package com.example.kuldip.jobportal.model;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Kuldip on 5/12/2018.
 */

public class ListofJobLocation {

    @SerializedName("city_name")
    private String job_location;

    public ListofJobLocation(String job_location) {
        this.job_location = job_location;
    }

    public String getJob_location() {
        return job_location;
    }

    public void setJob_location(String job_location) {
        this.job_location = job_location;
    }
    @Override
    public String toString() {
        return job_location;
    }
}
