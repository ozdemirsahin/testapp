package com.jaxws.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.DOCUMENT) //optional
public interface HelloWorld{

    @WebMethod String getHelloWorldAsString(String name);

}