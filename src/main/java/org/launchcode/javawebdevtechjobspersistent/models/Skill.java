package org.launchcode.javawebdevtechjobspersistent.models;


import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {
    @NotNull(message = "Skill description is required")
    @Size(min = 25, max = 1000, message = "Skill description must be between 25-1000 characters")
    private String skillDescription;

    @ManyToMany(mappedBy="skills")
    private List<Job> jobs = new ArrayList<>();

    public Skill (String skillDescription){
        this.skillDescription = skillDescription;
    }

    public Skill() {}

    public String getDescription() {
        return skillDescription;
    }

    public void setDescription(String skillDescription) {
        this.skillDescription = skillDescription;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}