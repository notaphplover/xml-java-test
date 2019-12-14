//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.14 at 02:13:28 p. m. CET 
//


package com.ucm.shiro.facturae.v3_1.parser.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubsidyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubsidyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubsidyDescription" type="{http://www.facturae.es/Facturae/2007/v3.1/Facturae}TextMax2500Type"/>
 *         &lt;element name="SubsidyRate" type="{http://www.facturae.es/Facturae/2007/v3.1/Facturae}DoubleFourDecimalType" minOccurs="0"/>
 *         &lt;element name="SubsidyAmount" type="{http://www.facturae.es/Facturae/2007/v3.1/Facturae}DoubleTwoDecimalType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubsidyType", propOrder = {
    "subsidyDescription",
    "subsidyRate",
    "subsidyAmount"
})
public class SubsidyType {

    @XmlElement(name = "SubsidyDescription", required = true)
    protected String subsidyDescription;
    @XmlElement(name = "SubsidyRate")
    protected Double subsidyRate;
    @XmlElement(name = "SubsidyAmount")
    protected double subsidyAmount;

    /**
     * Gets the value of the subsidyDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubsidyDescription() {
        return subsidyDescription;
    }

    /**
     * Sets the value of the subsidyDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubsidyDescription(String value) {
        this.subsidyDescription = value;
    }

    /**
     * Gets the value of the subsidyRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSubsidyRate() {
        return subsidyRate;
    }

    /**
     * Sets the value of the subsidyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSubsidyRate(Double value) {
        this.subsidyRate = value;
    }

    /**
     * Gets the value of the subsidyAmount property.
     * 
     */
    public double getSubsidyAmount() {
        return subsidyAmount;
    }

    /**
     * Sets the value of the subsidyAmount property.
     * 
     */
    public void setSubsidyAmount(double value) {
        this.subsidyAmount = value;
    }

}
