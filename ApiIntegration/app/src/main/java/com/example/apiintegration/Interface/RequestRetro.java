package com.example.apiintegration.Interface;

import com.example.apiintegration.Retrofit.Models.ListUsers;
import com.example.apiintegration.Retrofit.Models.SingleUserData;
import com.example.apiintegration.Retrofit.Models.UserJob;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RequestRetro {
    @GET("/api/users/{id}")
    Call<SingleUserData> getSingleUserData(@Path("id") String id);

    @POST("/api/users")
    Call<UserJob> createUser(@Body UserJob userJob);

    //@Query = ?page=id
    @GET("/api/users")
    Call<ListUsers> getList(@Query("page") String id);
}
