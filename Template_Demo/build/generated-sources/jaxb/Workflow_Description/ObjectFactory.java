//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.04 at 05:51:05 PM CEST 
//


package Workflow_Description;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the Workflow_Description package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Workflow_Description
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Workflow }
     * 
     */
    public Workflow createWorkflow() {
        return new Workflow();
    }

    /**
     * Create an instance of {@link Workflow.Connections }
     * 
     */
    public Workflow.Connections createWorkflowConnections() {
        return new Workflow.Connections();
    }

    /**
     * Create an instance of {@link Workflow.Connections.Connection }
     * 
     */
    public Workflow.Connections.Connection createWorkflowConnectionsConnection() {
        return new Workflow.Connections.Connection();
    }

    /**
     * Create an instance of {@link Workflow.Buildingblocks }
     * 
     */
    public Workflow.Buildingblocks createWorkflowBuildingblocks() {
        return new Workflow.Buildingblocks();
    }

    /**
     * Create an instance of {@link Workflow.Buildingblocks.Buildingblock }
     * 
     */
    public Workflow.Buildingblocks.Buildingblock createWorkflowBuildingblocksBuildingblock() {
        return new Workflow.Buildingblocks.Buildingblock();
    }

    /**
     * Create an instance of {@link Workflow.Buildingblocks.Buildingblock.Port }
     * 
     */
    public Workflow.Buildingblocks.Buildingblock.Port createWorkflowBuildingblocksBuildingblockPort() {
        return new Workflow.Buildingblocks.Buildingblock.Port();
    }

    /**
     * Create an instance of {@link Workflow.Optional }
     * 
     */
    public Workflow.Optional createWorkflowOptional() {
        return new Workflow.Optional();
    }

    /**
     * Create an instance of {@link Workflow.Optional.Offering }
     * 
     */
    public Workflow.Optional.Offering createWorkflowOptionalOffering() {
        return new Workflow.Optional.Offering();
    }

    /**
     * Create an instance of {@link Workflow.Connections.Connection.Port }
     * 
     */
    public Workflow.Connections.Connection.Port createWorkflowConnectionsConnectionPort() {
        return new Workflow.Connections.Connection.Port();
    }

    /**
     * Create an instance of {@link Workflow.Buildingblocks.Buildingblock.Port.OfferedEffect }
     * 
     */
    public Workflow.Buildingblocks.Buildingblock.Port.OfferedEffect createWorkflowBuildingblocksBuildingblockPortOfferedEffect() {
        return new Workflow.Buildingblocks.Buildingblock.Port.OfferedEffect();
    }

    /**
     * Create an instance of {@link Workflow.Buildingblocks.Buildingblock.Port.RequiredEffect }
     * 
     */
    public Workflow.Buildingblocks.Buildingblock.Port.RequiredEffect createWorkflowBuildingblocksBuildingblockPortRequiredEffect() {
        return new Workflow.Buildingblocks.Buildingblock.Port.RequiredEffect();
    }

    /**
     * Create an instance of {@link Workflow.Optional.Offering.Attribute }
     * 
     */
    public Workflow.Optional.Offering.Attribute createWorkflowOptionalOfferingAttribute() {
        return new Workflow.Optional.Offering.Attribute();
    }

}
