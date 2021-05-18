package com.example.covid_19.pojo;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Model  {
    private String ID;
private String Message;
private String Global;
 private ArrayList<Countries>Countries;

    public Model(String ID, String message, String global,
                 ArrayList<com.example.covid_19.pojo.Countries> countries) {
        this.ID = ID;
        Message = message;
        Global = global;
        Countries = countries;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public String getGlobal() {
        return Global;
    }

    public void setGlobal(String global) {
        Global = global;
    }

    public ArrayList<com.example.covid_19.pojo.Countries> getCountries() {
        return Countries;
    }

    public void setCountries(ArrayList<com.example.covid_19.pojo.Countries> countries) {
        Countries = countries;
    }
}