//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.14 at 05:22:02 p. m. CET 
//


package com.ucm.shiro.facturae.v3_2_1.parser.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReasonDescriptionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReasonDescriptionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Número de la factura"/>
 *     &lt;enumeration value="Serie de la factura"/>
 *     &lt;enumeration value="Fecha expedición"/>
 *     &lt;enumeration value="Nombre y apellidos/Razón Social-Emisor"/>
 *     &lt;enumeration value="Nombre y apellidos/Razón Social-Receptor"/>
 *     &lt;enumeration value="Identificación fiscal Emisor/obligado"/>
 *     &lt;enumeration value="Identificación fiscal Receptor"/>
 *     &lt;enumeration value="Domicilio Emisor/Obligado"/>
 *     &lt;enumeration value="Domicilio Receptor"/>
 *     &lt;enumeration value="Detalle Operación"/>
 *     &lt;enumeration value="Porcentaje impositivo a aplicar"/>
 *     &lt;enumeration value="Cuota tributaria a aplicar"/>
 *     &lt;enumeration value="Fecha/Periodo a aplicar"/>
 *     &lt;enumeration value="Clase de factura"/>
 *     &lt;enumeration value="Literales legales"/>
 *     &lt;enumeration value="Base imponible"/>
 *     &lt;enumeration value="Cálculo de cuotas repercutidas"/>
 *     &lt;enumeration value="Cálculo de cuotas retenidas"/>
 *     &lt;enumeration value="Base imponible modificada por devolución de envases / embalajes"/>
 *     &lt;enumeration value="Base imponible modificada por descuentos y bonificaciones"/>
 *     &lt;enumeration value="Base imponible modificada por resolución firme, judicial o administrativa"/>
 *     &lt;enumeration value="Base imponible modificada cuotas repercutidas no satisfechas. Auto de declaración de concurso"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReasonDescriptionType")
@XmlEnum
public enum ReasonDescriptionType {

    @XmlEnumValue("N\u00famero de la factura")
    NÚMERO_DE_LA_FACTURA("N\u00famero de la factura"),
    @XmlEnumValue("Serie de la factura")
    SERIE_DE_LA_FACTURA("Serie de la factura"),
    @XmlEnumValue("Fecha expedici\u00f3n")
    FECHA_EXPEDICIÓN("Fecha expedici\u00f3n"),
    @XmlEnumValue("Nombre y apellidos/Raz\u00f3n Social-Emisor")
    NOMBRE_Y_APELLIDOS_RAZÓN_SOCIAL_EMISOR("Nombre y apellidos/Raz\u00f3n Social-Emisor"),
    @XmlEnumValue("Nombre y apellidos/Raz\u00f3n Social-Receptor")
    NOMBRE_Y_APELLIDOS_RAZÓN_SOCIAL_RECEPTOR("Nombre y apellidos/Raz\u00f3n Social-Receptor"),
    @XmlEnumValue("Identificaci\u00f3n fiscal Emisor/obligado")
    IDENTIFICACIÓN_FISCAL_EMISOR_OBLIGADO("Identificaci\u00f3n fiscal Emisor/obligado"),
    @XmlEnumValue("Identificaci\u00f3n fiscal Receptor")
    IDENTIFICACIÓN_FISCAL_RECEPTOR("Identificaci\u00f3n fiscal Receptor"),
    @XmlEnumValue("Domicilio Emisor/Obligado")
    DOMICILIO_EMISOR_OBLIGADO("Domicilio Emisor/Obligado"),
    @XmlEnumValue("Domicilio Receptor")
    DOMICILIO_RECEPTOR("Domicilio Receptor"),
    @XmlEnumValue("Detalle Operaci\u00f3n")
    DETALLE_OPERACIÓN("Detalle Operaci\u00f3n"),
    @XmlEnumValue("Porcentaje impositivo a aplicar")
    PORCENTAJE_IMPOSITIVO_A_APLICAR("Porcentaje impositivo a aplicar"),
    @XmlEnumValue("Cuota tributaria a aplicar")
    CUOTA_TRIBUTARIA_A_APLICAR("Cuota tributaria a aplicar"),
    @XmlEnumValue("Fecha/Periodo a aplicar")
    FECHA_PERIODO_A_APLICAR("Fecha/Periodo a aplicar"),
    @XmlEnumValue("Clase de factura")
    CLASE_DE_FACTURA("Clase de factura"),
    @XmlEnumValue("Literales legales")
    LITERALES_LEGALES("Literales legales"),
    @XmlEnumValue("Base imponible")
    BASE_IMPONIBLE("Base imponible"),
    @XmlEnumValue("C\u00e1lculo de cuotas repercutidas")
    CÁLCULO_DE_CUOTAS_REPERCUTIDAS("C\u00e1lculo de cuotas repercutidas"),
    @XmlEnumValue("C\u00e1lculo de cuotas retenidas")
    CÁLCULO_DE_CUOTAS_RETENIDAS("C\u00e1lculo de cuotas retenidas"),
    @XmlEnumValue("Base imponible modificada por devoluci\u00f3n de envases / embalajes")
    BASE_IMPONIBLE_MODIFICADA_POR_DEVOLUCIÓN_DE_ENVASES_EMBALAJES("Base imponible modificada por devoluci\u00f3n de envases / embalajes"),
    @XmlEnumValue("Base imponible modificada por descuentos y bonificaciones")
    BASE_IMPONIBLE_MODIFICADA_POR_DESCUENTOS_Y_BONIFICACIONES("Base imponible modificada por descuentos y bonificaciones"),
    @XmlEnumValue("Base imponible modificada por resoluci\u00f3n firme, judicial o administrativa")
    BASE_IMPONIBLE_MODIFICADA_POR_RESOLUCIÓN_FIRME_JUDICIAL_O_ADMINISTRATIVA("Base imponible modificada por resoluci\u00f3n firme, judicial o administrativa"),
    @XmlEnumValue("Base imponible modificada cuotas repercutidas no satisfechas. Auto de declaraci\u00f3n de concurso")
    BASE_IMPONIBLE_MODIFICADA_CUOTAS_REPERCUTIDAS_NO_SATISFECHAS_AUTO_DE_DECLARACIÓN_DE_CONCURSO("Base imponible modificada cuotas repercutidas no satisfechas. Auto de declaraci\u00f3n de concurso");
    private final String value;

    ReasonDescriptionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReasonDescriptionType fromValue(String v) {
        for (ReasonDescriptionType c: ReasonDescriptionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
