package com.calculator.springbootsoapexample.endpoint;
import com.calculator.springbootsoapexample.model.CalculatorRequest;
import com.calculator.springbootsoapexample.model.Response;
import com.calculator.springbootsoapexample.service.CalculatorService;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;



@Endpoint
public class CalculatorEndpoint {

    private static final String NAMESPACE = "http://www.baeldung.com/springsoap/gen";

    private CalculatorService calculatorService;
    @Autowired
    public CalculatorEndpoint(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
    @PayloadRoot(namespace = NAMESPACE, localPart = "CalculatorRequest")
    @ResponsePayload
    public Response getLoanStatus(@RequestPayload @NotNull CalculatorRequest request) {
        System.out.println(request.getFirst());
        Response response = new Response();
        response.setMessage(this.calculatorService.calculate(request).getMessage());
        response.setResult(this.calculatorService.calculate(request).getResult());
        return response;
    }

}
