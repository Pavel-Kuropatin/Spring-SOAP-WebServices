package by.kuropatin.jaxwscxf.ws;

import by.kuropatin.jaxwscxf.service.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;

@Component
@RequiredArgsConstructor
@WebService(serviceName = "Hello")
public class HelloWebService {

    private final HelloService service;

    @WebMethod(operationName = "sayHello")
    public String sayHello(
            @WebParam(name = "name") @XmlElement(required = true) final String name
    ) {
        return service.sayHello(name);
    }
}