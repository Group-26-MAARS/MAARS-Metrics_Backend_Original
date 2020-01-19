package com.maarsCloud.model;

public class ProcGenDto {

    private int ID;
    private String date;
    private int boltTime;
    private int safetyWireTime;
    private int adhesiveTime;
    private int ppeTime;
    private int totalTime;
    private int userID;

    public int getID() {
        return ID;
    }
    

    public void setID(int ID) {
        this.ID = ID;
    }
    

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getBoltTime() {
        return boltTime;
    }

    public void setBoltTime(int boltTime) {
        this.boltTime = boltTime;
    }

    public int getSafetyWireTime() {
        return safetyWireTime;
    }

    public void setSafetyWireTime(int safetyWireTime) {
        this.safetyWireTime = safetyWireTime;
    }

    public int getAdhesiveTime() {
        return this.adhesiveTime;
    }

    public void setAdhesiveTime(int adhesiveTime) {
        this.adhesiveTime = adhesiveTime;
    }

    public int getPPETime() {
        return this.ppeTime;
    }

    public void setPPETime(int ppeTime) {
        this.ppeTime = ppeTime;
    }

    public int getTotalTime() {
        return this.totalTime;
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

