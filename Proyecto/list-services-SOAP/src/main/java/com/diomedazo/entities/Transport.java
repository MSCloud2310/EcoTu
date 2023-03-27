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
 * <p>Clase Java para transport complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="transport"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id_transport" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="vehicule_type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="path_name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="time_arrival" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="time_depature" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "transport", propOrder = {
    "idTransport",
    "vehiculeType",
    "pathName",
    "timeArrival",
    "timeDepature",
    "idService"
})
public class Transport {

    @XmlElement(name = "id_transport")
    protected int idTransport;
    @XmlElement(name = "vehicule_type", required = true)
    protected String vehiculeType;
    @XmlElement(name = "path_name", required = true)
    protected String pathName;
    @XmlElement(name = "time_arrival", required = true)
    protected String timeArrival;
    @XmlElement(name = "time_depature", required = true)
    protected String timeDepature;
    @XmlElement(name = "id_service")
    protected int idService;

    /**
     * Obtiene el valor de la propiedad idTransport.
     * 
     */
    public int getIdTransport() {
        return idTransport;
    }

    /**
     * Define el valor de la propiedad idTransport.
     * 
     */
    public void setIdTransport(int value) {
        this.idTransport = value;
    }

    /**
     * Obtiene el valor de la propiedad vehiculeType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehiculeType() {
        return vehiculeType;
    }

    /**
     * Define el valor de la propiedad vehiculeType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehiculeType(String value) {
        this.vehiculeType = value;
    }

    /**
     * Obtiene el valor de la propiedad pathName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPathName() {
        return pathName;
    }

    /**
     * Define el valor de la propiedad pathName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPathName(String value) {
        this.pathName = value;
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
