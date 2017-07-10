package com.example.joshuarodriguez.mvpcalculator.mvp.utils.RxBus.Observers;

public abstract class OperatorButtonPressedObserver extends BusObserver<OperatorButtonPressedObserver.OperatorButton.Operator> {

    public OperatorButtonPressedObserver() {
        super(OperatorButton.Operator.class);
    }

    public static class OperatorButton {
        public enum Operator {
            ADDITION,
            SUBTRACTION,
            MULTIPLICATION,
            DIVISION,
            CLEAR,
            DELETE,
            EQUALS
        }
    }
}
