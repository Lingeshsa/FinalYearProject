package com.example.nestdigital.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Security")
public class SecurityModel {
    @Id
    @GeneratedValue
    private int id;
    private int secID;
    private  String secName;
    private String mail;
    private String phone;
    private  String address;
    private String username;
    private String password;

    public SecurityModel() {
    }

    public SecurityModel(int id, int secID, String secName, String mail, String phone, String address, String username, String password) {
        this.id = id;
        this.secID = secID;
        this.secName = secName;
        this.mail = mail;
        this.phone = phone;
        this.address = address;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSecID() {
        return secID;
    }

    public void setSecID(int secID) {
        this.secID = secID;
    }

    public String getSecName() {
        return secName;
    }

    public void setSecName(String secName) {
        this.secName = secName;
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
}

