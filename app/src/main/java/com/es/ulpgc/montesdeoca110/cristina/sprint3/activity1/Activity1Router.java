package com.es.ulpgc.montesdeoca110.cristina.sprint3.activity1;

import android.content.Intent;
import android.content.Context;

import com.es.ulpgc.montesdeoca110.cristina.sprint3.AllCountersState;
import com.es.ulpgc.montesdeoca110.cristina.sprint3.AppMediator;
import com.es.ulpgc.montesdeoca110.cristina.sprint3.CounterItem;
import com.es.ulpgc.montesdeoca110.cristina.sprint3.activity2.CounterDetailActivity;

public class Activity1Router implements Activity1Contract.Router {

    public static String TAG = Activity1Router.class.getSimpleName();

    private AppMediator mediator;

    public Activity1Router(AppMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void navigateToNextScreen() {
        Context context = mediator.getApplicationContext();
        Intent intent = new Intent(context, CounterDetailActivity.class);
        context.startActivity(intent);
    }

    @Override
    public void passDataToNextScreen(CounterItem item) {
        mediator.setCounterItem(item);
    }

    @Override
    public Activity1State getDataFromPreviousScreen() {
        Activity1State state = mediator.getActivity1State();
        return state;
    }

    @Override
    public AllCountersState getCounterState() {
        return mediator.getAllCountersState();
    }
}
