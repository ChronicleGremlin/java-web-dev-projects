package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {

    public static void main(String[] args){
       System.out.println(findEvens());

       System.out.println("PUT A NUMBER IN FOR THE WORDS!!");
       Scanner scanner = new Scanner(System.in);
       int userInputNumber = scanner.nextInt();
       checkAgainstUserNumber(userInputNumber);

    }

    public static int findEvens() {

        //declare total variable
        int total = 0;

        //create and populate ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(6);
        numbers.add(1);
        numbers.add(8);
        numbers.add(1);
        numbers.add(4);
        numbers.add(9);
        numbers.add(1);
        numbers.add(3);

        //calculate even sum
        for (int integer : numbers) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }

        return total;
    }

    public static void checkAgainstUserNumber(int numLetters) {

        //create ArrayList
        ArrayList<String> wordBank = new ArrayList<>(Arrays.asList("Hello", "World", "Hi", "Yellow", "Eat", "The", "Dog", "Cat", "Bread"));

        //iteration and test
        for (String word: wordBank) {
            if (word.length() == numLetters) {
                System.out.println(word);
            }
        }
    }
}

