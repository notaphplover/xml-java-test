//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.14 at 05:22:02 p. m. CET 
//


package com.ucm.shiro.facturae.v3_2_1.parser.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AmountsWithheldType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AmountsWithheldType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WithholdingReason" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}TextMax2500Type"/>
 *         &lt;element name="WithholdingRate" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}DoubleUpToEightDecimalType" minOccurs="0"/>
 *         &lt;element name="WithholdingAmount" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}DoubleUpToEightDecimalType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountsWithheldType", propOrder = {
    "withholdingReason",
    "withholdingRate",
    "withholdingAmount"
})
public class AmountsWithheldType {

    @XmlElement(name = "WithholdingReason", required = true)
    protected String withholdingReason;
    @XmlElement(name = "WithholdingRate")
    protected Double withholdingRate;
    @XmlElement(name = "WithholdingAmount")
    protected double withholdingAmount;

    /**
     * Gets the value of the withholdingReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWithholdingReason() {
        return withholdingReason;
    }

    /**
     * Sets the value of the withholdingReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWithholdingReason(String value) {
        this.withholdingReason = value;
    }

    /**
     * Gets the value of the withholdingRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWithholdingRate() {
        return withholdingRate;
    }

    /**
     * Sets the value of the withholdingRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWithholdingRate(Double value) {
        this.withholdingRate = value;
    }

    /**
     * Gets the value of the withholdingAmount property.
     * 
     */
    public double getWithholdingAmount() {
        return withholdingAmount;
    }

    /**
     * Sets the value of the withholdingAmount property.
     * 
     */
    public void setWithholdingAmount(double value) {
        this.withholdingAmount = value;
    }

}
