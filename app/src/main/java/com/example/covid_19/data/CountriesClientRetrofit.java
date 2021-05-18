package com.example.covid_19.data;

import com.example.covid_19.pojo.Countries;
import com.example.covid_19.pojo.Model;

import java.util.ArrayList;
import java.util.List;

import retrofit2.converter.gson.GsonConverterFactory;

import retrofit2.Call;
import retrofit2.Retrofit;
public class CountriesClientRetrofit {
    private static Retrofit retrofit;

    private static final String BASE_URL="https://api.covid19api.com/";
    private ApiInterface apiInterface;
    private static CountriesClientRetrofit instance;

    public CountriesClientRetrofit() {


            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

         apiInterface=retrofit.create(ApiInterface.class);

    }

    public static CountriesClientRetrofit getInstance() {
      if(null==instance){
instance=new CountriesClientRetrofit();

      }


        return instance;
    }
public Call<ArrayList<Countries>>getCountrys(){

        return apiInterface.getCountry();
}

}
