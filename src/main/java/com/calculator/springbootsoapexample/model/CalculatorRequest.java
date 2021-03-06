package com.calculator.springbootsoapexample.model;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "op",
        "first",
        "second"
})
@XmlRootElement(namespace = "http://www.baeldung.com/springsoap/gen",name = "CalculatorRequest")
public class CalculatorRequest {
    private float second = 1;
    private float first = 2;
    private String op = "+";

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public float getFirst() {
        return first;
    }

    public void setFirst(float first) {
        this.first = first;
    }

    public float getSecond() {
        return second;
    }

    public void setSecond(float second) {
        this.second = second;
    }
}
