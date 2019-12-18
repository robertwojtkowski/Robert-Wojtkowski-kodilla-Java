package com.kodilla.patterns2.decorator.pizza;
import com.kodilla.patterns2.decorator.pizza.decorators.*;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        BigDecimal calculateCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(10), calculateCost);
    }
    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Zamówienie: pizza, składniki: sos pomidorowy, ser mozarella", description);
    }
    @Test
    public void testPizzaOrder1() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new HamOrderDecorator(theOrder);
        theOrder = new TunaOrderDecorator(theOrder);
        theOrder = new MushroomsOrderDecorator(theOrder);

        //When
        BigDecimal theCost = theOrder.getCost();
        String description = theOrder.getDescription();
        //Then
        assertEquals(new BigDecimal(17), theCost);
        assertEquals("Zamówienie: pizza, składniki: sos pomidorowy, ser mozarella, szynka, tuńczyk, pieczarki", description);
    }
    @Test
    public void testPizzaOrder2() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new SpinachOrderDecorator(theOrder);
        theOrder = new SalamiOrderDecorator(theOrder);
        theOrder = new PineappleOrderDecorator(theOrder);

        //When
        BigDecimal theCost = theOrder.getCost();
        String description = theOrder.getDescription();
        //Then
        assertEquals(new BigDecimal(19), theCost);
        assertEquals("Zamówienie: pizza, składniki: sos pomidorowy, ser mozarella, szpinak, salami, ananas", description);
    }
    @Test
    public void testPizzaOrder3() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new GarlicOrderDecorator(theOrder);
        theOrder = new ChilliPeppersOrderDecorator(theOrder);
        theOrder = new BaconOrderDecorator(theOrder);
        theOrder = new ChickenOrderDecorator(theOrder);

        //When
        BigDecimal theCost = theOrder.getCost();
        String description = theOrder.getDescription();
        //Then
        assertEquals(new BigDecimal(21), theCost);
        assertEquals("Zamówienie: pizza, składniki: sos pomidorowy, ser mozarella, czosnek, papryczki chilli, boczek, kurczak", description);
    }
    @Test
    public void testPizzaOrder4() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new HamOrderDecorator(theOrder);
        theOrder = new ChilliPeppersOrderDecorator(theOrder);
        theOrder = new ChilliPeppersOrderDecorator(theOrder);
        theOrder = new ChickenOrderDecorator(theOrder);
        theOrder = new ChickenOrderDecorator(theOrder);

        //When
        BigDecimal theCost = theOrder.getCost();
        String description = theOrder.getDescription();
        //Then
        assertEquals(new BigDecimal(26), theCost);
        assertEquals("Zamówienie: pizza, składniki: sos pomidorowy, ser mozarella, szynka, papryczki chilli, papryczki chilli, kurczak, kurczak", description);
    }
    @Test
    public void testPizzaOrder5() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new SalamiOrderDecorator(theOrder);
        theOrder = new SalamiOrderDecorator(theOrder);
        theOrder = new SalamiOrderDecorator(theOrder);
        theOrder = new MushroomsOrderDecorator(theOrder);
        theOrder = new MushroomsOrderDecorator(theOrder);
        theOrder = new TunaOrderDecorator(theOrder);

        //When
        BigDecimal theCost = theOrder.getCost();
        String description = theOrder.getDescription();
        //Then
        assertEquals(new BigDecimal(26), theCost);
        assertEquals("Zamówienie: pizza, składniki: sos pomidorowy, ser mozarella, salami, salami, salami, pieczarki, pieczarki, tuńczyk", description);
    }

}
