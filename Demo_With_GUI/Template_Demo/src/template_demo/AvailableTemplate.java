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
public class AvailableTemplate {

    String tempName;
    ArrayList<String> vertices;
    ArrayList<Connection> connections;
    ArrayList<CovEffect> coveredEffects;
    ArrayList<String> domains;
    ArrayList<PlaceHold> placeHolders;

    public void Initialize(String templateName) {
        vertices = new ArrayList<String>();
        connections = new ArrayList<Connection>();
        coveredEffects = new ArrayList<CovEffect>();
        domains = new ArrayList<String>();
        placeHolders = new ArrayList<PlaceHold>();
        tempName = templateName;

    }

    public void addVertex(String vertexName) {

        vertices.add(vertexName);
    }

    public Connection addConnection() {
        Connection con = new Connection();
        con.Initialize();
        connections.add(con);
        return con;
    }

    public void addCovEffect(String effectName, String operatorName, String attributeName, String isToggle) {
        CovEffect eff = new CovEffect();
        eff.effectName = effectName;
        eff.operatorName = operatorName;
        eff.attributeName = attributeName;
        eff.isToggle = isToggle;
        coveredEffects.add(eff);
    }

    public boolean containsEffectLowerCase(String effectName) {
        boolean isContain = false;
        String coveredEffect;
//        for (int i = 0; i < coveredEffects.size(); i++) {
//            coveredEffect = coveredEffects.get(i);
//            System.out.println("Covered Effect is : "+ coveredEffect + " Effect To be Checked is : " + effectName);
//            if (coveredEffect.toLowerCase().contains(effectName.toLowerCase())) {
//                isContain = true;
//                return isContain;
//            }
//        }

        return isContain;

    }

    public PlaceHold GetPlaceHolder(String name) {
        for (int i = 0; i < placeHolders.size(); i++) {
            if (placeHolders.get(i).placeHolderName.compareToIgnoreCase(name) == 0) {
                return placeHolders.get(i);
            }
        }
        return null;
    }

    public void addDomain(String domain) {
        domains.add(domain);
    }

    public void AddPlaceHolder(PlaceHold pl) {
        placeHolders.add(pl);
    }

    public PlaceHold CreatePlaceHolder(String placeHolderName, String placeHolderID, boolean isToggle) {

        //System.out.println("Create Place Holder : " + placeHolderName + "ID" + placeHolderID + " isToggle : "+ isToggle);
        PlaceHold place = new PlaceHold();
        place.placeHolderName = placeHolderName;
        place.placeHolderID = placeHolderID;
        place.isToggle = isToggle;
        placeHolders.add(place);
        return place;
    }

    public void PrintPlaceHolders() {
        for (int i = 0; i < placeHolders.size(); i++) {
            //System.out.println(placeHolders.get(i).placeHolderName);
        }
    }

    public void FillTemplate(ArrayList<AvailableBB> availableBBs) {
        //System.out.println("Size of BBs is: " + availableBBs.size());
        //System.out.println("Size of Placeholders is: " + placeHolders.size());
        for (int j = 0; j < availableBBs.size(); j++) {
            for (int i = 0; i < placeHolders.size(); i++) {
                // System.out.println("Berfore       ............... Add Mapping :::::::::: "+placeHolders.get(i).placeHolderName+ " ID : " + placeHolders.get(i).placeHolderID );
                placeHolders.get(i).DoesItMatch(availableBBs.get(j));
            }
        }
    }
}

class PlaceHold {

    String placeHolderName;
    String placeHolderID;
    boolean isToggle;
    ArrayList<PlaceHolderPort> placeholderPorts;
    BB suggestedBB;
    ArrayList<BB> preselectedBB;
    ArrayList<AvailableBB> possibleAvaBB;
    BB selectedBB;
    int selectedBBIndex = 0;
    int possibleBBIndex = 0;
    int countFornextBranch = 0;
    int possiblePermutations = 0;
//    ArrayList<String> phCoveredEffects;

    public PlaceHold() {
        placeHolderName = "";
        placeHolderID = "";
        isToggle = false;
        placeholderPorts = new ArrayList<PlaceHolderPort>();
        suggestedBB = new BB();
        selectedBB = new BB();
        preselectedBB = new ArrayList<BB>();
        possibleAvaBB = new ArrayList<AvailableBB>();
        

//        phCoveredEffects = new ArrayList<String>();
    }

    public PlaceHolderPort CreatePort(String ID) {
        PlaceHolderPort port = new PlaceHolderPort();
        port.portId = ID;
        placeholderPorts.add(port);

        return port;
    }

    public AvailableBB GetSelectedBB() {
        if (!possibleAvaBB.isEmpty()) {
            return possibleAvaBB.get(selectedBBIndex);
        }
        return null;
    }

    public AvailableBB GetPossibleBBs() {
        AvailableBB avBB;
        countFornextBranch = countFornextBranch + 1;
        if (!possibleAvaBB.isEmpty()) {
            avBB = possibleAvaBB.get(possibleBBIndex);
            selectedBBIndex = possibleBBIndex;
            if (countFornextBranch >= GetPossiblePerumtations()) {
                possibleBBIndex = possibleBBIndex + 1;                
                if (possibleBBIndex > (possibleAvaBB.size() - 1)) {
                    countFornextBranch = 0;
                    possibleBBIndex = 0;
                }
            }
            return avBB;
        }
        return null;
    }

    public int GetAvailbleBBCount() {
        return possibleAvaBB.size();
    }

    public int GetPossiblePerumtations() {
        return possiblePermutations;
    }

    public void SetPossiblePerumtations(int per) {
        possiblePermutations = per;
    }

    public void AddSuggestedBB(String ID) {
        suggestedBB.bbID = ID;

    }

    public void AddPreSelectedBB(String ID) {
        BB bb = new BB();
        bb.bbID = ID;
        preselectedBB.add(bb);
    }

    public boolean DoesItMatch(AvailableBB bb) {
        boolean isMatch = true;
        boolean isPort = false;

        //System.out.println("*******************Checking Placeholder against BB**************");
        //System.out.println("Name of PlaceHOlder : " + placeHolderName + "   Name of BB:  " + bb.bbName);

        for (int i = 0; i < placeholderPorts.size(); i++) {
            isPort = false;

            for (int j = 0; j < bb.ports.size(); j++) {

                isPort = placeholderPorts.get(i).DoesItMatch(bb.ports.get(j));


                if (isPort) {
                    // System.out.println("Add Mapping :::::::::: "+this.placeHolderName+ " ID " + this.placeHolderID + "  portID:" + placeholderPorts.get(i).portId );
                    bb.ports.get(j).addBBPHPortMapping(this.placeHolderName, this.placeHolderID, placeholderPorts.get(i).portId);
                    break;
                }
            }

            if (!isPort) {
                return false;
            }
        }
        if (isMatch) {
            //  System.out.println("************BB Match Found***************");
            possibleAvaBB.add(bb);
        }
        return isMatch;
    }
}

class PlaceHolderPort {

    String portId;
    ArrayList<PlaceHolderEffect> offeredEffects;
    ArrayList<PlaceHolderEffect> requiredEffects;

    public PlaceHolderPort() {
        portId = "";
        offeredEffects = new ArrayList<PlaceHolderEffect>();
        requiredEffects = new ArrayList<PlaceHolderEffect>();
    }

    public boolean DoesItMatch(BBPort port) {
        boolean isPortFound = true;
        boolean isEffectFound;

        //Check Offered Effects
        for (int i = 0; i < offeredEffects.size(); i++) {

            isEffectFound = false;
            for (int j = 0; j < port.oEffects.size(); j++) {
                isEffectFound = offeredEffects.get(i).CompareEffect(port.oEffects.get(j).effectName, port.oEffects.get(j).operatorName, port.oEffects.get(j).attribute.formula.formula);

                if (isEffectFound) {
                    //        System.out.println("************Effect Match Found***************");
                    break;
                }
            }

            if (!isEffectFound) {
                return false;
            }


        }

        //Check Required Effects
        for (int i = 0; i < requiredEffects.size(); i++) {

            isEffectFound = false;
            for (int j = 0; j < port.rEffects.size(); j++) {
                isEffectFound = requiredEffects.get(i).CompareEffect(port.rEffects.get(j).effectName, port.rEffects.get(j).operatorName, port.rEffects.get(j).attribute.formula.formula);

                if (isEffectFound) {

                    //      System.out.println("************Effect Match Found***************");
                    break;
                }
            }

            if (!isEffectFound) {
                return false;
            }


        }
        if (isPortFound) {
            //     System.out.println("************Port Match Found***************");
        }
        return isPortFound;
    }

    public ArrayList<String> GetQosParameters() {
        return null;
    }

    public ArrayList<String> GetOfferedEffects() {
        return null;
    }

    public ArrayList<String> GetRequiredEffects() {
        return null;
    }
}

class PlaceHolderEffect {

    public PlaceHolderEffect() {
        effectName = "";
        operatorName = "";
        attributeName = "";
    }
    String effectName;
    String operatorName;
    String attributeName;

    public String getPlaceHolderEffect() {
        return effectName + operatorName + attributeName;
    }
//
//    public boolean DoesItMatch(BBEffect effect) {
//        boolean isMatch = true;
//
//        System.out.println("Placeholder Effect is: " + effectName + operatorName + attributeName);
//        System.out.println("BB Effect is: " + effect.effectName + effect.operatorName + effect.attribute.formula.formula);
//        //should check greater than equal to ...etc
//        isMatch = effectName.equalsIgnoreCase(effect.effectName);
//
//        if (isIntNumber(attributeName) && isIntNumber(effect.attribute.formula.formula)) {
//
//            if (operatorName.equalsIgnoreCase("<") && effect.attribute.formula.formula.equalsIgnoreCase(">")) {
//                isMatch = false;
//            } else if (operatorName.equalsIgnoreCase(">") && effect.attribute.formula.formula.equalsIgnoreCase("<")) {
//                isMatch = false;
//            } else if (operatorName.equalsIgnoreCase("<") && (effect.attribute.formula.formula.equalsIgnoreCase("<") || effect.attribute.formula.formula.equalsIgnoreCase("="))) {
//                isMatch = Integer.parseInt(attributeName) < Integer.parseInt(effect.attribute.formula.formula);
//            } else if (operatorName.equalsIgnoreCase(">") && (effect.attribute.formula.formula.equalsIgnoreCase(">") || effect.attribute.formula.formula.equalsIgnoreCase("="))) {
//                isMatch = Integer.parseInt(attributeName) > Integer.parseInt(effect.attribute.formula.formula);
//            } else if (operatorName.equalsIgnoreCase("=")) {
//                isMatch = Integer.parseInt(attributeName) == Integer.parseInt(effect.attribute.formula.formula);
//            }
//
//        }
//        //Boolean is yet missing...
//
//        return isMatch;
//    }

    public boolean CompareEffect(String effectName_a, String operator_a, String attribute_a) {
        boolean isMatch = true;

        //should check greater than equal to ...etc
        isMatch = effectName.equalsIgnoreCase(effectName_a);

//        if(isMatch)
        {
            //System.out.println("Requirement is: " + effectName_a + operator_a + attribute_a);
            //System.out.println("Covered Effect is: " + effectName + operatorName + attributeName);
        }
        if (isMatch && isIntNumber(attributeName) && isIntNumber(attribute_a)) {

            if ((operatorName.equalsIgnoreCase(">") || operatorName.equalsIgnoreCase(">=")) && operator_a.equalsIgnoreCase(">=")) {
                isMatch = Integer.parseInt(attributeName) >= Integer.parseInt(attribute_a);
            } else if ((operatorName.equalsIgnoreCase(">") || operatorName.equalsIgnoreCase(">=")) && operator_a.equalsIgnoreCase("<=")) {
                isMatch = Integer.parseInt(attributeName) <= Integer.parseInt(attribute_a);
            } else if (operatorName.equalsIgnoreCase("<") && operator_a.equalsIgnoreCase(">=")) {
                isMatch = Integer.parseInt(attributeName) > Integer.parseInt(attribute_a);
            } else if ((operatorName.equalsIgnoreCase("<") || operatorName.equalsIgnoreCase("<=")) && operator_a.equalsIgnoreCase("<=")) {
                isMatch = Integer.parseInt(attributeName) <= Integer.parseInt(attribute_a);
            }
            if (operatorName.equalsIgnoreCase("<=") && operator_a.equalsIgnoreCase(">=")) {
                isMatch = Integer.parseInt(attributeName) >= Integer.parseInt(attribute_a);
            } else if (operatorName.equalsIgnoreCase("=")) {
                isMatch = Integer.parseInt(attributeName) == Integer.parseInt(attribute_a);
            }
            
            
//            if ((operatorName.equalsIgnoreCase(">") || operatorName.equalsIgnoreCase("=>")) && operator_a.equalsIgnoreCase("=>")) {
//                isMatch = Integer.parseInt(attributeName) >= Integer.parseInt(attribute_a);
//            } else if ((operatorName.equalsIgnoreCase(">") || operatorName.equalsIgnoreCase("=>")) && operator_a.equalsIgnoreCase("=<")) {
//                isMatch = Integer.parseInt(attributeName) <= Integer.parseInt(attribute_a);
//            } else if (operatorName.equalsIgnoreCase("<") && operator_a.equalsIgnoreCase("=>")) {
//                isMatch = Integer.parseInt(attributeName) > Integer.parseInt(attribute_a);
//            } else if ((operatorName.equalsIgnoreCase("<") || operatorName.equalsIgnoreCase("=<")) && operator_a.equalsIgnoreCase("=<")) {
//                isMatch = Integer.parseInt(attributeName) <= Integer.parseInt(attribute_a);
//            }
//            if (operatorName.equalsIgnoreCase("=<") && operator_a.equalsIgnoreCase("=>")) {
//                isMatch = Integer.parseInt(attributeName) >= Integer.parseInt(attribute_a);
//            } else if (operatorName.equalsIgnoreCase("=")) {
//                isMatch = Integer.parseInt(attributeName) == Integer.parseInt(attribute_a);
//            }

        }

        //System.out.println("isMatch is : " + isMatch);

        return isMatch;
    }

    public boolean isIntNumber(String num) {
        try {
            Integer.parseInt(num);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}

class BB {

    public BB() {
        bbID = "1";
        uuID = "";
        special = "";
    }
    String bbID;
    String uuID;
    String special;
}

class Connection {

    ArrayList<Port> ports;

    void Initialize() {
        ports = new ArrayList<Port>();
    }

    void addPort(String placeholderName, String portID) {
        Port port = new Port();
        port.placeholderName = placeholderName;
        port.portId = portID;
        ports.add(port);
    }
}

class Port {

    String placeholderName;
    String portId;
    String portName;
}

class CovEffect {

    public CovEffect() {
        effectName = "";
        operatorName = "";
        attributeName = "";
        isToggle = "";
        isRemove = false;
    }
    String effectName;
    String operatorName;
    String attributeName;
    String isToggle;
    boolean isRemove;

    public String getCoveredEffect() {
        return effectName + operatorName + attributeName;

    }

    public boolean CompareEffect(String effectName_a, String operator_a, String attribute_a) {
        boolean isMatch = true;

        //should check greater than equal to ...etc
        isMatch = effectName.equalsIgnoreCase(effectName_a);

//        if(isMatch)
        {
            //System.out.println("Requirement is: " + effectName_a + operator_a + attribute_a);
            //System.out.println("Covered Effect is: " + effectName + operatorName + attributeName);
        }
        if (isMatch && isIntNumber(attributeName) && isIntNumber(attribute_a)) {

            if ((operatorName.equalsIgnoreCase(">") || operatorName.equalsIgnoreCase(">=")) && operator_a.equalsIgnoreCase(">=")) {
                isMatch = Integer.parseInt(attributeName) >= Integer.parseInt(attribute_a);
            } else if ((operatorName.equalsIgnoreCase(">") || operatorName.equalsIgnoreCase(">=")) && operator_a.equalsIgnoreCase("<=")) {
                isMatch = Integer.parseInt(attributeName) <= Integer.parseInt(attribute_a);
            } else if (operatorName.equalsIgnoreCase("<") && operator_a.equalsIgnoreCase(">=")) {
                isMatch = Integer.parseInt(attributeName) > Integer.parseInt(attribute_a);
            } else if ((operatorName.equalsIgnoreCase("<") || operatorName.equalsIgnoreCase("<=")) && operator_a.equalsIgnoreCase("<=")) {
                isMatch = Integer.parseInt(attributeName) <= Integer.parseInt(attribute_a);
            }
            if (operatorName.equalsIgnoreCase("<=") && operator_a.equalsIgnoreCase(">=")) {
                isMatch = Integer.parseInt(attributeName) >= Integer.parseInt(attribute_a);
            } else if (operatorName.equalsIgnoreCase("=")) {
                isMatch = Integer.parseInt(attributeName) == Integer.parseInt(attribute_a);
            }

        }

        //System.out.println("isMatch is : " + isMatch);

        return isMatch;
    }

    public boolean isIntNumber(String num) {
        try {
            Integer.parseInt(num);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
