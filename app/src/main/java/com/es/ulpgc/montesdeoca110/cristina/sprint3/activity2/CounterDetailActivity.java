package com.es.ulpgc.montesdeoca110.cristina.sprint3.activity2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.es.ulpgc.montesdeoca110.cristina.sprint3.R;

public class CounterDetailActivity
        extends AppCompatActivity implements CounterDetailContract.View {

    public static String TAG = CounterDetailActivity.class.getSimpleName();

    private CounterDetailContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter_detail);

        // do the setup
        CounterDetailScreen.configure(this);
    }

    @Override
    protected void onResume() {
        super.onResume();

        // do some work
        presenter.fetchData();
    }

    @Override
    public void injectPresenter(CounterDetailContract.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void displayData(CounterDetailViewModel viewModel) {
        //Log.e(TAG, "displayData()");

        // deal with the data
        ((TextView) findViewById(R.id.data)).setText(viewModel.data);
    }
}
