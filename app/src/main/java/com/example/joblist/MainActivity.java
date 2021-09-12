package com.example.joblist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout deltaRelative;
    private RecyclerView recyclerView;
    private CardView mainCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        recyclerView();

    }

    public void recyclerView() {
        ArrayList<Job> job = new ArrayList<>();
        job.add(new Job(R.drawable.account, "Account", "New", "Featured" , "Software Developer", "FullTime", "1day", "Indonesia",
                "Fullstack", "Java", "Ruby", "Website"));
        job.add(new Job(R.drawable.eyecam_co, "Eyecam", null, null, "Graphic Designer", "PartTime",
                "1-4 Hours", "Singapore", "Figma"));

        JobAdapter adapter = new JobAdapter(this);
        adapter.setJobs(job);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }

    public void initView() {
        deltaRelative = findViewById(R.id.Relative);
        recyclerView = findViewById(R.id.recycleView);
        mainCard = findViewById(R.id.mainCard);

    }
}