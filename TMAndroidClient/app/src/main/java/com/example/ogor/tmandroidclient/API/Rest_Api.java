package com.example.ogor.tmandroidclient.API;
import com.example.ogor.tmandroidclient.model.Rest_Model;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by OGOR on 2016-11-07.
 */

public interface Rest_Api {

        @GET("/users/{user}")
        //here is the other url part.best way is to start using /

        public void getFeed(@Path("user") String user, Callback<Rest_Model> response);
            //string user is for passing values from edittext for eg: user=basil2style,google
            //response is the response from the server which is now in the POJO
}
