/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package template_demo;

import Network_Description.Offerings;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import reqdesc.requirements.Requirements;

/**
 *
 * @author siddiqui
 */
public class NetworkParameters {

    ArrayList<NetworkParameter> parameters;

    public NetworkParameters() {
        parameters = new ArrayList<NetworkParameter>();
    }

    public void addParameter(String effectName, String operator, String attribute) {

        NetworkParameter param = new NetworkParameter();
        param.effect = effectName;
        param.operator = operator;
        param.attribute = attribute;
        parameters.add(param);
    }
    
    public NetworkParameter GetParam (String paramName)
    {
    
       for (int i = 0 ; i<parameters.size(); i++)          
       {
       
           if (parameters.get(i).effect.equalsIgnoreCase(paramName))
           {
           return parameters.get(i);
           }
       }
       return null;
    }

    public void ProcessNetworkPolicies(String file_path) {
        JAXBContext jc;
        try {
            jc = JAXBContext.newInstance("Network_Description");

            Unmarshaller unmarshaller = jc.createUnmarshaller();
            Offerings netList = (Offerings) unmarshaller.unmarshal(new File(file_path));
            String effectName, operator, attributeName, attributeUnit;

            if (netList.getMandatory() != null) {
                List<Offerings.Mandatory.Offering> mandOff = netList.getMandatory().getOffering();


                if (!mandOff.isEmpty()) {

                    for (int i = 0; i < mandOff.size(); i++) {

                        Offerings.Mandatory.Offering o = mandOff.get(i);

                        effectName = o.getEffect();
                        operator = o.getOperator();
                        Offerings.Mandatory.Offering.Attribute atr = o.getAttribute();
                        attributeName = atr.getValue();
                        attributeUnit = atr.getUnit();

                        if (attributeUnit == null) {
                            attributeUnit = "";
                        }
                        if (attributeName == null) {
                            attributeName = "";
                        }
                        addParameter(effectName, operator, attributeName);
                        // retReqs.addRequirement(effectName, operator, attributeName);
                    }
                }
            }
            if (netList.getOptional() != null) {
                List<Offerings.Optional.Offering> optOff = netList.getOptional().getOffering();
                if (!optOff.isEmpty()) {
                    for (int i = 0; i < optOff.size(); i++) {

                        Offerings.Optional.Offering o = optOff.get(i);

                        effectName = o.getEffect();
                        operator = o.getOperator();
                        Offerings.Optional.Offering.Attribute atr = o.getAttribute();
                        attributeName = atr.getValue();
                        attributeUnit = atr.getUnit();

                        if (attributeUnit == null) {
                            attributeUnit = "";
                        }
                        if (attributeName == null) {
                            attributeName = "";
                        }
                        addParameter(effectName, operator, attributeName);
                        // retReqs.addRequirement(effectName, operator, attributeName);
                    }
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(NetworkParameters.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void PrintoutAllParameters()
    {
    for (int i = 0; i< parameters.size(); i++)
    {
    System.out.println(parameters.get(i).effect+ parameters.get(i).operator+ parameters.get(i).attribute );
    }
    }
}

class NetworkParameter {

    String effect;
    String operator;
    String attribute;
}