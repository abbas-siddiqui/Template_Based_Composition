/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package template_demo;

import Workflow_Description.Workflow;
import Workflow_Description.Workflow.Buildingblocks;
import Workflow_Description.Workflow.Buildingblocks.Buildingblock;
import Workflow_Description.Workflow.Connections;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

/**
 *
 * @author siddiqui
 */
public class WorkflowGenerator {

    Workflow wf;
   
    List<Buildingblock> blocks;
    Buildingblocks bbs;
    Connections conns;
    Workflow.Optional opt;
    List<Workflow.Optional.Offering> offerings;
    List<Workflow_Description.Workflow.Connections.Connection> connList;
    int numberofWorkflows = 1;
    String workflows = "";
    String[] qosString = {"delay", "imagequality", "bandwidth", "lossratio"};
    ArrayList<PGQoS> pgqos;

    public void InitWorkflow() {


        
        wf = new Workflow();
        
        opt = new Workflow.Optional();
        offerings = opt.getOffering();
        bbs = new Buildingblocks();
        blocks = bbs.getBuildingblock();
        conns = new Connections();
        connList = conns.getConnection();

        pgqos = new ArrayList<PGQoS>();
        
        

        wf.setBuildingblocks(bbs);
        wf.setConnections(conns);
        wf.setOptional(opt);
    }

    public void InitQoSParameters() {
        for (int i = 0; i < qosString.length; i++) {
            PGQoS q = new PGQoS();
            q.effectName = qosString[i];
            pgqos.add(q);
        }

    }

    public WorkflowGenerator() {

        InitWorkflow();
        InitQoSParameters();
    }

    public void CountPermutations(AvailableTemplate temp) {
        int permutations = 1;
        int bbcount = 1;
        for (int i = (temp.placeHolders.size() - 1); i >= 0; i--) {
            bbcount = temp.placeHolders.get(i).GetAvailbleBBCount();
//            for (int j= 0; j<temp.placeHolders.get(i).GetAvailbleBBCount(); j++)
//            {
//            System.out.println(temp.placeHolders.get(i).possibleAvaBB.get(j).ID);
//            }
            if (bbcount > 0) {
                temp.placeHolders.get(i).SetPossiblePerumtations(permutations);
                permutations = permutations * bbcount;
            }
        }
        numberofWorkflows = permutations;
    }

    public int GenerateWorkflows(AvailableTemplate temp) {
        CountPermutations(temp);
        try {
            for (int i = 0; i < numberofWorkflows; i++) {
                ProcessTemplate(temp);
                workflows = workflows + "\n" + GenerateWorkflow(temp, i + 1);
                InitWorkflow();
                InitQoSParameters();
            }
        } catch (Exception ex) {
            Logger.getLogger(WorkflowGenerator.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("GEnerateworkflows nr of Workflows are : " + numberofWorkflows);
        return numberofWorkflows;
    }

    public void ProcessTemplate(AvailableTemplate temp) {
        AvailableBB bb, bb1, bb2;
        String placeholderName = "";
        PlaceHold pl1, pl2;
        BBPort port1, port2;
         
       // addSpecialBB("app");

        for (int i = 0; i < temp.placeHolders.size(); i++) {

            bb = temp.placeHolders.get(i).GetPossibleBBs();
            if(bb!= null)
            {
            for (int j = 0; j < pgqos.size(); j++) {
                if (bb.GetQoS(pgqos.get(j).effectName) != null) {
                    // System.out.println("pgqos parameters: "+ pgqos.get(j).effectName + " BBID is :" + bb.GetQoS(pgqos.get(j).effectName).effectName); 
                    pgqos.get(j).addValue(bb.GetQoS(pgqos.get(j).effectName));
                }
            }
            addBB(bb);
            }
        }

        //addSpecialBB("net");
        
        AddQoSParameters();

        for (int j = 0; j < temp.connections.size(); j++) {

            placeholderName = temp.connections.get(j).ports.get(0).placeholderName;
            pl1 = temp.GetPlaceHolder(placeholderName);
            bb1 = pl1.GetSelectedBB();
            port1 = bb1.GetBBPort(placeholderName, temp.connections.get(j).ports.get(0).portId, pl1.placeHolderID);


            // System.out.println("Place Holder ID is :" + pl1.placeHolderID);
            //   System.out.println("port id is :" + port1.portId);

            placeholderName = temp.connections.get(j).ports.get(1).placeholderName;
            pl2 = temp.GetPlaceHolder(placeholderName);
            bb2 = pl2.GetSelectedBB();
            port2 = bb2.GetBBPort(placeholderName, temp.connections.get(j).ports.get(1).portId,  pl2.placeHolderID);

            //System.out.println("Place Holder ID is :" + pl2.placeHolderID);
            //System.out.println("port id is :" + port2.portId);
          //  if(port1 == null || port2 == null)
            //{
            //System.out.println("stop here");
           // }
            if (bb1 != null && bb2 !=null && port1 != null && port2 != null)
               
            addConnectionPorts(bb1.bbName, bb1.ID, port1.portId, port1.portId, bb2.bbName, bb2.ID, port2.portId, port2.portId);
            //addPorts(String blockName1, String blockID1, String portName1, String portID1, String blockName2, String blockID2, String portName2, String portID2)
        }
    }

    public void AddQoSParameters() {

        for (int i = 0; i < pgqos.size(); i++) {
            Workflow.Optional.Offering off = new Workflow.Optional.Offering();
            off.setEffect(pgqos.get(i).effectName);
            off.setOperator("=");
            Workflow.Optional.Offering.Attribute attr = new Workflow.Optional.Offering.Attribute();
            attr.setUnit("");
            attr.setValue(String.valueOf(pgqos.get(i).value));
            off.setAttribute(attr);
            offerings.add(off);
        }
    }

    public void addSpecialBB(String name) {
        Buildingblock bb = new Buildingblock();
        bb.setId(name);
        bb.setSpecial(name);
        blocks.add(bb);
    }

    public void addBB(AvailableBB b) {
        Buildingblock bb = addBuildingBlock(b.ID, b.ID);
        AddPorts(b, bb);  
                    blocks.add(bb);

    }

    public Buildingblock addBuildingBlock(String id, String uuid) {

        Buildingblock bb = new Buildingblock();
        bb.setId(id);
        bb.setUuid(uuid);
         if (id.equalsIgnoreCase("app") || id.equalsIgnoreCase("net"))
        {
        bb.setSpecial(id);
        }
        //bb.setSpecial(special);
        return bb;


    }

    public void AddPorts(AvailableBB bb, Buildingblock wfbb) {
        List<Buildingblock.Port> wfports = wfbb.getPort();
        Buildingblock.Port wfPort = new Buildingblock.Port();
        for (int i = 0; i < bb.ports.size(); i++) {
            wfPort = addPort(bb.ports.get(i));
            if (wfPort != null) {
                wfports.add(wfPort);
            }
        }
    }

    public Buildingblock.Port addPort(BBPort bbPort) {
        Buildingblock.Port wfPort = new Buildingblock.Port();
        wfPort.setPortID(bbPort.portId);
        if (bbPort != null) {
            addEffects(bbPort, wfPort);
        }
        return wfPort;
    }

    public void addEffects(BBPort port, Buildingblock.Port wfPort) {
        if (port == null || wfPort == null) {
            return;
        }

        Buildingblock.Port.OfferedEffect oeff;
        Buildingblock.Port.RequiredEffect reff;
        for (int i = 0; i < port.oEffects.size(); i++) {
            oeff = addOfferedEffect(port.oEffects.get(i));
            wfPort.getOfferedEffect().add(oeff);
        }

        for (int i = 0; i < port.rEffects.size(); i++) {
            reff = addRequiredEffect(port.rEffects.get(i));
            wfPort.getRequiredEffect().add(reff);
        }
    }

    public Buildingblock.Port.OfferedEffect addOfferedEffect(BBEffect effect) {
        Buildingblock.Port.OfferedEffect eff = new Buildingblock.Port.OfferedEffect();
        eff.setEffect(effect.effectName);
        eff.setOperator(effect.operatorName);
        eff.setAttribute(effect.attribute.formula.formula);
        return eff;
    }

    public Buildingblock.Port.RequiredEffect addRequiredEffect(BBEffect effect) {
        Buildingblock.Port.RequiredEffect eff = new Buildingblock.Port.RequiredEffect();
        eff.setEffect(effect.effectName);
        eff.setOperator(effect.operatorName);
        eff.setAttribute(effect.attribute.formula.formula);
        return eff;
    }

    public void addConnectionPorts(String blockName1, String blockID1, String portName1, String portID1, String blockName2, String blockID2, String portName2, String portID2) {

        Workflow.Connections.Connection.Port port1 = new Workflow.Connections.Connection.Port();
        port1.setBlockid(blockID1);
        port1.setBlockname(blockName1);
        port1.setId(portID1);
        port1.setName(portName1);

        Workflow.Connections.Connection.Port port2 = new Workflow.Connections.Connection.Port();
        port2.setBlockid(blockID2);
        port2.setBlockname(blockName2);
        port2.setId(portID2);
        port2.setName(portName2);

        addConnection(port1, port2);
    }

    public void addConnection(Workflow.Connections.Connection.Port port1, Workflow.Connections.Connection.Port port2) {

        Workflow.Connections.Connection con = new Workflow.Connections.Connection();
        con.getPort().add(0, port1);
        con.getPort().add(1, port2);
        connList.add(con);

    }

    public String GenerateWorkflow(AvailableTemplate temp, int workflowNr) throws FileNotFoundException, IOException {

        OutputStream os;
        String s = "";
        os = new FileOutputStream("./Extra_Files/workflow" + workflowNr + ".xml");
        try {
            File f;
            f = new File("./Extra_Files/workflow" + workflowNr + ".xml");
            if (!f.exists()) {
                f.createNewFile();
            }

            JAXBContext jc = JAXBContext.newInstance(wf.getClass().getPackage().getName());//("BB_Description");
            Marshaller marshaller = jc.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_ENCODING, "UTF-8"); //NOI18N
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(wf, os);
        } catch (Exception ex) {
            Logger.getLogger(WorkflowGenerator.class.getName()).log(Level.SEVERE, null, ex);
        }

        ByteArrayOutputStream byte1 = new ByteArrayOutputStream();
        os.write(byte1.toByteArray());
        byte1.flush();

        s = byte1.toString();
        // System.out.println("Workflow file is: " + s.toString());

        return s.toString();
    }
}

class PGQoS {

    public PGQoS() {
        effectName = "";
        value = 0;
    }

    public void addValue(BBEffect eff) {

        if (eff != null) {
            if (eff.effectName.equalsIgnoreCase(effectName)) {
                // have to convert in numeric value
                if (isIntNumber(eff.attribute.formula.formula)) {
                    value = value + Double.parseDouble(eff.attribute.formula.formula);
                }
            }
        }
    }

    public boolean isIntNumber(String num) {
        try {
            Integer.parseInt(num);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
    String effectName;
    double value;
}