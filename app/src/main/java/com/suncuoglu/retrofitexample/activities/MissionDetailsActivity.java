package com.suncuoglu.retrofitexample.activities;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.airbnb.lottie.LottieAnimationView;
import com.suncuoglu.retrofitexample.R;
import com.suncuoglu.retrofitexample.adapters.MissionAdapter;
import com.suncuoglu.retrofitexample.adapters.MissionDetailsAdapter;
import com.suncuoglu.retrofitexample.models.Payloads;

import java.util.ArrayList;
import java.util.List;

public class MissionDetailsActivity extends AppCompatActivity {

    private List<Payloads> payloads;
    String details_text;
    String rocket_name_text;
    List<String> customers=new ArrayList<>();

    TextView details;
    TextView rocket_name;

    RecyclerView mission_details_recylerview;
    MissionDetailsAdapter missionDetailsAdapter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_mission);

        setViews();

        try {
            Intent i = getIntent();
            payloads = (List<Payloads>) i.getSerializableExtra("payloads");

            Bundle bundle = getIntent().getExtras();
            if (bundle != null) {
                details_text = bundle.getString("details");
                rocket_name_text = bundle.getString("rocket_name");

                if (details_text==null){
                    details.setText("Detay bulunmuyor.");
                }else {
                    details.setText(details_text);
                }
                rocket_name.setText(rocket_name_text);
            }

            for (int j = 0; j < payloads.size(); j++) {
                customers.addAll(payloads.get(j).getCustomers());

                missionDetailsAdapter = new MissionDetailsAdapter(MissionDetailsActivity.this, customers);
                mission_details_recylerview.setAdapter(missionDetailsAdapter);
                mission_details_recylerview.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));

            }

        }catch (Exception e){

        }

    }

    void setViews(){
        details=findViewById(R.id.details);
        rocket_name=findViewById(R.id.rocket_name);
        mission_details_recylerview=findViewById(R.id.mission_details_recylerview);
    }
}
