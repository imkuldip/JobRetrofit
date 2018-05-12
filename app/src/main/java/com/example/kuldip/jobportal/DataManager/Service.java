package com.example.kuldip.jobportal.DataManager;

import android.util.Log;
import android.widget.ArrayAdapter;

import com.example.kuldip.jobportal.model.ListofJobLocation;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Service {

    ApiInterface apiService;
    public Service() {
        apiService = ApiClient.getClient().create(ApiInterface.class);
    }
    public interface GetJobCallback{
        void onSuccess(List<ListofJobLocation> listofJobLocations);
        void onError(String e);
    }

    public void getJobLocationList(final GetJobCallback callback){
        Call<List<ListofJobLocation>> l = apiService.getJobLocationList();
        l.enqueue(new Callback<List<ListofJobLocation>>(){
            @Override
            public void onResponse(Call<List<ListofJobLocation>> call, Response<List<ListofJobLocation>> response) {
                List<ListofJobLocation> s = response.body();
                if (s!=null && s.size() > 0){
                    callback.onSuccess(s);
                }else{
                    callback.onError("No data available");
                }
            }
            @Override
            public void onFailure(Call<List<ListofJobLocation>> call, Throwable t) {
                Log.d("dfdfd", "onFailure: " + t.getCause());
            }
        });
    }
}
