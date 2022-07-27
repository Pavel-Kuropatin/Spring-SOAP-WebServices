package by.kuropatin.jaxwscxf.config;

import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.connector.RequestFacade;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

@Slf4j
@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class CustomFilter implements Filter {

    @Value("${cxf.path}")
    private String wsContext;

    @Override
    public void doFilter(final ServletRequest request, final ServletResponse response, final FilterChain chain) throws IOException, ServletException {
        final String requestURI = ((RequestFacade) request).getRequestURI();
        final String regex = String.format("^%1$s/.+$|^/jaxws-cxf%1$s/.+$", wsContext);
        if (!requestURI.matches(regex)) {
            log.info("Invocation of resource with URI: " + requestURI);
            chain.doFilter(request, response);
            return;
        }

        log.info("Invocation of Web Service with URI: " + requestURI);
        chain.doFilter(request, response);
    }
}