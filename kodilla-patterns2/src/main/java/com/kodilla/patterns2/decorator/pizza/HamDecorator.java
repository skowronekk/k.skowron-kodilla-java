package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class HamDecorator extends AbstractPizzaOrderDecorator {
    public HamDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getBasicPizza() {
        return super.getBasicPizza().add(new BigDecimal(4));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + ham";
    }
}
