package org.launchcode;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MenuItem dish = new MenuItem("Apple", 2.99, "Farmers pick", "Appetizer");
        MenuItem dishTwo = new MenuItem("Chicken Tacos", 8.99, "Loaded with cheese, lettuces and tomatoes", "main course");

        //check menu
        System.out.println(dish);
    }
}
