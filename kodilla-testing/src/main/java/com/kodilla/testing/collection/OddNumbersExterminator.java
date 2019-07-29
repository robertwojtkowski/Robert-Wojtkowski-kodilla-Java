package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {


    public static ArrayList exterminate(ArrayList<Integer> numbers){
        ArrayList<Integer> zwrot= new ArrayList<>();
        //utworzenie nowej listy- tej ktora będzie zwracana

        for (int a:numbers){ //pętla iterująca po wszystkich elementach listy wejściowej

            if (a%2==0){//sprawdzenie parzystości

                zwrot.add(a);//dodanie do nowej listy
            }

        }

        return zwrot;//zwrot listy parzystej
    }

}
