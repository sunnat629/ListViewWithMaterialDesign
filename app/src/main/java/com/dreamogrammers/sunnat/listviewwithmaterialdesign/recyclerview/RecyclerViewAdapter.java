package com.dreamogrammers.sunnat.listviewwithmaterialdesign.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dreamogrammers.sunnat.listviewwithmaterialdesign.R;

/**
 * Created by sunnat629 on 7/20/16.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolders> {

    private String[] itemList;
    private Integer[] imgageID;
    private Context context;
    boolean imageGone = true;

    public RecyclerViewAdapter(Context context, String[] itemList) {
        this.itemList = itemList;
        this.context = context;
    }

    public RecyclerViewAdapter(Context context, String[] itemList, Integer[] imgageID) {
        this.itemList = itemList;
        this.context = context;
        this.imgageID = imgageID;
        imageGone = false;
    }

    @Override
    public RecyclerViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_list, null);
        RecyclerViewHolders rcv = new RecyclerViewHolders(layoutView, itemList);
        if (imageGone == false) {
            rcv = new RecyclerViewHolders(layoutView, itemList, imgageID);
        }
        return rcv;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolders holder, int position) {
        holder.cityName.setText(itemList[position]);

        if (imageGone == false) {
            holder.countryPhoto.setImageResource(imgageID[position]);
        }
    }

    @Override
    public int getItemCount() {
        return this.itemList.length;
    }
}