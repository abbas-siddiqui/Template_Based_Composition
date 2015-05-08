//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2012.07.25 um 04:03:49 PM CEST 
//


package Domain_Policies;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the Domain_Policies package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Domain_Policies
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DomainsPolicies }
     * 
     */
    public DomainsPolicies createDomainsPolicies() {
        return new DomainsPolicies();
    }

    /**
     * Create an instance of {@link DomainsPolicies.Domain }
     * 
     */
    public DomainsPolicies.Domain createDomainsPoliciesDomain() {
        return new DomainsPolicies.Domain();
    }

    /**
     * Create an instance of {@link DomainsPolicies.Domain.Condition }
     * 
     */
    public DomainsPolicies.Domain.Condition createDomainsPoliciesDomainCondition() {
        return new DomainsPolicies.Domain.Condition();
    }

    /**
     * Create an instance of {@link DomainsPolicies.Domain.Requirement }
     * 
     */
    public DomainsPolicies.Domain.Requirement createDomainsPoliciesDomainRequirement() {
        return new DomainsPolicies.Domain.Requirement();
    }

    /**
     * Create an instance of {@link DomainsPolicies.Domain.Condition.IF }
     * 
     */
    public DomainsPolicies.Domain.Condition.IF createDomainsPoliciesDomainConditionIF() {
        return new DomainsPolicies.Domain.Condition.IF();
    }

    /**
     * Create an instance of {@link DomainsPolicies.Domain.Condition.Then }
     * 
     */
    public DomainsPolicies.Domain.Condition.Then createDomainsPoliciesDomainConditionThen() {
        return new DomainsPolicies.Domain.Condition.Then();
    }

    /**
     * Create an instance of {@link DomainsPolicies.Domain.Requirement.Attribute }
     * 
     */
    public DomainsPolicies.Domain.Requirement.Attribute createDomainsPoliciesDomainRequirementAttribute() {
        return new DomainsPolicies.Domain.Requirement.Attribute();
    }

}
