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
import android.widget.Toast;

import com.example.kuldip.jobportal.DataManager.ApiClient;
import com.example.kuldip.jobportal.DataManager.ApiInterface;
import com.example.kuldip.jobportal.DataManager.Service;
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

public class HomeTopFragment extends Fragment implements Service.GetJobCallback {

    Context context;
    Spinner jobTypeSpinner, jobLocationSpinner, jobEducationSpinner, jobOwnershipSpinner;
    Service service;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.search_view, null);

        context = container.getContext();
        jobTypeSpinner = view.findViewById(R.id.job_type);
        jobLocationSpinner = view.findViewById(R.id.job_location);
        jobEducationSpinner = view.findViewById(R.id.job_education);
        jobOwnershipSpinner = view.findViewById(R.id.job_ownership);

        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);

        service = new Service();
        service.getJobLocationList(this);
        service.getJobTypeList(this);
        service.getJobEducationList(this);
        service.getJobOwnerShipList(this);

     return view;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

    @Override
    public void onSuccessJobLocation(List<ListofJobLocation> listofJobLocations) {
        jobLocationSpinner.setAdapter(new ArrayAdapter<>(getActivity(),
                android.R.layout.simple_spinner_dropdown_item, listofJobLocations));
    }
    @Override
    public void onSuccessJobTypes(List<ListofJobTypes> listofJobTypes) {
        jobTypeSpinner.setAdapter(new ArrayAdapter<>(getActivity(),
                android.R.layout.simple_spinner_dropdown_item, listofJobTypes));
    }

    @Override
    public void onSuccessJobEducation(List<ListofJobEducation> listofJobEducations) {
        jobEducationSpinner.setAdapter(new ArrayAdapter<>(getActivity(),
                android.R.layout.simple_spinner_dropdown_item, listofJobEducations));
    }

    @Override
    public void onSuccessJobOwnership(List<ListofJobOwnerhip> listofJobOwnerhips) {
        jobOwnershipSpinner.setAdapter(new ArrayAdapter<>(getActivity(),
                android.R.layout.simple_spinner_dropdown_item, listofJobOwnerhips));
    }

    @Override
    public void onError(String e) {
        Toast.makeText(getActivity(), e, Toast.LENGTH_LONG).show();
    }
}
