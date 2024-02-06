package com.noseblind.model;

import org.springframework.data.annotation.Id;

import java.math.BigDecimal;

public class Perfume {
    @Id
    private int id;
    private String name;
    private BigDecimal price;
    private String description;

    public Perfume (String name, BigDecimal price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public BigDecimal getPrice () {
        return price;
    }

    public void setPrice (BigDecimal price) {
        this.price = price;
    }

    public String getDescription () {
        return description;
    }

    public void setDescription (String description) {
        this.description = description;
    }
}
