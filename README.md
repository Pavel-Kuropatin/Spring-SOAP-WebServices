# SOAP Web Services implementation using Spring Boot and Apache CXF

---
This sample project demonstrates how to use CXF Web Services with Spring Boot with constructor dependency injection.

Web services display warning `Web Serviceproblem:Class should be instantiatable (have public modifier and noarg public constructor)` since they don't have public no arg constructor as described in [JAX-WS documentation](https://docs.oracle.com/cd/E17802_01/webservices/webservices/docs/2.0/tutorial/doc/JAXWS3.html) but this is not a problem, because web services are created by Spring.

WSDL location can be configured in `application.properties` `cxf.path=` property. By default it is [http://localhost:8080/ws](http://localhost:8080/ws) when started from IDE. On a Tomcat server it will be [http://host:port/jaxws-cxf/ws]() by default.
<br>
___Spring Rest or MVC controllers and CXF services must be located on different servlet contexts.___

Postman WSDL collection located [HERE](WSDL.postman_collection.json)