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
import com.suncuoglu.retrofitexample.activities.MissionActivity;
import com.suncuoglu.retrofitexample.activities.MissionDetailsActivity;
import com.suncuoglu.retrofitexample.models.Links;
import com.suncuoglu.retrofitexample.models.Payloads;
import com.suncuoglu.retrofitexample.models.Rocket;
import com.suncuoglu.retrofitexample.models.SecondStage;
import com.suncuoglu.retrofitexample.models.Space;

import java.io.Serializable;
import java.util.List;

public class MissionAdapter extends RecyclerView.Adapter<MissionAdapter.MyViewHolder> {

    private Context context;
    private LayoutInflater inflater;
    private List<Space> spaceList;
    private List<Payloads> payloads;

    public MissionAdapter(Context ctx, List<Space> spaceList) {

        this.context = ctx;
        inflater = LayoutInflater.from(ctx);
        this.spaceList = spaceList;
    }

    @Override
    public MissionAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.activity_mission_bg, parent, false);
        MissionAdapter.MyViewHolder holder = new MissionAdapter.MyViewHolder(view);
        return holder;
    }

    @SuppressLint("ResourceType")
    @Override
    public void onBindViewHolder(@NonNull final MissionAdapter.MyViewHolder holder, int position) {
        Space space = spaceList.get(position);
        Rocket rocket = space.getRocket();
        Links links = space.getLinks();

        holder.mission_name.setText(space.getMission_name());
        holder.mission_year.setText(space.getLaunch_year());

        Glide.with(context)
                .load(links.getMission_patch_small())
                .into(holder.logo);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(context, MissionDetailsActivity.class)
                        .putExtra("details",space.getDetails())
                        .putExtra("rocket_name", rocket.getRocket_name())
                        .putExtra("payloads", (Serializable) space.getRocket().getSecondStage().getPayloadsList()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return spaceList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView mission_name;
        TextView mission_year;
        ImageView logo;

        public MyViewHolder(View itemView) {
            super(itemView);

            mission_name = itemView.findViewById(R.id.mission_name);
            mission_year = itemView.findViewById(R.id.mission_year);
            logo = itemView.findViewById(R.id.logo);

        }
    }
}