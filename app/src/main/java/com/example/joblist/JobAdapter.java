package com.example.joblist;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.joblist.serialize.Datum;
import com.example.joblist.serialize.Requirement;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class JobAdapter extends RecyclerView.Adapter<JobAdapter.ViewHolder> {

    ArrayList<Job> jobs = new ArrayList<>();
    List<Datum> job = new List<Datum>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(@Nullable Object o) {
            return false;
        }

        @NonNull
        @Override
        public Iterator<Datum> iterator() {
            return null;
        }

        @NonNull
        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @NonNull
        @Override
        public <T> T[] toArray(@NonNull T[] a) {
            return null;
        }

        @Override
        public boolean add(Datum datum) {
            return false;
        }

        @Override
        public boolean remove(@Nullable Object o) {
            return false;
        }

        @Override
        public boolean containsAll(@NonNull Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(@NonNull Collection<? extends Datum> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, @NonNull Collection<? extends Datum> c) {
            return false;
        }

        @Override
        public boolean removeAll(@NonNull Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(@NonNull Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public boolean equals(@Nullable Object o) {
            return false;
        }

        @Override
        public int hashCode() {
            return 0;
        }

        @Override
        public Datum get(int index) {
            return null;
        }

        @Override
        public Datum set(int index, Datum element) {
            return null;
        }

        @Override
        public void add(int index, Datum element) {

        }

        @Override
        public Datum remove(int index) {
            return null;
        }

        @Override
        public int indexOf(@Nullable Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(@Nullable Object o) {
            return 0;
        }

        @NonNull
        @Override
        public ListIterator<Datum> listIterator() {
            return null;
        }

        @NonNull
        @Override
        public ListIterator<Datum> listIterator(int index) {
            return null;
        }

        @NonNull
        @Override
        public List<Datum> subList(int fromIndex, int toIndex) {
            return null;
        }
    };
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
        String companyName = job.get(position).getCompanyName();
        long id = job.get(position).getId();
        String logoName = job.get(position).getLogoName().toLowerCase();
        int resourceId = context.getResources().getIdentifier(logoName, "drawable", context.getPackageName());
        String jobDesc = job.get(position).getJobDescription();
        String jobName = job.get(position).getJobTitle();
        String country = job.get(position).getCountry();
        String time = job.get(position).getCreatedAt();
        long salary = job.get(position).getSalary();
        String location = job.get(position).getLocation();
        String type = job.get(position).getJobType();
        int work_hours = (int) job.get(position).getWorkHours().longValue();
        String status = job.get(position).getStatus();
        boolean _new = job.get(position).getNew();
        boolean featured = job.get(position).getFeatured();
        String link = job.get(position).getLink();
        List<Requirement> requirements = job.get(position).getRequirements();

        if(resourceId != 0) {
            holder.account.setImageResource(resourceId);
        } else {
            holder.account.setImageResource(R.drawable.loop_studios);
        }

        holder.company.setText(companyName);
        if(companyName == null){
            holder.company.setVisibility(View.GONE);
        }

        if(_new) {
            holder.recent.setText("New");
        } else {
            holder.recent.setVisibility(View.GONE);
        }

        if(featured) {
            holder.ads.setText("Featured");
        } else {
            holder.ads.setVisibility(View.GONE);
        }

        holder.job.setText(jobName);
        if(jobName == null){
            holder.job.setVisibility(View.GONE);
        }

        holder.country.setText(country);
        if(country == null){
            holder.country.setVisibility(View.GONE);
        }

        holder.hour.setText(status);
        if(status == null){
            holder.hour.setVisibility(View.GONE);
        }

        holder.fulltime.setText(type);
        if(type == null){
            holder.fulltime.setVisibility(View.GONE);
        }

        for(int i = 0; i < requirements.size(); i++) {
            if(i == 0) {
                holder.qual1.setText(requirements.get(i).getRequirement());
                if(requirements.get(i).getRequirement() == null){
                    holder.qual1.setVisibility(View.GONE);
                }
            } else if(i == 1) {
                holder.qual2.setText(requirements.get(i).getRequirement());
                if(requirements.get(i).getRequirement() == null){
                    holder.qual2.setVisibility(View.GONE);
                }
            } else if(i == 2) {
                holder.qual3.setText(requirements.get(i).getRequirement());
                if(requirements.get(i).getRequirement() == null){
                    holder.qual3.setVisibility(View.GONE);
                }
            } else if(i == 3) {
                holder.qual4.setText(requirements.get(i).getRequirement());
                if(requirements.get(i).getRequirement() == null){
                    holder.qual4.setVisibility(View.GONE);
                }
            } else if(i == 4) {
                holder.qual5.setText(requirements.get(i).getRequirement());
                if(requirements.get(i).getRequirement() == null){
                    holder.qual5.setVisibility(View.GONE);
                }
            } else if(i == 5) {
                holder.qual6.setText(requirements.get(i).getRequirement());
                if(requirements.get(i).getRequirement() == null){
                    holder.qual6.setVisibility(View.GONE);
                }
            }
        }

        if(requirements.size() == 0) {
            holder.qual1.setVisibility(View.GONE);
            holder.qual2.setVisibility(View.GONE);
            holder.qual3.setVisibility(View.GONE);
            holder.qual4.setVisibility(View.GONE);
            holder.qual5.setVisibility(View.GONE);
            holder.qual6.setVisibility(View.GONE);
        }

        if(requirements.size() == 1) {
            holder.qual2.setVisibility(View.GONE);
            holder.qual3.setVisibility(View.GONE);
            holder.qual4.setVisibility(View.GONE);
            holder.qual5.setVisibility(View.GONE);
            holder.qual6.setVisibility(View.GONE);
        }

        if(requirements.size() == 2) {
            holder.qual3.setVisibility(View.GONE);
            holder.qual4.setVisibility(View.GONE);
            holder.qual5.setVisibility(View.GONE);
            holder.qual6.setVisibility(View.GONE);
        }

        if(requirements.size() == 3) {
            holder.qual4.setVisibility(View.GONE);
            holder.qual5.setVisibility(View.GONE);
            holder.qual6.setVisibility(View.GONE);
        }

        if(requirements.size() == 4) {
            holder.qual5.setVisibility(View.GONE);
            holder.qual6.setVisibility(View.GONE);
        }

        if(requirements.size() == 5) {
            holder.qual6.setVisibility(View.GONE);
        }

        if(requirements.size() >= 6) {
            holder.qual1.setVisibility(View.VISIBLE);
            holder.qual2.setVisibility(View.VISIBLE);
            holder.qual3.setVisibility(View.VISIBLE);
            holder.qual4.setVisibility(View.VISIBLE);
            holder.qual5.setVisibility(View.VISIBLE);
            holder.qual6.setVisibility(View.VISIBLE);
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
        return job.size();
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