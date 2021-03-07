package com.amfam.reskill.insuranceapp.insuranceapp;

import java.util.ArrayList;

public class InsurancePolicy {
    //InsurancePolicy variables
    private Integer id;
    // private String policy;
    private String name;
    private Double premium;
    private ArrayList<InsuranceClaim> claims;

    //Constructor
    public InsurancePolicy(Integer id, String policy, String name, Double premium) {
        this.id = id;
        // this.policy = policy;
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

    public Double getPremium() {
        return premium;
    }

    public ArrayList<InsuranceClaim> getClaims() {
        return claims;
    }

    public void setClaims(ArrayList<InsuranceClaim> claims) {
        this.claims = claims;
    }
}
