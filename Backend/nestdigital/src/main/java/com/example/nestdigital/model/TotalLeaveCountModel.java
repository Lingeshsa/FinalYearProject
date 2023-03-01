package com.example.nestdigital.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "leavecount")
public class TotalLeaveCountModel {
    @Id
    @GeneratedValue
    private int id;
    private int empid;
    private int casualLeave;
    private int sickLeave;
    private int splLeave;
    private int status;

    public TotalLeaveCountModel() {
    }

    public TotalLeaveCountModel(int id, int empid, int casualLeave, int sickLeave, int splLeave,int status) {
        this.id = id;
        this.empid = empid;
        this.casualLeave = casualLeave;
        this.sickLeave = sickLeave;
        this.splLeave = splLeave;
        this.status=status;
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

    public int getCasualLeave() {
        return casualLeave;
    }

    public void setCasualLeave(int casualLeave) {
        this.casualLeave = casualLeave;
    }

    public int getSickLeave() {
        return sickLeave;
    }

    public void setSickLeave(int sickLeave) {
        this.sickLeave = sickLeave;
    }

    public int getSplLeave() {
        return splLeave;
    }

    public void setSplLeave(int splLeave) {
        this.splLeave = splLeave;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
