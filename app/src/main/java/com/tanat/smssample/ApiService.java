package com.tanat.smssample;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface ApiService {

    @GET("add.php")
    Call<CodeResponse> postCode(@QueryMap Map<String, String> params);
}
