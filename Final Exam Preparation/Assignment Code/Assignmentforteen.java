package javaapplication34;

import java.util.*;
import java.math.BigInteger;

public class Assignmentforteen {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number  " );
        int n = input.nextInt();
        BigInteger fact = factorial(n);
        System.out.println("Factorial of " + n + "is :  " + fact);
    }

    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

}
