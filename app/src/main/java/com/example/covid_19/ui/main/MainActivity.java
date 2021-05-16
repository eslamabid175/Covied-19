package com.example.covid_19.ui.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;

import com.example.covid_19.R;
import com.example.covid_19.pojo.Countries;

import java.util.ArrayList;
import java.util.List;

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
recyclerView.setLayoutManager(new LinearLayoutManager(this));
recyclerView.setAdapter(adabter);


articlViewModel.CountryLiveData.observe(this, new Observer<List<Countries>>() {
    @Override
    public void onChanged(List<Countries> countriesList) {

        adabter.setArticlsList((ArrayList<Countries>) countriesList);
    }
});











//
//
//        ArrayList<Countries> arrayList=new ArrayList<>();
//
//
//        recyclerView=findViewById(R.id.recyxler_view);
//
//        ArticleAdabter adabter=new ArticleAdabter();
//adabter.setArticlsList(arrayList);
//        recyclerView.setAdapter(adabter);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}