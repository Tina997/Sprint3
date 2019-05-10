package com.es.ulpgc.montesdeoca110.cristina.sprint3.activity1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.es.ulpgc.montesdeoca110.cristina.sprint3.CounterItem;
import com.es.ulpgc.montesdeoca110.cristina.sprint3.R;

import java.util.List;

public class Activity1Adapter extends ArrayAdapter<CounterItem> {
    private List<CounterItem> itemList;
    private final View.OnClickListener clickListener;

    public Activity1Adapter(Context context, List<CounterItem> itemList, View.OnClickListener clickListener) {
        super(context,0,itemList);
        this.itemList = itemList;
        this.clickListener = clickListener;
    }
    @Override
    public int getCount() {
        return itemList.size();
    }

    @Override
    public CounterItem getItem(int position) {
        return itemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return getItem(position).id;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView = convertView;

        if (itemView == null) {
            itemView = LayoutInflater
                    .from(parent.getContext())
                    .inflate(R.layout.counter_list_content, parent, false);
        }

        itemView.setTag(itemList.get(position));
        itemView.setOnClickListener(clickListener);

        final TextView contentView = itemView.findViewById(R.id.content);
        contentView.setText(itemList.get(position).cuentaS);

        return itemView;
    }
}
