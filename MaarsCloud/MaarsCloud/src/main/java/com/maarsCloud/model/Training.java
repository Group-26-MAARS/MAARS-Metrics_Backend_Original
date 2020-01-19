package com.maarsCloud.model;

import com.fasterxml.jackson.annotation.JsonIgnore;    

import javax.persistence.*;

@Entity
@Table(name = "training")
public class Training {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column
    private int ID;
    @Column
    private String mostRecentDate;
    @Column
    private float percentProgress;
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

    public float getPercentProgress() {
        return percentProgress;
    }

    public void setPercentProgress(float percentProgress) {
        this.percentProgress = percentProgress;
    }
    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
}
