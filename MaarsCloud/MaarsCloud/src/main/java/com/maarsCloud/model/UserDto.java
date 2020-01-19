package com.maarsCloud.model;

public class UserDto {

    private int ID;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String emailAddress;
    private String jobTitle;
    private int totalTimeAllActivities;
    private String mostRecentDateAllActivities;

    public int getID() {
        return ID;
    }

    public void setUserID(int user_id) {
        this.ID = user_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLName(String lastName) {
        this.lastName = lastName;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmailAddress() {
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
    public int getTotalTimeAllActivities() {
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
}
