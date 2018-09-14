package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {


    @Test
    public void testBigBasicPizzaCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new BigSizeDecorator(theOrder);

        //When
        BigDecimal theCost = theOrder.getBasicPizza();

        //Then
        assertEquals(new BigDecimal(20), theCost);

    }

    @Test
    public void testBigBasicPizzaDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new BigSizeDecorator(theOrder);

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("You ordered Basic pizza, size: big", description);

    }

    @Test
    public void testBigBasicPizzaWithOnionAndHamCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new BigSizeDecorator(theOrder);
        theOrder = new OnionDecorator(theOrder);
        theOrder = new HamDecorator(theOrder);
        System.out.println(theOrder.getBasicPizza());

        //When
        BigDecimal theCost = theOrder.getBasicPizza();

        //Then
        assertEquals(new BigDecimal(26), theCost);

    }

    @Test
    public void testBigBasicPizzaWithOnionAndHamDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new BigSizeDecorator(theOrder);
        theOrder = new OnionDecorator(theOrder);
        theOrder = new HamDecorator(theOrder);
        System.out.println(theOrder.getDescription());

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("You ordered Basic pizza, size: big + onion + ham", description);

    }

}
