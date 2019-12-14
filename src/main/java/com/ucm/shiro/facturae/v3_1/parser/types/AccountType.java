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
 * <p>Java class for AccountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IBAN" type="{http://www.facturae.es/Facturae/2007/v3.1/Facturae}TextMin5Max34Type"/>
 *         &lt;element name="BankCode" type="{http://www.facturae.es/Facturae/2007/v3.1/Facturae}TextMax60Type" minOccurs="0"/>
 *         &lt;element name="BranchCode" type="{http://www.facturae.es/Facturae/2007/v3.1/Facturae}TextMax60Type" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="BranchInSpainAddress" type="{http://www.facturae.es/Facturae/2007/v3.1/Facturae}AddressType" minOccurs="0"/>
 *           &lt;element name="OverseasBranchAddress" type="{http://www.facturae.es/Facturae/2007/v3.1/Facturae}OverseasAddressType" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountType", propOrder = {
    "iban",
    "bankCode",
    "branchCode",
    "branchInSpainAddress",
    "overseasBranchAddress"
})
public class AccountType {

    @XmlElement(name = "IBAN", required = true)
    protected String iban;
    @XmlElement(name = "BankCode")
    protected String bankCode;
    @XmlElement(name = "BranchCode")
    protected String branchCode;
    @XmlElement(name = "BranchInSpainAddress")
    protected AddressType branchInSpainAddress;
    @XmlElement(name = "OverseasBranchAddress")
    protected OverseasAddressType overseasBranchAddress;

    /**
     * Gets the value of the iban property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIBAN() {
        return iban;
    }

    /**
     * Sets the value of the iban property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIBAN(String value) {
        this.iban = value;
    }

    /**
     * Gets the value of the bankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * Sets the value of the bankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCode(String value) {
        this.bankCode = value;
    }

    /**
     * Gets the value of the branchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchCode() {
        return branchCode;
    }

    /**
     * Sets the value of the branchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchCode(String value) {
        this.branchCode = value;
    }

    /**
     * Gets the value of the branchInSpainAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getBranchInSpainAddress() {
        return branchInSpainAddress;
    }

    /**
     * Sets the value of the branchInSpainAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setBranchInSpainAddress(AddressType value) {
        this.branchInSpainAddress = value;
    }

    /**
     * Gets the value of the overseasBranchAddress property.
     * 
     * @return
     *     possible object is
     *     {@link OverseasAddressType }
     *     
     */
    public OverseasAddressType getOverseasBranchAddress() {
        return overseasBranchAddress;
    }

    /**
     * Sets the value of the overseasBranchAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverseasAddressType }
     *     
     */
    public void setOverseasBranchAddress(OverseasAddressType value) {
        this.overseasBranchAddress = value;
    }

}
