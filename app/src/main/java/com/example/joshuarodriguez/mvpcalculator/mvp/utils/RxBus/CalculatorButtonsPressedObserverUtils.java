package com.example.joshuarodriguez.mvpcalculator.mvp.utils.RxBus;

import android.support.v7.app.AppCompatActivity;

import com.example.joshuarodriguez.mvpcalculator.R;
import com.example.joshuarodriguez.mvpcalculator.mvp.utils.RxBus.Observers.NumericButtonPressedObserver;
import com.example.joshuarodriguez.mvpcalculator.mvp.utils.RxBus.Observers.OperatorButtonPressedObserver;

public class CalculatorButtonsPressedObserverUtils {

    public static String determineNumericButtonValue(AppCompatActivity activity,
                                                     NumericButtonPressedObserver.NumericButton.Number number) {
        String buttonValue = "";

        switch(number) {
            case ZERO:
                buttonValue = activity.getString(R.string.calculator_button_value_zero);
                break;
            case ONE:
                buttonValue = activity.getString(R.string.calculator_button_value_one);
                break;
            case TWO:
                buttonValue = activity.getString(R.string.calculator_button_value_two);
                break;
            case THREE:
                buttonValue = activity.getString(R.string.calculator_button_value_three);
                break;
            case FOUR:
                buttonValue = activity.getString(R.string.calculator_button_value_four);
                break;
            case FIVE:
                buttonValue = activity.getString(R.string.calculator_button_value_five);
                break;
            case SIX:
                buttonValue = activity.getString(R.string.calculator_button_value_six);
                break;
            case SEVEN:
                buttonValue = activity.getString(R.string.calculator_button_value_seven);
                break;
            case EIGHT:
                buttonValue = activity.getString(R.string.calculator_button_value_eight);
                break;
            case NINE:
                buttonValue = activity.getString(R.string.calculator_button_value_nine);
                break;
            case DECIMAL:
                buttonValue = activity.getString(R.string.calculator_button_decimal);
                break;
        }

        return buttonValue;
    }

    public static String determineOperatorButtonValue(AppCompatActivity activity,
                                                      OperatorButtonPressedObserver.OperatorButton.Operator operator) {
        String buttonValue = "";

        switch(operator) {
            case ADDITION:
                buttonValue = activity.getString(R.string.calculator_button_operator_add);
                break;
            case SUBTRACTION:
                buttonValue = activity.getString(R.string.calculator_button_operator_subtract);
                break;
            case DIVISION:
                buttonValue = activity.getString(R.string.calculator_button_operator_divide);
                break;
            case MULTIPLICATION:
                buttonValue = activity.getString(R.string.calculator_button_operator_multiply);
                break;
            case CLEAR:
                buttonValue = activity.getString(R.string.calculator_button_operator_clear);
                break;
            case DELETE:
                buttonValue = activity.getString(R.string.calculator_button_operator_delete);
                break;
            case EQUALS:
                buttonValue = activity.getString(R.string.calculator_button_operator_equals);
                break;
        }

        return buttonValue;
    }
}
