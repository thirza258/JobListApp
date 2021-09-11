package com.example.joblist;

public class Job {
    private int companyLogo;
    private String company;
    private String recent;
    private String ads;
    private String jobName;
    private String time;
    private String full;
    private String country;
    private String qual1;
    private String qual2;
    private String qual3;
    private String qual4;
    private String qual5;
    private String qual6;

    public Job(int companyLogo, String company, String recent, String ads, String jobName, String time, String full, String country, String qual1) {
        this.companyLogo = companyLogo;
        this.company = company;
        this.recent = recent;
        this.ads = ads;
        this.jobName = jobName;
        this.time = time;
        this.full = full;
        this.country = country;
        this.qual1 = qual1;
    }

    public Job(int companyLogo, String company, String recent, String ads, String jobName, String time, String full, String country, String qual1, String qual2) {
        this.companyLogo = companyLogo;
        this.company = company;
        this.recent = recent;
        this.ads = ads;
        this.jobName = jobName;
        this.time = time;
        this.full = full;
        this.country = country;
        this.qual1 = qual1;
        this.qual2 = qual2;
    }

    public Job(int companyLogo, String company, String recent, String ads, String jobName, String time, String full, String country, String qual1, String qual2, String qual3) {
        this.companyLogo = companyLogo;
        this.company = company;
        this.recent = recent;
        this.ads = ads;
        this.jobName = jobName;
        this.time = time;
        this.full = full;
        this.country = country;
        this.qual1 = qual1;
        this.qual2 = qual2;
        this.qual3 = qual3;
    }

    public Job(int companyLogo, String company, String recent, String ads, String jobName, String time, String full, String country, String qual1, String qual2, String qual3, String qual4) {
        this.companyLogo = companyLogo;
        this.company = company;
        this.recent = recent;
        this.ads = ads;
        this.jobName = jobName;
        this.time = time;
        this.full = full;
        this.country = country;
        this.qual1 = qual1;
        this.qual2 = qual2;
        this.qual3 = qual3;
        this.qual4 = qual4;
    }

    public Job(int companyLogo, String company, String recent, String ads, String jobName, String time, String full, String country, String qual1, String qual2, String qual3, String qual4, String qual5) {
        this.companyLogo = companyLogo;
        this.company = company;
        this.recent = recent;
        this.ads = ads;
        this.jobName = jobName;
        this.time = time;
        this.full = full;
        this.country = country;
        this.qual1 = qual1;
        this.qual2 = qual2;
        this.qual3 = qual3;
        this.qual4 = qual4;
        this.qual5 = qual5;
    }

    public Job(int companyLogo, String company, String recent, String ads, String jobName, String time, String full, String country, String qual1, String qual2, String qual3, String qual4, String qual5, String qual6) {
        this.companyLogo = companyLogo;
        this.company = company;
        this.recent = recent;
        this.ads = ads;
        this.jobName = jobName;
        this.time = time;
        this.full = full;
        this.country = country;
        this.qual1 = qual1;
        this.qual2 = qual2;
        this.qual3 = qual3;
        this.qual4 = qual4;
        this.qual5 = qual5;
        this.qual6 = qual6;
    }



    public int getCompanyLogo() {
        return companyLogo;
    }

    public void setCompanyLogo(int companyLogo) {
        this.companyLogo = companyLogo;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getRecent() {
        return recent;
    }

    public void setRecent(String recent) {
        this.recent = recent;
    }

    public String getAds() {
        return ads;
    }

    public void setAds(String ads) {
        this.ads = ads;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getFull() {
        return full;
    }

    public void setFull(String full) {
        this.full = full;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getQual1() {
        return qual1;
    }

    public void setQual1(String qual1) {
        this.qual1 = qual1;
    }

    public String getQual2() {
        return qual2;
    }

    public void setQual2(String qual2) {
        this.qual2 = qual2;
    }

    public String getQual3() {
        return qual3;
    }

    public void setQual3(String qual3) {
        this.qual3 = qual3;
    }

    public String getQual4() {
        return qual4;
    }

    public void setQual4(String qual4) {
        this.qual4 = qual4;
    }

    public String getQual5() {
        return qual5;
    }

    public void setQual5(String qual5) {
        this.qual5 = qual5;
    }

    public String getQual6() {
        return qual6;
    }

    public void setQual6(String qual6) {
        this.qual6 = qual6;
    }

    @Override
    public String toString() {
        return "Job{" +
                "companyLogo=" + companyLogo +
                ", company='" + company + '\'' +
                ", recent='" + recent + '\'' +
                ", ads='" + ads + '\'' +
                ", jobName='" + jobName + '\'' +
                ", time='" + time + '\'' +
                ", full='" + full + '\'' +
                ", country='" + country + '\'' +
                ", qual1='" + qual1 + '\'' +
                ", qual2='" + qual2 + '\'' +
                ", qual3='" + qual3 + '\'' +
                ", qual4='" + qual4 + '\'' +
                ", qual5='" + qual5 + '\'' +
                ", qual6='" + qual6 + '\'' +
                '}';
    }

}
