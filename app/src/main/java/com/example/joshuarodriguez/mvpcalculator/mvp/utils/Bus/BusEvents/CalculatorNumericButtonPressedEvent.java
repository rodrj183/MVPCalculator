package com.example.joshuarodriguez.mvpcalculator.mvp.utils.Bus.BusEvents;

public class CalculatorNumericButtonPressedEvent extends BaseCalculatorButtonPressedEvent {

    public CalculatorNumericButtonPressedEvent() {}

    public CalculatorNumericButtonPressedEvent(String buttonValue) {
        super(buttonValue);
    }
}
