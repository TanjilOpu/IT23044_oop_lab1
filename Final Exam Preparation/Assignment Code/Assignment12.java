
package javaapplication34;


// Base class providing a method to print results
class BaseClass {
    void printResult(String result) {
        System.out.println(result);
    }
}

// Class to compute sum of series: 1 + 0.9 + 0.8 + ... + 0.1
class SumClass extends BaseClass {
    double computeSum() {
        double sum = 0;
        for (double i = 1.0; i >= 0.1; i -= 0.1) {
            sum += i;
        }
        return sum;
    }
}

// Class to find GCD and LCM of two numbers
class DivisorMultipleClass extends BaseClass {
    int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }
    
    int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}

// Class to convert numbers between Binary, Decimal, Hexadecimal, and Octal
class NumberConversionClass extends BaseClass {
    String toBinary(int num) {
        return Integer.toBinaryString(num);
    }
    
    String toHex(int num) {
        return Integer.toHexString(num);
    }
    
    String toOctal(int num) {
        return Integer.toOctalString(num);
    }
}

// Custom printing class for formatted printing
class CustomPrintClass extends BaseClass {
    void pr(String message) {
        System.out.println("*** " + message + " ***");
    }
}

// Main class to execute all methods
public class Assignment12 {
    public static void main(String[] args) {
        SumClass sumObj = new SumClass();
        double sumResult = sumObj.computeSum();
        sumObj.printResult("Sum of series: " + sumResult);

        DivisorMultipleClass gcdLcmObj = new DivisorMultipleClass();
        int num1 = 24, num2 = 36;
        int gcd = gcdLcmObj.gcd(num1, num2);
        int lcm = gcdLcmObj.lcm(num1, num2);
        gcdLcmObj.printResult("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        gcdLcmObj.printResult("LCM of " + num1 + " and " + num2 + " is: " + lcm);

        NumberConversionClass converter = new NumberConversionClass();
        int number = 29;
        converter.printResult("Binary of " + number + " is: " + converter.toBinary(number));
        converter.printResult("Hexadecimal of " + number + " is: " + converter.toHex(number));
        converter.printResult("Octal of " + number + " is: " + converter.toOctal(number));

        CustomPrintClass customPrint = new CustomPrintClass();
        customPrint.pr("Program Execution Completed");
    }
}
