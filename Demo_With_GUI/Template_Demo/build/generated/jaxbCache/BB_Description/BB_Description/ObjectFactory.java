//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2012.07.25 um 04:03:48 PM CEST 
//


package BB_Description;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the BB_Description package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: BB_Description
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuildingBlock }
     * 
     */
    public BuildingBlock createBuildingBlock() {
        return new BuildingBlock();
    }

    /**
     * Create an instance of {@link BuildingBlock.Optional }
     * 
     */
    public BuildingBlock.Optional createBuildingBlockOptional() {
        return new BuildingBlock.Optional();
    }

    /**
     * Create an instance of {@link BuildingBlock.Optional.QOS }
     * 
     */
    public BuildingBlock.Optional.QOS createBuildingBlockOptionalQOS() {
        return new BuildingBlock.Optional.QOS();
    }

    /**
     * Create an instance of {@link BuildingBlock.Optional.QOS.Attribute }
     * 
     */
    public BuildingBlock.Optional.QOS.Attribute createBuildingBlockOptionalQOSAttribute() {
        return new BuildingBlock.Optional.QOS.Attribute();
    }

    /**
     * Create an instance of {@link BuildingBlock.Port }
     * 
     */
    public BuildingBlock.Port createBuildingBlockPort() {
        return new BuildingBlock.Port();
    }

    /**
     * Create an instance of {@link BuildingBlock.Port.Requirement }
     * 
     */
    public BuildingBlock.Port.Requirement createBuildingBlockPortRequirement() {
        return new BuildingBlock.Port.Requirement();
    }

    /**
     * Create an instance of {@link BuildingBlock.Port.Requirement.Attribute }
     * 
     */
    public BuildingBlock.Port.Requirement.Attribute createBuildingBlockPortRequirementAttribute() {
        return new BuildingBlock.Port.Requirement.Attribute();
    }

    /**
     * Create an instance of {@link BuildingBlock.Port.Offering }
     * 
     */
    public BuildingBlock.Port.Offering createBuildingBlockPortOffering() {
        return new BuildingBlock.Port.Offering();
    }

    /**
     * Create an instance of {@link BuildingBlock.Port.Offering.Attribute }
     * 
     */
    public BuildingBlock.Port.Offering.Attribute createBuildingBlockPortOfferingAttribute() {
        return new BuildingBlock.Port.Offering.Attribute();
    }

    /**
     * Create an instance of {@link BuildingBlock.Optional.QOS.Attribute.Formula }
     * 
     */
    public BuildingBlock.Optional.QOS.Attribute.Formula createBuildingBlockOptionalQOSAttributeFormula() {
        return new BuildingBlock.Optional.QOS.Attribute.Formula();
    }

    /**
     * Create an instance of {@link BuildingBlock.Port.Requirement.Attribute.Formula }
     * 
     */
    public BuildingBlock.Port.Requirement.Attribute.Formula createBuildingBlockPortRequirementAttributeFormula() {
        return new BuildingBlock.Port.Requirement.Attribute.Formula();
    }

    /**
     * Create an instance of {@link BuildingBlock.Port.Offering.Attribute.Formula }
     * 
     */
    public BuildingBlock.Port.Offering.Attribute.Formula createBuildingBlockPortOfferingAttributeFormula() {
        return new BuildingBlock.Port.Offering.Attribute.Formula();
    }

}
