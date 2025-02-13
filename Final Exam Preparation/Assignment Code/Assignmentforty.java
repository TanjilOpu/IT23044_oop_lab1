
package javaapplication34;

public class Assignmentforty {

public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Error: Please provide two integer arguments.");
            return;
        }

        try {      
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            
            System.out.println("Sum: " + (num1 + num2));
            System.out.println("Difference: " + (num1 - num2));
            System.out.println("Product: " + (num1 * num2));
            
            if (num2 != 0) {
                System.out.println("Quotient: " + (num1 / num2));
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter valid integers.");
        }
    }
}
