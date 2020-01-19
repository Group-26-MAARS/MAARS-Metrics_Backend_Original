package com.maarsCloud.model;

import com.fasterxml.jackson.annotation.JsonIgnore;    

import javax.persistence.*;

@Entity
@Table(name = "design")
public class Design {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column
    private int ID;
    @Column
    private String mostRecentDate;
    @Column
    private int totalTime;
    @Column
    private int userID;
    @Column
    public int getID() {
        return ID;
    }

    public void setID(int user_id) {
        this.ID = user_id;
    }

    public String getMostRecentDate() {
        return mostRecentDate;
    }

    public void setMostRecentDate(String mostRecentDate) {
        this.mostRecentDate = mostRecentDate;
    }

    public int getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }
    public int getUserID() {
        return this.userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
}
