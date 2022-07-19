package by.kuropatin.jaxwscxf.ws;

import by.kuropatin.jaxwscxf.service.GoodByeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;

@Component
@RequiredArgsConstructor
@WebService(serviceName = "GoodBye")
public class GoodByeWebService {

    private final GoodByeService service;

    @WebMethod(operationName = "sayGoodBye")
    public String sayGoodBye(
            @WebParam(name = "name") @XmlElement(required = true) final String name
    ) {
        return service.sayGoodBye(name);
    }
}