
package ioservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ioservice package. 
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

    private final static QName _GetAll_QNAME = new QName("http://impl.service.spring.com/", "getAll");
    private final static QName _SayHello_QNAME = new QName("http://impl.service.spring.com/", "sayHello");
    private final static QName _GetAllResponse_QNAME = new QName("http://impl.service.spring.com/", "getAllResponse");
    private final static QName _InsertOne_QNAME = new QName("http://impl.service.spring.com/", "insertOne");
    private final static QName _InsertOneResponse_QNAME = new QName("http://impl.service.spring.com/", "insertOneResponse");
    private final static QName _SayHelloResponse_QNAME = new QName("http://impl.service.spring.com/", "sayHelloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ioservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAll }
     * 
     */
    public GetAll createGetAll() {
        return new GetAll();
    }

    /**
     * Create an instance of {@link SayHello }
     * 
     */
    public SayHello createSayHello() {
        return new SayHello();
    }

    /**
     * Create an instance of {@link GetAllResponse }
     * 
     */
    public GetAllResponse createGetAllResponse() {
        return new GetAllResponse();
    }

    /**
     * Create an instance of {@link InsertOne }
     * 
     */
    public InsertOne createInsertOne() {
        return new InsertOne();
    }

    /**
     * Create an instance of {@link InsertOneResponse }
     * 
     */
    public InsertOneResponse createInsertOneResponse() {
        return new InsertOneResponse();
    }

    /**
     * Create an instance of {@link SayHelloResponse }
     * 
     */
    public SayHelloResponse createSayHelloResponse() {
        return new SayHelloResponse();
    }

    /**
     * Create an instance of {@link Io }
     * 
     */
    public Io createIo() {
        return new Io();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.spring.com/", name = "getAll")
    public JAXBElement<GetAll> createGetAll(GetAll value) {
        return new JAXBElement<GetAll>(_GetAll_QNAME, GetAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.spring.com/", name = "sayHello")
    public JAXBElement<SayHello> createSayHello(SayHello value) {
        return new JAXBElement<SayHello>(_SayHello_QNAME, SayHello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.spring.com/", name = "getAllResponse")
    public JAXBElement<GetAllResponse> createGetAllResponse(GetAllResponse value) {
        return new JAXBElement<GetAllResponse>(_GetAllResponse_QNAME, GetAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertOne }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.spring.com/", name = "insertOne")
    public JAXBElement<InsertOne> createInsertOne(InsertOne value) {
        return new JAXBElement<InsertOne>(_InsertOne_QNAME, InsertOne.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertOneResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.spring.com/", name = "insertOneResponse")
    public JAXBElement<InsertOneResponse> createInsertOneResponse(InsertOneResponse value) {
        return new JAXBElement<InsertOneResponse>(_InsertOneResponse_QNAME, InsertOneResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.spring.com/", name = "sayHelloResponse")
    public JAXBElement<SayHelloResponse> createSayHelloResponse(SayHelloResponse value) {
        return new JAXBElement<SayHelloResponse>(_SayHelloResponse_QNAME, SayHelloResponse.class, null, value);
    }

}
