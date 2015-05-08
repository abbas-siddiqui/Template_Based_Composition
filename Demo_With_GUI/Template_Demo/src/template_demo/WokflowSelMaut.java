/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package template_demo;

import Workflow_Description.Workflow;
import Workflow_Description.Workflow.Optional.Offering;
import java.util.ArrayList;

/**
 *
 * @author siddiqui
 */
public class WokflowSelMaut {
    
    public Workflow SelectOptimalPG (ArrayList<Workflow> workflows, ArrayList<QoSParam> qosParams)
    {
    Workflow selectedWF= null;
    
    return selectedWF;
        
    }
    
    public void ExtractQoSParameters(ArrayList<Workflow> workflows) {
        String effectName;
        String operator;
        String value;
        for (int i = 0; i < workflows.size(); i++) {

            Workflow.Optional opt = workflows.get(i).getOptional();
            opt.getOffering();
            for (int j = 0; j < opt.getOffering().size(); j++) {
                Offering off = opt.getOffering().get(j);
                effectName = off.getEffect();
                operator = off.getOperator();
                value = off.getAttribute().getValue();

            }
        }
    
    
    }
    
}

//class Service {
//ArrayList<QoSParam> qosParams;
//}

class QoSParam {    
    String effectName;
    double value;
    double weight;
    public enum Best_Worst {Best_When_Smaller, Best_When_Greater};    
    
}
