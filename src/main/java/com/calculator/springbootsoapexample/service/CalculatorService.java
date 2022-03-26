package com.calculator.springbootsoapexample.service;

import com.calculator.springbootsoapexample.model.CalculatorRequest;
import com.calculator.springbootsoapexample.model.Response;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public Response calculate(CalculatorRequest request){
        Response resp = new Response();
        float first = request.getFirst();
        float second = request.getSecond();
        switch (request.getOp()) {
            case "+" -> resp.setResult(first + second);
            case "-" -> resp.setResult(first - second);
            case "*" -> resp.setResult(first * second);
            case "/" -> resp.setResult(first / second);
            case "^" -> resp.setResult((float) Math.pow(first, second));
            default -> resp.setMessage("invalid operator");
        }
        return resp;
    }
}
