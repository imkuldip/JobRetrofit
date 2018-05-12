package com.example.kuldip.jobportal.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Kuldip on 5/12/2018.
 */

public class ListofJobOwnerhip {




    @SerializedName("ownership_name")
    private String job_ownership;

    public ListofJobOwnerhip(String job_ownership) {
        this.job_ownership = job_ownership;
    }

    public String getJob_ownership() {
        return job_ownership;
    }

    public void setJob_ownership(String job_ownership) {
        this.job_ownership = job_ownership;
    }
}
