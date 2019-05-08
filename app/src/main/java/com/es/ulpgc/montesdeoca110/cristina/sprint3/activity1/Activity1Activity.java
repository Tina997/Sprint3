package com.es.ulpgc.montesdeoca110.cristina.sprint3.activity1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.es.ulpgc.montesdeoca110.cristina.sprint3.R;

public class Activity1Activity
        extends AppCompatActivity implements Activity1Contract.View {

    public static String TAG = Activity1Activity.class.getSimpleName();

    private Activity1Contract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity1);

        // do the setup
        Activity1Screen.configure(this);
    }

    @Override
    protected void onResume() {
        super.onResume();

        // do some work
        presenter.fetchData();
    }

    @Override
    public void injectPresenter(Activity1Contract.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void displayData(Activity1ViewModel viewModel) {
        //Log.e(TAG, "displayData()");

        // deal with the data
        ((TextView) findViewById(R.id.data)).setText(viewModel.data);
    }
}
