package com.example.project2_revised;

public class Product {

    private String name;
    private String description;
    private int imageResource;
    private double price;

    public Product(String name, String description, int imageResource, double price) {
        this.name = name;
        this.description = description;
        this.imageResource = imageResource;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResource;
    }

    public double getPrice() {
        return price;
    }
}
