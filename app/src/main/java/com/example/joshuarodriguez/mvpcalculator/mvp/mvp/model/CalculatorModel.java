package com.example.joshuarodriguez.mvpcalculator.mvp.mvp.model;

import android.util.Log;

import org.mariuszgromada.math.mxparser.Expression;

public class CalculatorModel {

    private static final String TAG = CalculatorModel.class.getSimpleName();

    public CalculatorModel() {}

    public Double calculateExpression(String mathExpression) {
        return new Expression(cleanExpression(mathExpression)).calculate();
    }

    private String cleanExpression(String mathExpression) {
        if (mathExpression.contains("×")) {
            mathExpression = mathExpression.replace('×', '*');
        }

        if (mathExpression.contains("÷")) {
            mathExpression = mathExpression.replace('÷', '/');
        }

        Log.d(TAG, mathExpression);

        return mathExpression;
    }
}
