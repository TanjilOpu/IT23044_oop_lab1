
package javaapplication34;


import java.util.Random;

public class CustomRandomGenerator {
    
    // Generates n random numbers using timestamp and modulo operation
    public static int[] myRand(int n) {
        int[] randomNumbers = new int[n];
        long timestamp = System.currentTimeMillis();
        Random rand = new Random(timestamp); // Seed based on timestamp
        
        for (int i = 0; i < n; i++) {
            randomNumbers[i] = Math.abs(rand.nextInt()) % 1000; // Random number in range [0, 999]
        }
        return randomNumbers;
    }

    // Overloaded method: Generates a single random number
    public static int myRand() {
        long timestamp = System.nanoTime(); // More precise timestamp
        return (int) (timestamp % 1000); // Random number in range [0, 999]
    }

    // Overloaded method: Generates n random numbers using a given array
    public static int[] myRand(int n, int[] arr) {
        int[] randomNumbers = new int[n];
        long timestamp = System.currentTimeMillis();
        Random rand = new Random(timestamp);
        
        for (int i = 0; i < n; i++) {
            int index = rand.nextInt(arr.length); // Pick a random index
            randomNumbers[i] = arr[index] % 1000; // Use modulo for randomness
        }
        return randomNumbers;
    }

    // Main method to test the CustomRandomGenerator
    public static void main(String[] args) {
        System.out.println("Generating 5 random numbers:");
        int[] nums1 = myRand(5);
        for (int num : nums1) {
            System.out.print(num + " ");
        }

        System.out.println("\nGenerating a single random number:");
        System.out.println(myRand());

        System.out.println("Generating 5 random numbers from a given array:");
        int[] sampleArray = {1234, 5678, 91011, 1415, 1617};
        int[] nums2 = myRand(5, sampleArray);
        for (int num : nums2) {
            System.out.print(num + " ");
        }
    }
}

