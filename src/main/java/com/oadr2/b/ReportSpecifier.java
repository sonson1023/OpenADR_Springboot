//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.10.07 at 12:32:33 PM CDT 
//


package com.oadr2.b;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.oadr2.b.xcal.DurationPropType;
import com.oadr2.b.xcal.Interval;


/**
 * Parameters that define the content of a Report Stream
 * 
 * <p>Java class for ReportSpecifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportSpecifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}reportSpecifierID"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}granularity"/>
 *         &lt;element name="reportBackDuration" type="{urn:ietf:params:xml:ns:icalendar-2.0}DurationPropType"/>
 *         &lt;element name="reportInterval" type="{urn:ietf:params:xml:ns:icalendar-2.0}WsCalendarIntervalType" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}specifierPayload" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportSpecifierType", namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", propOrder = {
    "reportSpecifierID",
    "granularity",
    "reportBackDuration",
    "reportInterval",
    "specifierPayloads"
})
@XmlRootElement(name = "reportSpecifier", namespace = "http://docs.oasis-open.org/ns/energyinterop/201110")
public class ReportSpecifier {

    @XmlElement(required = true)
    protected String reportSpecifierID;
    @XmlElement(namespace = "urn:ietf:params:xml:ns:icalendar-2.0", required = true)
    protected DurationPropType granularity;
    @XmlElement(required = true)
    protected DurationPropType reportBackDuration;
    protected Interval reportInterval;
    @XmlElement(name = "specifierPayload", required = true)
    protected List<SpecifierPayload> specifierPayloads;

    /**
     * Gets the value of the reportSpecifierID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportSpecifierID() {
        return reportSpecifierID;
    }

    /**
     * Sets the value of the reportSpecifierID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportSpecifierID(String value) {
        this.reportSpecifierID = value;
    }

    /**
     * How frequently the [measurement] is to be recorded.
     * 
     * @return
     *     possible object is
     *     {@link DurationPropType }
     *     
     */
    public DurationPropType getGranularity() {
        return granularity;
    }

    /**
     * Sets the value of the granularity property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationPropType }
     *     
     */
    public void setGranularity(DurationPropType value) {
        this.granularity = value;
    }

    /**
     * Gets the value of the reportBackDuration property.
     * 
     * @return
     *     possible object is
     *     {@link DurationPropType }
     *     
     */
    public DurationPropType getReportBackDuration() {
        return reportBackDuration;
    }

    /**
     * Sets the value of the reportBackDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationPropType }
     *     
     */
    public void setReportBackDuration(DurationPropType value) {
        this.reportBackDuration = value;
    }

    /**
     * Gets the value of the reportInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Interval }
     *     
     */
    public Interval getReportInterval() {
        return reportInterval;
    }

    /**
     * Sets the value of the reportInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Interval }
     *     
     */
    public void setReportInterval(Interval value) {
        this.reportInterval = value;
    }

    /**
     * Gets the value of the specifierPayloads property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specifierPayloads property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecifierPayloads().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecifierPayload }
     * 
     * 
     */
    public List<SpecifierPayload> getSpecifierPayloads() {
        if (specifierPayloads == null) {
            specifierPayloads = new ArrayList<SpecifierPayload>();
        }
        return this.specifierPayloads;
    }

}
