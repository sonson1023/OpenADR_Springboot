//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.10.07 at 12:32:33 PM CDT 
//


package com.oadr2.b;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes the subject and attributes of a report.
 * 
 * <p>Java class for oadrReportDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="oadrReportDescriptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}rID"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}reportSubject" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}reportDataSource" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}reportType"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06}itemBase" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}readingType"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06}marketContext" minOccurs="0"/>
 *         &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrSamplingRate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oadrReportDescriptionType", propOrder = {
    "rid",
    "reportSubject",
    "reportDataSource",
    "reportType",
    "itemBase",
    "readingType",
    "marketContext",
    "oadrSamplingRate"
})
@XmlRootElement(name = "oadrReportDescription")
public class OadrReportDescription {

    @XmlElement(name = "rID", namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", required = true)
    protected String rid;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110")
    protected EiTargetType reportSubject;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110")
    protected EiTargetType reportDataSource;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", required = true)
    protected String reportType;
    @XmlElementRef(name = "itemBase", namespace = "http://docs.oasis-open.org/ns/emix/2011/06", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends ItemBaseType> itemBase;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", required = true)
    protected String readingType;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/emix/2011/06")
    protected String marketContext;
    protected OadrSamplingRate oadrSamplingRate;

    /**
     * Gets the value of the rid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRID() {
        return rid;
    }

    /**
     * Sets the value of the rid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRID(String value) {
        this.rid = value;
    }

    /**
     * Gets the value of the reportSubject property.
     * 
     * @return
     *     possible object is
     *     {@link EiTargetType }
     *     
     */
    public EiTargetType getReportSubject() {
        return reportSubject;
    }

    /**
     * Sets the value of the reportSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link EiTargetType }
     *     
     */
    public void setReportSubject(EiTargetType value) {
        this.reportSubject = value;
    }

    /**
     * Gets the value of the reportDataSource property.
     * 
     * @return
     *     possible object is
     *     {@link EiTargetType }
     *     
     */
    public EiTargetType getReportDataSource() {
        return reportDataSource;
    }

    /**
     * Sets the value of the reportDataSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link EiTargetType }
     *     
     */
    public void setReportDataSource(EiTargetType value) {
        this.reportDataSource = value;
    }

    /**
     * Gets the value of the reportType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportType() {
        return reportType;
    }

    /**
     * Sets the value of the reportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportType(String value) {
        this.reportType = value;
    }

    /**
     * What is measured or tracked in this report (Units). 
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnergyItemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ItemBaseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PowerRealType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EnergyReactiveType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CurrencyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TemperatureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OadrGBItemBase }{@code >}
     *     {@link JAXBElement }{@code <}{@link PulseCountType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CurrencyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ThermType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CurrentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PowerItemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EnergyRealType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FrequencyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PowerReactiveType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PowerApparentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BaseUnitType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VoltageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EnergyApparentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CurrencyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CurrencyType }{@code >}
     *     
     */
    public JAXBElement<? extends ItemBaseType> getItemBase() {
        return itemBase;
    }

    /**
     * Sets the value of the itemBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnergyItemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ItemBaseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PowerRealType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EnergyReactiveType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CurrencyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TemperatureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OadrGBItemBase }{@code >}
     *     {@link JAXBElement }{@code <}{@link PulseCountType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CurrencyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ThermType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CurrentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PowerItemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EnergyRealType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FrequencyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PowerReactiveType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PowerApparentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BaseUnitType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VoltageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EnergyApparentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CurrencyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CurrencyType }{@code >}
     *     
     */
    public void setItemBase(JAXBElement<? extends ItemBaseType> value) {
        this.itemBase = value;
    }

    /**
     * Gets the value of the readingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReadingType() {
        return readingType;
    }

    /**
     * Sets the value of the readingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReadingType(String value) {
        this.readingType = value;
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
     * Gets the value of the oadrSamplingRate property.
     * 
     * @return
     *     possible object is
     *     {@link OadrSamplingRate }
     *     
     */
    public OadrSamplingRate getOadrSamplingRate() {
        return oadrSamplingRate;
    }

    /**
     * Sets the value of the oadrSamplingRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link OadrSamplingRate }
     *     
     */
    public void setOadrSamplingRate(OadrSamplingRate value) {
        this.oadrSamplingRate = value;
    }

}
