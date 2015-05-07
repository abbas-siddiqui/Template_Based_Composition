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
    NetworkParameters netParam;
    TemplatePool pool;
    BuildingBlockPool bbPool;
    DomainPolicies domPol;
    WorkflowGenerator generator;
    int nrOfWF = 1;

    /**
     * This is the main method, which is called to perform composition by
     * passing application requirements and network offering
     *
     * @param requirements_file_name
     * @param network_parameters_filename
     * @return Number of Workflows
     */
    public int PerformComposition(String requirements_file_name, String network_parameters_filename) {
        try {
            RetrieveRequirements(requirements_file_name);
            LoadNetworkParameters(network_parameters_filename);
            LoadTemplates(); //Load Templates from Pool
            LoadPolicies(); //Load Doamin Policies
            LoadBBs(); //Load Building blocks from Pool
            pool.SearchforTemplates(retReqs, domPol); // Search for suitable templates
            FillTempalte(); // Fill the placeholders with suitable BBs
        } catch (JAXBException ex) {
            Logger.getLogger(Composition.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nrOfWF;
    }

    /**
     * This method is used for processing the incoming network parameters
     *
     * @param network_parameters_filename
     */
    public void LoadNetworkParameters(String network_parameters_filename) {
        try {
            netParam = new NetworkParameters();
            netParam.ProcessNetworkPolicies(network_parameters_filename);//("./Extra_Files/NetwokParameters/Scenario1_Server1.xml");
            //netParam.PrintoutAllParameters();
        } catch (Exception ex) {
            Logger.getLogger(Composition.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is used for extracting the incoming requirements
     *
     * @param path_name
     * @throws JAXBException
     */
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
    }

    /**
     * This method is used for loading the templates from the TemplatePool to
     * the memory
     */
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
            } catch (Exception ex) {
                System.out.println(ex.toString());
            }
        }
    }

    /**
     * This method loads the policies into memory
     */
    public void LoadPolicies() {
        try {
            domPol = new DomainPolicies();

            domPol.ProcessDomainPolicies("./Extra_Files/DomainPolicies/DomainPolicies.xml", netParam);
            domPol.PrintoutDomains();
        } catch (JAXBException ex) {
            Logger.getLogger(Composition.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method loads all the available BBs for use
     */
    public void LoadBBs() {

        BBProcessing bbProcessing = new BBProcessing();
        bbPool = new BuildingBlockPool();

        File InputFolder = new File("./Extra_Files/BBPool/");
        String[] files = InputFolder.list();
        for (int i = 0; i < files.length; i++) {
            try {
                AvailableBB bb = new AvailableBB();
                bb.setBBName(files[i]);
                bbProcessing.BBProcess(files[i], bb);
                bbPool.addBB(bb);
            } catch (Exception ex) {
                System.out.println(ex.toString());
            }
        }
    }

    /**
     * This method fills the placeholders of a template
     */
    protected void FillTempalte() {

        if (pool.selectedTemplates.size() != 0) {
            pool.selectedTemplates.get(0).FillTemplate(bbPool.buildingBlocks);
        }
        GenerateWorkflow(pool.selectedTemplates.get(0));
    }

    /**
     * This method generates all the possible Protocol Graphs for the selected
     * template
     *
     * @param temp
     */
    public void GenerateWorkflow(AvailableTemplate temp) {
        generator = new WorkflowGenerator();
        nrOfWF = generator.GenerateWorkflows(temp);
        System.out.println("GEnerateworkflow nr of Workflows are : " + nrOfWF);
    }
}
