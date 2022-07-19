package by.kuropatin.jaxwscxf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = "by.kuropatin.jaxwscxf")
public class JaxWsCxfApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(JaxWsCxfApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(JaxWsCxfApplication.class);
    }
}