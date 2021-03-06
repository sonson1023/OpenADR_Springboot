//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.10.07 at 12:32:33 PM CDT 
//


package com.oadr2.b;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SignalTypeEnumeratedType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SignalTypeEnumeratedType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="delta"/>
 *     &lt;enumeration value="level"/>
 *     &lt;enumeration value="multiplier"/>
 *     &lt;enumeration value="price"/>
 *     &lt;enumeration value="priceMultiplier"/>
 *     &lt;enumeration value="priceRelative"/>
 *     &lt;enumeration value="setpoint"/>
 *     &lt;enumeration value="x-loadControlCapacity"/>
 *     &lt;enumeration value="x-loadControlLevelOffset"/>
 *     &lt;enumeration value="x-loadControlPercentOffset"/>
 *     &lt;enumeration value="x-loadControlSetpoint"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SignalTypeEnumeratedType", namespace = "http://docs.oasis-open.org/ns/energyinterop/201110")
@XmlEnum
public enum SignalTypeEnumeratedType {


    /**
     * Signal indicates the amount to change from what one would have used without the signal.
     * 
     */
    @XmlEnumValue("delta")
    DELTA("delta"),

    /**
     * Signal indicates a program level.
     * 
     */
    @XmlEnumValue("level")
    LEVEL("level"),

    /**
     * Signal indicates a multiplier applied to the current rate of  delivery or usage from what one would have used without the signal.
     * 
     */
    @XmlEnumValue("multiplier")
    MULTIPLIER("multiplier"),

    /**
     * Signal indicates the price.
     * 
     */
    @XmlEnumValue("price")
    PRICE("price"),

    /**
     * Signal indicates the price multiplier. Extended price is the computed price value multiplied by the number of units.
     * 
     */
    @XmlEnumValue("priceMultiplier")
    PRICE_MULTIPLIER("priceMultiplier"),

    /**
     * Signal indicates the relative price.
     * 
     */
    @XmlEnumValue("priceRelative")
    PRICE_RELATIVE("priceRelative"),

    /**
     * Signal indicates a target amount of units.
     * 
     */
    @XmlEnumValue("setpoint")
    SETPOINT("setpoint"),

    /**
     * This is an instruction for the load controller to operate at a level that is some percentage of its maximum load consumption capacity. This can be mapped to specific load controllers to do things like duty cycling. Note that 1.0 refers to 100% consumption. In the case of simple ON/OFF type devices then 0 = OFF and 1 = ON.
     * 
     */
    @XmlEnumValue("x-loadControlCapacity")
    X_LOAD_CONTROL_CAPACITY("x-loadControlCapacity"),

    /**
     * Discrete integer levels that are relative to normal operations where 0 is normal operations.
     * 
     */
    @XmlEnumValue("x-loadControlLevelOffset")
    X_LOAD_CONTROL_LEVEL_OFFSET("x-loadControlLevelOffset"),

    /**
     * Percentage change from normal load control operations.
     * 
     */
    @XmlEnumValue("x-loadControlPercentOffset")
    X_LOAD_CONTROL_PERCENT_OFFSET("x-loadControlPercentOffset"),

    /**
     * Load controller set points.
     * 
     */
    @XmlEnumValue("x-loadControlSetpoint")
    X_LOAD_CONTROL_SETPOINT("x-loadControlSetpoint");
    private final String value;

    SignalTypeEnumeratedType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SignalTypeEnumeratedType fromValue(String v) {
        for (SignalTypeEnumeratedType c: SignalTypeEnumeratedType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
