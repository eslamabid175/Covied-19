package com.example.covid_19.ui.main;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.covid_19.data.CountriesClientRetrofit;
import com.example.covid_19.pojo.Countries;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ArticlViewModel extends ViewModel {
    MutableLiveData<List<Countries>>CountryLiveData=new MutableLiveData<>();

    public void getCountry(){

        CountriesClientRetrofit.getInstance().getCountrys().enqueue(new Callback<List<Countries>>() {
            @Override
            public void onResponse(Call<List<Countries>> call, Response<List<Countries>> response) {
                CountryLiveData.setValue(response.body());
                Log.d("tadffff","glpElpianat");
            }

            @Override
            public void onFailure(Call<List<Countries>> call, Throwable t) {

            }
        });

    }
}
