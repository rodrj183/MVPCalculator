package com.example.joshuarodriguez.mvpcalculator.mvp.mvp.presenter;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;

import com.example.joshuarodriguez.mvpcalculator.mvp.mvp.model.CalculatorModel;
import com.example.joshuarodriguez.mvpcalculator.mvp.mvp.view.CalculatorView;
import com.example.joshuarodriguez.mvpcalculator.mvp.utils.RxBus.CalculatorButtonsPressedObserverUtils;
import com.example.joshuarodriguez.mvpcalculator.mvp.utils.RxBus.Observers.NumericButtonPressedObserver;
import com.example.joshuarodriguez.mvpcalculator.mvp.utils.RxBus.Observers.OperatorButtonPressedObserver;
import com.example.joshuarodriguez.mvpcalculator.mvp.utils.RxBus.RxBus;

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
        init();
    }

    private void init() {
        final AppCompatActivity activity = calculatorView.getActivity();

        if (activity == null) {
            return;
        }

        setPortraitOrientation(activity);
        calculatorView.hideKeyboard();
    }

    public void register() {
        final AppCompatActivity activity = calculatorView.getActivity();

        if (activity == null) {
            return;
        }

        RxBus.subscribe(activity, new NumericButtonPressedObserver() {
            @Override
            public void onEvent(NumericButton.Number value) {
                String buttonValue = CalculatorButtonsPressedObserverUtils.determineNumericButtonValue(activity, value);
                calculatorNumericButtonPressed(buttonValue);
            }
        });

        RxBus.subscribe(activity, new OperatorButtonPressedObserver() {
            @Override
            public void onEvent(OperatorButton.Operator value) {
                String buttonValue = CalculatorButtonsPressedObserverUtils.determineOperatorButtonValue(activity, value);
                calculatorOperatorButtonPressed(buttonValue);
            }
        });
    }

    public void unregister() {
        final AppCompatActivity activity = calculatorView.getActivity();

        if (activity == null) {
            return;
        }

        RxBus.clear(activity);
    }

    public void calculatorNumericButtonPressed(String value) {
        calculatorView.clearAndRevertFieldViewIfThereWasABadExpression();
        calculatorView.appendButtonValueToInputField(value);
        calculatorView.alwaysShowLatestInputs();
    }

    public void calculatorOperatorButtonPressed(String value) {
        calculatorView.clearAndRevertFieldViewIfThereWasABadExpression();
        determineCalculatorAction(value);
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

    private void setPortraitOrientation(AppCompatActivity appCompatActivity) {
        appCompatActivity.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }
}
