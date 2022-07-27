package by.kuropatin.jaxwscxf.controller;

import by.kuropatin.jaxwscxf.response.Data;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class Rest {

    @GetMapping("/data")
    public ResponseEntity<Data> getData() {
        final Data data = Data.builder()
                .id(RandomUtils.nextLong(1, 10))
                .value(RandomStringUtils.randomAlphabetic(10))
                .build();
        return new ResponseEntity<>(data, HttpStatus.OK);
    }
}