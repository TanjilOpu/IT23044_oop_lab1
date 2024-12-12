package fiveclass;

import java.util.Scanner;

public class FiveClass {

    public static void main(String[] args) {
        System.out.println("Sum class ");
        operation obj = new operation();

        double sum = obj.calculatesum();
        System.out.println("Calculated sum = " + sum);
        System.out.println("Calculating GCD and LCM ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number a ");
       int a = input.nextInt();
        System.out.print("Enter number b which will be greater than a ");

       int b = input.nextInt();

      int gcd = obj.calculategcd(a,b);
         System.out.println("GCD of"+a+"and"+b+"is "+gcd);
         System.out.println("Calculationg LCM ");
         int lcm = obj.calculatelcm(a,b);
         System.out.println("GCD of "+a+" and "+b+" is "+lcm);
         

    }

}

class operation {

    public double calculatesum() {
        double res = 1 + 0.9 + 0.8 + 0.7 + 0.6 + 0.5 + 0.4 + 0.3 + 0.2 + 0.1;
        return res;
    }

    public int calculategcd(int a,int b) {
         while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
         }
         return a;
       
    }
    public int calculatelcm(int a,int b){
        return (a*b)/calculategcd(a,b);
    }
}


