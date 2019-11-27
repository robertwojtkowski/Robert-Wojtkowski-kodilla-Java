package com.example.demo.calculator;

import org.springframework.stereotype.Component;

@Component
public class Display {
    public void displayvalue(double val){
        System.out.println("Wynik: " + val);
    }
}
