package template_demo;

import java.util.ArrayList;

/**
 *This class is actual processed template and contains all the placeholders, effects and connections
 * @author siddiqui
 */
public class AvailableTemplate {

    String tempName; 
    ArrayList<Connection> connections;
    ArrayList<CovEffect> coveredEffects;
    ArrayList<String> domains;
    ArrayList<PlaceHold> placeHolders;

    /**
     *It initializes all attributes
     * @param templateName
     */
    public void Initialize(String templateName) {
        connections = new ArrayList<Connection>();
        coveredEffects = new ArrayList<CovEffect>();
        domains = new ArrayList<String>();
        placeHolders = new ArrayList<PlaceHold>();
        tempName = templateName;

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
        PlaceHold place = new PlaceHold();
        place.placeHolderName = placeHolderName;
        place.placeHolderID = placeHolderID;
        place.isToggle = isToggle;
        placeHolders.add(place);
        return place;
    }

    /**
     *
     * @param availableBBs
     */
    public void FillTemplate(ArrayList<AvailableBB> availableBBs) {
        for (int j = 0; j < availableBBs.size(); j++) {
            for (int i = 0; i < placeHolders.size(); i++) {
                placeHolders.get(i).DoesItMatch(availableBBs.get(j));
            }
        }
    }
}

/**
 *This class holds the information about a placeholder
 * @author siddiqui
 */
class PlaceHold {
    String placeHolderName,placeHolderID;
    boolean isToggle;
    ArrayList<PlaceHolderPort> placeholderPorts;
    BB suggestedBB;
    ArrayList<BB> preselectedBB;
    ArrayList<AvailableBB> possibleAvaBB;
    BB selectedBB;
    int selectedBBIndex = 0;  int possibleBBIndex = 0; int countFornextBranch = 0;
    int possiblePermutations = 0;

    public PlaceHold() {
        placeHolderName = "";  placeHolderID = "";   isToggle = false;
        placeholderPorts = new ArrayList<PlaceHolderPort>();
        suggestedBB = new BB();
        selectedBB = new BB();
        preselectedBB = new ArrayList<BB>();
        possibleAvaBB = new ArrayList<AvailableBB>();
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
    /**
     *This method checks if a Building Block is suitable for this placeholder     
     */
    public boolean DoesItMatch(AvailableBB bb) {
        boolean isMatch = true;   boolean isPort = false;
        for (int i = 0; i < placeholderPorts.size(); i++) {
            isPort = false;
            for (int j = 0; j < bb.ports.size(); j++) {
                isPort = placeholderPorts.get(i).DoesItMatch(bb.ports.get(j));
                if (isPort) {
                    bb.ports.get(j).addBBPHPortMapping(this.placeHolderName, this.placeHolderID, placeholderPorts.get(i).portId);
                    break;
                }
            }
            if (!isPort) return false;
        }
        if (isMatch) possibleAvaBB.add(bb);        
        return isMatch;
    }
}
/**
 *This class holds the information about a placeholder port
 * @author siddiqui
 */
class PlaceHolderPort {
    String portId;
    ArrayList<PlaceHolderEffect> offeredEffects;
    ArrayList<PlaceHolderEffect> requiredEffects;

    public PlaceHolderPort() {
        portId = "";
        offeredEffects = new ArrayList<PlaceHolderEffect>();
        requiredEffects = new ArrayList<PlaceHolderEffect>();
    }

    /**
     *This method checks if a Building Block port matches with the placeholder port
     */
    public boolean DoesItMatch(BBPort port) {
        boolean isPortFound = true;
        boolean isEffectFound;

        //Check Offered Effects
        for (int i = 0; i < offeredEffects.size(); i++) {

            isEffectFound = false;
            for (int j = 0; j < port.oEffects.size(); j++) {
                isEffectFound = offeredEffects.get(i).CompareEffect(port.oEffects.get(j).effectName, port.oEffects.get(j).operatorName, port.oEffects.get(j).attribute.formula.formula);
                if (isEffectFound)  break;
            }

            if (!isEffectFound) return false;
        }

        //Check Required Effects
        for (int i = 0; i < requiredEffects.size(); i++) {

            isEffectFound = false;
            for (int j = 0; j < port.rEffects.size(); j++) {
                isEffectFound = requiredEffects.get(i).CompareEffect(port.rEffects.get(j).effectName, port.rEffects.get(j).operatorName, port.rEffects.get(j).attribute.formula.formula);

                if (isEffectFound) break;
            }
            if (!isEffectFound) return false;
        }
        return isPortFound;
    }
}

/**
 *This class holds the information about a effect of the placeholder port
 * @author siddiqui
 */
class PlaceHolderEffect {

    public PlaceHolderEffect() {
        effectName = ""; operatorName = ""; attributeName = "";
    }
    String effectName,operatorName,attributeName;
    public String getPlaceHolderEffect() {
        return effectName + operatorName + attributeName;
    }
     /**
     *This method checks if a Building Block port effect matches with the placeholder port effect
     */
    public boolean CompareEffect(String effectName_a, String operator_a, String attribute_a) {
        boolean isMatch = true;

        //should check greater than equal to ...etc
        isMatch = effectName.equalsIgnoreCase(effectName_a);
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
/**
 *This class holds a dummy BB
 * @author siddiqui
 */
class BB {

    public BB() {
        bbID = "1"; uuID = ""; special = "";
    }
    String bbID,uuID,special;
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

    String placeholderName,portId,portName;
}

class CovEffect {

    public CovEffect() {
        effectName = ""; operatorName = ""; attributeName = "";isToggle = "";
        isRemove = false;
    }
    String effectName,operatorName,attributeName,isToggle;
    boolean isRemove;

    public String getCoveredEffect() {
        return effectName + operatorName + attributeName;

    }

    public boolean CompareEffect(String effectName_a, String operator_a, String attribute_a) {
        boolean isMatch = true;

        //should check greater than equal to ...etc
        isMatch = effectName.equalsIgnoreCase(effectName_a);
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
