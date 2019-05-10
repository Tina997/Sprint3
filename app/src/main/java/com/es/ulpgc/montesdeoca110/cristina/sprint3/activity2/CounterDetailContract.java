package com.es.ulpgc.montesdeoca110.cristina.sprint3.activity2;

import com.es.ulpgc.montesdeoca110.cristina.sprint3.AllCountersState;
import com.es.ulpgc.montesdeoca110.cristina.sprint3.CounterItem;

import java.lang.ref.WeakReference;

interface CounterDetailContract {

    interface View {
        void injectPresenter(Presenter presenter);

        void displayData(CounterDetailViewModel viewModel);
    }

    interface Presenter {
        void injectView(WeakReference<View> view);

        void injectModel(Model model);

        void injectRouter(Router router);

        void fetchData();

        void plusContador();
    }

    interface Model {
        String fetchData(int data);
        void updateContador(CounterDetailViewModel viewModel);
    }

    interface Router {
        void navigateToNextScreen();

        void passDataToNextScreen(CounterDetailState state);

        CounterItem getDataFromPreviousScreen();

        void setContadorTotal();

        AllCountersState getAllCounterState();
    }
}
