package by.kuropatin.jaxwscxf.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class HelloService {

    public String sayHello(final String name) {
        log.info("Executing sayHello({})", name);
        try {
            return String.format("Hello, %s!", name);
        } catch (Exception e) {
            log.error(e.toString());
            throw new RuntimeException(e);
        }
    }
}