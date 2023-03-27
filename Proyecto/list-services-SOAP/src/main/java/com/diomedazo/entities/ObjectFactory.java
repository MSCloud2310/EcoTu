//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.03.27 a las 01:19:39 PM COT 
//


package com.diomedazo.entities;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.diomedazo.entities package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetAllServicesRequest_QNAME = new QName("http://www.diomedazo.com/entities", "getAllServicesRequest");
    private final static QName _GetAllFoodServicesRequest_QNAME = new QName("http://www.diomedazo.com/entities", "getAllFoodServicesRequest");
    private final static QName _GetAllEntertaimentServicesRequest_QNAME = new QName("http://www.diomedazo.com/entities", "getAllEntertaimentServicesRequest");
    private final static QName _GetAllLogdementServicesRequest_QNAME = new QName("http://www.diomedazo.com/entities", "getAllLogdementServicesRequest");
    private final static QName _GetAllTransportServicesRequest_QNAME = new QName("http://www.diomedazo.com/entities", "getAllTransportServicesRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.diomedazo.entities
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllServicesResponse }
     * 
     */
    public GetAllServicesResponse createGetAllServicesResponse() {
        return new GetAllServicesResponse();
    }

    /**
     * Create an instance of {@link Service }
     * 
     */
    public Service createService() {
        return new Service();
    }

    /**
     * Create an instance of {@link GetAllFoodServicesResponse }
     * 
     */
    public GetAllFoodServicesResponse createGetAllFoodServicesResponse() {
        return new GetAllFoodServicesResponse();
    }

    /**
     * Create an instance of {@link Food }
     * 
     */
    public Food createFood() {
        return new Food();
    }

    /**
     * Create an instance of {@link GetAllEntertaimentServicesResponse }
     * 
     */
    public GetAllEntertaimentServicesResponse createGetAllEntertaimentServicesResponse() {
        return new GetAllEntertaimentServicesResponse();
    }

    /**
     * Create an instance of {@link Entertaiment }
     * 
     */
    public Entertaiment createEntertaiment() {
        return new Entertaiment();
    }

    /**
     * Create an instance of {@link GetAllLodgmentServicesResponse }
     * 
     */
    public GetAllLodgmentServicesResponse createGetAllLodgmentServicesResponse() {
        return new GetAllLodgmentServicesResponse();
    }

    /**
     * Create an instance of {@link Lodgment }
     * 
     */
    public Lodgment createLodgment() {
        return new Lodgment();
    }

    /**
     * Create an instance of {@link GetAllTransportServicesResponse }
     * 
     */
    public GetAllTransportServicesResponse createGetAllTransportServicesResponse() {
        return new GetAllTransportServicesResponse();
    }

    /**
     * Create an instance of {@link Transport }
     * 
     */
    public Transport createTransport() {
        return new Transport();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.diomedazo.com/entities", name = "getAllServicesRequest")
    public JAXBElement<Object> createGetAllServicesRequest(Object value) {
        return new JAXBElement<Object>(_GetAllServicesRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.diomedazo.com/entities", name = "getAllFoodServicesRequest")
    public JAXBElement<Object> createGetAllFoodServicesRequest(Object value) {
        return new JAXBElement<Object>(_GetAllFoodServicesRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.diomedazo.com/entities", name = "getAllEntertaimentServicesRequest")
    public JAXBElement<Object> createGetAllEntertaimentServicesRequest(Object value) {
        return new JAXBElement<Object>(_GetAllEntertaimentServicesRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.diomedazo.com/entities", name = "getAllLogdementServicesRequest")
    public JAXBElement<Object> createGetAllLogdementServicesRequest(Object value) {
        return new JAXBElement<Object>(_GetAllLogdementServicesRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.diomedazo.com/entities", name = "getAllTransportServicesRequest")
    public JAXBElement<Object> createGetAllTransportServicesRequest(Object value) {
        return new JAXBElement<Object>(_GetAllTransportServicesRequest_QNAME, Object.class, null, value);
    }

}
