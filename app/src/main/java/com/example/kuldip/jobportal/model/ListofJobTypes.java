package com.example.kuldip.jobportal.model;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Kuldip on 5/11/2018.
 */

public class ListofJobTypes {

//    @SerializedName("job_type")
//    private String type_of_job;

    private String job_type;
    //constructior
    public ListofJobTypes(String job_type)
    {
        this.job_type = job_type;
    }

    //getter and setter
    public String getJob_type() {
        return job_type;
    }

    public void setJob_type(String job_type)
    {
        this.job_type = job_type;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
