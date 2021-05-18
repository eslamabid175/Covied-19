package com.example.covid_19.ui.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;

import com.example.covid_19.R;
import com.example.covid_19.pojo.Countries;
import com.example.covid_19.pojo.Model;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
ArticlViewModel articlViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        articlViewModel= ViewModelProviders.of(this).get(ArticlViewModel.class);
articlViewModel.getCountry();

recyclerView=findViewById(R.id.recyxler_view);
ArticleAdabter adabter=new ArticleAdabter();

articlViewModel.CountryLiveData.observe(this, new Observer<ArrayList<Countries>>() {
    @Override
    public void onChanged(ArrayList<Countries> countries) {
        adabter.setArticlsList(countries);
    }
});
recyclerView.setLayoutManager(new LinearLayoutManager(this));
recyclerView.setAdapter(adabter);



    }
}


//
//new Observer<List<Model>>() {
//@Override
//public void onChanged(List<Model> countriesList) {
//
//        adabter.setArticlsList((ArrayList<Model>) countriesList);
//        }
//        });