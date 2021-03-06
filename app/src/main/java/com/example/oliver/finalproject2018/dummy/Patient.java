package com.example.oliver.finalproject2018.dummy;

import java.util.Date;

/**
 * Created by oliver on 4/11/2018.
 */

public class Patient {
    private String name;
    private String address;
    private Date birthday;
    private String phoneNumber;
    private String HealthCard;
    private String Description ;

    public Patient() {

    }

    public Patient(String name, String address, Date birthday, String phoneNumber, String healthCard, String description) {
        this.name = name;
        this.address = address;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        HealthCard = healthCard;
        Description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setHealthCard(String healthCard) {
        HealthCard = healthCard;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getHealthCard() {
        return HealthCard;
    }

    public String getDescription() {
        return Description;
    }
}
