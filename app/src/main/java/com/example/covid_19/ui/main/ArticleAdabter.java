package com.example.covid_19.ui.main;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.covid_19.R;
import com.example.covid_19.pojo.Countries;
import com.example.covid_19.pojo.Model;

import java.util.ArrayList;

public class ArticleAdabter extends RecyclerView.Adapter<ArticleAdabter.AdapterViewHolder> {
    private ArrayList<Countries> articlsList=new ArrayList<>();
    @NonNull
    @Override
    public AdapterViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        return new AdapterViewHolder(LayoutInflater.from(parent.getContext()).
                inflate(R.layout.article_list_item,parent,false));

    }

    @Override
    public void onBindViewHolder(@NonNull ArticleAdabter.AdapterViewHolder holder, int position) {
holder.nc.setText(articlsList.get(position).getNewConfirmed()+"");
holder.tc.setText(articlsList.get(position).getTotalConfirmed()+"");
holder.c.setText(articlsList.get(position).getCountry());
holder.nd.setText(articlsList.get(position).getNewDeaths()+"");
holder.td.setText(articlsList.get(position).getTotalDeaths()+"");
holder.d.setText(articlsList.get(position).getDate());
holder.nr.setText(articlsList.get(position).getNewRecovered()+"");
holder.tr.setText(articlsList.get(position).getTotalRecovered()+"");
    }

    @Override
    public int getItemCount() {
        return articlsList.size();
    }
public void setArticlsList(ArrayList<Countries>articlsList){

        this.articlsList=articlsList;
        notifyDataSetChanged();
}
    public class AdapterViewHolder extends RecyclerView.ViewHolder {

        TextView nc,tc,c,nd,td,d,nr,tr;

        public AdapterViewHolder(@NonNull View itemView) {
            super(itemView);
nc=itemView.findViewById(R.id.new_confirmed);
tc=itemView.findViewById(R.id.total_confirmed);
c=itemView.findViewById(R.id.country);
nd=itemView.findViewById(R.id.new_deaths);
td=itemView.findViewById(R.id.total_deaths);
d=itemView.findViewById(R.id.date);
nr=itemView.findViewById(R.id.new_recovered);
tr=itemView.findViewById(R.id.total_recovered);


        }
    }
}
