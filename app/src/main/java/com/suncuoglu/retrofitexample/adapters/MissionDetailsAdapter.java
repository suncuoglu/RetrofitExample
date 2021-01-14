package com.suncuoglu.retrofitexample.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.suncuoglu.retrofitexample.R;
import com.suncuoglu.retrofitexample.activities.MissionDetailsActivity;
import com.suncuoglu.retrofitexample.models.Links;
import com.suncuoglu.retrofitexample.models.Payloads;
import com.suncuoglu.retrofitexample.models.Rocket;
import com.suncuoglu.retrofitexample.models.Space;

import java.io.Serializable;
import java.util.List;

public class MissionDetailsAdapter extends RecyclerView.Adapter<MissionDetailsAdapter.MyViewHolder> {

    private Context context;
    private LayoutInflater inflater;
    private List<String> customers;

    public MissionDetailsAdapter(Context ctx, List<String> customers) {

        this.context = ctx;
        inflater = LayoutInflater.from(ctx);
        this.customers = customers;
    }

    @Override
    public MissionDetailsAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.activity_mission_details_bg, parent, false);
        MissionDetailsAdapter.MyViewHolder holder = new MissionDetailsAdapter.MyViewHolder(view);
        return holder;
    }

    @SuppressLint("ResourceType")
    @Override
    public void onBindViewHolder(@NonNull final MissionDetailsAdapter.MyViewHolder holder, int position) {

        String customer_text=customers.get(position);

        holder.customer_name.setText(customer_text);

    }

    @Override
    public int getItemCount() {
        return customers.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView customer_name;


        public MyViewHolder(View itemView) {
            super(itemView);

            customer_name = itemView.findViewById(R.id.customer_name);


        }
    }
}