package com.example.joshuarodriguez.mvpcalculator.mvp.utils.RxBus.Observers;

public abstract class NumericButtonPressedObserver extends BusObserver<NumericButtonPressedObserver.NumericButton.Number> {

    public NumericButtonPressedObserver() {
        super(NumericButton.Number.class);
    }

    public static class NumericButton {
        public enum Number {
            ZERO,
            ONE,
            TWO,
            THREE,
            FOUR,
            FIVE,
            SIX,
            SEVEN,
            EIGHT,
            NINE,
            DECIMAL
        }
    }
}
