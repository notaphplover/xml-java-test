//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.14 at 04:46:22 p. m. CET 
//


package com.ucm.shiro.facturae.v3_2_0.parser.types;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PaymentOnAccountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentOnAccountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentOnAccountDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="PaymentOnAccountAmount" type="{http://www.facturae.es/Facturae/2009/v3.2/Facturae}DoubleTwoDecimalType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentOnAccountType", propOrder = {
    "paymentOnAccountDate",
    "paymentOnAccountAmount"
})
public class PaymentOnAccountType {

    @XmlElement(name = "PaymentOnAccountDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar paymentOnAccountDate;
    @XmlElement(name = "PaymentOnAccountAmount")
    protected double paymentOnAccountAmount;

    /**
     * Gets the value of the paymentOnAccountDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaymentOnAccountDate() {
        return paymentOnAccountDate;
    }

    /**
     * Sets the value of the paymentOnAccountDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaymentOnAccountDate(XMLGregorianCalendar value) {
        this.paymentOnAccountDate = value;
    }

    /**
     * Gets the value of the paymentOnAccountAmount property.
     * 
     */
    public double getPaymentOnAccountAmount() {
        return paymentOnAccountAmount;
    }

    /**
     * Sets the value of the paymentOnAccountAmount property.
     * 
     */
    public void setPaymentOnAccountAmount(double value) {
        this.paymentOnAccountAmount = value;
    }

}
