package com.maarsCloud.model;

import com.fasterxml.jackson.annotation.JsonIgnore; 

import javax.persistence.*;

@Entity
@Table(name = "proceduregeneration")
public class ProcGen {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column
    private int ID;
    @Column
    private String date;
    @Column
    private int boltTime;
    @Column
    private int safetyWireTime;
    @Column
    private int adhesiveTime;
    @Column
    private int ppeTime;
    @Column
    private int totalTime;
    @Column
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
