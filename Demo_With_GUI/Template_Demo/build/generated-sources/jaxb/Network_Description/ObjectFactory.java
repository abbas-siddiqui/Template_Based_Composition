//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2012.07.25 um 04:03:51 PM CEST 
//


package Network_Description;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the Network_Description package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Network_Description
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Offerings }
     * 
     */
    public Offerings createOfferings() {
        return new Offerings();
    }

    /**
     * Create an instance of {@link Offerings.Optional }
     * 
     */
    public Offerings.Optional createOfferingsOptional() {
        return new Offerings.Optional();
    }

    /**
     * Create an instance of {@link Offerings.Optional.Offering }
     * 
     */
    public Offerings.Optional.Offering createOfferingsOptionalOffering() {
        return new Offerings.Optional.Offering();
    }

    /**
     * Create an instance of {@link Offerings.Mandatory }
     * 
     */
    public Offerings.Mandatory createOfferingsMandatory() {
        return new Offerings.Mandatory();
    }

    /**
     * Create an instance of {@link Offerings.Mandatory.Offering }
     * 
     */
    public Offerings.Mandatory.Offering createOfferingsMandatoryOffering() {
        return new Offerings.Mandatory.Offering();
    }

    /**
     * Create an instance of {@link Offerings.Optional.Offering.Attribute }
     * 
     */
    public Offerings.Optional.Offering.Attribute createOfferingsOptionalOfferingAttribute() {
        return new Offerings.Optional.Offering.Attribute();
    }

    /**
     * Create an instance of {@link Offerings.Mandatory.Offering.Attribute }
     * 
     */
    public Offerings.Mandatory.Offering.Attribute createOfferingsMandatoryOfferingAttribute() {
        return new Offerings.Mandatory.Offering.Attribute();
    }

}
