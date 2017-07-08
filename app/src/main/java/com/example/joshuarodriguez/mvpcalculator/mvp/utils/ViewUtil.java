package com.example.joshuarodriguez.mvpcalculator.mvp.utils;

import android.support.annotation.ColorRes;
import android.support.annotation.StringRes;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;

public class ViewUtil {
    public static String getStringResourceValue(AppCompatActivity activity, @StringRes int stringResourceId) {
        return activity.getResources().getString(stringResourceId);
    }

    public static int getColorResourceValue(AppCompatActivity activity, @ColorRes int colorResourceId) {
        return ContextCompat.getColor(activity, colorResourceId);
    }
}
