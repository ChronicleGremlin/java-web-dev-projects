package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {

    //initializing ArrayList && variables
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private LocalDate recentUpdate;

    //adding MenuItems to list
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }


}
