//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2012.07.25 um 04:03:47 PM CEST 
//


package reqdesc.requirements;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the reqdesc.requirements package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: reqdesc.requirements
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Requirements }
     * 
     */
    public Requirements createRequirements() {
        return new Requirements();
    }

    /**
     * Create an instance of {@link Requirements.Mandatory }
     * 
     */
    public Requirements.Mandatory createRequirementsMandatory() {
        return new Requirements.Mandatory();
    }

    /**
     * Create an instance of {@link Requirements.Mandatory.Requirement }
     * 
     */
    public Requirements.Mandatory.Requirement createRequirementsMandatoryRequirement() {
        return new Requirements.Mandatory.Requirement();
    }

    /**
     * Create an instance of {@link Requirements.Requirement }
     * 
     */
    public Requirements.Requirement createRequirementsRequirement() {
        return new Requirements.Requirement();
    }

    /**
     * Create an instance of {@link Requirements.Mandatory.Requirement.Attribute }
     * 
     */
    public Requirements.Mandatory.Requirement.Attribute createRequirementsMandatoryRequirementAttribute() {
        return new Requirements.Mandatory.Requirement.Attribute();
    }

    /**
     * Create an instance of {@link Requirements.Requirement.Attribute }
     * 
     */
    public Requirements.Requirement.Attribute createRequirementsRequirementAttribute() {
        return new Requirements.Requirement.Attribute();
    }

}
