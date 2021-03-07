package com.amfam.reskill.insuranceapp.insuranceapp;

import java.util.ArrayList;

public class Policy {
    //Policy variables
    private Integer id;
    private String policy;
    private String name;
    private Float premium;
    private ArrayList<Claim> claims;

    //Constructor
    public Policy(Integer id, String policy, String name, Float premium) {
        this.id = id;
        this.policy = policy;
        this.name = name;
        this.premium = premium;
        this.claims = new ArrayList<>();
    }

    //Property getters/setters
    public Integer getId() {
        return id;
    }
    
    public void setID(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPremium() {
        return premium;
    }

    public ArrayList<Claim> getClaims() {
        return claims;
    }

    public void setClaims(ArrayList<Claim> claims) {
        this.claims = claims;
    }
}
