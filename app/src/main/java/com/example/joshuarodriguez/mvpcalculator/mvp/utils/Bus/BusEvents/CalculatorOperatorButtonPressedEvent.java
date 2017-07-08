package com.example.joshuarodriguez.mvpcalculator.mvp.utils.Bus.BusEvents;

public class CalculatorOperatorButtonPressedEvent extends BaseCalculatorButtonPressedEvent {

    public CalculatorOperatorButtonPressedEvent() {}

    public CalculatorOperatorButtonPressedEvent(String buttonValue) {
        super(buttonValue);
    }
}
