package by.kuropatin.jaxwscxf.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class GoodByeService {

    public String sayGoodBye(final String name) {
        log.info("Executing sayGoodBye({})", name);
        try {
            return String.format("Goodbye, %s!", name);
        } catch (Exception e) {
            log.error(e.toString());
            throw new RuntimeException(e);
        }
    }
}