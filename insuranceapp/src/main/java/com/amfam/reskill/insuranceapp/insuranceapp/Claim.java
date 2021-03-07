package com.amfam.reskill.insuranceapp.insuranceapp;

public class Claim {
    //Private claim variables
    private Integer id;
    private String claim;
    private Boolean paid;
    private Float premium;

    //Constructor
    public Claim(Integer id, String claim, Boolean paid, Float premium) {
        this.id = id;
        this.claim = claim;
        this.paid = paid;
        this.premium = premium;
    }

    //Property getters/setters
    public Integer getID() {
        return id;
    }

    public void setID(Integer id) {
        this.id = id;
    }

    public String getClaim() {
        return claim;
    }

    public void setID(String claim) {
        this.claim = claim;
    }

    public Boolean getPaid() {
        return paid;
    }

    public void setPaid(Boolean paid) {
        this.paid = paid;
    }

    public Float getPremium() {
        return premium;
    }

    public void setPremium(Float paid) {
        this.premium = premium;
    }
    
}
