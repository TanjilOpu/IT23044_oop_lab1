
package calculatearea;
import java.util.Scanner;
                                 //Claculate the area of circle using two diffrent classes. 
                                 //Use setter and getter, constructor and private access modifier.

class CircleRadInContructor2 {
    private double radius;

                                      // Constructor
    public CircleRadInContructor2(double radius) {
        this.radius = radius;
    }

                                   // Setter method for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

                                  // Getter method for radius
    public double getRadius() {
        return this.radius;
    }

                                  // Method to compute area
    public double computeArea() {
        return Math.PI * radius * radius;
    }
}

public class CalculateArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

                                    
        System.out.print("Enter radius: ");
        double radius = input.nextDouble();

                                           // Create an object of CircleRadInContructor2
        CircleRadInContructor2 obj = new CircleRadInContructor2(radius);

        
        System.out.println("The area of the circle with radius " + obj.getRadius() + " is: " + obj.computeArea());
    }
}
