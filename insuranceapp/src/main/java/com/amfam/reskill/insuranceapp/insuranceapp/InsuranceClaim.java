package com.amfam.reskill.insuranceapp.insuranceapp;

public class InsuranceClaim {
    //Private claim variables
    private Integer id;
    private String claim;
    private Boolean paid;
    private Double amount;

    //Constructor
    public InsuranceClaim(Integer id, String claim, Boolean paid, Double amount) {
        this.id = id;
        this.claim = claim;
        this.paid = paid;
        this.amount = amount;
    }

    //Property getters/setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
    
}
