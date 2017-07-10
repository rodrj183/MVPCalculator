package com.example.joshuarodriguez.mvpcalculator.mvp.mvp.view;

import android.support.annotation.ColorRes;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.widget.EditText;

import com.example.joshuarodriguez.mvpcalculator.R;
import com.example.joshuarodriguez.mvpcalculator.mvp.utils.RxBus.Observers.NumericButtonPressedObserver;
import com.example.joshuarodriguez.mvpcalculator.mvp.utils.RxBus.Observers.OperatorButtonPressedObserver;
import com.example.joshuarodriguez.mvpcalculator.mvp.utils.RxBus.RxBus;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CalculatorView extends ActivityView {

    private static final String TAG = CalculatorView.class.getSimpleName();

    private static final String EMPTY_TEXT = "";
    private static final String BAD_EXPRESSION = "Bad expression";
    private static final String NAN = "NaN";

    /**
     * Binding input field from calculator view
     */
    @BindView(R.id.edittext_input_field) EditText editTextInputField;

    /**
     * Binding numeric buttons from calculator view
     */
    @BindView(R.id.button_number_zero) android.widget.Button buttonZero;
    @BindView(R.id.button_number_one) android.widget.Button buttonOne;
    @BindView(R.id.button_number_two) android.widget.Button buttonTwo;
    @BindView(R.id.button_number_three) android.widget.Button buttonThree;
    @BindView(R.id.button_number_four) android.widget.Button buttonFour;
    @BindView(R.id.button_number_five) android.widget.Button buttonFive;
    @BindView(R.id.button_number_six) android.widget.Button buttonSix;
    @BindView(R.id.button_number_seven) android.widget.Button buttonSeven;
    @BindView(R.id.button_number_eight) android.widget.Button buttonEight;
    @BindView(R.id.button_number_nine) android.widget.Button buttonNine;
    @BindView(R.id.button_decimal) android.widget.Button buttonDecimal;

    /**
     * Binding operator buttons from calculator view
     */
    @BindView(R.id.button_addition) android.widget.Button buttonAddition;
    @BindView(R.id.button_multiply) android.widget.Button buttonMultiply;
    @BindView(R.id.button_divide) android.widget.Button buttonDivide;
    @BindView(R.id.button_subtract) android.widget.Button buttonSubtract;
    @BindView(R.id.button_delete) android.widget.Button buttonDelete;
    @BindView(R.id.button_equals) android.widget.Button buttonEquals;
    @BindView(R.id.button_clear) android.widget.Button buttonClear;

    public CalculatorView(AppCompatActivity activity) {
        super(activity);
        ButterKnife.bind(this, activity);
    }

    @OnClick(R.id.button_number_zero)
    public void numericButtonZeroPressed() {
        RxBus.post(NumericButtonPressedObserver.NumericButton.Number.ZERO);
    }

    @OnClick(R.id.button_number_one)
    public void numericButtonOnePressed() {
        RxBus.post(NumericButtonPressedObserver.NumericButton.Number.ONE);
    }

    @OnClick(R.id.button_number_two)
    public void numericButtonTwoPressed() {
        RxBus.post(NumericButtonPressedObserver.NumericButton.Number.TWO);
    }

    @OnClick(R.id.button_number_three)
    public void numericButtonThreePressed() {
        RxBus.post(NumericButtonPressedObserver.NumericButton.Number.THREE);
    }

    @OnClick(R.id.button_number_four)
    public void numericButtonFourPressed() {
        RxBus.post(NumericButtonPressedObserver.NumericButton.Number.FOUR);
    }

    @OnClick(R.id.button_number_five)
    public void numericButtonFivePressed() {
        RxBus.post(NumericButtonPressedObserver.NumericButton.Number.FIVE);
    }

    @OnClick(R.id.button_number_six)
    public void numericButtonSixPressed() {
        RxBus.post(NumericButtonPressedObserver.NumericButton.Number.SIX);
    }

    @OnClick(R.id.button_number_seven)
    public void numericButtonSevenPressed() {
        RxBus.post(NumericButtonPressedObserver.NumericButton.Number.SEVEN);
    }

    @OnClick(R.id.button_number_eight)
    public void numericButtonEightPressed() {
        RxBus.post(NumericButtonPressedObserver.NumericButton.Number.EIGHT);
    }

    @OnClick(R.id.button_number_nine)
    public void numericButtonNinePressed() {
        RxBus.post(NumericButtonPressedObserver.NumericButton.Number.NINE);
    }

    @OnClick(R.id.button_decimal)
    public void numericButtonDecimalPressed() {
        RxBus.post(NumericButtonPressedObserver.NumericButton.Number.DECIMAL);
    }

    @OnClick(R.id.button_addition)
    public void operatorButtonAdditionPressed() {
        RxBus.post(OperatorButtonPressedObserver.OperatorButton.Operator.ADDITION);
    }

    @OnClick(R.id.button_subtract)
    public void operatorButtonSubtractionPressed() {
        RxBus.post(OperatorButtonPressedObserver.OperatorButton.Operator.SUBTRACTION);
    }

    @OnClick(R.id.button_divide)
    public void operatorButtonDivisionPressed() {
        RxBus.post(OperatorButtonPressedObserver.OperatorButton.Operator.DIVISION);
    }

    @OnClick(R.id.button_multiply)
    public void operatorButtonMultiplicationPressed() {
        RxBus.post(OperatorButtonPressedObserver.OperatorButton.Operator.MULTIPLICATION);
    }

    @OnClick(R.id.button_delete)
    public void operatorButtonDeletePressed() {
        RxBus.post(OperatorButtonPressedObserver.OperatorButton.Operator.DELETE);
    }

    @OnClick(R.id.button_clear)
    public void operatorButtonClearPressed() {
        RxBus.post(OperatorButtonPressedObserver.OperatorButton.Operator.CLEAR);
    }

    @OnClick(R.id.button_equals)
    public void operatorButtonEqualsPressed() {
        RxBus.post(OperatorButtonPressedObserver.OperatorButton.Operator.EQUALS);
    }

    public void appendButtonValueToInputField(String buttonValue) {
        StringBuilder stringBuilder = new StringBuilder(editTextInputField.getText()).append(buttonValue);
        editTextInputField.setText(stringBuilder.toString());
    }

    public void backSpaceCalculatorInputField() {
        CharSequence currentInput = editTextInputField.getText();
        if (currentInput.length() > 0) {
            CharSequence newInput = currentInput.subSequence(0, currentInput.length() - 1);
            editTextInputField.setText(newInput);
        }
    }

    public void clearAndRevertFieldViewIfThereWasABadExpression() {
        String inputFieldValue = editTextInputField.getText().toString();

        if (inputFieldValue.equals(BAD_EXPRESSION)) {
            editTextInputField.setText(EMPTY_TEXT);
            editTextInputField.setTextColor(
                    getColorResourceValue(R.color.colorInputFieldNormal)
            );
        }
    }

    public void setResult(String result) {
        if (!result.equals(NAN)) {
            editTextInputField.setText(result);
            editTextInputField.setSelection(0);
        } else {
            editTextInputField.setText(BAD_EXPRESSION);
            editTextInputField.setTextColor(
                    getColorResourceValue(R.color.colorInputFieldError)
            );
        }
    }

    public void alwaysShowLatestInputs() {
        editTextInputField.setSelection(editTextInputField.length());
    }

    public String getCalculatorInputFieldValue() {
        return editTextInputField.getText().toString();
    }

    public void clearCalculatorInputField() {
        editTextInputField.setText(EMPTY_TEXT);
    }

    public void hideKeyboard() {
        editTextInputField.setInputType(InputType.TYPE_NULL);
    }

    private int getColorResourceValue(@ColorRes int colorResourceId) {
        AppCompatActivity activity = getActivity();
        return (activity != null) ? ContextCompat.getColor(activity, colorResourceId) : 0;
    }
}
