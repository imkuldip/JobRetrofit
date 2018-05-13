package com.example.kuldip.jobportal.DataManager;

import android.util.Log;
import android.widget.ArrayAdapter;

import com.example.kuldip.jobportal.model.ListofJobEducation;
import com.example.kuldip.jobportal.model.ListofJobLocation;
import com.example.kuldip.jobportal.model.ListofJobOwnerhip;
import com.example.kuldip.jobportal.model.ListofJobTypes;

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
        void onSuccessJobLocation(List<ListofJobLocation> listofJobLocations);
        void onSuccessJobTypes(List<ListofJobTypes> listofJobTypes);
        void onSuccessJobEducation(List<ListofJobEducation> listofJobEducations);
        void onSuccessJobOwnership(List<ListofJobOwnerhip> listofJobOwnerhips);
        void onError(String e);
    }

    public void getJobLocationList(final GetJobCallback callback){
        Call<List<ListofJobLocation>> l = apiService.getJobLocationList();
        l.enqueue(new Callback<List<ListofJobLocation>>(){
            @Override
            public void onResponse(Call<List<ListofJobLocation>> call, Response<List<ListofJobLocation>> response) {
                List<ListofJobLocation> s = response.body();
                if (s!=null && s.size() > 0){
                    callback.onSuccessJobLocation(s);
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

    //Job Types Spinner
    public void getJobTypeList(final GetJobCallback callback){
        Call<List<ListofJobTypes>> c = apiService.getJobTypeList();
        c.enqueue(new Callback<List<ListofJobTypes>>(){
            @Override
            public void onResponse(Call<List<ListofJobTypes>> call, Response<List<ListofJobTypes>> response) {
                List<ListofJobTypes> a = response.body();
                if (a!=null && a.size() > 0){
                    callback.onSuccessJobTypes(a);
                }else{
                    callback.onError("No data available");
                }
            }
            @Override
            public void onFailure(Call<List<ListofJobTypes>> call, Throwable t) {
                Log.d("dfdfd", "onFailure: " + t.getCause());
            }
        });
    }

    public void getJobEducationList(final GetJobCallback callback){
        Call<List<ListofJobEducation>> c = apiService.getJobEducationList();
        c.enqueue(new Callback<List<ListofJobEducation>>(){
            @Override
            public void onResponse(Call<List<ListofJobEducation>> call, Response<List<ListofJobEducation>> response) {
                List<ListofJobEducation> a = response.body();
                if (a!=null && a.size() > 0){
                    callback.onSuccessJobEducation(a);
                }else{
                    callback.onError("No data available");
                }
            }
            @Override
            public void onFailure(Call<List<ListofJobEducation>> call, Throwable t) {
                Log.d("dfdfd", "onFailure: " + t.getCause());
            }
        });
    }

    public void getJobOwnerShipList(final GetJobCallback callback){
        Call<List<ListofJobOwnerhip>> l = apiService.getJobOwnershipList();
        l.enqueue(new Callback<List<ListofJobOwnerhip>>(){
            @Override
            public void onResponse(Call<List<ListofJobOwnerhip>> call, Response<List<ListofJobOwnerhip>> response) {
                List<ListofJobOwnerhip> s = response.body();
                if (s!=null && s.size() > 0){
                    callback.onSuccessJobOwnership(s);
                }else{
                    callback.onError("No data available");
                }
            }
            @Override
            public void onFailure(Call<List<ListofJobOwnerhip>> call, Throwable t) {
                Log.d("dfdfd", "onFailure: " + t.getCause());
            }
        });
    }


}
