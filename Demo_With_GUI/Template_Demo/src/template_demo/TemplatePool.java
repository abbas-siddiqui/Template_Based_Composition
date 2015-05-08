/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package template_demo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author siddiqui
 */
public class TemplatePool {

    ArrayList<AvailableTemplate> templates = new ArrayList<AvailableTemplate>();
    ArrayList<AvailableTemplate> selectedTemplates = new ArrayList<AvailableTemplate>();
    ArrayList<String> qos = new ArrayList<String>();

    public TemplatePool() {
        qos.add("delay");
        qos.add("memory");
        qos.add("bandwidth");
        qos.add("jitter");
        qos.add("throughput");
        qos.add("cpu");
        qos.add("datarate");
    }

    public boolean containsQoSLowerCase(String requirement) {
        boolean isContain = false;
        String qosParam;
        for (int i = 0; i < qos.size(); i++) {
            qosParam = qos.get(i);
            if (requirement.toLowerCase().indexOf(qosParam) > 0)//contains(requirement.toLowerCase()))
            {
                isContain = true;
                return isContain;
            }
        }

        return isContain;

    }

    public void addTemplate(AvailableTemplate template) {
        templates.add(template);
    }

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


//        System.out.println("**********************Priting out merged requirements *********************************");
//        for (int i = 0; i < mergedReq.size(); i++) {
//
//            System.out.println(mergedReq.get(i).effect + mergedReq.get(i).operator + mergedReq.get(i).attribute);
//        }
//        System.out.println("**************************************************************************************");



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
//            System.out.println("**********************Priting out Template Covered Effects *********************************");
//            for (int k = 0; k < covEffs.size(); k++) {
//
//                System.out.println(covEffs.get(k).effectName + covEffs.get(k).operatorName + covEffs.get(k).attributeName);
//            }
//            System.out.println("**************************************************************************************");



            for (int l = 0; l < mergedReq.size(); l++) {
                // effect = mergedReq.get(l).effect + mergedReq.get(l).operator + mergedReq.get(l).attribute;

                if (isSelected) {
                    if (containsEffectLowerCase(covEffs, mergedReq.get(l).effect, mergedReq.get(l).operator, mergedReq.get(l).attribute)) {
                    } else {
                        isSelected = false;
                    }
                }
            }

//            for (int m = 0; m < covEffs.size(); m++) {
//
//                System.out.println("Removing Covered Effect : " + covEffs.get(m).getCoveredEffect());
//                System.out.println("isRemove is : " + covEffs.get(m).isRemove);
//                if (covEffs.get(m).isRemove) {
//                    covEffs.remove(m);
//                }
//            }
            
             Iterator iter = covEffs.iterator();
            while(iter.hasNext() ) {
                CovEffect ef1 = (CovEffect) iter.next();
//                 System.out.println("Removing Covered Effect : " + ef1.getCoveredEffect());
//                System.out.println("isRemove is : " + ef1.isRemove);
                if (ef1.isRemove){
                    iter.remove();
                }
            } 


//            System.out.println("isSelected is :" + isSelected);

            if (isSelected && covEffs != null) {
                if (!CheckRemainingCoveredEffects(covEffs)) {
                    selectedTemplates.add(temp);
                }
            }
        }

//        System.out.println("**********************Priting out Retrieved requirements *********************************");
//        for (int i = 0; i < req.requirements.size(); i++) {
//
//            System.out.println(req.requirements.get(i).effect + req.requirements.get(i).operator + req.requirements.get(i).attribute);
//        }
//        System.out.println("**************************************************************************************");

    }

    public boolean containsEffectLowerCase(ArrayList<CovEffect> tempdummyEffects, String effectName_a, String operator_a, String attribute_a) {
        boolean isContain = false;
        CovEffect coveredEffect;
        for (int i = 0; i < tempdummyEffects.size(); i++) {
            coveredEffect = tempdummyEffects.get(i);
            // System.out.println("Covered Effect is : " + coveredEffect.getCoveredEffect() + " Effect To be Checked is : " + searchEffect);
            //  if (coveredEffect.getCoveredEffect().toLowerCase().contains(searchEffect.toLowerCase())) {
            if (coveredEffect.CompareEffect(effectName_a, operator_a, attribute_a)) {
                isContain = true;
                coveredEffect.isRemove = true;
//                System.out.println("Covered Effect is : " + coveredEffect.getCoveredEffect());
//                System.out.println("isRemove is :" + coveredEffect.isRemove);
                return isContain;
            }
        }

        return isContain;

    }

    public boolean CheckRemainingCoveredEffects(ArrayList<CovEffect> effs) {
        boolean isAdditionalEffects = false;

//        System.out.println("**********************Priting out Remaining Covered Effects *********************************");
//        for (int k = 0; k < effs.size(); k++) {
//
//            System.out.println(effs.get(k).effectName + effs.get(k).operatorName + effs.get(k).attributeName);
//        }
//        System.out.println("**************************************************************************************");

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
