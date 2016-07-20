package com.dreamogrammers.sunnat.listviewwithmaterialdesign.listview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.dreamogrammers.sunnat.listviewwithmaterialdesign.MotherClass;
import com.dreamogrammers.sunnat.listviewwithmaterialdesign.R;

/**
 * Created by sunnat629 on 7/20/16.
 */

public class CustomListViewActivity extends MotherClass {

    ListView list;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list);

        CustomListAdapter adapter = new CustomListAdapter(this, itemName, imgageID);
        list = (ListView) findViewById(R.id.CList);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                String Slecteditem = itemName[+position];
                Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();

            }
        });
    }
}
