package com.kodilla.testing.kalkulator;

public class Calculator {

    int a;
    int b;// zmienne do obliczen

    public Calculator(int a, int b) {//konstruktor, pobiera a i b
        this.a = a;
        this.b = b;
    }

 public int add(){//zwraca sumę
        return a+b;
    }

    public int subtract(){//zwraca różnicę
        return a-b;
    }


}
