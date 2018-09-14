package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class OnionDecorator extends AbstractPizzaOrderDecorator {
    public OnionDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getBasicPizza() {
        return super.getBasicPizza().add(new BigDecimal(2));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + onion";
    }
}
