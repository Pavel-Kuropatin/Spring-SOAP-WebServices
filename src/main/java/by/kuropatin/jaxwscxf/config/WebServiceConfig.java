package by.kuropatin.jaxwscxf.config;

import by.kuropatin.jaxwscxf.ws.GoodByeWebService;
import by.kuropatin.jaxwscxf.ws.HelloWebService;
import lombok.RequiredArgsConstructor;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

@Configuration
@RequiredArgsConstructor
public class WebServiceConfig {

    private final Bus bus;
    private final HelloWebService helloWebService;
    private final GoodByeWebService goodByeWebService;

    @Bean
    public Endpoint helloEndpoint() {
        final EndpointImpl endpoint = new EndpointImpl(bus, helloWebService);
        endpoint.publish("/Hello");
        return endpoint;
    }

    @Bean
    public Endpoint goodByeEndpoint() {
        final EndpointImpl endpoint = new EndpointImpl(bus, goodByeWebService);
        endpoint.publish("/GoodBye");
        return endpoint;
    }
}