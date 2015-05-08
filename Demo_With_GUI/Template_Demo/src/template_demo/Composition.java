/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package template_demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
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
public class Composition {
     RetrievedRequirements retReqs;
    TemplatePool pool;
    BuildingBlockPool bbPool;
    DomainPolicies domPol;
    WorkflowGenerator generator;
   
    int nrOfWF=1;
    
   public int PerformComposition(String absolute_path_filename)
   {
      
 
       
        try {
            RetrieveRequirements(absolute_path_filename);
        } catch (JAXBException ex) {
            Logger.getLogger(Composition.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nrOfWF;
    }
   
   
   protected void RetrieveRequirements(String path_name) throws JAXBException {

        JAXBContext jc = JAXBContext.newInstance("reqdesc.requirements");
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        retReqs = new RetrievedRequirements();
        Requirements reqList = (Requirements) unmarshaller.unmarshal(new File(path_name));//("./Extra_Files/Req1.xml"));

        String domainName = reqList.getDomain();
        retReqs.setDomainName(domainName);

        List<Requirements.Requirement> reqs = reqList.getRequirement();
        String effectName, operator, attributeName, attributeUnit;



        for (int i = 0; i < reqs.size(); i++) {

            Requirements.Requirement r = reqs.get(i);

            effectName = r.getEffect();
            operator = r.getOperator();
            Requirements.Requirement.Attribute atr = r.getAttribute();
            attributeName = atr.getValue();
            attributeUnit = atr.getUnit();

            if (attributeUnit == null) {
                attributeUnit = "";
            }
            if (attributeName == null) {
                attributeName = "";
            }
                                       
            retReqs.addRequirement(effectName, operator, attributeName);
        }

        //Retrieving Forced Mandatory Requirements from the Application!!!

        Requirements.Mandatory man = reqList.getMandatory();

        if (man != null) {
            List<Requirements.Mandatory.Requirement> manreqs = man.getRequirement();


            for (int i = 0; i < manreqs.size(); i++) {

                Requirements.Mandatory.Requirement r = manreqs.get(i);

                effectName = r.getEffect();
                operator = r.getOperator();
                Requirements.Mandatory.Requirement.Attribute atr = r.getAttribute();
                attributeName = atr.getValue();
                attributeUnit = atr.getUnit();

                if (attributeUnit == null) {
                    attributeUnit = "";
                }
                if (attributeName == null) {
                    attributeName = "";
                }
             
                retReqs.addRequirement(effectName, operator, attributeName);

            }
        }
         LoadTemplates();
          LoadPolicies();
           LoadBBs();
             pool.SearchforTemplates(retReqs, domPol);
             // TemplateFirstMatch();
//         new Thread() {
//
//            public void run() {
//                LoadTemplates();
//            }
//        }.start();
//
//        new Thread() {
//
//            public void run() {
//                LoadPolicies();
//            }
//        }.start();
//
//
//        new Thread() {
//
//            public void run() {
//                LoadBBs();
//            }
//        }.start();
//        try {
//            Thread.sleep(200);
//        } catch (InterruptedException ex) {
//            Logger.getLogger(Composition.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
        FillTempalte();
       
    }
   
   
    public void LoadTemplates() {

        TemplateProcessing tempProcessing = new TemplateProcessing();
        pool = new TemplatePool();

        File InputFolder = new File("./Extra_Files/TemplatesPool/");
        String[] files = InputFolder.list();
        for (int i = 0; i < files.length; i++) {
            try {
                AvailableTemplate temp = new AvailableTemplate();
                temp.Initialize("Template" + i);
                tempProcessing.TemplateProcess(files[i], temp);
                pool.addTemplate(temp);
                //DrawTemplate(temp, tempPoolpnl);
            } catch (Exception ex) {
        System.out.println(ex.toString());
            }
        }
    }
    
     public void LoadPolicies() {
        try {
            domPol = new DomainPolicies();

            //domPol.ProcessDomainPolicies("DomainPolicies1.xml");
        } catch (Exception ex) {
          System.out.println(ex.toString());
        }
    }

     
      public void LoadBBs() {

        BBProcessing bbProcessing = new BBProcessing();
        bbPool = new BuildingBlockPool();

        File InputFolder = new File("./Extra_Files/BBPool/");
        String[] files = InputFolder.list();
        for (int i = 0; i < files.length; i++) {
            try {
                AvailableBB bb = new AvailableBB();
                //System.out.println("File Name is "+files[i] );
                bb.setBBName(files[i]);
                bbProcessing.BBProcess(files[i], bb);
                bbPool.addBB(bb);
                //DrawTemplate(temp, tempPoolpnl);
            } catch (Exception ex) {
                System.out.println(ex.toString());
               // Logger.getLogger(MainVis.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }
      

    protected void FillTempalte()
    {
    
      if (pool.selectedTemplates.size() != 0) {
            pool.selectedTemplates.get(0).FillTemplate(bbPool.buildingBlocks);
        }

        GenerateWorkflow(pool.selectedTemplates.get(0));
      
    }
    
      public void  GenerateWorkflow(AvailableTemplate temp) {
          
        
        generator = new WorkflowGenerator();
        nrOfWF = generator.GenerateWorkflows(temp);
          System.out.println("GEnerateworkflow nr of Workflows are : " + nrOfWF);

//        try {
//            // generator.addBuildingBlock();
//             nrofWorkflows = generator.GenerateWorkflows(temp);
//            
//            String text = "";
//            try {
//                for (int i = 0; i < nrofWorkflows; i++) {
//
//                    FileReader fr = new FileReader("./Extra_Files/workflow.xml" + (i + 1));
//                    BufferedReader reader = new BufferedReader(fr);
//                    String textLine = "";
//                    while (textLine != null) {
//                        textLine = reader.readLine();
//                        text = text + textLine + "\n";
//                    }
//                }
//            } catch (Exception ex) {
//                ex.printStackTrace();
//            }
//         //   workflowdisplay.setText(text);
//        } catch (Exception ex) {
//            System.out.println(ex.toString());
//        }
        
        
    }
}