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
 * <p>Clase Java para food complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="food"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id_food" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="place_type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="diet_type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="food_type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "food", propOrder = {
    "idFood",
    "placeType",
    "dietType",
    "foodType",
    "idService"
})
public class Food {

    @XmlElement(name = "id_food")
    protected int idFood;
    @XmlElement(name = "place_type", required = true)
    protected String placeType;
    @XmlElement(name = "diet_type", required = true)
    protected String dietType;
    @XmlElement(name = "food_type", required = true)
    protected String foodType;
    @XmlElement(name = "id_service")
    protected int idService;

    /**
     * Obtiene el valor de la propiedad idFood.
     * 
     */
    public int getIdFood() {
        return idFood;
    }

    /**
     * Define el valor de la propiedad idFood.
     * 
     */
    public void setIdFood(int value) {
        this.idFood = value;
    }

    /**
     * Obtiene el valor de la propiedad placeType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceType() {
        return placeType;
    }

    /**
     * Define el valor de la propiedad placeType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceType(String value) {
        this.placeType = value;
    }

    /**
     * Obtiene el valor de la propiedad dietType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDietType() {
        return dietType;
    }

    /**
     * Define el valor de la propiedad dietType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDietType(String value) {
        this.dietType = value;
    }

    /**
     * Obtiene el valor de la propiedad foodType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoodType() {
        return foodType;
    }

    /**
     * Define el valor de la propiedad foodType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoodType(String value) {
        this.foodType = value;
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
