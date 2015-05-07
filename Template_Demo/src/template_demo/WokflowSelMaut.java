/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package template_demo;

import Workflow_Description.Workflow;
import java.util.ArrayList;

/**
 *
 * @author siddiqui
 */
public class WokflowSelMaut {
    
    public void SelectOptimalPG (ArrayList<Workflow> workflows, RetrievedRequirements reqs)
    {
    
    }
    
    public void ExtractQoSParameters(ArrayList<Workflow> workflows)
    {
    for(int i = 0; i<workflows.size(); i++)       
    {
    
        Workflow.Optional opt = workflows.get(i).getOptional();
        opt.getOffering();
    }
    
    
    }
    
}

class Service {
ArrayList<QoSParam> qosParams;
}

class QoSParam {
    String effectName;
    double value;
    double weight;
}
