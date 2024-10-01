package org.launchcode;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        //String to sort
        String hiddenFigures = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. " +
                "So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. " +
                "Once you’ve done that, it’s pretty straightforward from there.";

        char[] charactersInString = hiddenFigures.toCharArray();

        //Initialize HashMap
        HashMap<Character, Integer> sortedCharacters = new HashMap<>();

        //sort and print each character
        for (char character : charactersInString) {
            if (sortedCharacters.containsKey(character)) {
                sortedCharacters.put(character, sortedCharacters.get(character) + 1);
            } else {
                sortedCharacters.put(character, 1);
            }
        }
        for (Map.Entry<Character, Integer> pair : sortedCharacters.entrySet()){
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }
    }

}