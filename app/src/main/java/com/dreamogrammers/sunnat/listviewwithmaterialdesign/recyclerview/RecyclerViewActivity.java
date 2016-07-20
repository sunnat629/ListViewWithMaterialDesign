package com.dreamogrammers.sunnat.listviewwithmaterialdesign.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.dreamogrammers.sunnat.listviewwithmaterialdesign.R;

import static com.dreamogrammers.sunnat.listviewwithmaterialdesign.R.array.cities;

/**
 * Created by sunnat629 on 7/20/16.
 */

public class RecyclerViewActivity extends AppCompatActivity {
    private LinearLayoutManager lLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        final String[] citiesArr = getResources().getStringArray(cities);
        lLayout = new LinearLayoutManager(this);

        RecyclerView rView = (RecyclerView) findViewById(R.id.recycler_view);
        rView.setLayoutManager(lLayout);

        RecyclerViewAdapter rcAdapter = new RecyclerViewAdapter(this, citiesArr);
        rView.setAdapter(rcAdapter);

    }
}
