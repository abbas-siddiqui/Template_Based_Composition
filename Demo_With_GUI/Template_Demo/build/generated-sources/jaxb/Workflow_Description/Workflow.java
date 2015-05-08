//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2012.07.25 um 04:03:46 PM CEST 
//


package Workflow_Description;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Optional" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Offering" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Effect" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *                             &lt;element name="Operator" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                                   &lt;enumeration value="="/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Attribute" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *                                     &lt;attribute name="Unit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="buildingblocks">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="buildingblock" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Port" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="OfferedEffect" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Effect" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
 *                                               &lt;attribute name="Operator" use="required">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                                                     &lt;enumeration value="=>"/>
 *                                                     &lt;enumeration value="=&lt;"/>
 *                                                     &lt;enumeration value="&lt;"/>
 *                                                     &lt;enumeration value=">"/>
 *                                                     &lt;enumeration value="="/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="Attribute" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="RequiredEffect" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Effect" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
 *                                               &lt;attribute name="Operator" use="required">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                                                     &lt;enumeration value="=>"/>
 *                                                     &lt;enumeration value="=&lt;"/>
 *                                                     &lt;enumeration value="&lt;"/>
 *                                                     &lt;enumeration value=">"/>
 *                                                     &lt;enumeration value="="/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="Attribute" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="PortID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
 *                           &lt;attribute name="uuid" type="{http://www.w3.org/2001/XMLSchema}token" />
 *                           &lt;attribute name="special" type="{http://www.w3.org/2001/XMLSchema}token" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="connections">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="connection" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="port" maxOccurs="2">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="blockname" type="{http://www.w3.org/2001/XMLSchema}token" />
 *                                     &lt;attribute name="blockid" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                     &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                     &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "optional",
    "buildingblocks",
    "connections"
})
@XmlRootElement(name = "Workflow")
public class Workflow {

    @XmlElement(name = "Optional")
    protected Workflow.Optional optional;
    @XmlElement(required = true)
    protected Workflow.Buildingblocks buildingblocks;
    @XmlElement(required = true)
    protected Workflow.Connections connections;

    /**
     * Ruft den Wert der optional-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Workflow.Optional }
     *     
     */
    public Workflow.Optional getOptional() {
        return optional;
    }

    /**
     * Legt den Wert der optional-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Workflow.Optional }
     *     
     */
    public void setOptional(Workflow.Optional value) {
        this.optional = value;
    }

    /**
     * Ruft den Wert der buildingblocks-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Workflow.Buildingblocks }
     *     
     */
    public Workflow.Buildingblocks getBuildingblocks() {
        return buildingblocks;
    }

    /**
     * Legt den Wert der buildingblocks-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Workflow.Buildingblocks }
     *     
     */
    public void setBuildingblocks(Workflow.Buildingblocks value) {
        this.buildingblocks = value;
    }

    /**
     * Ruft den Wert der connections-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Workflow.Connections }
     *     
     */
    public Workflow.Connections getConnections() {
        return connections;
    }

    /**
     * Legt den Wert der connections-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Workflow.Connections }
     *     
     */
    public void setConnections(Workflow.Connections value) {
        this.connections = value;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="buildingblock" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Port" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="OfferedEffect" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Effect" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
     *                                     &lt;attribute name="Operator" use="required">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *                                           &lt;enumeration value="=>"/>
     *                                           &lt;enumeration value="=&lt;"/>
     *                                           &lt;enumeration value="&lt;"/>
     *                                           &lt;enumeration value=">"/>
     *                                           &lt;enumeration value="="/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="Attribute" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="RequiredEffect" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Effect" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
     *                                     &lt;attribute name="Operator" use="required">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *                                           &lt;enumeration value="=>"/>
     *                                           &lt;enumeration value="=&lt;"/>
     *                                           &lt;enumeration value="&lt;"/>
     *                                           &lt;enumeration value=">"/>
     *                                           &lt;enumeration value="="/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="Attribute" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="PortID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
     *                 &lt;attribute name="uuid" type="{http://www.w3.org/2001/XMLSchema}token" />
     *                 &lt;attribute name="special" type="{http://www.w3.org/2001/XMLSchema}token" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "buildingblock"
    })
    public static class Buildingblocks {

        @XmlElement(required = true)
        protected List<Workflow.Buildingblocks.Buildingblock> buildingblock;

        /**
         * Gets the value of the buildingblock property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the buildingblock property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBuildingblock().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Workflow.Buildingblocks.Buildingblock }
         * 
         * 
         */
        public List<Workflow.Buildingblocks.Buildingblock> getBuildingblock() {
            if (buildingblock == null) {
                buildingblock = new ArrayList<Workflow.Buildingblocks.Buildingblock>();
            }
            return this.buildingblock;
        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Port" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="OfferedEffect" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Effect" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
         *                           &lt;attribute name="Operator" use="required">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
         *                                 &lt;enumeration value="=>"/>
         *                                 &lt;enumeration value="=&lt;"/>
         *                                 &lt;enumeration value="&lt;"/>
         *                                 &lt;enumeration value=">"/>
         *                                 &lt;enumeration value="="/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="Attribute" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="RequiredEffect" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Effect" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
         *                           &lt;attribute name="Operator" use="required">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
         *                                 &lt;enumeration value="=>"/>
         *                                 &lt;enumeration value="=&lt;"/>
         *                                 &lt;enumeration value="&lt;"/>
         *                                 &lt;enumeration value=">"/>
         *                                 &lt;enumeration value="="/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="Attribute" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="PortID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
         *       &lt;attribute name="uuid" type="{http://www.w3.org/2001/XMLSchema}token" />
         *       &lt;attribute name="special" type="{http://www.w3.org/2001/XMLSchema}token" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "port"
        })
        public static class Buildingblock {

            @XmlElement(name = "Port", required = true)
            protected List<Workflow.Buildingblocks.Buildingblock.Port> port;
            @XmlAttribute(name = "id", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String id;
            @XmlAttribute(name = "uuid")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String uuid;
            @XmlAttribute(name = "special")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String special;

            /**
             * Gets the value of the port property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the port property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPort().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Workflow.Buildingblocks.Buildingblock.Port }
             * 
             * 
             */
            public List<Workflow.Buildingblocks.Buildingblock.Port> getPort() {
                if (port == null) {
                    port = new ArrayList<Workflow.Buildingblocks.Buildingblock.Port>();
                }
                return this.port;
            }

            /**
             * Ruft den Wert der id-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * Legt den Wert der id-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }

            /**
             * Ruft den Wert der uuid-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUuid() {
                return uuid;
            }

            /**
             * Legt den Wert der uuid-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUuid(String value) {
                this.uuid = value;
            }

            /**
             * Ruft den Wert der special-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSpecial() {
                return special;
            }

            /**
             * Legt den Wert der special-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSpecial(String value) {
                this.special = value;
            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="OfferedEffect" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Effect" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
             *                 &lt;attribute name="Operator" use="required">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
             *                       &lt;enumeration value="=>"/>
             *                       &lt;enumeration value="=&lt;"/>
             *                       &lt;enumeration value="&lt;"/>
             *                       &lt;enumeration value=">"/>
             *                       &lt;enumeration value="="/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="Attribute" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="RequiredEffect" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Effect" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
             *                 &lt;attribute name="Operator" use="required">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
             *                       &lt;enumeration value="=>"/>
             *                       &lt;enumeration value="=&lt;"/>
             *                       &lt;enumeration value="&lt;"/>
             *                       &lt;enumeration value=">"/>
             *                       &lt;enumeration value="="/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="Attribute" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="PortID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "offeredEffect",
                "requiredEffect"
            })
            public static class Port {

                @XmlElement(name = "OfferedEffect", required = true)
                protected List<Workflow.Buildingblocks.Buildingblock.Port.OfferedEffect> offeredEffect;
                @XmlElement(name = "RequiredEffect")
                protected List<Workflow.Buildingblocks.Buildingblock.Port.RequiredEffect> requiredEffect;
                @XmlAttribute(name = "PortID", required = true)
                protected String portID;

                /**
                 * Gets the value of the offeredEffect property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the offeredEffect property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getOfferedEffect().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Workflow.Buildingblocks.Buildingblock.Port.OfferedEffect }
                 * 
                 * 
                 */
                public List<Workflow.Buildingblocks.Buildingblock.Port.OfferedEffect> getOfferedEffect() {
                    if (offeredEffect == null) {
                        offeredEffect = new ArrayList<Workflow.Buildingblocks.Buildingblock.Port.OfferedEffect>();
                    }
                    return this.offeredEffect;
                }

                /**
                 * Gets the value of the requiredEffect property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the requiredEffect property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getRequiredEffect().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Workflow.Buildingblocks.Buildingblock.Port.RequiredEffect }
                 * 
                 * 
                 */
                public List<Workflow.Buildingblocks.Buildingblock.Port.RequiredEffect> getRequiredEffect() {
                    if (requiredEffect == null) {
                        requiredEffect = new ArrayList<Workflow.Buildingblocks.Buildingblock.Port.RequiredEffect>();
                    }
                    return this.requiredEffect;
                }

                /**
                 * Ruft den Wert der portID-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPortID() {
                    return portID;
                }

                /**
                 * Legt den Wert der portID-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPortID(String value) {
                    this.portID = value;
                }


                /**
                 * <p>Java-Klasse für anonymous complex type.
                 * 
                 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="Effect" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
                 *       &lt;attribute name="Operator" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
                 *             &lt;enumeration value="=>"/>
                 *             &lt;enumeration value="=&lt;"/>
                 *             &lt;enumeration value="&lt;"/>
                 *             &lt;enumeration value=">"/>
                 *             &lt;enumeration value="="/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="Attribute" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class OfferedEffect {

                    @XmlAttribute(name = "Effect", required = true)
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "token")
                    protected String effect;
                    @XmlAttribute(name = "Operator", required = true)
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    protected String operator;
                    @XmlAttribute(name = "Attribute", required = true)
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "token")
                    protected String attribute;

                    /**
                     * Ruft den Wert der effect-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getEffect() {
                        return effect;
                    }

                    /**
                     * Legt den Wert der effect-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setEffect(String value) {
                        this.effect = value;
                    }

                    /**
                     * Ruft den Wert der operator-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getOperator() {
                        return operator;
                    }

                    /**
                     * Legt den Wert der operator-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setOperator(String value) {
                        this.operator = value;
                    }

                    /**
                     * Ruft den Wert der attribute-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAttribute() {
                        return attribute;
                    }

                    /**
                     * Legt den Wert der attribute-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAttribute(String value) {
                        this.attribute = value;
                    }

                }


                /**
                 * <p>Java-Klasse für anonymous complex type.
                 * 
                 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="Effect" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
                 *       &lt;attribute name="Operator" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
                 *             &lt;enumeration value="=>"/>
                 *             &lt;enumeration value="=&lt;"/>
                 *             &lt;enumeration value="&lt;"/>
                 *             &lt;enumeration value=">"/>
                 *             &lt;enumeration value="="/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="Attribute" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class RequiredEffect {

                    @XmlAttribute(name = "Effect", required = true)
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "token")
                    protected String effect;
                    @XmlAttribute(name = "Operator", required = true)
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    protected String operator;
                    @XmlAttribute(name = "Attribute", required = true)
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "token")
                    protected String attribute;

                    /**
                     * Ruft den Wert der effect-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getEffect() {
                        return effect;
                    }

                    /**
                     * Legt den Wert der effect-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setEffect(String value) {
                        this.effect = value;
                    }

                    /**
                     * Ruft den Wert der operator-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getOperator() {
                        return operator;
                    }

                    /**
                     * Legt den Wert der operator-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setOperator(String value) {
                        this.operator = value;
                    }

                    /**
                     * Ruft den Wert der attribute-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAttribute() {
                        return attribute;
                    }

                    /**
                     * Legt den Wert der attribute-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAttribute(String value) {
                        this.attribute = value;
                    }

                }

            }

        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="connection" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="port" maxOccurs="2">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="blockname" type="{http://www.w3.org/2001/XMLSchema}token" />
     *                           &lt;attribute name="blockid" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                           &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "connection"
    })
    public static class Connections {

        @XmlElement(required = true)
        protected List<Workflow.Connections.Connection> connection;

        /**
         * Gets the value of the connection property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the connection property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConnection().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Workflow.Connections.Connection }
         * 
         * 
         */
        public List<Workflow.Connections.Connection> getConnection() {
            if (connection == null) {
                connection = new ArrayList<Workflow.Connections.Connection>();
            }
            return this.connection;
        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="port" maxOccurs="2">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="blockname" type="{http://www.w3.org/2001/XMLSchema}token" />
         *                 &lt;attribute name="blockid" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "port"
        })
        public static class Connection {

            @XmlElement(required = true)
            protected List<Workflow.Connections.Connection.Port> port;

            /**
             * Gets the value of the port property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the port property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPort().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Workflow.Connections.Connection.Port }
             * 
             * 
             */
            public List<Workflow.Connections.Connection.Port> getPort() {
                if (port == null) {
                    port = new ArrayList<Workflow.Connections.Connection.Port>();
                }
                return this.port;
            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="blockname" type="{http://www.w3.org/2001/XMLSchema}token" />
             *       &lt;attribute name="blockid" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Port {

                @XmlAttribute(name = "blockname")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "token")
                protected String blockname;
                @XmlAttribute(name = "blockid", required = true)
                @XmlSchemaType(name = "anySimpleType")
                protected String blockid;
                @XmlAttribute(name = "name")
                @XmlSchemaType(name = "anySimpleType")
                protected String name;
                @XmlAttribute(name = "id", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "token")
                protected String id;

                /**
                 * Ruft den Wert der blockname-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBlockname() {
                    return blockname;
                }

                /**
                 * Legt den Wert der blockname-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBlockname(String value) {
                    this.blockname = value;
                }

                /**
                 * Ruft den Wert der blockid-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBlockid() {
                    return blockid;
                }

                /**
                 * Legt den Wert der blockid-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBlockid(String value) {
                    this.blockid = value;
                }

                /**
                 * Ruft den Wert der name-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Legt den Wert der name-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setName(String value) {
                    this.name = value;
                }

                /**
                 * Ruft den Wert der id-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getId() {
                    return id;
                }

                /**
                 * Legt den Wert der id-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setId(String value) {
                    this.id = value;
                }

            }

        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Offering" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Effect" type="{http://www.w3.org/2001/XMLSchema}token"/>
     *                   &lt;element name="Operator" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *                         &lt;enumeration value="="/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Attribute" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
     *                           &lt;attribute name="Unit" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "offering"
    })
    public static class Optional {

        @XmlElement(name = "Offering", required = true)
        protected List<Workflow.Optional.Offering> offering;

        /**
         * Gets the value of the offering property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the offering property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOffering().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Workflow.Optional.Offering }
         * 
         * 
         */
        public List<Workflow.Optional.Offering> getOffering() {
            if (offering == null) {
                offering = new ArrayList<Workflow.Optional.Offering>();
            }
            return this.offering;
        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Effect" type="{http://www.w3.org/2001/XMLSchema}token"/>
         *         &lt;element name="Operator" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
         *               &lt;enumeration value="="/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Attribute" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
         *                 &lt;attribute name="Unit" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "effect",
            "operator",
            "attribute"
        })
        public static class Offering {

            @XmlElement(name = "Effect", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String effect;
            @XmlElement(name = "Operator")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String operator;
            @XmlElement(name = "Attribute")
            protected Workflow.Optional.Offering.Attribute attribute;

            /**
             * Ruft den Wert der effect-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEffect() {
                return effect;
            }

            /**
             * Legt den Wert der effect-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEffect(String value) {
                this.effect = value;
            }

            /**
             * Ruft den Wert der operator-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOperator() {
                return operator;
            }

            /**
             * Legt den Wert der operator-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOperator(String value) {
                this.operator = value;
            }

            /**
             * Ruft den Wert der attribute-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Workflow.Optional.Offering.Attribute }
             *     
             */
            public Workflow.Optional.Offering.Attribute getAttribute() {
                return attribute;
            }

            /**
             * Legt den Wert der attribute-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Workflow.Optional.Offering.Attribute }
             *     
             */
            public void setAttribute(Workflow.Optional.Offering.Attribute value) {
                this.attribute = value;
            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
             *       &lt;attribute name="Unit" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class Attribute {

                @XmlValue
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "token")
                protected String value;
                @XmlAttribute(name = "Unit")
                protected String unit;

                /**
                 * Ruft den Wert der value-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Legt den Wert der value-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Ruft den Wert der unit-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUnit() {
                    return unit;
                }

                /**
                 * Legt den Wert der unit-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUnit(String value) {
                    this.unit = value;
                }

            }

        }

    }

}
