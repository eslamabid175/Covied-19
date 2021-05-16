package com.example.covid_19.ui;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.covid_19.pojo.Countries;

import java.util.ArrayList;

public class DbtoArray extends ViewModel {

     public MutableLiveData<ArrayList<Countries>>articllivedata=new MutableLiveData<>();

     public void getArticl(){
articllivedata.setValue(getArticleFromDb());
     }

     private ArrayList<Countries>getArticleFromDb(){
ArrayList<Countries>arrayList=new ArrayList<>();

return arrayList;

     }
}
