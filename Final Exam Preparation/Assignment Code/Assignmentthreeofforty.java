package javaapplication34;

import java.util.*;

public class Assignmentthreeofforty {

   

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the range's loest value:");
        int lowest = input.nextInt();

        System.out.println("Enter the range's highest value:");
        int highest = input.nextInt();

        System.out.println("Factorion numbers in the range are:");
        find(lowest, highest);

    }
   

    public static void find(int lowest, int highest) {
        for (int n = lowest; n <= highest; n++) {
            int sum = 0;
            int number = n;

            while (number > 0) {
                int r = number % 10;
                sum += factorial(r);
                number /= 10;
            }

            if (sum == n) {
                System.out.print(n);
                System.out.print(" ");
            }
        }
        System.out.println("");

    }
      public static int factorial(int r) {
        if (r == 0) {
            return 1;
        }
        int factorialSum = 1;
        while (r > 1) {
            factorialSum *= r;
            r--;
        }
        return factorialSum;
    }
}
