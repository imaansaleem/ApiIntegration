package com.example.apiintegration.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.apiintegration.Interface.RequestRetro;
import com.example.apiintegration.R;
import com.example.apiintegration.Retrofit.Models.ListUsers;
import com.example.apiintegration.Retrofit.Models.SingleUserData;
import com.example.apiintegration.Retrofit.Models.UserJob;
import com.example.apiintegration.Utils.RetroMain;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class RetrofitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit);

//        postCreateUserRequest("Imaan", "SE");
//        getSingleUserRequest("2");
        getListOfUsers("2");

    }

    public void getSingleUserRequest(String pageNumber){
        //Get Retrofit Instance
        Retrofit retrofit = RetroMain.getInstance();

        //interface assigning
        RequestRetro requestRetro = retrofit.create(RequestRetro.class);

        //call api using interface object
        requestRetro.getSingleUserData(pageNumber).enqueue(new Callback<SingleUserData>(){

            @Override
            public void onResponse(Call<SingleUserData> call, Response<SingleUserData> response) {
                Log.d("apicall", "heeeeeeeeeeeey");
                if(response.isSuccessful()) {
                    Log.d("apicall", "successful");
                    if(response.body() == null) {
                        Log.d("apicall", "body is null");
                    } else {
                        Log.d("apicall", "all clear");
                        Log.d("apicall", response.body().getData().getFirst_name());
                        Log.d("apicall", response.body().getData().getLast_name());
                        Log.d("apicall", response.body().getData().getEmail());
                        Log.d("apicall", response.body().getData().getAvatar());
                    }
                } else {
                    Log.d("apicall", "failed");
                }
            }


            @Override
            public void onFailure(Call<SingleUserData> call, Throwable t) {
                Log.d("apicall", "onFailure");
                String err = t.getMessage();
                assert err != null;
                Log.d("apicall", err);
            }
        });
    }


    public void postCreateUserRequest(String name, String job) {
        Retrofit retrofit = RetroMain.getInstance();

        RequestRetro requestRetro = retrofit.create(RequestRetro.class);
        UserJob userJob = new UserJob(name, job);

        requestRetro.createUser(userJob).enqueue(new Callback<UserJob>() {
            @Override
            public void onResponse(Call<UserJob> call, Response<UserJob> response) {

                Log.d("apicall-res", "onResponse");
                if(response.isSuccessful()) {
                    Log.d("apicall-res", "successful");
                    if(response.body() == null) {
                        Log.d("apicall-res", "body is null");
                    } else {
                        Log.d("apicall-res", "all clear");
                        Log.d("apicall-res", response.body().getId());
                        Log.d("apicall-res", response.body().getName());
                        Log.d("apicall-res", response.body().getJob());
                        Log.d("apicall-res", response.body().getCreatedAt());
                    }
                } else {
                    Log.d("apicall-res", "failed");
                }

            }

            @Override
            public void onFailure(Call<UserJob> call, Throwable t) {
                Log.d("apicall-res", "onFailure");
                String err = t.getMessage();
                assert err != null;
                Log.d("apicall-res", err);
            }
        });
    }

    public void getListOfUsers(String pageNumber)
    {
        //Get Retrofit Instance
        Retrofit retrofit = RetroMain.getInstance();

        //interface assigning
        RequestRetro requestRetro = retrofit.create(RequestRetro.class);
        requestRetro.getList(pageNumber).enqueue(new Callback<ListUsers>() {
            @Override
            public void onResponse(Call<ListUsers> call, Response<ListUsers> response) {
                Log.d("apicall", "heeeeeeeeeeeey");
                if(response.isSuccessful()) {
                    Log.d("apicall", "successful");
                    if(response.body() == null) {
                        Log.d("apicall", "body is null");
                    } else {
                        Log.d("apicall", "all clear");
                        for(int i = 0; i<response.body().getData().size(); i++){
                            Log.d("apicall", response.body().getData().get(i).getId().toString());
                            Log.d("apicall", response.body().getData().get(i).getLast_name());
                            Log.d("apicall", response.body().getData().get(i).getEmail());
                            Log.d("apicall", response.body().getData().get(i).getAvatar());
                        }
                    }
                } else {
                    Log.d("apicall", "failed");
                }
            }

            @Override
            public void onFailure(Call<ListUsers> call, Throwable t) {
                Log.d("apicall", "onFailure");
                String err = t.getMessage();
                assert err != null;
                Log.d("apicall", err);
            }
        });
    }
}