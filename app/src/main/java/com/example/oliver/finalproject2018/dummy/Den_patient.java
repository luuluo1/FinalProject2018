package com.example.oliver.finalproject2018.dummy;

import java.util.Date;

/**
 * Created by oliver on 4/11/2018.
 */

public class Den_patient {

    private String name;
    private String address;
    private String birthday;
    private String phoneNumber;
    private String HealthCard;
    private String Description ;
    private String Benifits;
    private String hadBraces;

    public Den_patient() {

    }

    public Den_patient(String name, String address, String birthday, String phoneNumber, String healthCard, String description, String benifits, String hadBraces) {
        this.name = name;
        this.address = address;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.HealthCard = healthCard;
       this.Description = description;
        this.Benifits = benifits;
        this.hadBraces = hadBraces;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBirthday(String birthday) {
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

    public void setBenifits(String benifits) {
        Benifits = benifits;
    }

    public void setHadBraces(String hadBraces) {
        this.hadBraces = hadBraces;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getBirthday() {
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

    public String isBenifits() {
        return Benifits;
    }

    public String isHadBraces() {
        return hadBraces;
    }
}
