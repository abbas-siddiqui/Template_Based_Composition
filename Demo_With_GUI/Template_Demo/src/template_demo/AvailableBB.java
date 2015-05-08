/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package template_demo;

import java.util.ArrayList;

/**
 *
 * @author siddiqui
 */
public class AvailableBB {

    String ID;
    ArrayList<BBPort> ports;
    String bbName;
    ArrayList<BBEffect> QoS;

    public AvailableBB() {

        ID = "";
        ports = new ArrayList<BBPort>();
        bbName = "unknown";
        QoS = new ArrayList<BBEffect>();
    }

    public BBEffect GetQoS(String name) {
        for (int i = 0; i < QoS.size(); i++) {
            if (QoS.get(i).effectName.equalsIgnoreCase(name)) {
                return QoS.get(i);
            }
        }
        return null;
    }

    public void setBBName(String name) {
        bbName = name;
    }

    public BBPort GetBBPort(String placeholderName, String placeholderPortID, String placeholderID) {

        //System.out.println("PlaceHolderName: " + placeholderName + " PlaceholderPortID: " + placeholderPortID + " placeholderID: " + placeholderID);

        for (int i = 0; i < ports.size(); i++) {
            if (ports.get(i).DoesMappingMatch(placeholderName, placeholderPortID, placeholderID )) {
              //  System.out.println("Sending port back");
                return ports.get(i);
            }
        }

        return null;
    }
}

class BBPort {

    public BBPort() {
        portId = "";
        oEffects = new ArrayList<BBEffect>();
        rEffects = new ArrayList<BBEffect>();
        portMapping = new ArrayList<BBPHPortMapping>();

    }

    public void addBBPHPortMapping(String placeholderName, String placeholderID, String placeholderPortID) {
        //System.out.println("ADDBBPHPortMapping actual ::::::   PlaceHolderName: "+ placeholderName + " PlaceholderPortID: " + placeholderPortID + " placeholderID: "+ placeholderID);
        BBPHPortMapping bbportmap = new BBPHPortMapping();
        bbportmap.placeHolderName = placeholderName;
        bbportmap.placeHolderID = placeholderID;
        bbportmap.placeHolderPortID = placeholderPortID;
        portMapping.add(bbportmap);

    }

    public boolean DoesMappingMatch(String placeholderName, String placeholderPortID, String placeholderID ) {

      //  System.out.println("Does Mapping Match :::::: PlaceHolderName: " + placeholderName + " PlaceholderPortID: " + placeholderPortID + " placeholderID: " + placeholderID);

        for (int i = 0; i < portMapping.size(); i++) {
            if (portMapping.get(i).DoesItMatch(placeholderName,  placeholderPortID,placeholderID)) {
                return true;
            }

        }

        return false;
    }
    String portId;
    ArrayList<BBEffect> oEffects;
    ArrayList<BBEffect> rEffects;
    ArrayList<BBPHPortMapping> portMapping;
}

class BBEffect {

    public BBEffect() {
        effectName = "";
        operatorName = "";
        attribute = new BBAttribute();
    }
    String effectName;
    String operatorName;
    BBAttribute attribute;

    public String getBBEffect() {
        return effectName + operatorName + attribute.formula.formula;
    }
}

class BBAttribute {

    String unit;
    BBFormula formula;

    public BBAttribute() {
        unit = "";
        formula = new BBFormula();
    }
}

class BBFormula {

    String type;
    String formula;

    public BBFormula() {
        type = "";
        formula = "";
    }
}

class BBPHPortMapping {

    String placeHolderName;
    String placeHolderPortID;
    String placeHolderID;

    public BBPHPortMapping() {
        placeHolderID = "";
        placeHolderName = "";
        placeHolderPortID = "";
    }

    public boolean DoesItMatch(String plname, String portid, String plid) {
       // System.out.println("PlaceHolderName: " + plname + " PlaceholderPortID: " + portid + " placeholderID: " + plid);
        //System.out.println("PlaceHolderName_in_Mapping: " + placeHolderName + " PlaceholderPortID_in_Mapping: " + placeHolderPortID + " placeholderID_in_Mapping: " + placeHolderID);

//         if (placeHolderName.trim().equalsIgnoreCase(plname.trim()))
//         {
//         System.out.println("placeholder name matched");
//         }
//         if (placeHolderPortID.trim().equalsIgnoreCase(portid.trim()))
//         {
//         System.out.println("placeholder Port ID  matched");
//         }
//          if ( placeHolderID.trim().equalsIgnoreCase(plid.trim()))
//         {
//         System.out.println("placeholder ID matched");
//         }

        //System.out.println("Name : " +placeHolderName+ "PL-Port ID: " + placeHolderPortID + "PL ID: " + placeHolderID  );
        //System.out.println("C_Name : " +plname+ "C_PL-Port ID: " + portid + "C_PL ID: " + plid  );

        if (placeHolderName.trim().equalsIgnoreCase(plname.trim()) && placeHolderPortID.trim().equalsIgnoreCase(portid.trim()) && placeHolderID.trim().equalsIgnoreCase(plid.trim())) {
          //  System.out.println("sending true back");
            return true;
        }

        return false;
    }
}