/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package template_demo;

import Domain_Policies.DomainsPolicies;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author siddiqui
 */
public class DomainPolicies {

    ArrayList<DomainC> availableDomains;
    NetworkParameters params;

    public DomainPolicies() {
        availableDomains = new ArrayList<DomainC>();
    }

    
    public void PrintoutDomains ()
    {
    for (int i = 0 ; i<availableDomains.size(); i++)
    {
    for (int j=0; j<availableDomains.get(i).reqList.size(); j++)
    {
    availableDomains.get(i).PrintRequirements();
    
    }
    
    }
    
    }
    public void ProcessDomainPolicies(String fileName, NetworkParameters iparams) throws JAXBException {

        JAXBContext jc = JAXBContext.newInstance("Domain_Policies");
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        
        params = iparams;
        
        //Maybe change to absolute path...
        DomainsPolicies domains = (DomainsPolicies) unmarshaller.unmarshal(new File(fileName));

        List<DomainsPolicies.Domain> domainsList = domains.getDomain();
        ProcessDomains(domainsList);
    }

    public void ProcessDomains(List<DomainsPolicies.Domain> domainsList) {

        DomainC domn;
        DomainsPolicies.Domain dom;
        
        for (int i = 0; i < domainsList.size(); i++) {

            domn = new DomainC();
            dom = domainsList.get(i);
            domn.domainName = dom.getName();
            ProcessRequirements(domainsList.get(i).getRequirement(), domn);
            ProcessConditions(domainsList.get(i).getCondition(), domn);
            availableDomains.add(domn);
        }
    }

    public void ProcessRequirements(List<DomainsPolicies.Domain.Requirement> reqs, DomainC domn) {

        DomainsPolicies.Domain.Requirement req;
        for (int i = 0; i < reqs.size(); i++) {
            req = reqs.get(i);
            domn.CreateRequirement(req.getEffect(), req.getOperator(), req.getAttribute().getValue());
        }

    }
    
    public void ProcessConditions(List<DomainsPolicies.Domain.Condition> conds, DomainC domn)
    {
         DomainsPolicies.Domain.Condition cond;
         DomainsPolicies.Domain.Condition.IF ifcond;
         DomainsPolicies.Domain.Condition.Then thencond;
         NetworkParameter net;
         
        for (int i = 0; i < conds.size(); i++) {
            cond = conds.get(i);
            ifcond = cond.getIF();
            boolean isTrue = false;
            
            if ( ifcond != null)
            {
            net =params.GetParam(ifcond.getEffect());
            if (net != null)
            {
            if (ifcond.getOperator().equalsIgnoreCase("=>")) {
               isTrue =  Integer.parseInt(net.attribute) >= Integer.parseInt(ifcond.getAttribute()) ;
            } else if (ifcond.getOperator().equalsIgnoreCase("=<")) {
                 isTrue =  Integer.parseInt(net.attribute) <= Integer.parseInt(ifcond.getAttribute()) ;
            } else if (ifcond.getOperator().equalsIgnoreCase("=")) {
              isTrue =  Integer.parseInt(ifcond.getAttribute()) == Integer.parseInt(net.attribute);
            }
            
            if (isTrue)
            {                
                thencond = cond.getThen();
            if (thencond != null)
            {
                System.out.println("Condition: " +thencond.getEffect()+ thencond.getOperator()+thencond.getAttribute());
            domn.CreateRequirement(thencond.getEffect(), thencond.getOperator(), thencond.getAttribute());
            }
            }
            }
                
            }
            
            //domn.CreateRequirement(req.getEffect(), req.getOperator(), req.getAttribute().getValue());
        }
        
    }
    
    public void ProcessCodition()
    {
        
    
    }
    
    public ArrayList<Require> GetDomainRequirements(String domainName)
    {
    for (int i=0; i<availableDomains.size(); i++)
    {
    if (availableDomains.get(i).domainName.equalsIgnoreCase(domainName))
    {
    return availableDomains.get(i).reqList;
    }
    }
    
        return null;
    }
}

class DomainC {

    String domainName;
    ArrayList<Require> reqList;

    public DomainC() {
        domainName = "";
        reqList = new ArrayList<Require>();
    }

   

    void CreateRequirement(String effectName, String operatorName, String attributeValue) {
        Require req = new Require();
        req.effect = effectName;
        req.operator = operatorName;
        req.attribute = attributeValue;

        reqList.add(req);
    }
    
    void PrintRequirements()
    {
    for (int i= 0; i<reqList.size(); i++)
    {
   System.out.println(reqList.get(i).effect+reqList.get(i).operator+reqList.get(i).attribute);
    
    }
    }
}
//class Constraint {
//
//    String effect;
//    String operator;
//    String attribute;
//}