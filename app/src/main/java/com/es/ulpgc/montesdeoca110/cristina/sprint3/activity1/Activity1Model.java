package com.es.ulpgc.montesdeoca110.cristina.sprint3.activity1;

import java.util.ArrayList;
import java.util.List;

import com.es.ulpgc.montesdeoca110.cristina.sprint3.CounterItem;

public class Activity1Model implements Activity1Contract.Model {

    public static String TAG = Activity1Model.class.getSimpleName();
    private final List<CounterItem> list = new ArrayList<>();

    public Activity1Model() {

    }

    @Override
    public List<CounterItem> fetchData() {
        // Log.e(TAG, "fetchData()");
        CounterItem counterItem = new CounterItem(0,"0","0");
        list.add(counterItem);
        return list;
    }

    @Override
    public void addCounter(String cuentaTotal) {
        CounterItem counterItem = new CounterItem(list.size(),"0","0");
        list.add(counterItem);
    }

}
