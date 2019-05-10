package com.es.ulpgc.montesdeoca110.cristina.sprint3.activity2;

import android.util.Log;

import java.lang.ref.WeakReference;

public class CounterDetailPresenter implements CounterDetailContract.Presenter {

    public static String TAG = CounterDetailPresenter.class.getSimpleName();

    private WeakReference<CounterDetailContract.View> view;
    private CounterDetailViewModel viewModel;
    private CounterDetailContract.Model model;
    private CounterDetailContract.Router router;

    public CounterDetailPresenter(CounterDetailState state) {
        viewModel = state;
    }

    @Override
    public void injectView(WeakReference<CounterDetailContract.View> view) {
        this.view = view;
    }

    @Override
    public void injectModel(CounterDetailContract.Model model) {
        this.model = model;
    }

    @Override
    public void injectRouter(CounterDetailContract.Router router) {
        this.router = router;
    }

    @Override
    public void fetchData() {
        // Log.e(TAG, "fetchData()");

        // set passed state
        CounterDetailState state = router.getDataFromPreviousScreen();
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
