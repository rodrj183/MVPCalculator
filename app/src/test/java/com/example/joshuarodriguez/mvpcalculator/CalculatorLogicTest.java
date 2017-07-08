package com.example.joshuarodriguez.mvpcalculator;

import org.junit.Test;
import org.mariuszgromada.math.mxparser.Expression;

import static junit.framework.Assert.assertEquals;

public class CalculatorLogicTest {

    @Test
    public void isAdditionCorrect() {
        Double result = calculateMathExpression("1+1");
        assertEquals(2.0, result);
    }

    @Test
    public void isSubtractionCorrect() {
        Double result = calculateMathExpression("2-1");
        assertEquals(1.0, result);
    }

    @Test
    public void isMultiplicationCorrect() {
        Double result = calculateMathExpression("5*5");
        assertEquals(25.0, result);
    }

    @Test
    public void isDivisionCorrect() {
        Double result = calculateMathExpression("6/2");
        assertEquals(3.0, result);
    }

    @Test
    public void isOrderOfOperationsExecutedCorrectly() {
        Double result = calculateMathExpression("-2+5-2-6+4*9*4");
        assertEquals(139.0, result);
    }

    private Double calculateMathExpression(String mathExpression) {
        return new Expression(mathExpression).calculate();
    }
}