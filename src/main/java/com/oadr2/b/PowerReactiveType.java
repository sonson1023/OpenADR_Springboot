//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.10.07 at 12:32:33 PM CDT 
//


package com.oadr2.b;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Reactive power, measured in volt-amperes reactive (VAR)
 * 
 * <p>Java class for PowerReactiveType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PowerReactiveType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://docs.oasis-open.org/ns/emix/2011/06/power}PowerItemType">
 *       &lt;sequence>
 *         &lt;element name="itemDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemUnits" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06/siscale}siScaleCode"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06/power}powerAttributes"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PowerReactiveType", namespace = "http://docs.oasis-open.org/ns/emix/2011/06/power")
public class PowerReactiveType
    extends PowerItemType
{


}
