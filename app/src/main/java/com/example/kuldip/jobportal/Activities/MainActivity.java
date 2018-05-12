package com.example.kuldip.jobportal.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.kuldip.jobportal.DataManager.ApiClient;
import com.example.kuldip.jobportal.DataManager.ApiInterface;
import com.example.kuldip.jobportal.R;
import com.example.kuldip.jobportal.model.ListofJobTypes;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         listView = (ListView)findViewById(R.id.listView);



//        ApiInterface apiService =
//                ApiClient.getClient().create(ApiInterface.class);
//
//        Call<List<ListofJobTypes>> c = apiService.getJobTypeList();
//        c.enqueue(new Callback<List<ListofJobTypes>>() {
//
//            @Override
//            public void onResponse(Call<List<ListofJobTypes>> call, Response<List<ListofJobTypes>> response) {
//
//
//                List<ListofJobTypes> s = response.body();
//
//                Toast.makeText(MainActivity.this,"hjh", Toast.LENGTH_SHORT).show();
//
//                String[] jobtype = new String[s.size()];
//                for (int i=0; i<s.size();i++){
//                    jobtype[i] = s.get(i).getJob_type();
//                }
//                listView.setAdapter(
//                        new ArrayAdapter<String>(
//                                //getApplicationContext(),
//                                MainActivity.this,
//                                android.R.layout.simple_expandable_list_item_1,
//                                jobtype
//                        ));
//
//
////                for (ListofJobTypes j : s){
////                    Log.d("JobType", j.getJob_type());
////                    Toast.makeText(MainActivity.this,j.getJob_type(),Toast.LENGTH_SHORT).show();
////                    Toast.makeText(MainActivity.this,"how",Toast.LENGTH_SHORT).show();
////                    Log.d("RESPONSE", "onResponse: " + response.body());
////
////                }
//
//            }
//            @Override
//            public void onFailure(Call<List<ListofJobTypes>> call, Throwable t) {
//                Toast.makeText(MainActivity.this,"hello",Toast.LENGTH_SHORT).show();
//                Log.d("dfdfd", "onFailure: " + t.getCause());
//            }
//        });


    }
}
