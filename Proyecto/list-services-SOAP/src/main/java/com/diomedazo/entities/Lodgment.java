//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.03.27 a las 01:19:39 PM COT 
//


package com.diomedazo.entities;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para lodgment complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="lodgment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id_logdment" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="lodgment_type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="room_type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="id_service" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lodgment", propOrder = {
    "idLogdment",
    "lodgmentType",
    "roomType",
    "idService"
})
public class Lodgment {

    @XmlElement(name = "id_logdment")
    protected int idLogdment;
    @XmlElement(name = "lodgment_type", required = true)
    protected String lodgmentType;
    @XmlElement(name = "room_type", required = true)
    protected String roomType;
    @XmlElement(name = "id_service")
    protected int idService;

    /**
     * Obtiene el valor de la propiedad idLogdment.
     * 
     */
    public int getIdLogdment() {
        return idLogdment;
    }

    /**
     * Define el valor de la propiedad idLogdment.
     * 
     */
    public void setIdLogdment(int value) {
        this.idLogdment = value;
    }

    /**
     * Obtiene el valor de la propiedad lodgmentType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLodgmentType() {
        return lodgmentType;
    }

    /**
     * Define el valor de la propiedad lodgmentType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLodgmentType(String value) {
        this.lodgmentType = value;
    }

    /**
     * Obtiene el valor de la propiedad roomType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomType() {
        return roomType;
    }

    /**
     * Define el valor de la propiedad roomType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomType(String value) {
        this.roomType = value;
    }

    /**
     * Obtiene el valor de la propiedad idService.
     * 
     */
    public int getIdService() {
        return idService;
    }

    /**
     * Define el valor de la propiedad idService.
     * 
     */
    public void setIdService(int value) {
        this.idService = value;
    }

}
