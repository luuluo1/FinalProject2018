package com.example.oliver.finalproject2018.dummy;

import java.util.Date;

/**
 * Created by oliver on 4/11/2018.
 */

public class Opt_patient extends Patient{


    private String glassesBought;
    private String glassesStore;

    public Opt_patient() {

    }

    public Opt_patient(String glassesBought, String glassesStore) {

        this.glassesBought = glassesBought;
        this.glassesStore = glassesStore;
    }

    public void setGlassesBought(String glassesBought) {
        this.glassesBought = glassesBought;
    }

    public void setGlassesStore(String glassesStore) {
        this.glassesStore = glassesStore;
    }

    public String getGlassesBought() {
        return glassesBought;
    }

    public String getGlassesStore() {
        return glassesStore;
    }
}
