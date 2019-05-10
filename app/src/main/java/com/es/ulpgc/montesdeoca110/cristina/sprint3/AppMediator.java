package com.es.ulpgc.montesdeoca110.cristina.sprint3;

import android.app.Application;

import com.es.ulpgc.montesdeoca110.cristina.sprint3.activity1.Activity1State;
import com.es.ulpgc.montesdeoca110.cristina.sprint3.activity2.CounterDetailState;

public class AppMediator extends Application {
    private Activity1State activity1State = new Activity1State();
    private AllCountersState allCountersState = new AllCountersState();
    private CounterDetailState counterDetailState = new CounterDetailState();
    private CounterItem counterItem;
    public void setActivity1State(Activity1State state) {
        this.activity1State = state;
    }

    public Activity1State getActivity1State() {
        return activity1State;
    }

    public void setAllCountersState(AllCountersState allCountersState) {
        this.allCountersState = allCountersState;
    }
    public AllCountersState getAllCountersState(){
        return allCountersState;
    }

    public void setCounterDetailState(CounterDetailState state) {
        this.counterDetailState = state;
    }

    public CounterDetailState getCounterDetailState() {
    return counterDetailState;
    }

    public void setCounterItem(CounterItem item) {
        counterItem = item;
    }

    public CounterItem getCounterItem() {
        return counterItem;
    }
}
