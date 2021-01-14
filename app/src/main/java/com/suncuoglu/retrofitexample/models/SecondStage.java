package com.suncuoglu.retrofitexample.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SecondStage {

    @SerializedName("block")
    private int block;

    @SerializedName("payloads")
    private List<Payloads> payloadsList;

    public List<Payloads> getPayloadsList() {
        return payloadsList;
    }

    public void setPayloadsList(List<Payloads> payloadsList) {
        this.payloadsList = payloadsList;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }
}
