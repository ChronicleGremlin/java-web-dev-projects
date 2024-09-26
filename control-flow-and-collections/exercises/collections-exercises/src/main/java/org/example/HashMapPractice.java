package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {

    public static void main(String[] args) {

        //setting up HashMap
        HashMap<Integer, String> roster = new HashMap<>();

        //Getting user information for HashMap
        Scanner scanner = new Scanner(System.in);
        int idNumber;

        System.out.println("Please enter your ID Number! When done enter -1");

        do {
            System.out.print("ID Number: ");
            idNumber = scanner.nextInt();
            scanner.nextLine();

            if (idNumber != -1) {
                System.out.print("Name: ");
                String name = scanner.nextLine();
                roster.put(idNumber, name);
            }
        } while (idNumber != -1);

        for (Map.Entry<Integer, String> student : roster.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
        }

    }
}
