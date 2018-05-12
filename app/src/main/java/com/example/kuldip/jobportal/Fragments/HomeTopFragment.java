package com.example.kuldip.jobportal.Fragments;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.kuldip.jobportal.DataManager.ApiClient;
import com.example.kuldip.jobportal.DataManager.ApiInterface;
import com.example.kuldip.jobportal.R;
import com.example.kuldip.jobportal.model.ListofJobEducation;
import com.example.kuldip.jobportal.model.ListofJobLocation;
import com.example.kuldip.jobportal.model.ListofJobOwnerhip;
import com.example.kuldip.jobportal.model.ListofJobTypes;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * Created by Kuldip on 5/8/2018.
 */

public class HomeTopFragment extends Fragment {

    Context context;
    Spinner jobTypeSpinner,jobLocationSpinner, jobEducationSpinner,jobOwnershipSpinner;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View  view = inflater.inflate(R.layout.search_view,null);

        context = container.getContext();
        jobTypeSpinner = view.findViewById(R.id.job_type);
        jobLocationSpinner = view.findViewById(R.id.job_location);
        jobEducationSpinner = view.findViewById(R.id.job_education);
        jobOwnershipSpinner = view.findViewById(R.id.job_ownership);

        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);

        //Job Types Spinner
        Call<List<ListofJobTypes>> c = apiService.getJobTypeList();
        c.enqueue(new Callback<List<ListofJobTypes>>() {
            @Override
            public void onResponse(Call<List<ListofJobTypes>> call, Response<List<ListofJobTypes>> response) {
                List<ListofJobTypes> s = response.body();
                String[] jobtype = new String[s.size()];
                for (int i=0; i<s.size();i++){
                   // jobtype[0]= "Select Job Type";
                    jobtype[i] = s.get(i).getJob_type();
                }

                jobTypeSpinner.setAdapter(new ArrayAdapter<String>(
                        context,
                        android.R.layout.simple_spinner_dropdown_item,
                        jobtype
                ));
            }
            @Override
            public void onFailure(Call<List<ListofJobTypes>> call, Throwable t) {
                Log.d("dfdfd", "onFailure: " + t.getCause());
            }
        });


        //Job Location Spinner
        Call<List<ListofJobLocation>> l = apiService.getJobLocationList();
        l.enqueue(new Callback<List<ListofJobLocation>>(){
            @Override
            public void onResponse(Call<List<ListofJobLocation>> call, Response<List<ListofJobLocation>> response) {
                List<ListofJobLocation> s = response.body();
                String[] joblocation = new String[s.size()];
                for (int i=0; i<s.size();i++){
                    // jobtype[0]= "Select Job Type";
                    joblocation[i] = s.get(i).getJob_location();
                }

                jobLocationSpinner.setAdapter(new ArrayAdapter<String>(
                        context,
                        android.R.layout.simple_spinner_dropdown_item,
                        //simple_spinner_item,
                        joblocation
                ));
            }
            @Override
            public void onFailure(Call<List<ListofJobLocation>> call, Throwable t) {
                Log.d("dfdfd", "onFailure: " + t.getCause());
            }
        });

        //Job Education Spinner

        Call<List<ListofJobEducation>> e = apiService.getJobEducationList();
        e.enqueue(new Callback<List<ListofJobEducation>>(){
            @Override
            public void onResponse(Call<List<ListofJobEducation>> call, Response<List<ListofJobEducation>> response) {
                List<ListofJobEducation> s = response.body();
                String[] jobeducation = new String[s.size()];
                for (int i=0; i<s.size();i++){
                    jobeducation[i] = s.get(i).getJob_education();
                }

                jobEducationSpinner.setAdapter(new ArrayAdapter<String>(
                        context,
                        android.R.layout.simple_spinner_dropdown_item,
                        //simple_spinner_item,
                        jobeducation
                ));
            }
            @Override
            public void onFailure(Call<List<ListofJobEducation>> call, Throwable t) {
                Log.d("dfdfd", "onFailure: " + t.getCause());
            }
        });

        //Job Ownership Spinner

        Call<List<ListofJobOwnerhip>> o = apiService.getJobOwnershipList();
        o.enqueue(new Callback<List<ListofJobOwnerhip>>(){
            @Override
            public void onResponse(Call<List<ListofJobOwnerhip>> call, Response<List<ListofJobOwnerhip>> response) {
                List<ListofJobOwnerhip> s = response.body();
                String[] jobownership = new String[s.size()];
                for (int i=0; i<s.size();i++){
                    jobownership[i] = s.get(i).getJob_ownership();
                }

                jobOwnershipSpinner.setAdapter(new ArrayAdapter<String>(
                        context,
                        android.R.layout.simple_spinner_dropdown_item,
                        //simple_spinner_item,
                        jobownership
                ));
            }
            @Override
            public void onFailure(Call<List<ListofJobOwnerhip>> call, Throwable t) {
                Log.d("dfdfd", "onFailure: " + t.getCause());
            }
        });



        return view;

    }

   @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }
}
