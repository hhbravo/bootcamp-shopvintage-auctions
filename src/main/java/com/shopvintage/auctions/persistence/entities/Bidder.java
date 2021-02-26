package com.shopvintage.auctions.persistence.entities;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class Bidder {
    private Integer id;
    @NotBlank(message = "El nombre no puede ser vacío")
    private String name;
    private String email;

    public Bidder(Integer id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Bidder() {

    }

    @Override
    public String toString() {
        return "Bidder{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
