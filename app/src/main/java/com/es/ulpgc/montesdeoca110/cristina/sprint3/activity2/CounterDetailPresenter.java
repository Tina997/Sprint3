package com.es.ulpgc.montesdeoca110.cristina.sprint3.activity2;

import android.util.Log;

import com.es.ulpgc.montesdeoca110.cristina.sprint3.CounterItem;

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
        CounterItem counterItem = router.getDataFromPreviousScreen();
        if(counterItem != null){
            viewModel.data = counterItem.cuenta;
        }
        if(viewModel.data != null){
            String data = model.fetchData(viewModel.data);
            viewModel.data = data;
        }
        // update the view
        view.get().displayData(viewModel);

    }

    @Override
    public void plusContador() {
        model.updateContador(viewModel);
    }


}
