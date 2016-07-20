package com.dreamogrammers.sunnat.listviewwithmaterialdesign;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.dreamogrammers.sunnat.listviewwithmaterialdesign.listview.CustomListViewActivity;
import com.dreamogrammers.sunnat.listviewwithmaterialdesign.listview.SimpleListViewActivity;
import com.dreamogrammers.sunnat.listviewwithmaterialdesign.recyclerview.RecyclerViewActivity;
import com.dreamogrammers.sunnat.listviewwithmaterialdesign.recyclerview.RecyclerViewImageActivity;

/**
 * Created by sunnat629 on 7/20/16.
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button buttonGoToRecyclerView, buttonGoToSimpleListView,
            buttonGoToCustomListView, buttonGoToRecyclerViewImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        buttonGoToRecyclerView = (Button) findViewById(R.id.buttonGoToRecyclerView);
        buttonGoToSimpleListView = (Button) findViewById(R.id.buttonGoToSimpleListView);
        buttonGoToCustomListView = (Button) findViewById(R.id.buttonGoToCustomListView);
        buttonGoToRecyclerViewImage = (Button) findViewById(R.id.buttonGoToRecyclerViewImage);

        buttonGoToRecyclerView.setOnClickListener(this);
        buttonGoToSimpleListView.setOnClickListener(this);
        buttonGoToCustomListView.setOnClickListener(this);
        buttonGoToRecyclerViewImage.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.buttonGoToRecyclerView:
                Intent goToRecyclerView = new Intent(this, RecyclerViewActivity.class);
                startActivity(goToRecyclerView);
                break;

            case R.id.buttonGoToRecyclerViewImage:
                Intent goToRecyclerViewImage = new Intent(this, RecyclerViewImageActivity.class);
                startActivity(goToRecyclerViewImage);
                break;

            case R.id.buttonGoToSimpleListView:
                Intent goToSimpleListView = new Intent(this, SimpleListViewActivity.class);
                startActivity(goToSimpleListView);
                break;

            case R.id.buttonGoToCustomListView:
                Intent goToCustomListView = new Intent(this, CustomListViewActivity.class);
                startActivity(goToCustomListView);
                break;


        }
    }
}
