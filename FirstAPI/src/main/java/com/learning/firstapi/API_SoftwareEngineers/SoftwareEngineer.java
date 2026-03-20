package com.learning.firstapi.API_SoftwareEngineers;

import java.util.Objects;

public class SoftwareEngineer {
    private Integer id;
    private String name;
    private String email;
    private String techStake;

    public SoftwareEngineer(Integer id, String name, String email, String techStake) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.techStake = techStake;
    }
//setters

    public void setId(Integer id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setTechStake(String techStake) {this.techStake = techStake;}

//getters

    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getTechStake() {return techStake;}


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SoftwareEngineer that = (SoftwareEngineer) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(email, that.email) && Objects.equals(techStake, that.techStake);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, techStake);
    }
}
