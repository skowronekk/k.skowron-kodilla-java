package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class OlivesDecorator extends AbstractPizzaOrderDecorator {
    public OlivesDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getBasicPizza() {
        return super.getBasicPizza().add(new BigDecimal(5));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + olives";
    }
}
