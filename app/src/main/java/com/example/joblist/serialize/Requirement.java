
package com.example.joblist.serialize;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Requirement implements Serializable
{

    @SerializedName("id")
    @Expose
    private Long id;
    @SerializedName("requirement")
    @Expose
    private String requirement;
    @SerializedName("job")
    @Expose
    private Long job;
    private final static long serialVersionUID = 6562967159039266897L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Requirement() {
    }

    /**
     * 
     * @param id
     * @param requirement
     * @param job
     */
    public Requirement(Long id, String requirement, Long job) {
        super();
        this.id = id;
        this.requirement = requirement;
        this.job = job;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Requirement withId(Long id) {
        this.id = id;
        return this;
    }

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    public Requirement withRequirement(String requirement) {
        this.requirement = requirement;
        return this;
    }

    public Long getJob() {
        return job;
    }

    public void setJob(Long job) {
        this.job = job;
    }

    public Requirement withJob(Long job) {
        this.job = job;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Requirement.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("requirement");
        sb.append('=');
        sb.append(((this.requirement == null)?"<null>":this.requirement));
        sb.append(',');
        sb.append("job");
        sb.append('=');
        sb.append(((this.job == null)?"<null>":this.job));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.requirement == null)? 0 :this.requirement.hashCode()));
        result = ((result* 31)+((this.job == null)? 0 :this.job.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Requirement) == false) {
            return false;
        }
        Requirement rhs = ((Requirement) other);
        return ((((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id)))&&((this.requirement == rhs.requirement)||((this.requirement!= null)&&this.requirement.equals(rhs.requirement))))&&((this.job == rhs.job)||((this.job!= null)&&this.job.equals(rhs.job))));
    }

}
