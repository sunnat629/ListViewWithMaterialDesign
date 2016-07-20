package com.dreamogrammers.sunnat.listviewwithmaterialdesign.listview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.dreamogrammers.sunnat.listviewwithmaterialdesign.R;

/**
 * Created by sunnat629 on 7/20/16.
 */

public class CustomListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] itemName;
    private final Integer[] imgageID;

    public CustomListAdapter(Activity context, String[] itemName, Integer[] imgageID) {
        super(context, R.layout.customlist, itemName);
        // TODO Auto-generated constructor stub

        this.context = context;
        this.itemName = itemName;
        this.imgageID = imgageID;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.customlist, null, true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.item);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        TextView extratxt = (TextView) rowView.findViewById(R.id.textView1);

        txtTitle.setText(itemName[position]);
        imageView.setImageResource(imgageID[position]);
        extratxt.setText("This is " + itemName[position]);
        return rowView;
    }
}