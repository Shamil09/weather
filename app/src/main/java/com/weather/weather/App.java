package com.weather.weather;

import android.annotation.SuppressLint;
import android.app.Application;
import android.support.annotation.ColorInt;

import es.dmoral.toasty.Toasty;

public class App extends Application{
    @SuppressLint("CheckResult")
    @Override
    public void onCreate() {
        super.onCreate();
        Toasty.Config.getInstance().setSuccessColor(getResources().getColor(R.color.yellow))
                .setTextSize(getResources().getColor(R.color.weatherColor)).apply();

    }
}
