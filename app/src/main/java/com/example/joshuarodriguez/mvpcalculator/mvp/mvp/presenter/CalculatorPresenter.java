package com.example.joshuarodriguez.mvpcalculator.mvp.mvp.presenter;

import com.example.joshuarodriguez.mvpcalculator.mvp.mvp.model.CalculatorModel;
import com.example.joshuarodriguez.mvpcalculator.mvp.mvp.view.CalculatorView;
import com.example.joshuarodriguez.mvpcalculator.mvp.utils.Bus.BusEvents.CalculatorNumericButtonPressedEvent;
import com.example.joshuarodriguez.mvpcalculator.mvp.utils.Bus.BusEvents.CalculatorOperatorButtonPressedEvent;
import com.squareup.otto.Subscribe;

public class CalculatorPresenter {

    private static final String TAG = CalculatorPresenter.class.getSimpleName();

    private static final String CLEAR_OPERATOR = "C";
    private static final String DELETE_OPERATOR = "DEL";
    private static final String EQUALS_OPERATOR = "=";

    private CalculatorModel calculatorModel;
    private CalculatorView calculatorView;

    public CalculatorPresenter(CalculatorModel calculatorModel, CalculatorView calculatorView) {
        this.calculatorModel = calculatorModel;
        this.calculatorView = calculatorView;
    }

    @Subscribe
    public void calculatorNumericButtonPressed(CalculatorNumericButtonPressedEvent event) {
        calculatorView.clearAndRevertFieldViewIfThereWasABadExpression();
        calculatorView.appendButtonValueToInputField(event.getButtonValue());
        calculatorView.alwaysShowLatestInputs();
    }

    @Subscribe
    public void calculatorOperatorButtonPressed(CalculatorOperatorButtonPressedEvent event) {
        calculatorView.clearAndRevertFieldViewIfThereWasABadExpression();;
        determineCalculatorAction(event.getButtonValue());
    }

    private void determineCalculatorAction(String operatorPressed) {
        if (operatorPressed.equals(DELETE_OPERATOR)) {
            calculatorView.backSpaceCalculatorInputField();
        } else if (operatorPressed.equals(CLEAR_OPERATOR)) {
            calculatorView.clearCalculatorInputField();
        } else if (operatorPressed.equals(EQUALS_OPERATOR)) {
            String inputFieldValue = calculatorView.getCalculatorInputFieldValue();
            String result = calculatorModel.calculateExpression(inputFieldValue).toString();
            calculatorView.setResult(result);
        } else {
            calculatorView.appendButtonValueToInputField(operatorPressed);
            calculatorView.alwaysShowLatestInputs();
        }
    }
}
