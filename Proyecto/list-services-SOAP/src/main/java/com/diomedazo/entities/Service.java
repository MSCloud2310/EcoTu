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
 * <p>Clase Java para service complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="service"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id_service" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="availability" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="category" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="photo_url" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="id_supplier" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "service", propOrder = {
    "idService",
    "availability",
    "category",
    "name",
    "photoUrl",
    "price",
    "duration",
    "idSupplier"
})
public class Service {

    @XmlElement(name = "id_service")
    protected int idService;
    protected int availability;
    @XmlElement(required = true)
    protected String category;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(name = "photo_url", required = true)
    protected String photoUrl;
    protected float price;
    @XmlElement(required = true)
    protected String duration;
    @XmlElement(name = "id_supplier")
    protected int idSupplier;

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

    /**
     * Obtiene el valor de la propiedad availability.
     * 
     */
    public int getAvailability() {
        return availability;
    }

    /**
     * Define el valor de la propiedad availability.
     * 
     */
    public void setAvailability(int value) {
        this.availability = value;
    }

    /**
     * Obtiene el valor de la propiedad category.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Define el valor de la propiedad category.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad photoUrl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhotoUrl() {
        return photoUrl;
    }

    /**
     * Define el valor de la propiedad photoUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhotoUrl(String value) {
        this.photoUrl = value;
    }

    /**
     * Obtiene el valor de la propiedad price.
     * 
     */
    public float getPrice() {
        return price;
    }

    /**
     * Define el valor de la propiedad price.
     * 
     */
    public void setPrice(float value) {
        this.price = value;
    }

    /**
     * Obtiene el valor de la propiedad duration.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Define el valor de la propiedad duration.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration(String value) {
        this.duration = value;
    }

    /**
     * Obtiene el valor de la propiedad idSupplier.
     * 
     */
    public int getIdSupplier() {
        return idSupplier;
    }

    /**
     * Define el valor de la propiedad idSupplier.
     * 
     */
    public void setIdSupplier(int value) {
        this.idSupplier = value;
    }

}
