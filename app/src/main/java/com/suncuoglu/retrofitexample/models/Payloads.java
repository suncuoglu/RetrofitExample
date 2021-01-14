package com.suncuoglu.retrofitexample.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Payloads implements Serializable {

    @SerializedName("customers")
    private List<String> customers;

    public List<String> getCustomers() {
        return customers;
    }

    public void setCustomers(List<String> customers) {
        this.customers = customers;
    }
}
