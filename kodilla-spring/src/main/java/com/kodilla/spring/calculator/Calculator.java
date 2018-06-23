package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public final class Calculator {
    @Autowired
    private Display display;

    public double addMethod(double a, double b) {
        double result = a + b;
        display.displayValue(result);
        return result;

    }

    public double subMethod(double a, double b) {
        double result = a - b;
        display.displayValue(result);
        return result;

    }

    public double mulMethod(double a, double b) {
        double result = a * b;
        display.displayValue(result);
        return result;
    }

    public double divMethod(double a, double b) {
        double result = a/b;
        display.displayValue(result);
        return result;


    }

}
