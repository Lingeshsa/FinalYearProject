package com.example.nestdigital.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="viewlog")
public class ViewLogModel {
    @Id
    private int id;
    private int empid;
    private String name;
    private String purpose;
    private String whoomToMeet;
    private String entryTime;
    private String exitTime;

    public ViewLogModel() {
    }

    public ViewLogModel(int id, int empid, String name, String purpose, String whoomToMeet, String entryTime, String exitTime) {
        this.id = id;
        this.empid = empid;
        this.name = name;
        this.purpose = purpose;
        this.whoomToMeet = whoomToMeet;
        this.entryTime = entryTime;
        this.exitTime = exitTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getWhoomToMeet() {
        return whoomToMeet;
    }

    public void setWhoomToMeet(String whoomToMeet) {
        this.whoomToMeet = whoomToMeet;
    }

    public String getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(String entryTime) {
        this.entryTime = entryTime;
    }

    public String getExitTime() {
        return exitTime;
    }

    public void setExitTime(String exitTime) {
        this.exitTime = exitTime;
    }
}
