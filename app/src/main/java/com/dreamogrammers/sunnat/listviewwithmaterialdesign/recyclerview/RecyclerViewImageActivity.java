package com.dreamogrammers.sunnat.listviewwithmaterialdesign.recyclerview;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.dreamogrammers.sunnat.listviewwithmaterialdesign.MotherClass;
import com.dreamogrammers.sunnat.listviewwithmaterialdesign.R;

/**
 * Created by sunnat629 on 7/20/16.
 */

public class RecyclerViewImageActivity extends MotherClass {
    private LinearLayoutManager lLayout;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        lLayout = new LinearLayoutManager(this);

        RecyclerView rView = (RecyclerView) findViewById(R.id.recycler_view);
        rView.setLayoutManager(lLayout);

        RecyclerViewAdapter rcAdapter = new RecyclerViewAdapter(this, itemName, imgageID);
        rView.setAdapter(rcAdapter);

    }
}
