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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EiTargetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EiTargetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06/power}aggregatedPnode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06/power}endDeviceAsset" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06/power}meterAsset" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06/power}pnode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06}serviceArea" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06/power}serviceDeliveryPoint" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06/power}serviceLocation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06/power}transportInterface" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}groupID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}groupName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}resourceID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}venID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}partyID" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EiTargetType", namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", propOrder = {
    "aggregatedPnodes",
    "endDeviceAssets",
    "meterAssets",
    "pnodes",
    "serviceAreas",
    "serviceDeliveryPoints",
    "serviceLocations",
    "transportInterfaces",
    "groupIDs",
    "groupNames",
    "resourceIDs",
    "venIDs",
    "partyIDs"
})
public class EiTargetType {

    @XmlElement(name = "aggregatedPnode", namespace = "http://docs.oasis-open.org/ns/emix/2011/06/power")
    protected List<AggregatedPnode> aggregatedPnodes;
    @XmlElement(name = "endDeviceAsset", namespace = "http://docs.oasis-open.org/ns/emix/2011/06/power")
    protected List<EndDeviceAsset> endDeviceAssets;
    @XmlElement(name = "meterAsset", namespace = "http://docs.oasis-open.org/ns/emix/2011/06/power")
    protected List<MeterAsset> meterAssets;
    @XmlElement(name = "pnode", namespace = "http://docs.oasis-open.org/ns/emix/2011/06/power")
    protected List<Pnode> pnodes;
    @XmlElement(name = "serviceArea", namespace = "http://docs.oasis-open.org/ns/emix/2011/06")
    protected List<ServiceArea> serviceAreas;
    @XmlElement(name = "serviceDeliveryPoint", namespace = "http://docs.oasis-open.org/ns/emix/2011/06/power")
    protected List<ServiceDeliveryPoint> serviceDeliveryPoints;
    @XmlElement(name = "serviceLocation", namespace = "http://docs.oasis-open.org/ns/emix/2011/06/power")
    protected List<ServiceLocation> serviceLocations;
    @XmlElement(name = "transportInterface", namespace = "http://docs.oasis-open.org/ns/emix/2011/06/power")
    protected List<TransportInterface> transportInterfaces;
    @XmlElement(name = "groupID")
    protected List<String> groupIDs;
    @XmlElement(name = "groupName")
    protected List<String> groupNames;
    @XmlElement(name = "resourceID")
    protected List<String> resourceIDs;
    @XmlElement(name = "venID")
    protected List<String> venIDs;
    @XmlElement(name = "partyID")
    protected List<String> partyIDs;

    /**
     * Gets the value of the aggregatedPnodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aggregatedPnodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAggregatedPnodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AggregatedPnode }
     * 
     * 
     */
    public List<AggregatedPnode> getAggregatedPnodes() {
        if (aggregatedPnodes == null) {
            aggregatedPnodes = new ArrayList<AggregatedPnode>();
        }
        return this.aggregatedPnodes;
    }

    /**
     * Gets the value of the endDeviceAssets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endDeviceAssets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndDeviceAssets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EndDeviceAsset }
     * 
     * 
     */
    public List<EndDeviceAsset> getEndDeviceAssets() {
        if (endDeviceAssets == null) {
            endDeviceAssets = new ArrayList<EndDeviceAsset>();
        }
        return this.endDeviceAssets;
    }

    /**
     * Gets the value of the meterAssets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meterAssets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeterAssets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeterAsset }
     * 
     * 
     */
    public List<MeterAsset> getMeterAssets() {
        if (meterAssets == null) {
            meterAssets = new ArrayList<MeterAsset>();
        }
        return this.meterAssets;
    }

    /**
     * Gets the value of the pnodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pnodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPnodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Pnode }
     * 
     * 
     */
    public List<Pnode> getPnodes() {
        if (pnodes == null) {
            pnodes = new ArrayList<Pnode>();
        }
        return this.pnodes;
    }

    /**
     * Gets the value of the serviceAreas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceAreas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceAreas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceArea }
     * 
     * 
     */
    public List<ServiceArea> getServiceAreas() {
        if (serviceAreas == null) {
            serviceAreas = new ArrayList<ServiceArea>();
        }
        return this.serviceAreas;
    }

    /**
     * Gets the value of the serviceDeliveryPoints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceDeliveryPoints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceDeliveryPoints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceDeliveryPoint }
     * 
     * 
     */
    public List<ServiceDeliveryPoint> getServiceDeliveryPoints() {
        if (serviceDeliveryPoints == null) {
            serviceDeliveryPoints = new ArrayList<ServiceDeliveryPoint>();
        }
        return this.serviceDeliveryPoints;
    }

    /**
     * Gets the value of the serviceLocations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceLocations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceLocations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceLocation }
     * 
     * 
     */
    public List<ServiceLocation> getServiceLocations() {
        if (serviceLocations == null) {
            serviceLocations = new ArrayList<ServiceLocation>();
        }
        return this.serviceLocations;
    }

    /**
     * Gets the value of the transportInterfaces property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportInterfaces property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportInterfaces().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportInterface }
     * 
     * 
     */
    public List<TransportInterface> getTransportInterfaces() {
        if (transportInterfaces == null) {
            transportInterfaces = new ArrayList<TransportInterface>();
        }
        return this.transportInterfaces;
    }

    /**
     * Gets the value of the groupIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getGroupIDs() {
        if (groupIDs == null) {
            groupIDs = new ArrayList<String>();
        }
        return this.groupIDs;
    }

    /**
     * Gets the value of the groupNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getGroupNames() {
        if (groupNames == null) {
            groupNames = new ArrayList<String>();
        }
        return this.groupNames;
    }

    /**
     * Gets the value of the resourceIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getResourceIDs() {
        if (resourceIDs == null) {
            resourceIDs = new ArrayList<String>();
        }
        return this.resourceIDs;
    }

    /**
     * Gets the value of the venIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the venIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVenIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVenIDs() {
        if (venIDs == null) {
            venIDs = new ArrayList<String>();
        }
        return this.venIDs;
    }

    /**
     * Gets the value of the partyIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPartyIDs() {
        if (partyIDs == null) {
            partyIDs = new ArrayList<String>();
        }
        return this.partyIDs;
    }

}
