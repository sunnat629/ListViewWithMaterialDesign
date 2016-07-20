package com.dreamogrammers.sunnat.listviewwithmaterialdesign;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by sunnat629 on 7/21/16.
 */

public class MotherClass extends AppCompatActivity {

    public String[] itemName = {"Brave", "Safari", "Google Earth",
            "FireFox", "UC Browser", "Android", "VLC Player", "Chrome",
            "Safari", "Brave", "Google Earth", "FireFox", "UC Browser", "Android",
            "VLC Player", "Chrome"};
    ;
    public Integer[] imgageID = {R.drawable.pic2, R.drawable.pic1, R.drawable.pic3, R.drawable.pic4,
            R.drawable.pic5, R.drawable.pic6, R.drawable.pic7, R.drawable.pic8, R.drawable.pic1,
            R.drawable.pic2, R.drawable.pic3, R.drawable.pic4, R.drawable.pic5, R.drawable.pic6,
            R.drawable.pic7, R.drawable.pic8};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


}
