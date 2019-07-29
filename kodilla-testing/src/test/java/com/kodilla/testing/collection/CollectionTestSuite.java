package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Poczatek pojedynczego testu");
    }
    @After
    public void after(){
        System.out.println("koniec pojedynczego testu");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Poczatek testu");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("koniec testu");
    }


    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        ArrayList<Integer> pusta=new ArrayList<>();
        //nowa pusta lista
        //When
        ArrayList wynik=OddNumbersExterminator.exterminate(pusta);
        //przepuszczenie pustej listy przez metode
        //Then
        Assert.assertEquals(pusta,wynik);
        //porownanie wyniku z oczekiwanymi rezultatami

    }

    @Test
    public void testOddNumbersExterminatorNormalList (){
        //Given
        ArrayList<Integer> lista=new ArrayList<>();
        ArrayList<Integer> oczekiwana=new ArrayList<Integer>();
        lista.add(1);
        lista.add(2);
        oczekiwana.add(2);
        lista.add(5);
        lista.add(6);
        oczekiwana.add(6);
        //stworzenie listy z róznymi liczbami i listy z samymi parzystymi


        //When
        ArrayList wynik=OddNumbersExterminator.exterminate(lista);
        //przepuszczenie przez metodę



        //Then
        Assert.assertEquals(oczekiwana,wynik);
        //porównanie listy oczekiwanej i wynikowej

    }



}
