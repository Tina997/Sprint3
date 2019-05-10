package com.es.ulpgc.montesdeoca110.cristina.sprint3.activity2;

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
    }

    interface Model {
        String fetchData();
    }

    interface Router {
        void navigateToNextScreen();

        void passDataToNextScreen(CounterDetailState state);

        CounterDetailState getDataFromPreviousScreen();
    }
}
