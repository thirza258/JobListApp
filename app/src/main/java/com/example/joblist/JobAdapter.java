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
import android.widget.Toast;

import com.example.joblist.serialize.Datum;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class JobAdapter extends RecyclerView.Adapter<JobAdapter.ViewHolder> {

    ArrayList<Job> jobs = new ArrayList<>();
    List<Datum> job;
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
        holder.account.setImageResource(jobs.get(position).getCompanyLogo());
        holder.company.setText(jobs.get(position).getCompany());
        if(jobs.get(position).getCompany() == null){
            holder.company.setVisibility(View.GONE);
        }
        holder.recent.setText(jobs.get(position).getRecent());
        if(jobs.get(position).getRecent() == null){
            holder.recent.setVisibility(View.GONE);
        }
        holder.ads.setText(jobs.get(position).getAds());
        if(jobs.get(position).getAds() == null){
            holder.ads.setVisibility(View.GONE);
        }
        holder.job.setText(jobs.get(position).getJobName());
        if(jobs.get(position).getJobName() == null){
            holder.job.setVisibility(View.GONE);
        }
        holder.country.setText(jobs.get(position).getCountry());
        if(jobs.get(position).getCountry() == null){
            holder.country.setVisibility(View.GONE);
        }
        holder.hour.setText(jobs.get(position).getTime());
        if(jobs.get(position).getTime() == null){
            holder.hour.setVisibility(View.GONE);
        }
        holder.fulltime.setText(jobs.get(position).getFull());
        if(jobs.get(position).getFull() == null){
            holder.fulltime.setVisibility(View.GONE);
        }
        holder.qual1.setText(jobs.get(position).getQual1());
        if(jobs.get(position).getQual1() == null){
            holder.qual1.setVisibility(View.GONE);
        }
        holder.qual2.setText(jobs.get(position).getQual2());
        if(jobs.get(position).getQual2() == null){
            holder.qual2.setVisibility(View.GONE);
        }
        holder.qual3.setText(jobs.get(position).getQual3());
        if(jobs.get(position).getQual3() == null){
            holder.qual3.setVisibility(View.GONE);
        }
        holder.qual4.setText(jobs.get(position).getQual4());
        if(jobs.get(position).getQual4() == null){
            holder.qual4.setVisibility(View.GONE);
        }
        holder.qual5.setText(jobs.get(position).getQual5());
        if(jobs.get(position).getQual5() == null){
            holder.qual5.setVisibility(View.GONE);
        }
        holder.qual6.setText(jobs.get(position).getQual6());
        if(jobs.get(position).getQual6() == null){
            holder.qual6.setVisibility(View.GONE);
        }
        holder.parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Selected", Toast.LENGTH_SHORT).show();
            }
        });

    }


    @Override
    public int getItemCount() {
        return jobs.size();
    }

    public void setJobs(List<Datum> jobs) {
        this.job = jobs;
        notifyDataSetChanged();
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