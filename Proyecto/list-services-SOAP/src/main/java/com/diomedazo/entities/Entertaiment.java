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
 * <p>Clase Java para entertaiment complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="entertaiment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id_enter" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="enter_type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="time_arrival" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="time_depature" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="restriction" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "entertaiment", propOrder = {
    "idEnter",
    "enterType",
    "timeArrival",
    "timeDepature",
    "restriction",
    "idService"
})
public class Entertaiment {

    @XmlElement(name = "id_enter")
    protected int idEnter;
    @XmlElement(name = "enter_type", required = true)
    protected String enterType;
    @XmlElement(name = "time_arrival", required = true)
    protected String timeArrival;
    @XmlElement(name = "time_depature", required = true)
    protected String timeDepature;
    @XmlElement(required = true)
    protected String restriction;
    @XmlElement(name = "id_service")
    protected int idService;

    /**
     * Obtiene el valor de la propiedad idEnter.
     * 
     */
    public int getIdEnter() {
        return idEnter;
    }

    /**
     * Define el valor de la propiedad idEnter.
     * 
     */
    public void setIdEnter(int value) {
        this.idEnter = value;
    }

    /**
     * Obtiene el valor de la propiedad enterType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnterType() {
        return enterType;
    }

    /**
     * Define el valor de la propiedad enterType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnterType(String value) {
        this.enterType = value;
    }

    /**
     * Obtiene el valor de la propiedad timeArrival.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeArrival() {
        return timeArrival;
    }

    /**
     * Define el valor de la propiedad timeArrival.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeArrival(String value) {
        this.timeArrival = value;
    }

    /**
     * Obtiene el valor de la propiedad timeDepature.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeDepature() {
        return timeDepature;
    }

    /**
     * Define el valor de la propiedad timeDepature.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeDepature(String value) {
        this.timeDepature = value;
    }

    /**
     * Obtiene el valor de la propiedad restriction.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestriction() {
        return restriction;
    }

    /**
     * Define el valor de la propiedad restriction.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestriction(String value) {
        this.restriction = value;
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
