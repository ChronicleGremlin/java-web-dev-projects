package org.launchcode;
import java.util.Scanner;

public class NumericTypesArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, please enter length of the rectangle");
        Double rectangleLength = input.nextDouble();

        System.out.println("Hello, please enter width of the rectangle");
        Double rectangleWidth = input.nextDouble();

        double rectangleArea = rectangleLength * rectangleWidth;
        System.out.println("The area of the rectangle is" + rectangleArea);
    }
}
