package com.example.joshuarodriguez.mvpcalculator.mvp.utils.Bus;

import android.os.Handler;
import android.os.Looper;

import com.squareup.otto.Bus;

import static com.squareup.otto.ThreadEnforcer.ANY;

public class MainPostingBus extends Bus {

    private final Handler handler = new Handler(Looper.getMainLooper());

    public MainPostingBus() {
        super(ANY);
    }

    @Override
    public void post(final Object event) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            super.post(event);
            return;
        }

        handler.post(new Runnable() {
            @Override
            public void run() {
                MainPostingBus.super.post(event);
            }
        });
    }
}
