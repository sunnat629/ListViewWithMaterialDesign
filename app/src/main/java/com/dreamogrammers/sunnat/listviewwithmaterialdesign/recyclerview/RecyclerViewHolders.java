package com.dreamogrammers.sunnat.listviewwithmaterialdesign.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.dreamogrammers.sunnat.listviewwithmaterialdesign.R;

/**
 * Created by sunnat629 on 7/20/16.
 */

public class RecyclerViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener {

    private String[] itemList;
    private Integer[] imgageID;
    public ImageView countryPhoto = (ImageView) itemView.findViewById(R.id.country_photo);
    public TextView cityName = (TextView) itemView.findViewById(R.id.city_name);;

    // This View Holder is for Text
    public RecyclerViewHolders(View itemView, String[] itemList) {
        super(itemView);

        this.itemList = itemList;
        itemView.setOnClickListener(this);
        cityName.setBackgroundResource(R.color.colorPrimary);
        countryPhoto.setVisibility(View.GONE);
    }

    // This View Holder is for Text and Image
    public RecyclerViewHolders(View itemView, String[] itemList, Integer[] imgageID) {
        super(itemView);
        this.itemList = itemList;
        this.imgageID = imgageID;
        itemView.setOnClickListener(this);
        countryPhoto.setVisibility(View.VISIBLE);
        cityName.setBackgroundResource(R.color.indigo);
    }


    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(), itemList[getAdapterPosition()], Toast.LENGTH_SHORT).show();
    }
}