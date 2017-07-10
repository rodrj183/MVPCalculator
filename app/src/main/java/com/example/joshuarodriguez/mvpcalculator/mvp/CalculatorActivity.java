package com.example.joshuarodriguez.mvpcalculator.mvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.joshuarodriguez.mvpcalculator.R;
import com.example.joshuarodriguez.mvpcalculator.mvp.mvp.model.CalculatorModel;
import com.example.joshuarodriguez.mvpcalculator.mvp.mvp.presenter.CalculatorPresenter;
import com.example.joshuarodriguez.mvpcalculator.mvp.mvp.view.CalculatorView;

public class CalculatorActivity extends AppCompatActivity {

    private CalculatorPresenter calculatorPresenter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        calculatorPresenter = createCalculatorPresenter();
    }

    @Override
    public void onResume() {
        super.onResume();
        calculatorPresenter.register();
    }

    @Override
    public void onPause() {
        super.onPause();
        calculatorPresenter.unregister();
    }

    private CalculatorPresenter createCalculatorPresenter() {
        CalculatorModel calculatorModel = new CalculatorModel();
        CalculatorView calculatorView = new CalculatorView(this);
        return new CalculatorPresenter(calculatorModel, calculatorView);
    }
}
