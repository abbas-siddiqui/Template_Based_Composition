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
public class RetrievedRequirements {

    ArrayList<Require> requirements;    
    String domainName;

    public RetrievedRequirements() {
        requirements = new ArrayList<Require>();
    }

    public void setDomainName(String domain) {
        domainName = domain;
    }

    public void addRequirement(String effectName, String operator, String attribute) {

        Require req = new Require();
        req.effect = effectName;
        req.operator = operator;
        req.attribute = attribute;
        requirements.add(req);
    }
}

class Require {

    String effect;
    String operator;
    String attribute;
    
}