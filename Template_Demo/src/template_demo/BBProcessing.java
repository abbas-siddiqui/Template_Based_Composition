/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package template_demo;

import BB_Description.BuildingBlock;
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
public class BBProcessing {

    AvailableBB availableBB;

    public void BBProcess(String fileName, AvailableBB b) throws JAXBException {

        this.availableBB = b;

        JAXBContext jc = JAXBContext.newInstance("BB_Description");
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        BuildingBlock buildingB = (BuildingBlock) unmarshaller.unmarshal(new File("./Extra_Files/BBPool/" + fileName));


        //System.out.println("Building Block Name : " + fileName);
        // System.out.println("*********************************** Start BB Processing **************************************");
        availableBB.ID = buildingB.getBBID();
        availableBB.ports = ProcessBuildingBlockPorts(buildingB.getPort());
        if(buildingB.getOptional() != null)
        {
       availableBB.QoS = ProcessQoSProperties(buildingB.getOptional().getQOS());
        }
        //System.out.println("******************************************************************************************************");
    }

    public ArrayList<BBPort> ProcessBuildingBlockPorts(List<BuildingBlock.Port> ports) {
        ArrayList<BBPort> bbPorts = new ArrayList<BBPort>();

        for (int i = 0; i < ports.size(); i++) {
            bbPorts.add(ProcessBBPort(ports.get(i)));

        }
        return bbPorts;
    }

    public BBPort ProcessBBPort(BuildingBlock.Port port) {
        BBPort bbPort = new BBPort();
        bbPort.portId = port.getPortID();
        //  System.out.println("*****************Processing BB Port*************************");
        List<Object> effects = port.getOfferingAndRequirement();
        ProcessEffects(effects, bbPort.oEffects, bbPort.rEffects);
        return bbPort;
    }

    public void ProcessEffects(List<Object> effects, ArrayList<BBEffect> oEffects, ArrayList<BBEffect> rEffects) {
        //ArrayList<BBEffect> bbEffects = new ArrayList<BBEffect>();
        for (int i = 0; i < effects.size(); i++) {

            Object effect = effects.get(i);
            // System.out.println("Class Name is : "+ effect.getClass().getName());
            if (effect.getClass().getName().toLowerCase().contains("offering")) {
                oEffects.add(ProcessOfferedEffect((BuildingBlock.Port.Offering) effect));
            } else if (effect.getClass().getName().toLowerCase().contains("requirement")) {
                rEffects.add(ProcessReqEffect((BuildingBlock.Port.Requirement) effect));
            }

        }

    }

    public BBEffect ProcessOfferedEffect(BuildingBlock.Port.Offering effect) {

        // System.out.println("Processing BB Offered Effect");
        BBEffect bbEffect = new BBEffect();
        bbEffect.effectName = effect.getEffect();
        bbEffect.operatorName = effect.getOperator();
        if (effect.getAttribute() != null) {
            bbEffect.attribute.formula.formula = effect.getAttribute().getFormula().getValue();
            bbEffect.attribute.formula.type = effect.getAttribute().getFormula().getType();
            bbEffect.attribute.unit = effect.getAttribute().getUnit();
        }
        return bbEffect;
    }

    public BBEffect ProcessReqEffect(BuildingBlock.Port.Requirement effect) {
        BBEffect bbEffect = new BBEffect();
        bbEffect.effectName = effect.getEffect();
        bbEffect.operatorName = effect.getOperator();
        if (effect.getAttribute() != null) {
            bbEffect.attribute.formula.formula = effect.getAttribute().getFormula().getValue();
            bbEffect.attribute.formula.type = effect.getAttribute().getFormula().getType();
            bbEffect.attribute.unit = effect.getAttribute().getUnit();
        }
        return bbEffect;
    }

    public ArrayList<BBEffect> ProcessQoSProperties(List<BuildingBlock.Optional.QOS> QoSList) {

        ArrayList<BBEffect> qos = new ArrayList<BBEffect>();

        if (QoSList.isEmpty()) {
            return qos;
        }
        for (int i = 0; i < QoSList.size(); i++) {
            qos.add(ProcessQoS(QoSList.get(i)));
        }

        return qos;
    }

    public BBEffect ProcessQoS(BuildingBlock.Optional.QOS qos) {
        BBEffect bbEffect = new BBEffect();
        bbEffect.effectName = qos.getEffect();
        bbEffect.operatorName = qos.getOperator();
        
       // System.out.println("Qos Process........................Effect Name:  "+ bbEffect.effectName );
        if (qos.getAttribute() != null) {
            bbEffect.attribute.formula.formula = qos.getAttribute().getFormula().getValue();
            if (qos.getAttribute().getFormula().getType() != null)
            bbEffect.attribute.formula.type = qos.getAttribute().getFormula().getType();
            if (qos.getAttribute().getUnit() != null)
            bbEffect.attribute.unit = qos.getAttribute().getUnit();
         //     System.out.println("Qos Process........................Value:  "+ bbEffect.attribute.formula.formula );
        }
        return bbEffect;
    }
}


