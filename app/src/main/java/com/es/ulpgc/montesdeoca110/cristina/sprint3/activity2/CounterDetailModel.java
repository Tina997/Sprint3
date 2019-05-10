package com.es.ulpgc.montesdeoca110.cristina.sprint3.activity2;

import android.util.Log;

import java.lang.ref.WeakReference;

import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.FragmentActivity;

public class CounterDetailModel implements CounterDetailContract.Model {

    public static String TAG = CounterDetailModel.class.getSimpleName();
    private String cuenta;
    public CounterDetailModel() {

    }

    @Override
    public String fetchData(String data) {
        // Log.e(TAG, "fetchData()");
        this.cuenta = data;
        return cuenta;
    }

    @Override
    public void updateContador(CounterDetailViewModel viewModel) {
        viewModel.contador++;
        this.cuenta = viewModel.contador +"";
        viewModel.data = cuenta;
    }
}
