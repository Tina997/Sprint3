package com.es.ulpgc.montesdeoca110.cristina.sprint3.activity1;

import java.lang.ref.WeakReference;

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
    }

    interface Model {
        String fetchData();
    }

    interface Router {
        void navigateToNextScreen();

        void passDataToNextScreen(Activity1State state);

        Activity1State getDataFromPreviousScreen();
    }
}
