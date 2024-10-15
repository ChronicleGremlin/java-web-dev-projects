package org.launchcode;

public class MenuItem {

    //initialize
    private String itemName;
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    //constructor
    public MenuItem(String itemName, double price, String description, String category, boolean isNew) {
        this.itemName = itemName;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = true;
    }


    //setters
    public void setName(String itemName) {
        this.itemName = itemName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setIsNew(boolean isNew) {
        this.isNew = isNew;
    }


    //getters
    public String getName() {
        return itemName;
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

    public boolean getIsNew() {
        return isNew;
    }

    //override to print menu
    @Override
    public String toString() {
        return (this.isNew ? "NEW! - " : "") +
                this.itemName + " - " +
                this.description + " - " +
                this.category + " - " +
                this.price;
    }

    @Override
    public boolean equals(Object toBeCompared) {
        if (this == toBeCompared) {
            return true;
        }
        if (toBeCompared == null || this.getClass() != toBeCompared.getClass()) {
            return false;
        }

        MenuItem item = (MenuItem) toBeCompared;
        return this.itemName.equals(itemName);
    }
}

