package com.suncuoglu.retrofitexample.services;

import com.suncuoglu.retrofitexample.models.Space;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RecyclerInterface {

    @GET("launches")
    Call<List<Space>> getSpace();


}

