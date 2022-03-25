package com.calculator.springbootsoapexample.endpoint;
import com.calculator.springbootsoapexample.model.CalculatorRequest;
import com.calculator.springbootsoapexample.model.Response;
import com.calculator.springbootsoapexample.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;



@Endpoint
public class CalculatorEndpoint {

    private static final String NAMESPACE = "test";
    @Autowired
    public CalculatorService service;
    @PayloadRoot(namespace = NAMESPACE, localPart = "CustomerRequest")
    @ResponsePayload
    public Response getLoanStatus(@RequestPayload CalculatorRequest request) {
        return service.calculate(request);
    }

}
