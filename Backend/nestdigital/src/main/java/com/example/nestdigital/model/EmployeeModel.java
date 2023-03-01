package com.example.nestdigital.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Employee")
public class EmployeeModel {
    @Id
    @GeneratedValue
    private int id;
    private int empid;
    private  String empName;
    private String designation;
    private String mail;
    private String phone;
    private  String address;
    private String username;
    private String password;
    private  String status;

    public EmployeeModel() {
    }

    public EmployeeModel(int id, int empid, String empName, String designation, String mail, String phone, String address, String username, String password, String status) {
        this.id = id;
        this.empid = empid;
        this.empName = empName;
        this.designation = designation;
        this.mail = mail;
        this.phone = phone;
        this.address = address;
        this.username = username;
        this.password = password;
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

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
