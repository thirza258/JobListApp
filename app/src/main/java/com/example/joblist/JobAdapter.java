package com.example.joblist;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class JobAdapter extends RecyclerView.Adapter<JobAdapter.ViewHolder> {

    ArrayList<Job> jobs = new ArrayList<>();

    private Context context;

    public JobAdapter(Context context) {
        this.context = context;
    }


    @NonNull
    @NotNull
    @Override
    public JobAdapter.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_job_adapter, parent , false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull JobAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return jobs.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private CardView parent;
        private ImageView account;
        private TextView company, recent, ads, job, country, hour, fulltime;
        private TextView qual1, qual2, qual3, qual4;
        private TextView qual5, qual6;

        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);

            parent = itemView.findViewById(R.id.parent);
            account = itemView.findViewById(R.id.account);
            company = itemView.findViewById(R.id.company);
            recent = itemView.findViewById(R.id.recent);
            ads = itemView.findViewById(R.id.ads);
            job = itemView.findViewById(R.id.job);
            country = itemView.findViewById(R.id.country);
            hour = itemView.findViewById(R.id.hour);
            fulltime = itemView.findViewById(R.id.fulltime);
            qual1 = itemView.findViewById(R.id.qual1);
            qual2 = itemView.findViewById(R.id.qual2);
            qual3 = itemView.findViewById(R.id.qual3);
            qual4 = itemView.findViewById(R.id.qual4);
            qual5 = itemView.findViewById(R.id.qual5);
            qual6 = itemView.findViewById(R.id.qual6);

        }
    }
}