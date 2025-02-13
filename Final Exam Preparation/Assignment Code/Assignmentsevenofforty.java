package javaapplication34;

import java.util.*;

public class Assignmentsevenofforty {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter coefficients a, b, and c");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = b * b - 4 * a * c;
        if (d < 0) {
            System.out.println("NO real roots");

        } else {
            double determinate = Math.sqrt(d);
            double x1 = (-b + determinate) / (2 * a);
            double x2 = (-b - determinate) / (2 * a);
            double result = Math.min(x1, x2);
            System.out.println("result =" + result);

        }

    }
    // input.close();
}
