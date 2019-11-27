package com.example.demo.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @Autowired
    Display display;

    public double add(double a, double b){
        double value = a + b;
        display.displayvalue(value);
        return value;
    }

    public  double sub(double a, double b){
        double value = a - b;
        display.displayvalue(value);
        return value;
    }

    public double mul(double a, double b){
        double value = a * b;
        display.displayvalue(value);
        return value;
    }
    public double div(double a, double b){
        double value = a / b;
        display.displayvalue(value);
        return value;
    }

}
