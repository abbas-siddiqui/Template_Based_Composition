//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2012.07.25 um 04:03:44 PM CEST 
//


package template_Description;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 *         &lt;element name="QoS_Parameters" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="QoS">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Effect" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *                             &lt;element name="Operator">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="="/>
 *                                   &lt;enumeration value="=>"/>
 *                                   &lt;enumeration value="&lt;"/>
 *                                   &lt;enumeration value="=&lt;"/>
 *                                   &lt;enumeration value=">"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Attribute">
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
 *         &lt;element name="Domains">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="Domain">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Placeholders">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="PlaceHolder">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ToggleEnable">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="isToggle" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Port" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence maxOccurs="unbounded">
 *                                       &lt;element name="OfferedEffect">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Effect" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
 *                                               &lt;attribute name="Operator" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
 *                                               &lt;attribute name="Attribute" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="RequiredEffect" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Effect" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
 *                                               &lt;attribute name="Operator" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
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
 *                             &lt;element name="PreSelection" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="SuggestedBB">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="BB">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="PreSelectedBBs">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="BB" maxOccurs="unbounded">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Connections">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="Connection">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Port" maxOccurs="2">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="PortID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="Placeholder" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
 *         &lt;element name="CoveredEffects">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="CoveredEffect">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Effect" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
 *                           &lt;attribute name="Operator" type="{http://www.w3.org/2001/XMLSchema}token" />
 *                           &lt;attribute name="Attribute" type="{http://www.w3.org/2001/XMLSchema}token" />
 *                           &lt;attribute name="isToggle" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "qoSParameters",
    "domains",
    "placeholders",
    "connections",
    "coveredEffects"
})
@XmlRootElement(name = "Template")
public class Template {

    @XmlElement(name = "QoS_Parameters")
    protected Template.QoSParameters qoSParameters;
    @XmlElement(name = "Domains", required = true)
    protected Template.Domains domains;
    @XmlElement(name = "Placeholders", required = true)
    protected Template.Placeholders placeholders;
    @XmlElement(name = "Connections", required = true)
    protected Template.Connections connections;
    @XmlElement(name = "CoveredEffects", required = true)
    protected Template.CoveredEffects coveredEffects;
    @XmlAttribute(name = "Name")
    @XmlSchemaType(name = "anySimpleType")
    protected String name;

    /**
     * Ruft den Wert der qoSParameters-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Template.QoSParameters }
     *     
     */
    public Template.QoSParameters getQoSParameters() {
        return qoSParameters;
    }

    /**
     * Legt den Wert der qoSParameters-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Template.QoSParameters }
     *     
     */
    public void setQoSParameters(Template.QoSParameters value) {
        this.qoSParameters = value;
    }

    /**
     * Ruft den Wert der domains-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Template.Domains }
     *     
     */
    public Template.Domains getDomains() {
        return domains;
    }

    /**
     * Legt den Wert der domains-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Template.Domains }
     *     
     */
    public void setDomains(Template.Domains value) {
        this.domains = value;
    }

    /**
     * Ruft den Wert der placeholders-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Template.Placeholders }
     *     
     */
    public Template.Placeholders getPlaceholders() {
        return placeholders;
    }

    /**
     * Legt den Wert der placeholders-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Template.Placeholders }
     *     
     */
    public void setPlaceholders(Template.Placeholders value) {
        this.placeholders = value;
    }

    /**
     * Ruft den Wert der connections-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Template.Connections }
     *     
     */
    public Template.Connections getConnections() {
        return connections;
    }

    /**
     * Legt den Wert der connections-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Template.Connections }
     *     
     */
    public void setConnections(Template.Connections value) {
        this.connections = value;
    }

    /**
     * Ruft den Wert der coveredEffects-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Template.CoveredEffects }
     *     
     */
    public Template.CoveredEffects getCoveredEffects() {
        return coveredEffects;
    }

    /**
     * Legt den Wert der coveredEffects-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Template.CoveredEffects }
     *     
     */
    public void setCoveredEffects(Template.CoveredEffects value) {
        this.coveredEffects = value;
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
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded">
     *         &lt;element name="Connection">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Port" maxOccurs="2">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="PortID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="Placeholder" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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

        @XmlElement(name = "Connection", required = true)
        protected List<Template.Connections.Connection> connection;

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
         * {@link Template.Connections.Connection }
         * 
         * 
         */
        public List<Template.Connections.Connection> getConnection() {
            if (connection == null) {
                connection = new ArrayList<Template.Connections.Connection>();
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
         *         &lt;element name="Port" maxOccurs="2">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="PortID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="Placeholder" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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

            @XmlElement(name = "Port", required = true)
            protected List<Template.Connections.Connection.Port> port;

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
             * {@link Template.Connections.Connection.Port }
             * 
             * 
             */
            public List<Template.Connections.Connection.Port> getPort() {
                if (port == null) {
                    port = new ArrayList<Template.Connections.Connection.Port>();
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
             *       &lt;attribute name="PortID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="Placeholder" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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

                @XmlAttribute(name = "PortID", required = true)
                protected String portID;
                @XmlAttribute(name = "Placeholder", required = true)
                @XmlSchemaType(name = "anySimpleType")
                protected String placeholder;

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
                 * Ruft den Wert der placeholder-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPlaceholder() {
                    return placeholder;
                }

                /**
                 * Legt den Wert der placeholder-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPlaceholder(String value) {
                    this.placeholder = value;
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
     *       &lt;sequence maxOccurs="unbounded">
     *         &lt;element name="CoveredEffect">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Effect" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
     *                 &lt;attribute name="Operator" type="{http://www.w3.org/2001/XMLSchema}token" />
     *                 &lt;attribute name="Attribute" type="{http://www.w3.org/2001/XMLSchema}token" />
     *                 &lt;attribute name="isToggle" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
        "coveredEffect"
    })
    public static class CoveredEffects {

        @XmlElement(name = "CoveredEffect", required = true)
        protected List<Template.CoveredEffects.CoveredEffect> coveredEffect;

        /**
         * Gets the value of the coveredEffect property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the coveredEffect property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCoveredEffect().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Template.CoveredEffects.CoveredEffect }
         * 
         * 
         */
        public List<Template.CoveredEffects.CoveredEffect> getCoveredEffect() {
            if (coveredEffect == null) {
                coveredEffect = new ArrayList<Template.CoveredEffects.CoveredEffect>();
            }
            return this.coveredEffect;
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
         *       &lt;attribute name="Operator" type="{http://www.w3.org/2001/XMLSchema}token" />
         *       &lt;attribute name="Attribute" type="{http://www.w3.org/2001/XMLSchema}token" />
         *       &lt;attribute name="isToggle" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class CoveredEffect {

            @XmlAttribute(name = "Effect", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String effect;
            @XmlAttribute(name = "Operator")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String operator;
            @XmlAttribute(name = "Attribute")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String attribute;
            @XmlAttribute(name = "isToggle")
            @XmlSchemaType(name = "anySimpleType")
            protected String isToggle;

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

            /**
             * Ruft den Wert der isToggle-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIsToggle() {
                return isToggle;
            }

            /**
             * Legt den Wert der isToggle-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIsToggle(String value) {
                this.isToggle = value;
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
     *       &lt;sequence maxOccurs="unbounded">
     *         &lt;element name="Domain">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
     *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
        "domain"
    })
    public static class Domains {

        @XmlElement(name = "Domain", required = true)
        protected List<Template.Domains.Domain> domain;

        /**
         * Gets the value of the domain property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the domain property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDomain().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Template.Domains.Domain }
         * 
         * 
         */
        public List<Template.Domains.Domain> getDomain() {
            if (domain == null) {
                domain = new ArrayList<Template.Domains.Domain>();
            }
            return this.domain;
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
         *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
        public static class Domain {

            @XmlValue
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String value;
            @XmlAttribute(name = "Name")
            @XmlSchemaType(name = "anySimpleType")
            protected String name;

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
     *       &lt;sequence maxOccurs="unbounded">
     *         &lt;element name="PlaceHolder">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ToggleEnable">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="isToggle" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Port" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence maxOccurs="unbounded">
     *                             &lt;element name="OfferedEffect">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Effect" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
     *                                     &lt;attribute name="Operator" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
     *                                     &lt;attribute name="Attribute" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="RequiredEffect" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Effect" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
     *                                     &lt;attribute name="Operator" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
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
     *                   &lt;element name="PreSelection" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="SuggestedBB">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="BB">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="PreSelectedBBs">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="BB" maxOccurs="unbounded">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
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
     *                 &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "placeHolder"
    })
    public static class Placeholders {

        @XmlElement(name = "PlaceHolder", required = true)
        protected List<Template.Placeholders.PlaceHolder> placeHolder;

        /**
         * Gets the value of the placeHolder property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the placeHolder property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPlaceHolder().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Template.Placeholders.PlaceHolder }
         * 
         * 
         */
        public List<Template.Placeholders.PlaceHolder> getPlaceHolder() {
            if (placeHolder == null) {
                placeHolder = new ArrayList<Template.Placeholders.PlaceHolder>();
            }
            return this.placeHolder;
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
         *         &lt;element name="ToggleEnable">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="isToggle" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Port" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence maxOccurs="unbounded">
         *                   &lt;element name="OfferedEffect">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Effect" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
         *                           &lt;attribute name="Operator" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
         *                           &lt;attribute name="Attribute" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="RequiredEffect" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Effect" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
         *                           &lt;attribute name="Operator" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
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
         *         &lt;element name="PreSelection" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="SuggestedBB">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="BB">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="PreSelectedBBs">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="BB" maxOccurs="unbounded">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
         *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "toggleEnable",
            "port",
            "preSelection"
        })
        public static class PlaceHolder {

            @XmlElement(name = "ToggleEnable", required = true)
            protected Template.Placeholders.PlaceHolder.ToggleEnable toggleEnable;
            @XmlElement(name = "Port", required = true)
            protected List<Template.Placeholders.PlaceHolder.Port> port;
            @XmlElement(name = "PreSelection")
            protected Template.Placeholders.PlaceHolder.PreSelection preSelection;
            @XmlAttribute(name = "Name", required = true)
            @XmlSchemaType(name = "anySimpleType")
            protected String name;
            @XmlAttribute(name = "ID", required = true)
            protected String id;

            /**
             * Ruft den Wert der toggleEnable-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Template.Placeholders.PlaceHolder.ToggleEnable }
             *     
             */
            public Template.Placeholders.PlaceHolder.ToggleEnable getToggleEnable() {
                return toggleEnable;
            }

            /**
             * Legt den Wert der toggleEnable-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Template.Placeholders.PlaceHolder.ToggleEnable }
             *     
             */
            public void setToggleEnable(Template.Placeholders.PlaceHolder.ToggleEnable value) {
                this.toggleEnable = value;
            }

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
             * {@link Template.Placeholders.PlaceHolder.Port }
             * 
             * 
             */
            public List<Template.Placeholders.PlaceHolder.Port> getPort() {
                if (port == null) {
                    port = new ArrayList<Template.Placeholders.PlaceHolder.Port>();
                }
                return this.port;
            }

            /**
             * Ruft den Wert der preSelection-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Template.Placeholders.PlaceHolder.PreSelection }
             *     
             */
            public Template.Placeholders.PlaceHolder.PreSelection getPreSelection() {
                return preSelection;
            }

            /**
             * Legt den Wert der preSelection-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Template.Placeholders.PlaceHolder.PreSelection }
             *     
             */
            public void setPreSelection(Template.Placeholders.PlaceHolder.PreSelection value) {
                this.preSelection = value;
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
            public String getID() {
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
            public void setID(String value) {
                this.id = value;
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
             *       &lt;sequence maxOccurs="unbounded">
             *         &lt;element name="OfferedEffect">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Effect" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
             *                 &lt;attribute name="Operator" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
             *                 &lt;attribute name="Attribute" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="RequiredEffect" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Effect" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
             *                 &lt;attribute name="Operator" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
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
                "offeredEffectAndRequiredEffect"
            })
            public static class Port {

                @XmlElements({
                    @XmlElement(name = "OfferedEffect", required = true, type = Template.Placeholders.PlaceHolder.Port.OfferedEffect.class),
                    @XmlElement(name = "RequiredEffect", required = true, type = Template.Placeholders.PlaceHolder.Port.RequiredEffect.class)
                })
                protected List<Object> offeredEffectAndRequiredEffect;
                @XmlAttribute(name = "PortID", required = true)
                protected String portID;

                /**
                 * Gets the value of the offeredEffectAndRequiredEffect property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the offeredEffectAndRequiredEffect property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getOfferedEffectAndRequiredEffect().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Template.Placeholders.PlaceHolder.Port.OfferedEffect }
                 * {@link Template.Placeholders.PlaceHolder.Port.RequiredEffect }
                 * 
                 * 
                 */
                public List<Object> getOfferedEffectAndRequiredEffect() {
                    if (offeredEffectAndRequiredEffect == null) {
                        offeredEffectAndRequiredEffect = new ArrayList<Object>();
                    }
                    return this.offeredEffectAndRequiredEffect;
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
                 *       &lt;attribute name="Operator" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
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
                    @XmlSchemaType(name = "token")
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
                 *       &lt;attribute name="Operator" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
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
                    @XmlSchemaType(name = "token")
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
             *         &lt;element name="SuggestedBB">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="BB">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="PreSelectedBBs">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="BB" maxOccurs="unbounded">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
                "suggestedBB",
                "preSelectedBBs"
            })
            public static class PreSelection {

                @XmlElement(name = "SuggestedBB", required = true)
                protected Template.Placeholders.PlaceHolder.PreSelection.SuggestedBB suggestedBB;
                @XmlElement(name = "PreSelectedBBs", required = true)
                protected Template.Placeholders.PlaceHolder.PreSelection.PreSelectedBBs preSelectedBBs;

                /**
                 * Ruft den Wert der suggestedBB-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Template.Placeholders.PlaceHolder.PreSelection.SuggestedBB }
                 *     
                 */
                public Template.Placeholders.PlaceHolder.PreSelection.SuggestedBB getSuggestedBB() {
                    return suggestedBB;
                }

                /**
                 * Legt den Wert der suggestedBB-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Template.Placeholders.PlaceHolder.PreSelection.SuggestedBB }
                 *     
                 */
                public void setSuggestedBB(Template.Placeholders.PlaceHolder.PreSelection.SuggestedBB value) {
                    this.suggestedBB = value;
                }

                /**
                 * Ruft den Wert der preSelectedBBs-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Template.Placeholders.PlaceHolder.PreSelection.PreSelectedBBs }
                 *     
                 */
                public Template.Placeholders.PlaceHolder.PreSelection.PreSelectedBBs getPreSelectedBBs() {
                    return preSelectedBBs;
                }

                /**
                 * Legt den Wert der preSelectedBBs-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Template.Placeholders.PlaceHolder.PreSelection.PreSelectedBBs }
                 *     
                 */
                public void setPreSelectedBBs(Template.Placeholders.PlaceHolder.PreSelection.PreSelectedBBs value) {
                    this.preSelectedBBs = value;
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
                 *         &lt;element name="BB" maxOccurs="unbounded">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
                    "bb"
                })
                public static class PreSelectedBBs {

                    @XmlElement(name = "BB", required = true)
                    protected List<Template.Placeholders.PlaceHolder.PreSelection.PreSelectedBBs.BB> bb;

                    /**
                     * Gets the value of the bb property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the bb property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getBB().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Template.Placeholders.PlaceHolder.PreSelection.PreSelectedBBs.BB }
                     * 
                     * 
                     */
                    public List<Template.Placeholders.PlaceHolder.PreSelection.PreSelectedBBs.BB> getBB() {
                        if (bb == null) {
                            bb = new ArrayList<Template.Placeholders.PlaceHolder.PreSelection.PreSelectedBBs.BB>();
                        }
                        return this.bb;
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
                     *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class BB {

                        @XmlAttribute(name = "ID")
                        @XmlSchemaType(name = "anySimpleType")
                        protected String id;

                        /**
                         * Ruft den Wert der id-Eigenschaft ab.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getID() {
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
                        public void setID(String value) {
                            this.id = value;
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
                 *         &lt;element name="BB">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
                    "bb"
                })
                public static class SuggestedBB {

                    @XmlElement(name = "BB", required = true)
                    protected Template.Placeholders.PlaceHolder.PreSelection.SuggestedBB.BB bb;

                    /**
                     * Ruft den Wert der bb-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Template.Placeholders.PlaceHolder.PreSelection.SuggestedBB.BB }
                     *     
                     */
                    public Template.Placeholders.PlaceHolder.PreSelection.SuggestedBB.BB getBB() {
                        return bb;
                    }

                    /**
                     * Legt den Wert der bb-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Template.Placeholders.PlaceHolder.PreSelection.SuggestedBB.BB }
                     *     
                     */
                    public void setBB(Template.Placeholders.PlaceHolder.PreSelection.SuggestedBB.BB value) {
                        this.bb = value;
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
                     *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class BB {

                        @XmlAttribute(name = "ID")
                        @XmlSchemaType(name = "anySimpleType")
                        protected String id;

                        /**
                         * Ruft den Wert der id-Eigenschaft ab.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getID() {
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
                        public void setID(String value) {
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
             *       &lt;attribute name="isToggle" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ToggleEnable {

                @XmlAttribute(name = "isToggle", required = true)
                protected boolean isToggle;

                /**
                 * Ruft den Wert der isToggle-Eigenschaft ab.
                 * 
                 */
                public boolean isIsToggle() {
                    return isToggle;
                }

                /**
                 * Legt den Wert der isToggle-Eigenschaft fest.
                 * 
                 */
                public void setIsToggle(boolean value) {
                    this.isToggle = value;
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
     *       &lt;sequence maxOccurs="unbounded">
     *         &lt;element name="QoS">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Effect" type="{http://www.w3.org/2001/XMLSchema}token"/>
     *                   &lt;element name="Operator">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="="/>
     *                         &lt;enumeration value="=>"/>
     *                         &lt;enumeration value="&lt;"/>
     *                         &lt;enumeration value="=&lt;"/>
     *                         &lt;enumeration value=">"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Attribute">
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
        "qoS"
    })
    public static class QoSParameters {

        @XmlElement(name = "QoS", required = true)
        protected List<Template.QoSParameters.QoS> qoS;

        /**
         * Gets the value of the qoS property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the qoS property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getQoS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Template.QoSParameters.QoS }
         * 
         * 
         */
        public List<Template.QoSParameters.QoS> getQoS() {
            if (qoS == null) {
                qoS = new ArrayList<Template.QoSParameters.QoS>();
            }
            return this.qoS;
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
         *         &lt;element name="Operator">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="="/>
         *               &lt;enumeration value="=>"/>
         *               &lt;enumeration value="&lt;"/>
         *               &lt;enumeration value="=&lt;"/>
         *               &lt;enumeration value=">"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Attribute">
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
        public static class QoS {

            @XmlElement(name = "Effect", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String effect;
            @XmlElement(name = "Operator", required = true)
            protected String operator;
            @XmlElement(name = "Attribute", required = true)
            protected Template.QoSParameters.QoS.Attribute attribute;

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
             *     {@link Template.QoSParameters.QoS.Attribute }
             *     
             */
            public Template.QoSParameters.QoS.Attribute getAttribute() {
                return attribute;
            }

            /**
             * Legt den Wert der attribute-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Template.QoSParameters.QoS.Attribute }
             *     
             */
            public void setAttribute(Template.QoSParameters.QoS.Attribute value) {
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
