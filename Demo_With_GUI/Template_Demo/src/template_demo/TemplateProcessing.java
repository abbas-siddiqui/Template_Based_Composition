/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package template_demo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import template_Description.Template;

/**
 *
 * @author siddiqui
 */
public class TemplateProcessing {

    AvailableTemplate temp;

    public void TemplateProcess(String fileName, AvailableTemplate template) throws JAXBException {


        this.temp = template;

        JAXBContext jc = JAXBContext.newInstance("template_Description");
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        Template tem = (Template) unmarshaller.unmarshal(new File("./Extra_Files/TemplatesPool/" + fileName));
        
       // System.out.println("Template Name : " + fileName);

        //System.out.println("*********************************** Start Template Processing **************************************");

        //System.out.println("*********************************** Processing Domains **************************************");

        //Processing doamin in a Template
        Template.Domains domains = tem.getDomains();
        List<Template.Domains.Domain> domainsList = domains.getDomain();
        ProcessDomains(domainsList);
       // System.out.println("*************************");


        //System.out.println("*********************************** Processing PlaceHolders **************************************");

        //Processing Placeholders in a Template
        Template.Placeholders plhol = tem.getPlaceholders();
        List<Template.Placeholders.PlaceHolder> placeholdersList = plhol.getPlaceHolder();
        ProcessPlaceholders(placeholdersList);
        //System.out.println("*************************");


        //System.out.println("*********************************** Processing Connections **************************************");

        //Processing Connections in a Template
        Template.Connections connections = tem.getConnections();
        List<Template.Connections.Connection> connectionsList = connections.getConnection();
        ProcessConnections(connectionsList);
        //System.out.println("*************************");


        //System.out.println("*********************************** Processing Covered Effects**************************************");

        //Processing Covered Effects in a Template
        Template.CoveredEffects coveredEffects = tem.getCoveredEffects();
        List<Template.CoveredEffects.CoveredEffect> coveredEffectsList = coveredEffects.getCoveredEffect();
        ProcessCoveredEffects(coveredEffectsList);
        //System.out.println("*************************");


        //System.out.println("******************************************************************************************************");
    }

    public void ProcessPlaceholders(List<Template.Placeholders.PlaceHolder> placeholdersList) {

        // Process all the placeholders
        for (int i = 0; i < placeholdersList.size(); i++) {
            Template.Placeholders.PlaceHolder placeholder = placeholdersList.get(i);
            String placeholderId = placeholder.getID();
            String placeholderName = placeholder.getName();
            boolean isEnabled = placeholder.getToggleEnable().isIsToggle();

            temp.addVertex(placeholderName);
            
           

            ProcessPlaceholder(placeholder);

        }
    }

    public void ProcessPlaceholder(Template.Placeholders.PlaceHolder holder) {

        try {
            PlaceHold hold = temp.CreatePlaceHolder(holder.getName(), holder.getID(), holder.getToggleEnable().isIsToggle());
            
             //System.out.println("placholderID : " + holder.getID());
            //System.out.println("placholderName : " + holder.getName());
            //System.out.println("Placeholder Toggling : " + holder.getToggleEnable().isIsToggle());

             //System.out.println("????????????Processing Ports?????????????????");
            hold.placeholderPorts = ProcessPlaceholderPorts(holder.getPort());
             //System.out.println("?????????????????????????????");
             
            if (holder.getPreSelection() != null) {
                hold.preselectedBB = ProcessPlaceholderPreSelection(holder.getPreSelection());      
                 hold.suggestedBB.bbID = holder.getPreSelection().getSuggestedBB().getBB().getID();                 
               //  System.out.println("------------Suggested BBID is : " + hold.suggestedBB.bbID);

           }

           // temp.AddPlaceHolder(hold);
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

    public ArrayList<PlaceHolderPort> ProcessPlaceholderPorts(List<Template.Placeholders.PlaceHolder.Port> ports) {
        ArrayList<PlaceHolderPort> pPorts = new ArrayList<PlaceHolderPort>();
        for (int i = 0; i < ports.size(); i++) {

            pPorts.add(ProcessPlaceHolderPort(ports.get(i)));

        }
        return pPorts;
    }

    public PlaceHolderPort ProcessPlaceHolderPort(Template.Placeholders.PlaceHolder.Port port) {
        PlaceHolderPort pPort = new PlaceHolderPort();
        pPort.portId= port.getPortID();
        List<Object> effects = port.getOfferedEffectAndRequiredEffect();
        ProcessEffects(effects,pPort.offeredEffects,pPort.requiredEffects);
        return pPort;
    }

    public void ProcessEffects(List<Object> effects, ArrayList<PlaceHolderEffect> pOEffects, ArrayList<PlaceHolderEffect> pREffects) {
       
        for (int i = 0; i < effects.size(); i++) {
            Object effect = effects.get(i);
            if (effect.getClass().getName().toLowerCase().contains("offeredeffect")) {
                pOEffects.add(ProcessOfferedEffect((Template.Placeholders.PlaceHolder.Port.OfferedEffect) effect));
            } else if (effect.getClass().getName().toLowerCase().contains("requiredeffect")) {
                pREffects.add(ProcessReqEffect((Template.Placeholders.PlaceHolder.Port.RequiredEffect) effect));
            }

        }       
    }

    public PlaceHolderEffect ProcessOfferedEffect(Template.Placeholders.PlaceHolder.Port.OfferedEffect effect) {
        PlaceHolderEffect pEffect = new PlaceHolderEffect();
        pEffect.effectName = effect.getEffect();
        pEffect.operatorName = effect.getOperator();
        pEffect.attributeName = effect.getAttribute();
      //  System.out.println("EffectName: " + pEffect.effectName + " EffectOperator : " + pEffect.operatorName + " effectAttribute : " + pEffect.attributeName);

        return pEffect;
    }

    public PlaceHolderEffect ProcessReqEffect(Template.Placeholders.PlaceHolder.Port.RequiredEffect effect) {
        PlaceHolderEffect pEffect = new PlaceHolderEffect();
        pEffect.effectName = effect.getEffect();
        pEffect.operatorName = effect.getOperator();
        pEffect.effectName = effect.getAttribute();

        return pEffect;
    }

    public ArrayList<BB> ProcessPlaceholderPreSelection(Template.Placeholders.PlaceHolder.PreSelection sel) {

        ArrayList<BB> pBBs = new ArrayList<BB>();
        if (sel.getPreSelectedBBs().getBB() != null) {
            List<Template.Placeholders.PlaceHolder.PreSelection.PreSelectedBBs.BB> bbs = sel.getPreSelectedBBs().getBB();

            BB bb;
            if (bbs != null) {
                for (int i = 0; i < bbs.size(); i++) {
                    bb = new BB();
                    bb.bbID = bbs.get(i).getID();
                    pBBs.add(bb);
          //          System.out.println("Preselection BBID is : " + bb.bbID);

                }
            }
        }
        return pBBs;
    }

    public void ProcessConnections(List<Template.Connections.Connection> connections) {
        for (int i = 0; i < connections.size(); i++) {
            Template.Connections.Connection connection = connections.get(i);
            ProcessConnection(connection);
        }
    }

    public void ProcessConnection(Template.Connections.Connection connection) {
        List<Template.Connections.Connection.Port> ports = connection.getPort();

        Connection con = temp.addConnection();
        for (int i = 0; i < ports.size(); i++) {
            Template.Connections.Connection.Port port = ports.get(i);
            String portID = port.getPortID();
            String placeholderName = port.getPlaceholder();

            con.addPort(placeholderName, portID);

            //  System.out.println("Placeholder Name : " + placeholderName + " Port Id : " + portID);
        }
    }

    public void ProcessCoveredEffects(List<Template.CoveredEffects.CoveredEffect> coveredEffects) {
        String effectName = "", effectOperator = "", effectAttribute = "", effectIsToggle = "";
        for (int i = 0; i < coveredEffects.size(); i++) {

            Template.CoveredEffects.CoveredEffect coveredEffect = coveredEffects.get(i);
            if (coveredEffect != null) {
                effectName = coveredEffect.getEffect();
                effectOperator = coveredEffect.getOperator();
                effectAttribute = coveredEffect.getAttribute();
                effectIsToggle = coveredEffect.getIsToggle();


                temp.addCovEffect(effectName, effectOperator, effectAttribute, effectIsToggle);
            }
            //System.out.println("Covered Effect : " + effectName +effectOperator+effectAttribute);
        }
    }

    public void ProcessDomains(List<Template.Domains.Domain> domains) {
        for (int i = 0; i < domains.size(); i++) {
            Template.Domains.Domain domain = domains.get(i);
            if (domain != null) {
                temp.addDomain(domain.getName());
            }
            // System.out.println("Domain Name : " + domain.getName());
        }
    }
}
