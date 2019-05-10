package com.es.ulpgc.montesdeoca110.cristina.sprint3.activity1;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.es.ulpgc.montesdeoca110.cristina.sprint3.CounterItem;
import com.es.ulpgc.montesdeoca110.cristina.sprint3.R;

public class Activity1Activity
        extends AppCompatActivity implements Activity1Contract.View {

    public static String TAG = Activity1Activity.class.getSimpleName();

    private Activity1Contract.Presenter presenter;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity1);
  //      Toolbar toolbar = findViewById(R.id.toolbarC);
//        setSupportActionBar(toolbar);

   /*     ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.setTitle("Maestro");
        }
*/
        listView = findViewById(R.id.counters_list);
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
        listView.setAdapter(new Activity1Adapter(this,viewModel.counterItems,new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                CounterItem item = (CounterItem) v.getTag();
            }
        }));
        // deal with the data
    }

    public void goToAddCounter(View view) {presenter.AddCounter();
    }
}
