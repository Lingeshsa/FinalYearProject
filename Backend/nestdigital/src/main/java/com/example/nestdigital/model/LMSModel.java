package com.example.nestdigital.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name = "lms")
public class LMSModel {
    @Id
    @GeneratedValue
    private int id;
    private int empid;
    private String leaveType;
    private String remarks;
    private String fromDate;
    private String toDate;
    private String applyDate;
    private String status;
    private int casualLeave;
    private int sickLeave;
    private int splLeave;




    public LMSModel() {
    }

    public LMSModel(int id, int empid, String leaveType, String remarks, String fromDate, String toDate, String applyDate, String status, int casualLeave, int sickLeave, int splLeave) {
        this.id = id;
        this.empid = empid;
        this.leaveType = leaveType;
        this.remarks = remarks;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.applyDate = applyDate;
        this.status = status;
        this.casualLeave = casualLeave;
        this.sickLeave = sickLeave;
        this.splLeave = splLeave;
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

    public String getLeaveType() {
        return leaveType;
    }

    public void setLeaveType(String leaveType) {
        this.leaveType = leaveType;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public String getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate;
    }

    public String  getStatus() {
        return status;
    }

    public void setStatus(String  status) {
        this.status = status;
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


}
