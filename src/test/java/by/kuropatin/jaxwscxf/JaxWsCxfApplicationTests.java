package by.kuropatin.jaxwscxf;

import by.kuropatin.jaxwscxf.config.WebServiceConfig;
import by.kuropatin.jaxwscxf.service.GoodByeService;
import by.kuropatin.jaxwscxf.service.HelloService;
import by.kuropatin.jaxwscxf.ws.GoodByeWebService;
import by.kuropatin.jaxwscxf.ws.HelloWebService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class JaxWsCxfApplicationTests {

    @Autowired
    private WebServiceConfig webServiceConfig;
    @Autowired
    private GoodByeService goodByeService;
    @Autowired
    private HelloService helloService;
    @Autowired
    private GoodByeWebService goodByeWebService;
    @Autowired
    private HelloWebService helloWebService;

    @Test
    void contextLoads() {
        assertNotNull(webServiceConfig);
        assertNotNull(goodByeService);
        assertNotNull(helloService);
        assertNotNull(goodByeWebService);
        assertNotNull(helloWebService);
    }
}