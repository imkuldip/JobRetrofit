package com.example.kuldip.jobportal.DataManager;

import com.example.kuldip.jobportal.model.ListofJobEducation;
import com.example.kuldip.jobportal.model.ListofJobLocation;
import com.example.kuldip.jobportal.model.ListofJobOwnerhip;
import com.example.kuldip.jobportal.model.ListofJobTypes;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Kuldip on 5/11/2018.
 */

public interface ApiInterface {
    //@GET("abc.json")

    @GET("job_type_list.php")
    public Call<List<ListofJobTypes>> getJobTypeList();

    @GET("job_location_list.php")
    public Call<List<ListofJobLocation>> getJobLocationList();

    @GET("job_education_list.php")
    public Call<List<ListofJobEducation>> getJobEducationList();

    @GET("job_ownership_list.php")
    public Call<List<ListofJobOwnerhip>> getJobOwnershipList();
}
