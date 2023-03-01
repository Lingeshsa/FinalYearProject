package com.example.nestdigital.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employeeslog")
public class EmployeeLogModel {
    @Id
    @GeneratedValue
    private int id;
    private int empid;
    private String  entryDate;
    private String entryTime;
    private String exitTime;
    private String status;

    public EmployeeLogModel() {
    }

    public EmployeeLogModel(int id, int empid, String entryDate, String entryTime, String exitTime, String status) {
        this.id = id;
        this.empid = empid;
        this.entryDate = entryDate;
        this.entryTime = entryTime;
        this.exitTime = exitTime;
        this.status = status;
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

    public String getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
