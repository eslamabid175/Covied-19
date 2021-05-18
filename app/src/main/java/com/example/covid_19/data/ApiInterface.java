package com.example.covid_19.data;

import com.example.covid_19.pojo.Countries;
import com.example.covid_19.pojo.Model;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
@GET("summary")
    public Call<ArrayList<Countries>> getCountry();
}
