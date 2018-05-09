package com.example.kuldip.jobportal.Activities;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.kuldip.jobportal.Fragments.HomeTopFragment;
import com.example.kuldip.jobportal.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HomeTopFragment homeTopFragment = new HomeTopFragment();
        FragmentManager manager = getFragmentManager();


        FragmentTransaction transaction = manager.beginTransaction();

        transaction.replace(R.id.mainlayout,homeTopFragment);
        transaction.commit();
    }
}
