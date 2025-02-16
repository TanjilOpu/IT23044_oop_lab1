
package javaapplication34;


public class Assignment33 {


    // Main method to test findExtreme
    public static void main(String[] args) {
        int x = findExtreme("smallest", 5, 2, 9, 2,3,6,9,0);
        int y = findExtreme("largest", 8, 3, 10, 4,10,100,1000);

        System.out.println("Smallest number: " + x); // Expected Output: 1
        System.out.println("Largest number: " + y);  // Expected Output: 10
    }
    
    // Function to find the smallest or largest number
    public static int findExtreme(String type, int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("At least one number must be provided");
        }

        int result = numbers[0]; // Initialize with the first number

        for (int num : numbers) {
            if (type.equalsIgnoreCase("smallest") && num < result) {
                result = num;
            } else if (type.equalsIgnoreCase("largest") && num > result) {
                result = num;
            }
        }

        return result;
    }
}

