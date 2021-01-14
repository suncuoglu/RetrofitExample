package com.suncuoglu.retrofitexample.models;

import com.google.gson.annotations.SerializedName;

public class Rocket {

    @SerializedName("rocket_name")
    private String rocket_name;

    @SerializedName("rocket_type")
    private String rocket_type;

    @SerializedName("first_stage")
    private FirstStage firstStage;

    @SerializedName("second_stage")
    private SecondStage secondStage;

    @SerializedName("launch_success")
    private boolean launch_success;

    public String getRocket_name() {
        return rocket_name;
    }

    public void setRocket_name(String rocket_name) {
        this.rocket_name = rocket_name;
    }

    public String getRocket_type() {
        return rocket_type;
    }

    public void setRocket_type(String rocket_type) {
        this.rocket_type = rocket_type;
    }

    public FirstStage getFirstStage() {
        return firstStage;
    }

    public void setFirstStage(FirstStage firstStage) {
        this.firstStage = firstStage;
    }

    public SecondStage getSecondStage() {
        return secondStage;
    }

    public void setSecondStage(SecondStage secondStage) {
        this.secondStage = secondStage;
    }

    public boolean isLaunch_success() {
        return launch_success;
    }

    public void setLaunch_success(boolean launch_success) {
        this.launch_success = launch_success;
    }

}
