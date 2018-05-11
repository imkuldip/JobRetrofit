package com.example.kuldip.jobportal.Activities;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.kuldip.jobportal.Fragments.ServiceFragment;
import com.example.kuldip.jobportal.R;

public class ServiceActivityFragment extends AppCompatActivity {

    ServiceFragment serviceFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_service_fragment);

        serviceFragment = new ServiceFragment();

        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        transaction.replace(R.id.serviceContainer,serviceFragment);
        transaction.commit();



    }
}











