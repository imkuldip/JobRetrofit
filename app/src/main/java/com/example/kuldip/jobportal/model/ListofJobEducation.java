package com.example.kuldip.jobportal.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Kuldip on 5/12/2018.
 */


public class ListofJobEducation {

    @SerializedName("education_name")
    private String job_education;

    public ListofJobEducation(String job_education) {
        this.job_education = job_education;
    }

    public String getJob_education() {
        return job_education;
    }

    public void setJob_education(String job_education) {
        this.job_education = job_education;
    }
}
