package com.kodilla.testing;

import com.kodilla.testing.kalkulator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        int a=3;
        int b=2;
        Calculator kalk = new Calculator();
//tworzymy obiekt klakulator i od razu wprowadzamy dane

        if (kalk.subtract(a,b)==(1)){//jesli 3-2=1 jest dobrze
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }


        if (kalk.add(a,b)==(5)){  //jesli 3+3=5 to jest dobrze
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    }
}