package com.maarsCloud.model;

import com.fasterxml.jackson.annotation.JsonIgnore;    

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column
    private int ID;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String emailAddress;
    @Column
    private String username;
    @Column
    private String password;
    @Column
    private String jobTitle;
    @Column
    private int totalTimeAllActivities;
    @Column
    private String mostRecentDateAllActivities;

    public int getID() {
        return this.ID;
    }

    public void setID(int user_id) {
        this.ID = user_id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getUsername() {
    	return this.username;
    }
    
    public void setUsername(String username) {
    	this.username = username;
    }

    public String getEmail() {
        return this.emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public long getTotalTimeAllActivities() {
        return this.totalTimeAllActivities;
    }

    public void setTotalTimeAllActivities(int totalTimeAllActivities) {
        this.totalTimeAllActivities = totalTimeAllActivities;
    }

    public String getMostRecentDateAllActivities() {
        return this.mostRecentDateAllActivities;
    }

    public void setMostRecentDateAllActivities(String mostRecentDateAllActivities) {
        this.mostRecentDateAllActivities = mostRecentDateAllActivities;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
