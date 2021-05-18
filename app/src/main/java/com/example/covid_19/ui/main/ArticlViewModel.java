package com.example.covid_19.ui.main;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.covid_19.data.CountriesClientRetrofit;
import com.example.covid_19.pojo.Countries;
import com.example.covid_19.pojo.Model;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ArticlViewModel extends ViewModel {
    MutableLiveData<ArrayList<Countries>> CountryLiveData=new MutableLiveData<>();

    public void getCountry(){
        CountriesClientRetrofit.getInstance().getCountrys().enqueue(new Callback<ArrayList<Countries>>() {
            @Override
            public void onResponse(Call<ArrayList<Countries>> call, Response<ArrayList<Countries>> response) {
                CountryLiveData.setValue(response.body());
            }

            @Override
            public void onFailure(Call<ArrayList<Countries>> call, Throwable t) {

            }
        });




//                .enqueue(new Callback<ArrayList<Model>>() {
//            @Override
//            public void onResponse(Call<ArrayList<Model>> call, Response<ArrayList<Model>> response) {
//                CountryLiveData.setValue(response.body());
//            }
//
//            @Override
//            public void onFailure(Call<ArrayList<Model>> call, Throwable t) {
//
//            }
//        });
//                enqueue(new Callback<ArrayList<Model.Countries>>() {
//            @Override
//            public void onResponse(Call<ArrayList<Model.Countries>> call, Response<ArrayList<Model.Countries>> response) {
//
//                CountryLiveData.setValue(response.body());
//
//                                Log.e("TAG","OnResponce Code"+response.code());
//  ArrayList<Model.Countries>countriesArrayList=response.body();
//
//           for(Model.Countries countries1 : countriesArrayList){
//Log.e("TAG","OnResponnce"+countries1.getNewConfirmed());
//
//
//           }
//
//            }
//
//            @Override
//            public void onFailure(Call<ArrayList<Model.Countries>> call, Throwable t) {
//                Log.e("TAG","OnFail"+t.getMessage());
//            }
//        });
//
//                enqueue(new Callback<Model>() {
//
//            @Override
//            public void onResponse(Call<Model> call, Response<Model> response) {
//                CountryLiveData.setValue(response.body().getCountries());
//
//                Log.e("TAG","OnResponce Code"+response.code());
//  ArrayList<Model.Countries>countriesArrayList=response.body().getCountries();
//
//           for(Model.Countries countries1 : countriesArrayList){
//Log.e("TAG","OnResponnce"+countries1.getNewConfirmed());
//
//
//           }
//
//            }
//
//            @Override
//            public void onFailure(Call<Model> call, Throwable t) {
//Log.e("TAG","OnFail"+t.getMessage());
//            }
//        });



    }
}
