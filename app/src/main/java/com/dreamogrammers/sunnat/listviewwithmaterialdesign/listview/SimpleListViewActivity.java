package com.dreamogrammers.sunnat.listviewwithmaterialdesign.listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.dreamogrammers.sunnat.listviewwithmaterialdesign.R;

import static com.dreamogrammers.sunnat.listviewwithmaterialdesign.R.array.cities;

/**
 * Created by sunnat629 on 7/20/16.
 */

public class SimpleListViewActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_list_view);

        final String[] citiesArr = getResources().getStringArray(cities);
        listView = (ListView) findViewById(R.id.list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, citiesArr);

        listView.setAdapter(adapter);

        // ListView Item Click Listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // ListView Clicked item index
                int itemPosition = position;

                // ListView Clicked item value
                String itemValue = (String) listView.getItemAtPosition(position);

                // Show Alert
                Toast.makeText(getApplicationContext(),
                        "Position: " + (itemPosition+1) + "  City: " + itemValue, Toast.LENGTH_LONG)
                        .show();
            }

        });
    }
}
