
package factorionnumbermain;
import java.util.*;
class Factorial {
    
    public static int calculateFactorial(int rem) { // this class for calculating factorial
        int fact = 1;                                // of single digit of the original number
        for (int i = 2; i <= rem; i++) {
            fact *= i;
        }
        return fact;
    }
}


class FactorionNumbercheck {
    
    public static boolean isFactorion(int number) {  //this class check that if the number is factorial or not
        int originalNumber = number;
        int sum = 0;

        while (number > 0) {
            int rem = number % 10;
            sum += Factorial.calculateFactorial(rem); 
            number /= 10;
        }

        return sum == originalNumber;
    }
}

public class FactorionNumberMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

      
        System.out.print("Enter the lower range of the range: ");
        int lowerRange = input.nextInt();

        System.out.print("Enter the upper range of the range: ");
        int upperRange = input.nextInt();

        System.out.println("Factorion numbers in the range of " + lowerRange + " to " +upperRange+"  :");
        boolean found = false;

      
        for (int i = lowerRange; i <= upperRange; i++) {
            if (FactorionNumbercheck.isFactorion(i)) {
                System.out.println(i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No factorion numbers found in the given range.");
        }
    }
}
