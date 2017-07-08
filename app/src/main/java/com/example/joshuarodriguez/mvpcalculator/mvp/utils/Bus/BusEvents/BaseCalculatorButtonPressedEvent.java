package com.example.joshuarodriguez.mvpcalculator.mvp.utils.Bus.BusEvents;

public class BaseCalculatorButtonPressedEvent {

    private String buttonValue;

    public BaseCalculatorButtonPressedEvent() {}

    public BaseCalculatorButtonPressedEvent(String buttonValue) {
        this.buttonValue = buttonValue;
    }

    public String getButtonValue() {
        return buttonValue;
    }

    public void setButtonValue(String buttonValue) {
        this.buttonValue = buttonValue;
    }
}
