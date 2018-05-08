package com.example.kuldip.jobportal;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HomeActivityFragment extends AppCompatActivity {

    HomeTopFragment homeTopFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_fragment);

        homeTopFragment = new HomeTopFragment();

        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        transaction.replace(R.id.topContainer,homeTopFragment);
        transaction.commit();

    }
}
