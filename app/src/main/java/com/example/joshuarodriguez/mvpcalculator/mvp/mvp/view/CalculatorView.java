package com.example.joshuarodriguez.mvpcalculator.mvp.mvp.view;

import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.widget.Button;
import android.widget.EditText;

import com.example.joshuarodriguez.mvpcalculator.R;
import com.example.joshuarodriguez.mvpcalculator.mvp.utils.Bus.BusEvents.CalculatorNumericButtonPressedEvent;
import com.example.joshuarodriguez.mvpcalculator.mvp.utils.Bus.BusEvents.CalculatorOperatorButtonPressedEvent;
import com.example.joshuarodriguez.mvpcalculator.mvp.utils.ViewUtil;
import com.squareup.otto.Bus;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CalculatorView extends ActivityView {

    private static final String TAG = CalculatorView.class.getSimpleName();

    private static final String EMPTY_TEXT = "";
    private static final String BAD_EXPRESSION = "Bad expression";
    private static final String NAN = "NaN";

    private final Bus eventBus;

    /**
     * Binding input field from calculator view
     */
    @BindView(R.id.edittext_input_field) EditText mEditTextInputField;

    /**
     * Binding numeric buttons from calculator view
     */
    @BindView(R.id.button_number_zero) Button mButtonZero;
    @BindView(R.id.button_number_one) Button mButtonOne;
    @BindView(R.id.button_number_two) Button mButtonTwo;
    @BindView(R.id.button_number_three) Button mButtonThree;
    @BindView(R.id.button_number_four) Button mButtonFour;
    @BindView(R.id.button_number_five) Button mButtonFive;
    @BindView(R.id.button_number_six) Button mButtonSix;
    @BindView(R.id.button_number_seven) Button mButtonSeven;
    @BindView(R.id.button_number_eight) Button mButtonEight;
    @BindView(R.id.button_number_nine) Button mButtonNine;
    @BindView(R.id.button_decimal) Button mButtonDecimal;

    /**
     * Binding operator buttons from calculator view
     */
    @BindView(R.id.button_addition) Button mButtonAddition;
    @BindView(R.id.button_multiply) Button mButtonMultiply;
    @BindView(R.id.button_divide) Button mButtonDivide;
    @BindView(R.id.button_subtract) Button mButtonSubtract;
    @BindView(R.id.button_delete) Button mButtonDelete;
    @BindView(R.id.button_equals) Button mButtonEquals;
    @BindView(R.id.button_clear) Button mButtonClear;

    public CalculatorView(AppCompatActivity activity, Bus eventBus) {
        super(activity);
        this.eventBus = eventBus;
        ButterKnife.bind(this, activity);
        hideKeyboard();
    }

    @OnClick(R.id.button_number_zero)
    public void numericButtonZeroPressed() {
        eventBus.post(new CalculatorNumericButtonPressedEvent(
                ViewUtil.getStringResourceValue(getActivity(), R.string.calculator_button_value_zero)
        ));
    }

    @OnClick(R.id.button_number_one)
    public void numericButtonOnePressed() {
        eventBus.post(new CalculatorNumericButtonPressedEvent(
                ViewUtil.getStringResourceValue(getActivity(), R.string.calculator_button_value_one)
        ));
    }

    @OnClick(R.id.button_number_two)
    public void numericButtonTwoPressed() {
        eventBus.post(new CalculatorNumericButtonPressedEvent(
                ViewUtil.getStringResourceValue(getActivity(), R.string.calculator_button_value_two)
        ));
    }

    @OnClick(R.id.button_number_three)
    public void numericButtonThreePressed() {
        eventBus.post(new CalculatorNumericButtonPressedEvent(
                ViewUtil.getStringResourceValue(getActivity(), R.string.calculator_button_value_three)
        ));
    }

    @OnClick(R.id.button_number_four)
    public void numericButtonFourPressed() {
        eventBus.post(new CalculatorNumericButtonPressedEvent(
                ViewUtil.getStringResourceValue(getActivity(), R.string.calculator_button_value_four)
        ));
    }

    @OnClick(R.id.button_number_five)
    public void numericButtonFivePressed() {
        eventBus.post(new CalculatorNumericButtonPressedEvent(
                ViewUtil.getStringResourceValue(getActivity(), R.string.calculator_button_value_five)
        ));
    }

    @OnClick(R.id.button_number_six)
    public void numericButtonSixPressed() {
        eventBus.post(new CalculatorNumericButtonPressedEvent(
                ViewUtil.getStringResourceValue(getActivity(), R.string.calculator_button_value_six)
        ));
    }

    @OnClick(R.id.button_number_seven)
    public void numericButtonSevenPressed() {
        eventBus.post(new CalculatorNumericButtonPressedEvent(
                ViewUtil.getStringResourceValue(getActivity(), R.string.calculator_button_value_seven)
        ));
    }

    @OnClick(R.id.button_number_eight)
    public void numericButtonEightPressed() {
        eventBus.post(new CalculatorNumericButtonPressedEvent(
                ViewUtil.getStringResourceValue(getActivity(), R.string.calculator_button_value_eight)
        ));
    }

    @OnClick(R.id.button_number_nine)
    public void numericButtonNinePressed() {
        eventBus.post(new CalculatorNumericButtonPressedEvent(
                ViewUtil.getStringResourceValue(getActivity(), R.string.calculator_button_value_nine)
        ));
    }

    @OnClick(R.id.button_decimal)
    public void numericButtonDecimalPressed() {
        eventBus.post(new CalculatorNumericButtonPressedEvent(
                ViewUtil.getStringResourceValue(getActivity(), R.string.calculator_button_decimal)
        ));
    }

    @OnClick(R.id.button_addition)
    public void operatorButtonAdditionPressed() {
        eventBus.post(new CalculatorOperatorButtonPressedEvent(
                ViewUtil.getStringResourceValue(getActivity(), R.string.calculator_button_operator_add)
        ));
    }

    @OnClick(R.id.button_subtract)
    public void operatorButtonSubtractionPressed() {
        eventBus.post(new CalculatorOperatorButtonPressedEvent(
                ViewUtil.getStringResourceValue(getActivity(), R.string.calculator_button_operator_subtract)
        ));
    }

    @OnClick(R.id.button_divide)
    public void operatorButtonDivisionPressed() {
        eventBus.post(new CalculatorOperatorButtonPressedEvent(
                ViewUtil.getStringResourceValue(getActivity(), R.string.calculator_button_operator_divide)
        ));
    }

    @OnClick(R.id.button_multiply)
    public void operatorButtonMultiplicationPressed() {
        eventBus.post(new CalculatorOperatorButtonPressedEvent(
                ViewUtil.getStringResourceValue(getActivity(), R.string.calculator_button_operator_multiply)
        ));
    }

    @OnClick(R.id.button_delete)
    public void operatorButtonDeletePressed() {
        eventBus.post(new CalculatorOperatorButtonPressedEvent(
                ViewUtil.getStringResourceValue(getActivity(), R.string.calculator_button_operator_delete)
        ));
    }

    @OnClick(R.id.button_clear)
    public void operatorButtonClearPressed() {
        eventBus.post(new CalculatorOperatorButtonPressedEvent(
                ViewUtil.getStringResourceValue(getActivity(), R.string.calculator_button_operator_clear)
        ));
    }

    @OnClick(R.id.button_equals)
    public void operatorButtonEqualsPressed() {
        eventBus.post(new CalculatorOperatorButtonPressedEvent(
                ViewUtil.getStringResourceValue(getActivity(), R.string.calculator_button_operator_equals)
        ));
    }

    public void appendButtonValueToInputField(String buttonValue) {
        StringBuilder stringBuilder = new StringBuilder(mEditTextInputField.getText()).append(buttonValue);
        mEditTextInputField.setText(stringBuilder.toString());
    }

    public void backSpaceCalculatorInputField() {
        CharSequence currentInput = mEditTextInputField.getText();
        if (currentInput.length() > 0) {
            CharSequence newInput = currentInput.subSequence(0, currentInput.length() - 1);
            mEditTextInputField.setText(newInput);
        }
    }

    public void clearAndRevertFieldViewIfThereWasABadExpression() {
        String inputFieldValue = mEditTextInputField.getText().toString();

        if (inputFieldValue.equals(BAD_EXPRESSION)) {
            mEditTextInputField.setText(EMPTY_TEXT);
            mEditTextInputField.setTextColor(
                    ViewUtil.getColorResourceValue(getActivity(), R.color.colorInputFieldNormal)
            );
        }
    }

    public void setResult(String result) {
        if (!result.equals(NAN)) {
            mEditTextInputField.setText(result);
            mEditTextInputField.setSelection(0);
        } else {
            mEditTextInputField.setText(BAD_EXPRESSION);
            mEditTextInputField.setTextColor(
                    ViewUtil.getColorResourceValue(getActivity(), R.color.colorInputFieldError)
            );
        }
    }

    public void alwaysShowLatestInputs() {
        mEditTextInputField.setSelection(mEditTextInputField.length());
    }

    public String getCalculatorInputFieldValue() {
        return mEditTextInputField.getText().toString();
    }

    public void clearCalculatorInputField() {
        mEditTextInputField.setText(EMPTY_TEXT);
    }

    private void hideKeyboard() {
        mEditTextInputField.setInputType(InputType.TYPE_NULL);
    }
}
