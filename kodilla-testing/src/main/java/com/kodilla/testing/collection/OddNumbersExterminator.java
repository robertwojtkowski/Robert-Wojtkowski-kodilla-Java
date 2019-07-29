package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {


    public static ArrayList exterminate(ArrayList<Integer> numbers){
        ArrayList zwrot= new ArrayList();

        for (int a:numbers){

            if (a%2==0){

                zwrot.add(a);
            }

        }



        return zwrot;
    }

}
