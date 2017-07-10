package com.example.joshuarodriguez.mvpcalculator.mvp.mvp.model;

import org.mariuszgromada.math.mxparser.Expression;

public class CalculatorModel {

    private static final String TAG = CalculatorModel.class.getSimpleName();

    private static final char MULTI_SYMBOL = '×';
    private static final char DIV_SYMBOL = '÷';
    private static final char MULTI_SYMBOL_FOR_PARSER = '*';
    private static final char DIV_SYMBOL_FOR_PARSER = '/';

    public CalculatorModel() {}

    public Double calculateExpression(String mathExpression) {
        return new Expression(cleanExpression(mathExpression)).calculate();
    }

    private String cleanExpression(String mathExpression) {
        if (mathExpression.contains(String.valueOf(MULTI_SYMBOL))) {
            mathExpression = mathExpression.replace(MULTI_SYMBOL, MULTI_SYMBOL_FOR_PARSER);
        }

        if (mathExpression.contains(String.valueOf(DIV_SYMBOL))) {
            mathExpression = mathExpression.replace(DIV_SYMBOL, DIV_SYMBOL_FOR_PARSER);
        }

        return mathExpression;
    }
}
