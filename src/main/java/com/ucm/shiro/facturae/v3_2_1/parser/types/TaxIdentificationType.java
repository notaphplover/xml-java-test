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
 * <p>Java class for TaxIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PersonTypeCode" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}PersonTypeCodeType"/>
 *         &lt;element name="ResidenceTypeCode" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}ResidenceTypeCodeType"/>
 *         &lt;element name="TaxIdentificationNumber" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}TextMin3Max30Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxIdentificationType", propOrder = {
    "personTypeCode",
    "residenceTypeCode",
    "taxIdentificationNumber"
})
public class TaxIdentificationType {

    @XmlElement(name = "PersonTypeCode", required = true)
    protected PersonTypeCodeType personTypeCode;
    @XmlElement(name = "ResidenceTypeCode", required = true)
    protected ResidenceTypeCodeType residenceTypeCode;
    @XmlElement(name = "TaxIdentificationNumber", required = true)
    protected String taxIdentificationNumber;

    /**
     * Gets the value of the personTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link PersonTypeCodeType }
     *     
     */
    public PersonTypeCodeType getPersonTypeCode() {
        return personTypeCode;
    }

    /**
     * Sets the value of the personTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonTypeCodeType }
     *     
     */
    public void setPersonTypeCode(PersonTypeCodeType value) {
        this.personTypeCode = value;
    }

    /**
     * Gets the value of the residenceTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ResidenceTypeCodeType }
     *     
     */
    public ResidenceTypeCodeType getResidenceTypeCode() {
        return residenceTypeCode;
    }

    /**
     * Sets the value of the residenceTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResidenceTypeCodeType }
     *     
     */
    public void setResidenceTypeCode(ResidenceTypeCodeType value) {
        this.residenceTypeCode = value;
    }

    /**
     * Gets the value of the taxIdentificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxIdentificationNumber() {
        return taxIdentificationNumber;
    }

    /**
     * Sets the value of the taxIdentificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxIdentificationNumber(String value) {
        this.taxIdentificationNumber = value;
    }

}
