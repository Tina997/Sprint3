package com.es.ulpgc.montesdeoca110.cristina.sprint3.activity2;

import android.util.Log;
import android.content.Intent;
import android.content.Context;

import com.es.ulpgc.montesdeoca110.cristina.sprint3.AppMediator;
import com.es.ulpgc.montesdeoca110.cristina.sprint3.CounterItem;

public class CounterDetailRouter implements CounterDetailContract.Router {

    public static String TAG = CounterDetailRouter.class.getSimpleName();

    private AppMediator mediator;

    public CounterDetailRouter(AppMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void navigateToNextScreen() {
        Context context = mediator.getApplicationContext();
        Intent intent = new Intent(context, CounterDetailActivity.class);
        context.startActivity(intent);
    }

    @Override
    public void passDataToNextScreen(CounterDetailState state) {
        mediator.setCounterDetailState(state);
    }

    @Override
    public CounterItem getDataFromPreviousScreen() {
        CounterItem counterItem = mediator.getCounterItem();
        return counterItem;
    }
}
