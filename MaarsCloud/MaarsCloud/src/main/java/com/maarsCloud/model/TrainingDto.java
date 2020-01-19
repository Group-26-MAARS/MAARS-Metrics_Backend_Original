package com.maarsCloud.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class TrainingDto {

    private int ID;
    private String mostRecentDate;
    private float percentProgress;
    private int userID;

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

