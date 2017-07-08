package com.example.joshuarodriguez.mvpcalculator.mvp.utils.Bus.BusEvents;

public class CalculatorOperatorButtonPressedLongEvent extends CalculatorOperatorButtonPressedEvent {

    public CalculatorOperatorButtonPressedLongEvent() {}

    public CalculatorOperatorButtonPressedLongEvent(String buttonValue) {
        super(buttonValue);
    }
}
