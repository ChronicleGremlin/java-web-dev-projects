package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
        CD panicAtTheDisco = new CD(700, 14, "200 - 500");
        DVD megaMind = new DVD(4707, 7, "570 - 1600");

        // TODO: Call each CD and DVD method to verify that they work as expected.

        panicAtTheDisco.spinDisk();
        megaMind.spinDisk();
    }
}