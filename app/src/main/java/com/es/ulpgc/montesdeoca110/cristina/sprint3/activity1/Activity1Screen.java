package com.es.ulpgc.montesdeoca110.cristina.sprint3.activity1;

import java.lang.ref.WeakReference;

import android.support.v4.app.FragmentActivity;

import com.es.ulpgc.montesdeoca110.cristina.sprint3.AppMediator;

public class Activity1Screen {

    public static void configure(Activity1Contract.View view) {

        WeakReference<FragmentActivity> context =
                new WeakReference<>((FragmentActivity) view);

        AppMediator mediator = (AppMediator) context.get().getApplication();
        Activity1State state = mediator.getActivity1State();

        Activity1Contract.Router router = new Activity1Router(mediator);
        Activity1Contract.Presenter presenter = new Activity1Presenter(state);
        Activity1Contract.Model model = new Activity1Model();
        presenter.injectModel(model);
        presenter.injectRouter(router);
        presenter.injectView(new WeakReference<>(view));

        view.injectPresenter(presenter);

    }
}
