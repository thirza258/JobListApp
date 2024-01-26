package com.example.joblist.client;

import com.example.joblist.serialize.Response;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIInterface {
    @GET("/job")
    Call<Response> getJobs();

}
