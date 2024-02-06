package in.kpmg.iocl.skuapi;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.3.2
 * 2024-02-06T20:23:11.178+05:30
 * Generated source version: 3.3.2
 *
 */
@WebServiceClient(name = "ViewSkuAltConvPortService",
                  wsdlLocation = "file:/C:/Users/vidhiaggarwal/Documents/Projects/IOCL/code/iocl_consumer-main/src/main/resources/wsdl/getSkuAltCon.wsdl",
                  targetNamespace = "http://www.kpmg.in/iocl/SKUapi")
public class ViewSkuAltConvPortService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.kpmg.in/iocl/SKUapi", "ViewSkuAltConvPortService");
    public final static QName ViewSkuAltConvPortSoap11 = new QName("http://www.kpmg.in/iocl/SKUapi", "ViewSkuAltConvPortSoap11");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/vidhiaggarwal/Documents/Projects/IOCL/code/iocl_consumer-main/src/main/resources/wsdl/getSkuAltCon.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ViewSkuAltConvPortService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/vidhiaggarwal/Documents/Projects/IOCL/code/iocl_consumer-main/src/main/resources/wsdl/getSkuAltCon.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ViewSkuAltConvPortService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ViewSkuAltConvPortService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ViewSkuAltConvPortService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public ViewSkuAltConvPortService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ViewSkuAltConvPortService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ViewSkuAltConvPortService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns ViewSkuAltConvPort
     */
    @WebEndpoint(name = "ViewSkuAltConvPortSoap11")
    public ViewSkuAltConvPort getViewSkuAltConvPortSoap11() {
        return super.getPort(ViewSkuAltConvPortSoap11, ViewSkuAltConvPort.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ViewSkuAltConvPort
     */
    @WebEndpoint(name = "ViewSkuAltConvPortSoap11")
    public ViewSkuAltConvPort getViewSkuAltConvPortSoap11(WebServiceFeature... features) {
        return super.getPort(ViewSkuAltConvPortSoap11, ViewSkuAltConvPort.class, features);
    }

}