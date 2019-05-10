package com.es.ulpgc.montesdeoca110.cristina.sprint3.activity1;

import android.content.Intent;
import android.content.Context;

import com.es.ulpgc.montesdeoca110.cristina.sprint3.AllCountersState;
import com.es.ulpgc.montesdeoca110.cristina.sprint3.AppMediator;

public class Activity1Router implements Activity1Contract.Router {

    public static String TAG = Activity1Router.class.getSimpleName();

    private AppMediator mediator;

    public Activity1Router(AppMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void navigateToNextScreen() {
        Context context = mediator.getApplicationContext();
        Intent intent = new Intent(context, Activity1Activity.class);
        context.startActivity(intent);
    }

    @Override
    public void passDataToNextScreen(Activity1State state) {
        mediator.setActivity1State(state);
    }

    @Override
    public Activity1State getDataFromPreviousScreen() {
        Activity1State state = mediator.getActivity1State();
        return state;
    }

    @Override
    public AllCountersState getCounterState() {
        return getCounterState();
    }
}
