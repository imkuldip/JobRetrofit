package com.example.kuldip.jobportal.model;

import android.util.Log;
import android.widget.ArrayAdapter;

import com.example.kuldip.jobportal.DataManager.ApiClient;
import com.example.kuldip.jobportal.DataManager.ApiInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Kuldip on 5/12/2018.
 */

public  class ReturnList {

    /*ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
    String[] jobtype;

    public List<ListofJobTypes> JobTypes() {

        Call<List<ListofJobTypes>> c = apiService.getJobTypeList();

        c.enqueue(new Callback<List<ListofJobTypes>>() {
            @Override
            public void onResponse(Call<List<ListofJobTypes>> call, Response<List<ListofJobTypes>> response) {
                List<ListofJobTypes> s = response.body();
                 jobtype = new String[s.size()];
                for (int i = 0; i < s.size(); i++) {
                    jobtype[i] = s.get(i).getJob_type();
                }
            }
           @Override
            public void onFailure(Call<List<ListofJobTypes>> call, Throwable t) {
                Log.d("error", "onFailure: " + t.getCause());
            }
        });
        return jobtype;
    }*/
}
