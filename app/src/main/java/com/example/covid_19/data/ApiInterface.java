package com.example.covid_19.data;

import com.example.covid_19.pojo.Countries;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
@GET("summary")
    public Call<List<Countries>> getCountry();
}
