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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DeliveryNoteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryNoteType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeliveryNoteNumber" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}TextMax30Type"/>
 *         &lt;element name="DeliveryNoteDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryNoteType", propOrder = {
    "deliveryNoteNumber",
    "deliveryNoteDate"
})
public class DeliveryNoteType {

    @XmlElement(name = "DeliveryNoteNumber", required = true)
    protected String deliveryNoteNumber;
    @XmlElement(name = "DeliveryNoteDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar deliveryNoteDate;

    /**
     * Gets the value of the deliveryNoteNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryNoteNumber() {
        return deliveryNoteNumber;
    }

    /**
     * Sets the value of the deliveryNoteNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryNoteNumber(String value) {
        this.deliveryNoteNumber = value;
    }

    /**
     * Gets the value of the deliveryNoteDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeliveryNoteDate() {
        return deliveryNoteDate;
    }

    /**
     * Sets the value of the deliveryNoteDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeliveryNoteDate(XMLGregorianCalendar value) {
        this.deliveryNoteDate = value;
    }

}
