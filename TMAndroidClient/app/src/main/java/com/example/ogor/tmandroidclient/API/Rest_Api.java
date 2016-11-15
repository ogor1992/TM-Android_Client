package com.example.ogor.tmandroidclient.API;

import com.example.ogor.tmandroidclient.model.Rest_Model;

import java.util.List;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.Call;


/**
 * Created by OGOR on 2016-11-07.
 */

public interface Rest_Api {

        @GET("/auth?name={name}&passw={passw}")
        Call<List<String>> loginAct(
                @Path("name") String name,
                @Path("passw") String passw);
        //here is the other url part.best way is to start using /

       // public void getFeed(@Path("user") String user, Callback<Rest_Model> response);
            //string user is for passing values from edittext for eg: user=basil2style,google
            //response is the response from the server which is now in the POJO

        public static final Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("212.191.92.101:5998")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
}
