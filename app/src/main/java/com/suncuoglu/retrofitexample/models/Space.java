package com.suncuoglu.retrofitexample.models;

import com.google.gson.annotations.SerializedName;

public class Space {

    @SerializedName("mission_name")
    private String mission_name;

    @SerializedName("launch_year")
    private String launch_year;

    @SerializedName("rocket")
    private Rocket rocket;

    @SerializedName("links")
    private Links links;

    @SerializedName("details")
    private String details;

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getMission_name() {
        return mission_name;
    }

    public void setMission_name(String mission_name) {
        this.mission_name = mission_name;
    }

    public String getLaunch_year() {
        return launch_year;
    }

    public void setLaunch_year(String launch_year) {
        this.launch_year = launch_year;
    }

    public Rocket getRocket() {
        return rocket;
    }

    public void setRocket(Rocket rocket) {
        this.rocket = rocket;
    }
}
