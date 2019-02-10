//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.10.07 at 12:32:33 PM CDT 
//


package com.oadr2.b;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for oadrCreateOptType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="oadrCreateOptType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ns/energyinterop/201110}EiOptType">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110/payloads}requestID"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}qualifiedEventID" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}eiTarget"/>
 *         &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrDeviceClass" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oadrCreateOptType", propOrder = {
    "requestID",
    "qualifiedEventID",
    "eiTarget",
    "oadrDeviceClass"
})
@XmlRootElement(name = "oadrCreateOpt")
public class OadrCreateOpt
    extends EiOptType
{

    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110/payloads", required = true)
    protected String requestID;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110")
    protected QualifiedEventID qualifiedEventID;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", required = true)
    protected EiTargetType eiTarget;
    protected EiTargetType oadrDeviceClass;

    /**
     * Gets the value of the requestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestID() {
        return requestID;
    }

    /**
     * Sets the value of the requestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestID(String value) {
        this.requestID = value;
    }

    /**
     * Gets the value of the qualifiedEventID property.
     * 
     * @return
     *     possible object is
     *     {@link QualifiedEventID }
     *     
     */
    public QualifiedEventID getQualifiedEventID() {
        return qualifiedEventID;
    }

    /**
     * Sets the value of the qualifiedEventID property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualifiedEventID }
     *     
     */
    public void setQualifiedEventID(QualifiedEventID value) {
        this.qualifiedEventID = value;
    }

    /**
     * Gets the value of the eiTarget property.
     * 
     * @return
     *     possible object is
     *     {@link EiTargetType }
     *     
     */
    public EiTargetType getEiTarget() {
        return eiTarget;
    }

    /**
     * Sets the value of the eiTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link EiTargetType }
     *     
     */
    public void setEiTarget(EiTargetType value) {
        this.eiTarget = value;
    }

    /**
     * Gets the value of the oadrDeviceClass property.
     * 
     * @return
     *     possible object is
     *     {@link EiTargetType }
     *     
     */
    public EiTargetType getOadrDeviceClass() {
        return oadrDeviceClass;
    }

    /**
     * Sets the value of the oadrDeviceClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link EiTargetType }
     *     
     */
    public void setOadrDeviceClass(EiTargetType value) {
        this.oadrDeviceClass = value;
    }

}
