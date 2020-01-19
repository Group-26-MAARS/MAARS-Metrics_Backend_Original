package com.maarsCloud.model;

public class AccessUser {

    private String emailAddress;
    private String username;
    private String password;
    private int ID;
    
    public int getID() {
    	return this.ID;
    }
    
    public void setID(int ID) {
    	this.ID = ID;
    }
    
    public void setUsername(String username) {
    	this.username = username;
    }
    
    public String getUsername() {
    	return this.username;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
