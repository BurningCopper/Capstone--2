package com.amfam.reskill.insuranceapp.insuranceapp;

public class InsuranceClaim {
    //Private claim variables
    private Integer id;
    private String claim;
    private Boolean paid;
    private Double premium;

    //Constructor
    public InsuranceClaim(Integer id, String claim, Boolean paid, Double premium) {
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

    public Double getPremium() {
        return premium;
    }

    public void setPremium(Double premium) {
        this.premium = premium;
    }
    
}
