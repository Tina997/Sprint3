package com.es.ulpgc.montesdeoca110.cristina.sprint3.activity1;

import com.es.ulpgc.montesdeoca110.cristina.sprint3.AllCountersState;
import com.es.ulpgc.montesdeoca110.cristina.sprint3.CounterItem;

import java.lang.ref.WeakReference;
import java.util.List;

interface Activity1Contract {

    interface View {
        void injectPresenter(Presenter presenter);

        void displayData(Activity1ViewModel viewModel);
    }

    interface Presenter {
        void injectView(WeakReference<View> view);

        void injectModel(Model model);

        void injectRouter(Router router);

        void fetchData();

        void AddCounter();
    }

    interface Model {
        List<CounterItem> fetchData();
        void addCounter(String cuentaTotal);
    }

    interface Router {
        void navigateToNextScreen();

        void passDataToNextScreen(Activity1State state);

        Activity1State getDataFromPreviousScreen();

        AllCountersState getCounterState();
    }
}
