package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Menu {

    //initiate variables
    private LocalDate lastUpdated;
    private List<MenuItem> MenuItems = new ArrayList<>();

    //constructor
    public Menu(LocalDate lastUpdated, List<MenuItem> MenuItems) {
        this.lastUpdated = lastUpdated;
        this.MenuItems = MenuItems;
    }

    //setters
    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setMenuItems(List<MenuItem> MenuItems) {
        this.MenuItems = MenuItems;
    }

    //getters
    public LocalDate getLastUpdated() {
        return this.lastUpdated;
    }

    public List<MenuItem> getMenuItems() {
        return this.MenuItems;
    }

    //add and remove menu items
    public void addMenuItem(MenuItem menuItem) {
        this.MenuItems.add(menuItem);
    }

    public void removeMenuItem(MenuItem menuItem) {
        this.MenuItems.remove(menuItem);
    }

    //override to add to menu and update last added
    @Override
    public String toString() {
        String output = "Today's Menu is\n";
        //loop through menu
        for(MenuItem item : this.MenuItems) {
            output += item + "\n";
        }
        //add last update
        output += "Last updated on: " + this.lastUpdated;
        return output;
    }
}

