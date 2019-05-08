package com.es.ulpgc.montesdeoca110.cristina.sprint3.activity1;

import android.util.Log;

import java.lang.ref.WeakReference;

import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.FragmentActivity;

public class Activity1Model implements Activity1Contract.Model {

    public static String TAG = Activity1Model.class.getSimpleName();

    public Activity1Model() {

    }

    @Override
    public String fetchData() {
        // Log.e(TAG, "fetchData()");
        return "Hello";
    }
}
