//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.14 at 12:01:19 p. m. CET 
//


package com.ucm.shiro.facturae.v3_0.parser.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttachmentFormatType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AttachmentFormatType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="xml"/>
 *     &lt;enumeration value="doc"/>
 *     &lt;enumeration value="gif"/>
 *     &lt;enumeration value="rtf"/>
 *     &lt;enumeration value="pdf"/>
 *     &lt;enumeration value="xls"/>
 *     &lt;enumeration value="jpg"/>
 *     &lt;enumeration value="bmp"/>
 *     &lt;enumeration value="tiff"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AttachmentFormatType")
@XmlEnum
public enum AttachmentFormatType {

    @XmlEnumValue("xml")
    XML("xml"),
    @XmlEnumValue("doc")
    DOC("doc"),
    @XmlEnumValue("gif")
    GIF("gif"),
    @XmlEnumValue("rtf")
    RTF("rtf"),
    @XmlEnumValue("pdf")
    PDF("pdf"),
    @XmlEnumValue("xls")
    XLS("xls"),
    @XmlEnumValue("jpg")
    JPG("jpg"),
    @XmlEnumValue("bmp")
    BMP("bmp"),
    @XmlEnumValue("tiff")
    TIFF("tiff");
    private final String value;

    AttachmentFormatType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AttachmentFormatType fromValue(String v) {
        for (AttachmentFormatType c: AttachmentFormatType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
