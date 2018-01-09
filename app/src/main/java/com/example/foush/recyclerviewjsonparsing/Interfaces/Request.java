package com.example.foush.recyclerviewjsonparsing.Interfaces;

import com.example.foush.recyclerviewjsonparsing.Models.JSONResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by foush on 1/9/18.
 */

public interface Request {

    @GET("android/jsonandroid")
    public Call<JSONResponse> getJSON();

}
