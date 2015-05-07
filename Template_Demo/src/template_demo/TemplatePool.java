package template_demo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *This class is used for storing all the templates and for searching the suitable templates with respect to requirements
 * @author siddiqui
 */
public class TemplatePool {

    ArrayList<AvailableTemplate> templates = new ArrayList<AvailableTemplate>();
    ArrayList<AvailableTemplate> selectedTemplates = new ArrayList<AvailableTemplate>();
    ArrayList<String> qos = new ArrayList<String>();

    /**
     * Hard-Coded QoS parameters for the sake of proof-of-concept
     */
    public TemplatePool() {
        qos.add("delay");
        qos.add("memory");
        qos.add("bandwidth");
        qos.add("jitter");
        qos.add("throughput");
        qos.add("cpu");
        qos.add("datarate");
    }

    /**
     *Search requirements for QoS prameters
     * @param requirement
     * @return
     */
    public boolean containsQoSLowerCase(String requirement) {
        boolean isContain = false;
        String qosParam;
        for (int i = 0; i < qos.size(); i++) {
            qosParam = qos.get(i);
            if (requirement.toLowerCase().indexOf(qosParam) > 0) {
                isContain = true;
                return isContain;
            }
        }
        return isContain;
    }

    /**
     *
     * @param template
     */
    public void addTemplate(AvailableTemplate template) {
        templates.add(template);
    }

    /**
     *Search for suitable templates for the given requirements and domain policies
     * @param req
     * @param policies
     */
    public void SearchforTemplates(RetrievedRequirements req, DomainPolicies policies) {

        selectedTemplates.clear();
        boolean isSelected = true;
        String effect = "";
        Require requir;
        CovEffect tempEffect;

        ArrayList<Require> mergedReq = new ArrayList<Require>();
        ArrayList<CovEffect> covEffs = new ArrayList<CovEffect>();

        //Find Domain
        ArrayList<Require> domainReq = policies.GetDomainRequirements(req.domainName);

        //Merge Requirements from Application and Domain Policies
        for (int i = 0; i < req.requirements.size(); i++) {
            requir = CreateNewRequirement(req.requirements.get(i).effect, req.requirements.get(i).operator, req.requirements.get(i).attribute);
            if (!mergedReq.contains(requir)) {
                mergedReq.add(requir);
            }
        }
        for (int i = 0; i < domainReq.size(); i++) {
            requir = CreateNewRequirement(domainReq.get(i).effect, domainReq.get(i).operator, domainReq.get(i).attribute);
            if (!mergedReq.contains(requir)) {
                mergedReq.add(requir);
            }
        }

        // *********************Extract QoS requirements**************************
        for (int i = 0; i < mergedReq.size(); i++) {

            if (containsQoSLowerCase(mergedReq.get(i).effect)) {
                mergedReq.remove(i);
            }
        }

        for (int i = 0; i < templates.size(); i++) {

            isSelected = true;
            AvailableTemplate temp = templates.get(i);
            covEffs.clear();
            //Copy Template covered Effects in a dummy Array List
            for (int k = 0; k < temp.coveredEffects.size(); k++) {
                tempEffect = new CovEffect();
                tempEffect.effectName = temp.coveredEffects.get(k).effectName;
                tempEffect.operatorName = temp.coveredEffects.get(k).operatorName;
                tempEffect.attributeName = temp.coveredEffects.get(k).attributeName;
                tempEffect.isToggle = temp.coveredEffects.get(k).isToggle;

                covEffs.add(tempEffect);
            }
            for (int l = 0; l < mergedReq.size(); l++) {
                // effect = mergedReq.get(l).effect + mergedReq.get(l).operator + mergedReq.get(l).attribute;

                if (isSelected) {
                    if (containsEffectLowerCase(covEffs, mergedReq.get(l).effect, mergedReq.get(l).operator, mergedReq.get(l).attribute)) {
                    } else {
                        isSelected = false;
                    }
                }
            }

            Iterator iter = covEffs.iterator();
            while (iter.hasNext()) {
                CovEffect ef1 = (CovEffect) iter.next();
                if (ef1.isRemove) {
                    iter.remove();
                }
            }

            if (isSelected && covEffs != null) {
                if (!CheckRemainingCoveredEffects(covEffs)) {
                    selectedTemplates.add(temp);
                }
            }
        }
    }

    /**
     * To check if the effect is covered in the template
     */
    public boolean containsEffectLowerCase(ArrayList<CovEffect> tempdummyEffects, String effectName_a, String operator_a, String attribute_a) {
        boolean isContain = false;
        CovEffect coveredEffect;
        for (int i = 0; i < tempdummyEffects.size(); i++) {
            coveredEffect = tempdummyEffects.get(i);
            if (coveredEffect.CompareEffect(effectName_a, operator_a, attribute_a)) {
                isContain = true;
                coveredEffect.isRemove = true;
                return isContain;
            }
        }
        return isContain;
    }

    /**
     * Check for additional effects
     * @param effs
     * @return
     */
    public boolean CheckRemainingCoveredEffects(ArrayList<CovEffect> effs) {
        boolean isAdditionalEffects = false;

        if (effs.size() > 0) {
            for (int i = 0; i < effs.size(); i++) {
                if (effs.get(i) != null) {
                    if (effs.get(i).isToggle.contains("false")) {
                        isAdditionalEffects = true;
                    }
                }
            }
        }
        return isAdditionalEffects;
    }

  
    public Require CreateNewRequirement(String effectName, String operator, String attribute) {
        Require req = new Require();
        req.effect = effectName;
        req.operator = operator;
        req.attribute = attribute;
        return req;
    }
}
