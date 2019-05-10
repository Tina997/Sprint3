package com.es.ulpgc.montesdeoca110.cristina.sprint3.activity2;

import java.lang.ref.WeakReference;

import android.support.v4.app.FragmentActivity;

import com.es.ulpgc.montesdeoca110.cristina.sprint3.AppMediator;

public class CounterDetailScreen {

    public static void configure(CounterDetailContract.View view) {

        WeakReference<FragmentActivity> context =
                new WeakReference<>((FragmentActivity) view);

        AppMediator mediator = (AppMediator) context.get().getApplication();
        CounterDetailState state = mediator.getCounterDetailState();

        CounterDetailContract.Router router = new CounterDetailRouter(mediator);
        CounterDetailContract.Presenter presenter = new CounterDetailPresenter(state);
        CounterDetailContract.Model model = new CounterDetailModel();
        presenter.injectModel(model);
        presenter.injectRouter(router);
        presenter.injectView(new WeakReference<>(view));

        view.injectPresenter(presenter);

    }
}
