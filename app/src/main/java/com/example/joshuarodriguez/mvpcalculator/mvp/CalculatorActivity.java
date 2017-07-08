package com.example.joshuarodriguez.mvpcalculator.mvp;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.joshuarodriguez.mvpcalculator.R;
import com.example.joshuarodriguez.mvpcalculator.mvp.mvp.model.CalculatorModel;
import com.example.joshuarodriguez.mvpcalculator.mvp.mvp.presenter.CalculatorPresenter;
import com.example.joshuarodriguez.mvpcalculator.mvp.utils.Bus.BusProvider;
import com.example.joshuarodriguez.mvpcalculator.mvp.mvp.view.CalculatorView;

public class CalculatorActivity extends AppCompatActivity {

    private CalculatorPresenter calculatorPresenter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        setPortraitOrientation();
        calculatorPresenter = createCalculatorPresenter();
    }

    @Override
    public void onResume() {
        super.onResume();
        BusProvider.register(calculatorPresenter);
    }

    @Override
    public void onPause() {
        super.onPause();
        BusProvider.unregister(calculatorPresenter);
    }

    private CalculatorPresenter createCalculatorPresenter() {
        CalculatorModel calculatorModel = new CalculatorModel();
        CalculatorView calculatorView = new CalculatorView(this, BusProvider.getInstance());
        CalculatorPresenter calculatorPresenter = new CalculatorPresenter(calculatorModel, calculatorView);
        return calculatorPresenter;
    }

    private void setPortraitOrientation() {
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }
}
