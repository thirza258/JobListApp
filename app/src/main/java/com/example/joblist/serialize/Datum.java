
package com.example.joblist.serialize;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Datum implements Serializable
{

    @SerializedName("id")
    @Expose
    private Long id;
    @SerializedName("logo")
    @Expose
    private String logo;
    @SerializedName("logo_name")
    @Expose
    private String logoName;
    @SerializedName("company_name")
    @Expose
    private String companyName;
    @SerializedName("job_title")
    @Expose
    private String jobTitle;
    @SerializedName("job_description")
    @Expose
    private String jobDescription;
    @SerializedName("salary")
    @Expose
    private Long salary;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("job_type")
    @Expose
    private String jobType;
    @SerializedName("work_hours")
    @Expose
    private Long workHours;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("new")
    @Expose
    private Boolean _new;
    @SerializedName("featured")
    @Expose
    private Boolean featured;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("deleted_at")
    @Expose
    private Object deletedAt;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("requirements")
    @Expose
    private List<Requirement> requirements = new ArrayList<Requirement>();
    private final static long serialVersionUID = 2034913422143600850L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Datum() {
    }

    /**
     * 
     * @param logoName
     * @param country
     * @param featured
     * @param requirements
     * @param companyName
     * @param jobTitle
     * @param workHours
     * @param link
     * @param salary
     * @param _new
     * @param createdAt
     * @param deletedAt
     * @param logo
     * @param jobDescription
     * @param location
     * @param id
     * @param jobType
     * @param status
     * @param updatedAt
     */
    public Datum(Long id, String logo, String logoName, String companyName, String jobTitle, String jobDescription, Long salary, String location, String country, String jobType, Long workHours, String status, Boolean _new, Boolean featured, String createdAt, String updatedAt, Object deletedAt, String link, List<Requirement> requirements) {
        super();
        this.id = id;
        this.logo = logo;
        this.logoName = logoName;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.jobDescription = jobDescription;
        this.salary = salary;
        this.location = location;
        this.country = country;
        this.jobType = jobType;
        this.workHours = workHours;
        this.status = status;
        this._new = _new;
        this.featured = featured;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
        this.link = link;
        this.requirements = requirements;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Datum withId(Long id) {
        this.id = id;
        return this;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Datum withLogo(String logo) {
        this.logo = logo;
        return this;
    }

    public String getLogoName() {
        return logoName;
    }

    public void setLogoName(String logoName) {
        this.logoName = logoName;
    }

    public Datum withLogoName(String logoName) {
        this.logoName = logoName;
        return this;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Datum withCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Datum withJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public Datum withJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
        return this;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public Datum withSalary(Long salary) {
        this.salary = salary;
        return this;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Datum withLocation(String location) {
        this.location = location;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Datum withCountry(String country) {
        this.country = country;
        return this;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public Datum withJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }

    public Long getWorkHours() {
        return workHours;
    }

    public void setWorkHours(Long workHours) {
        this.workHours = workHours;
    }

    public Datum withWorkHours(Long workHours) {
        this.workHours = workHours;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Datum withStatus(String status) {
        this.status = status;
        return this;
    }

    public Boolean getNew() {
        return _new;
    }

    public void setNew(Boolean _new) {
        this._new = _new;
    }

    public Datum withNew(Boolean _new) {
        this._new = _new;
        return this;
    }

    public Boolean getFeatured() {
        return featured;
    }

    public void setFeatured(Boolean featured) {
        this.featured = featured;
    }

    public Datum withFeatured(Boolean featured) {
        this.featured = featured;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Datum withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Datum withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public Object getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Object deletedAt) {
        this.deletedAt = deletedAt;
    }

    public Datum withDeletedAt(Object deletedAt) {
        this.deletedAt = deletedAt;
        return this;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Datum withLink(String link) {
        this.link = link;
        return this;
    }

    public List<Requirement> getRequirements() {
        return requirements;
    }

    public void setRequirements(List<Requirement> requirements) {
        this.requirements = requirements;
    }

    public Datum withRequirements(List<Requirement> requirements) {
        this.requirements = requirements;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Datum.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("logo");
        sb.append('=');
        sb.append(((this.logo == null)?"<null>":this.logo));
        sb.append(',');
        sb.append("logoName");
        sb.append('=');
        sb.append(((this.logoName == null)?"<null>":this.logoName));
        sb.append(',');
        sb.append("companyName");
        sb.append('=');
        sb.append(((this.companyName == null)?"<null>":this.companyName));
        sb.append(',');
        sb.append("jobTitle");
        sb.append('=');
        sb.append(((this.jobTitle == null)?"<null>":this.jobTitle));
        sb.append(',');
        sb.append("jobDescription");
        sb.append('=');
        sb.append(((this.jobDescription == null)?"<null>":this.jobDescription));
        sb.append(',');
        sb.append("salary");
        sb.append('=');
        sb.append(((this.salary == null)?"<null>":this.salary));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
        sb.append(',');
        sb.append("country");
        sb.append('=');
        sb.append(((this.country == null)?"<null>":this.country));
        sb.append(',');
        sb.append("jobType");
        sb.append('=');
        sb.append(((this.jobType == null)?"<null>":this.jobType));
        sb.append(',');
        sb.append("workHours");
        sb.append('=');
        sb.append(((this.workHours == null)?"<null>":this.workHours));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("_new");
        sb.append('=');
        sb.append(((this._new == null)?"<null>":this._new));
        sb.append(',');
        sb.append("featured");
        sb.append('=');
        sb.append(((this.featured == null)?"<null>":this.featured));
        sb.append(',');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null)?"<null>":this.createdAt));
        sb.append(',');
        sb.append("updatedAt");
        sb.append('=');
        sb.append(((this.updatedAt == null)?"<null>":this.updatedAt));
        sb.append(',');
        sb.append("deletedAt");
        sb.append('=');
        sb.append(((this.deletedAt == null)?"<null>":this.deletedAt));
        sb.append(',');
        sb.append("link");
        sb.append('=');
        sb.append(((this.link == null)?"<null>":this.link));
        sb.append(',');
        sb.append("requirements");
        sb.append('=');
        sb.append(((this.requirements == null)?"<null>":this.requirements));
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
        result = ((result* 31)+((this.logoName == null)? 0 :this.logoName.hashCode()));
        result = ((result* 31)+((this.country == null)? 0 :this.country.hashCode()));
        result = ((result* 31)+((this.featured == null)? 0 :this.featured.hashCode()));
        result = ((result* 31)+((this.requirements == null)? 0 :this.requirements.hashCode()));
        result = ((result* 31)+((this.companyName == null)? 0 :this.companyName.hashCode()));
        result = ((result* 31)+((this.jobTitle == null)? 0 :this.jobTitle.hashCode()));
        result = ((result* 31)+((this.workHours == null)? 0 :this.workHours.hashCode()));
        result = ((result* 31)+((this.link == null)? 0 :this.link.hashCode()));
        result = ((result* 31)+((this.salary == null)? 0 :this.salary.hashCode()));
        result = ((result* 31)+((this._new == null)? 0 :this._new.hashCode()));
        result = ((result* 31)+((this.createdAt == null)? 0 :this.createdAt.hashCode()));
        result = ((result* 31)+((this.deletedAt == null)? 0 :this.deletedAt.hashCode()));
        result = ((result* 31)+((this.logo == null)? 0 :this.logo.hashCode()));
        result = ((result* 31)+((this.jobDescription == null)? 0 :this.jobDescription.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.jobType == null)? 0 :this.jobType.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+((this.updatedAt == null)? 0 :this.updatedAt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Datum) == false) {
            return false;
        }
        Datum rhs = ((Datum) other);
        return ((((((((((((((((((((this.logoName == rhs.logoName)||((this.logoName!= null)&&this.logoName.equals(rhs.logoName)))&&((this.country == rhs.country)||((this.country!= null)&&this.country.equals(rhs.country))))&&((this.featured == rhs.featured)||((this.featured!= null)&&this.featured.equals(rhs.featured))))&&((this.requirements == rhs.requirements)||((this.requirements!= null)&&this.requirements.equals(rhs.requirements))))&&((this.companyName == rhs.companyName)||((this.companyName!= null)&&this.companyName.equals(rhs.companyName))))&&((this.jobTitle == rhs.jobTitle)||((this.jobTitle!= null)&&this.jobTitle.equals(rhs.jobTitle))))&&((this.workHours == rhs.workHours)||((this.workHours!= null)&&this.workHours.equals(rhs.workHours))))&&((this.link == rhs.link)||((this.link!= null)&&this.link.equals(rhs.link))))&&((this.salary == rhs.salary)||((this.salary!= null)&&this.salary.equals(rhs.salary))))&&((this._new == rhs._new)||((this._new!= null)&&this._new.equals(rhs._new))))&&((this.createdAt == rhs.createdAt)||((this.createdAt!= null)&&this.createdAt.equals(rhs.createdAt))))&&((this.deletedAt == rhs.deletedAt)||((this.deletedAt!= null)&&this.deletedAt.equals(rhs.deletedAt))))&&((this.logo == rhs.logo)||((this.logo!= null)&&this.logo.equals(rhs.logo))))&&((this.jobDescription == rhs.jobDescription)||((this.jobDescription!= null)&&this.jobDescription.equals(rhs.jobDescription))))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.jobType == rhs.jobType)||((this.jobType!= null)&&this.jobType.equals(rhs.jobType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))))&&((this.updatedAt == rhs.updatedAt)||((this.updatedAt!= null)&&this.updatedAt.equals(rhs.updatedAt))));
    }

}
