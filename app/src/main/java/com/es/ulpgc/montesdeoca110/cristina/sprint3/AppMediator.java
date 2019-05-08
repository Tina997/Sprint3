package com.es.ulpgc.montesdeoca110.cristina.sprint3;

import android.app.Application;

import com.es.ulpgc.montesdeoca110.cristina.sprint3.activity1.Activity1State;

public class AppMediator extends Application {
    private Activity1State activity1State = new Activity1State();

    public void setActivity1State(Activity1State state) {
        this.activity1State = state;
    }

    public Activity1State getActivity1State() {
        return activity1State;
    }
}
