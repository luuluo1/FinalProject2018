package com.example.oliver.finalproject2018.dummy;

import java.util.Date;

/**
 * Created by oliver on 4/11/2018.
 */

public class Opt_patient extends Patient{


    private Date glassesBought;
    private String glassesStore;

    public Opt_patient() {

    }

    public Opt_patient(Date glassesBought, String glassesStore) {

        this.glassesBought = glassesBought;
        this.glassesStore = glassesStore;
    }

    public void setGlassesBought(Date glassesBought) {
        this.glassesBought = glassesBought;
    }

    public void setGlassesStore(String glassesStore) {
        this.glassesStore = glassesStore;
    }

    public Date getGlassesBought() {
        return glassesBought;
    }

    public String getGlassesStore() {
        return glassesStore;
    }
}
