//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.10.07 at 12:32:33 PM CDT 
//


package com.oadr2.b;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PowerAttributesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PowerAttributesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hertz" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="voltage" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ac" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PowerAttributesType", namespace = "http://docs.oasis-open.org/ns/emix/2011/06/power", propOrder = {
    "hertz",
    "voltage",
    "ac"
})
@XmlRootElement(name = "powerAttributes", namespace = "http://docs.oasis-open.org/ns/emix/2011/06/power")
public class PowerAttributes {

    @XmlElement(required = true)
    protected BigDecimal hertz;
    @XmlElement(required = true)
    protected BigDecimal voltage;
    protected boolean ac;

    /**
     * Gets the value of the hertz property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHertz() {
        return hertz;
    }

    /**
     * Sets the value of the hertz property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHertz(BigDecimal value) {
        this.hertz = value;
    }

    /**
     * Gets the value of the voltage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVoltage() {
        return voltage;
    }

    /**
     * Sets the value of the voltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVoltage(BigDecimal value) {
        this.voltage = value;
    }

    /**
     * Gets the value of the ac property.
     * 
     */
    public boolean isAc() {
        return ac;
    }

    /**
     * Sets the value of the ac property.
     * 
     */
    public void setAc(boolean value) {
        this.ac = value;
    }

}
