
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
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

    private final static QName _Test_QNAME = new QName("http://ws/", "test");
    private final static QName _ConversionEuroDh_QNAME = new QName("http://ws/", "conversionEuroDh");
    private final static QName _TestResponse_QNAME = new QName("http://ws/", "testResponse");
    private final static QName _ConversionEuroDhResponse_QNAME = new QName("http://ws/", "conversionEuroDhResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Test }
     * 
     */
    public Test createTest() {
        return new Test();
    }

    /**
     * Create an instance of {@link ConversionEuroDh }
     * 
     */
    public ConversionEuroDh createConversionEuroDh() {
        return new ConversionEuroDh();
    }

    /**
     * Create an instance of {@link TestResponse }
     * 
     */
    public TestResponse createTestResponse() {
        return new TestResponse();
    }

    /**
     * Create an instance of {@link ConversionEuroDhResponse }
     * 
     */
    public ConversionEuroDhResponse createConversionEuroDhResponse() {
        return new ConversionEuroDhResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Test }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "test")
    public JAXBElement<Test> createTest(Test value) {
        return new JAXBElement<Test>(_Test_QNAME, Test.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroDh }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "conversionEuroDh")
    public JAXBElement<ConversionEuroDh> createConversionEuroDh(ConversionEuroDh value) {
        return new JAXBElement<ConversionEuroDh>(_ConversionEuroDh_QNAME, ConversionEuroDh.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "testResponse")
    public JAXBElement<TestResponse> createTestResponse(TestResponse value) {
        return new JAXBElement<TestResponse>(_TestResponse_QNAME, TestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroDhResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "conversionEuroDhResponse")
    public JAXBElement<ConversionEuroDhResponse> createConversionEuroDhResponse(ConversionEuroDhResponse value) {
        return new JAXBElement<ConversionEuroDhResponse>(_ConversionEuroDhResponse_QNAME, ConversionEuroDhResponse.class, null, value);
    }

}
