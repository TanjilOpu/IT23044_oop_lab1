
package javaapplication34;
import java.util.*;

// Custom exception for invalid radius
class InvalidRadiusException extends Exception {
    public InvalidRadiusException(String message) {
        super(message);
    }
}

// Circle class
class Circle {
    private double radius;

    // Method to set radius, throws an exception if negative
    public void setRadius(double radius) throws InvalidRadiusException {
        if (radius < 0) {
            throw new InvalidRadiusException("Radius cannot be negative!");
        }
        this.radius = radius;
    }

    // Method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Main class to test exception handling
public class Assignment25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Circle circle = new Circle();
        try {
            System.out.println("Enter the radius");
            int r=input.nextInt();
            circle.setRadius(r); // This will trigger the exception
            double area = circle.calculateArea();
            System.out.println("Area of the Circle: " + area);
        } catch (InvalidRadiusException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        } finally {
            System.out.println("Program Execution Completed.");
        }
    }
}
