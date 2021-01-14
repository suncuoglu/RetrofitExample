package com.suncuoglu.retrofitexample.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;
import com.suncuoglu.retrofitexample.R;
import com.suncuoglu.retrofitexample.adapters.MissionAdapter;
import com.suncuoglu.retrofitexample.models.Space;
import com.suncuoglu.retrofitexample.services.RetrofitClientInstance;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MissionActivity extends AppCompatActivity {

    MissionAdapter missionAdapter;
    List<Space> spaceList;
    RecyclerView mission_recylerview;

    LottieAnimationView space;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mission);

        setViews();

        try {
            getSpace();
        } catch (Exception e) {

        }

    }

    void setViews() {
        mission_recylerview = findViewById(R.id.mission_recylerview);
        space = findViewById(R.id.space);
    }

    public void getSpace() {
        try {
            Call<List<Space>> call = RetrofitClientInstance.getInstance().getApi().getSpace();

            call.enqueue(new Callback<List<Space>>() {
                @Override
                public void onResponse(Call<List<Space>> call, Response<List<Space>> response) {

                    spaceList = response.body();

                    try {

                        missionAdapter = new MissionAdapter(MissionActivity.this, spaceList);
                        mission_recylerview.setAdapter(missionAdapter);
                        mission_recylerview.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
                        space.setVisibility(View.GONE);


                    } catch (Exception e) {

                    }
                }

                @Override
                public void onFailure(Call<List<Space>> call, Throwable t) {

                }
            });
        } catch (Exception e) {

        }
    }
}