package by.kuropatin.jaxwscxf.response;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Data {

    private final Long id;
    private final String value;
}