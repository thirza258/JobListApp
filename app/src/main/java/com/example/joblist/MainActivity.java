package com.example.joblist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.RelativeLayout;

import com.example.joblist.client.APIClient;
import com.example.joblist.client.APIInterface;
import com.example.joblist.serialize.Datum;
import com.example.joblist.serialize.Response;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout deltaRelative;
    private RecyclerView recyclerView;
    private CardView mainCard;

    private APIInterface apiInterface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        apiInterface = APIClient.getClient().create(APIInterface.class);

        deltaRelative = findViewById(R.id.Relative);
        recyclerView = findViewById(R.id.recycleView);
        mainCard = findViewById(R.id.mainCard);

        Call<Response> call = apiInterface.getJobs();
        call.enqueue(new Callback<Response>() {
            @Override
            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
                Log.d("TAG", response.code() + "");
                Response response1 = response.body();

                List<Datum> data =  response1.getData();

                JobAdapter adapter = new JobAdapter(MainActivity.this);
                adapter.setJobs(data);

                Log.d("TAG", data.get(0).getCompanyName());


                recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                recyclerView.setAdapter(adapter);

            }

            @Override
            public void onFailure(Call<Response> call, Throwable t) {
                call.cancel();
            }
        });

        recyclerView();

    }

    public void recyclerView() {
        ArrayList<Job> job = new ArrayList<>();
        job.add(new Job(R.drawable.account, "Account", "New", "Featured" , "Software Developer", "FullTime", "1day", "Indonesia",
                "Fullstack", "Java", "Ruby", "Website"));
        job.add(new Job(R.drawable.eyecam_co, "Eyecam", null, null, "Graphic Designer", "PartTime",
                "1-4 Hours", "Singapore", "Figma"));

        JobAdapter adapter = new JobAdapter(this);


        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }

}