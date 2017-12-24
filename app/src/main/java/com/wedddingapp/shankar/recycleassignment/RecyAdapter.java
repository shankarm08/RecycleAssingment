package com.wedddingapp.shankar.recycleassignment;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by shan on 12/23/2017.
 */

public class RecyAdapter extends RecyclerView.Adapter<RecyAdapter.VersionViewHolder>
{


    public static class VersionViewHolder extends RecyclerView.ViewHolder
    {
        //creating references of CardView and textView.
        CardView cardView;
        TextView versionName;

        //constructor.
        VersionViewHolder(View itemView)
        {
            super(itemView);

            //Setting references with their IDs.
            cardView=(CardView)itemView.findViewById(R.id.card_view);
            versionName=(TextView)itemView.findViewById(R.id.name_tv);

        }
    }

    ArrayList<String> versionList;   //referencee of ArrayList.

    //constructor.
    public RecyAdapter(ArrayList<String> list)
    {
        versionList=list;
    }


    @Override
    //Method will return view for every item for list.
    public VersionViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        //inflating Layout.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout,parent,false);
        VersionViewHolder tempObj = new VersionViewHolder(view);   //Creating temporary object and fixing view.
        return tempObj;   //returning object.
    }

    @Override
    //Method to set the text to textView Of CardView.
    public void onBindViewHolder(VersionViewHolder holder, int position)
    {
        //Setting text to textView.
        holder.versionName.setText(versionList.get(position));
    }

    @Override
    //Method to find size of ArrayList.
    public int getItemCount() {
        return versionList.size();
    }
}




















