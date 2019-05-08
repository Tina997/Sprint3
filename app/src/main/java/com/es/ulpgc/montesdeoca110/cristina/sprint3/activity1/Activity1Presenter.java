package com.es.ulpgc.montesdeoca110.cristina.sprint3.activity1;

import android.util.Log;

import java.lang.ref.WeakReference;

public class Activity1Presenter implements Activity1Contract.Presenter {

    public static String TAG = Activity1Presenter.class.getSimpleName();

    private WeakReference<Activity1Contract.View> view;
    private Activity1ViewModel viewModel;
    private Activity1Contract.Model model;
    private Activity1Contract.Router router;

    public Activity1Presenter(Activity1State state) {
        viewModel = state;
    }

    @Override
    public void injectView(WeakReference<Activity1Contract.View> view) {
        this.view = view;
    }

    @Override
    public void injectModel(Activity1Contract.Model model) {
        this.model = model;
    }

    @Override
    public void injectRouter(Activity1Contract.Router router) {
        this.router = router;
    }

    @Override
    public void fetchData() {
        // Log.e(TAG, "fetchData()");

        // set passed state
        Activity1State state = router.getDataFromPreviousScreen();
        if (state != null) {
            viewModel.data = state.data;
        }

        if (viewModel.data == null) {
            // call the model
            String data = model.fetchData();

            // set initial state
            viewModel.data = data;
        }

        // update the view
        view.get().displayData(viewModel);

    }


}
