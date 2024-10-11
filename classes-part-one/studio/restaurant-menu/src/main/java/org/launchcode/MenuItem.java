package org.launchcode;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class MenuItem {

    //initializing variables
    private String name;
    private double price;
    private String description;
    private String category;
    private final LocalDate dateAdded;

    //constructor
    public MenuItem(String name, double price, String description, String category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.dateAdded = LocalDate.now();
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice (double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    //getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }


    //Checks if item is new
    boolean isNew() {
        LocalDate today = LocalDate.now();
        double daysSinceAdded = dateAdded.until(today, ChronoUnit.DAYS);
        return daysSinceAdded < 2;
    }

    //adds New if new to menu
    @Override
    public String toString() {
        String newText = isNew() ? " - New" : "";
        return name + newText + "\n" + description + " | $" + price;

    }

}
