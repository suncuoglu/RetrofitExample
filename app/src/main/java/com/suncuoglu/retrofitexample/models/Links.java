package com.suncuoglu.retrofitexample.models;

import com.google.gson.annotations.SerializedName;

public class Links {

    @SerializedName("mission_patch")
    private String mission_patch;

    @SerializedName("mission_patch_small")
    private String mission_patch_small;

    @SerializedName("article_link")
    private String article_link;

    @SerializedName("wikipedia")
    private String wikipedia;

    public String getMission_patch() {
        return mission_patch;
    }

    public void setMission_patch(String mission_patch) {
        this.mission_patch = mission_patch;
    }

    public String getMission_patch_small() {
        return mission_patch_small;
    }

    public void setMission_patch_small(String mission_patch_small) {
        this.mission_patch_small = mission_patch_small;
    }

    public String getArticle_link() {
        return article_link;
    }

    public void setArticle_link(String article_link) {
        this.article_link = article_link;
    }

    public String getWikipedia() {
        return wikipedia;
    }

    public void setWikipedia(String wikipedia) {
        this.wikipedia = wikipedia;
    }
}
