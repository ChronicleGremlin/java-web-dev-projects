package studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double radius;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a radius: ");
        radius = input.nextDouble();

        System.out.println("The area of a circle of raduis is " + radius + "is: " + Circle.getArea(radius));
    }
}
