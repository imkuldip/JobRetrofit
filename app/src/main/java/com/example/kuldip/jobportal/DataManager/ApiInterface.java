package com.example.kuldip.jobportal.DataManager;

import com.example.kuldip.jobportal.model.ListofJobTypes;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Kuldip on 5/11/2018.
 */

public interface ApiInterface {
    //@GET("abc.json")

    @GET("job_type_list")
    public Call<List<ListofJobTypes>> getJobTypeList();
}
