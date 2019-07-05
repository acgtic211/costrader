package es.ual.acg.cos.trader.register.ws;

import javax.xml.ws.Endpoint;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import es.ual.acg.cos.trader.register.controller.RegisterController;;
 
 
@Configuration
public class WebServiceConfig {
    @Autowired
    private Bus bus;
 
    // Beans with SOAP WS
    @Bean
    public Endpoint endpoint() {
        //EndpointImpl endpoint = new EndpointImpl(bus, new RegisterWSImpl());
        EndpointImpl endpoint = new EndpointImpl(bus, new RegisterController());
        endpoint.publish("/registersoap");
        return endpoint;
    }
    /*@Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, new ManageACRepositoryRESTImpl());
        endpoint.publish("/manageac");
        return endpoint;
    }*/
}