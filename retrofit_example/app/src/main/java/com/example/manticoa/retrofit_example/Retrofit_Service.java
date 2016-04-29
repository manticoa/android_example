package com.example.manticoa.retrofit_example;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.Call;

/**
 * Created by manticoa on 16. 2. 24..
 */
public interface Retrofit_Service {
    @GET("/users/{user}/repos")
    Call<List<Repo>> listRepos(@Path("user") String user);
}
