//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.10.07 at 12:32:33 PM CDT 
//


package com.oadr2.b;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import com.oadr2.b.xcal.Vavailability;


/**
 * Opts are used by the VEN to temporarily override the pre-existing agreement. For example, a VEN may opt in to events during the evening, or opt out from events during the world series.
 * 
 * <p>Java class for EiOptType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EiOptType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}optID"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}optType"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}optReason"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06}marketContext" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}venID"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}vavailability" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}createdDateTime"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://docs.oasis-open.org/ns/energyinterop/201110}schemaVersion"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EiOptType", namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", propOrder = {
    "optID",
    "optType",
    "optReason",
    "marketContext",
    "venID",
    "vavailability",
    "createdDateTime"
})
@XmlSeeAlso({
    OadrCreateOpt.class
})
public class EiOptType {

    @XmlElement(required = true)
    protected String optID;
    @XmlElement(required = true)
    protected OptTypeType optType;
    @XmlElement(required = true)
    protected String optReason;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/emix/2011/06")
    protected String marketContext;
    @XmlElement(required = true)
    protected String venID;
    @XmlElement(namespace = "urn:ietf:params:xml:ns:icalendar-2.0")
    protected Vavailability vavailability;
    @XmlElement(required = true)
    protected XMLGregorianCalendar createdDateTime;
    @XmlAttribute(name = "schemaVersion", namespace = "http://docs.oasis-open.org/ns/energyinterop/201110")
    protected String schemaVersion;

    /**
     * Gets the value of the optID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptID() {
        return optID;
    }

    /**
     * Sets the value of the optID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptID(String value) {
        this.optID = value;
    }

    /**
     * Gets the value of the optType property.
     * 
     * @return
     *     possible object is
     *     {@link OptTypeType }
     *     
     */
    public OptTypeType getOptType() {
        return optType;
    }

    /**
     * Sets the value of the optType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptTypeType }
     *     
     */
    public void setOptType(OptTypeType value) {
        this.optType = value;
    }

    /**
     * Gets the value of the optReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptReason() {
        return optReason;
    }

    /**
     * Sets the value of the optReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptReason(String value) {
        this.optReason = value;
    }

    /**
     * Gets the value of the marketContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketContext() {
        return marketContext;
    }

    /**
     * Sets the value of the marketContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketContext(String value) {
        this.marketContext = value;
    }

    /**
     * Gets the value of the venID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVenID() {
        return venID;
    }

    /**
     * Sets the value of the venID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVenID(String value) {
        this.venID = value;
    }

    /**
     * Gets the value of the vavailability property.
     * 
     * @return
     *     possible object is
     *     {@link Vavailability }
     *     
     */
    public Vavailability getVavailability() {
        return vavailability;
    }

    /**
     * Sets the value of the vavailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vavailability }
     *     
     */
    public void setVavailability(Vavailability value) {
        this.vavailability = value;
    }

    /**
     * Gets the value of the createdDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDateTime() {
        return createdDateTime;
    }

    /**
     * Sets the value of the createdDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDateTime(XMLGregorianCalendar value) {
        this.createdDateTime = value;
    }

    /**
     * Gets the value of the schemaVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaVersion() {
        return schemaVersion;
    }

    /**
     * Sets the value of the schemaVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaVersion(String value) {
        this.schemaVersion = value;
    }

}
