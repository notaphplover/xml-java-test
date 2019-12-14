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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for InvoiceIssueDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceIssueDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IssueDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="OperationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PlaceOfIssue" type="{http://www.facturae.es/Facturae/2007/v3.1/Facturae}PlaceOfIssueType" minOccurs="0"/>
 *         &lt;element name="InvoicingPeriod" type="{http://www.facturae.es/Facturae/2007/v3.1/Facturae}PeriodDates" minOccurs="0"/>
 *         &lt;element name="InvoiceCurrencyCode" type="{http://www.facturae.es/Facturae/2007/v3.1/Facturae}CurrencyCodeType"/>
 *         &lt;element name="ExchangeRateDetails" type="{http://www.facturae.es/Facturae/2007/v3.1/Facturae}ExchangeRateDetailsType" minOccurs="0"/>
 *         &lt;element name="TaxCurrencyCode" type="{http://www.facturae.es/Facturae/2007/v3.1/Facturae}CurrencyCodeType"/>
 *         &lt;element name="LanguageName" type="{http://www.facturae.es/Facturae/2007/v3.1/Facturae}LanguageCodeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceIssueDataType", propOrder = {
    "issueDate",
    "operationDate",
    "placeOfIssue",
    "invoicingPeriod",
    "invoiceCurrencyCode",
    "exchangeRateDetails",
    "taxCurrencyCode",
    "languageName"
})
public class InvoiceIssueDataType {

    @XmlElement(name = "IssueDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar issueDate;
    @XmlElement(name = "OperationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar operationDate;
    @XmlElement(name = "PlaceOfIssue")
    protected PlaceOfIssueType placeOfIssue;
    @XmlElement(name = "InvoicingPeriod")
    protected PeriodDates invoicingPeriod;
    @XmlElement(name = "InvoiceCurrencyCode", required = true)
    protected CurrencyCodeType invoiceCurrencyCode;
    @XmlElement(name = "ExchangeRateDetails")
    protected ExchangeRateDetailsType exchangeRateDetails;
    @XmlElement(name = "TaxCurrencyCode", required = true)
    protected CurrencyCodeType taxCurrencyCode;
    @XmlElement(name = "LanguageName", required = true)
    protected LanguageCodeType languageName;

    /**
     * Gets the value of the issueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the value of the issueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssueDate(XMLGregorianCalendar value) {
        this.issueDate = value;
    }

    /**
     * Gets the value of the operationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOperationDate() {
        return operationDate;
    }

    /**
     * Sets the value of the operationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOperationDate(XMLGregorianCalendar value) {
        this.operationDate = value;
    }

    /**
     * Gets the value of the placeOfIssue property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceOfIssueType }
     *     
     */
    public PlaceOfIssueType getPlaceOfIssue() {
        return placeOfIssue;
    }

    /**
     * Sets the value of the placeOfIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceOfIssueType }
     *     
     */
    public void setPlaceOfIssue(PlaceOfIssueType value) {
        this.placeOfIssue = value;
    }

    /**
     * Gets the value of the invoicingPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodDates }
     *     
     */
    public PeriodDates getInvoicingPeriod() {
        return invoicingPeriod;
    }

    /**
     * Sets the value of the invoicingPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodDates }
     *     
     */
    public void setInvoicingPeriod(PeriodDates value) {
        this.invoicingPeriod = value;
    }

    /**
     * Gets the value of the invoiceCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCodeType }
     *     
     */
    public CurrencyCodeType getInvoiceCurrencyCode() {
        return invoiceCurrencyCode;
    }

    /**
     * Sets the value of the invoiceCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCodeType }
     *     
     */
    public void setInvoiceCurrencyCode(CurrencyCodeType value) {
        this.invoiceCurrencyCode = value;
    }

    /**
     * Gets the value of the exchangeRateDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRateDetailsType }
     *     
     */
    public ExchangeRateDetailsType getExchangeRateDetails() {
        return exchangeRateDetails;
    }

    /**
     * Sets the value of the exchangeRateDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRateDetailsType }
     *     
     */
    public void setExchangeRateDetails(ExchangeRateDetailsType value) {
        this.exchangeRateDetails = value;
    }

    /**
     * Gets the value of the taxCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCodeType }
     *     
     */
    public CurrencyCodeType getTaxCurrencyCode() {
        return taxCurrencyCode;
    }

    /**
     * Sets the value of the taxCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCodeType }
     *     
     */
    public void setTaxCurrencyCode(CurrencyCodeType value) {
        this.taxCurrencyCode = value;
    }

    /**
     * Gets the value of the languageName property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageCodeType }
     *     
     */
    public LanguageCodeType getLanguageName() {
        return languageName;
    }

    /**
     * Sets the value of the languageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageCodeType }
     *     
     */
    public void setLanguageName(LanguageCodeType value) {
        this.languageName = value;
    }

}
