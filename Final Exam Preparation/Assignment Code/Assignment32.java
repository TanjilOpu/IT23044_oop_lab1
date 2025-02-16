package javaapplication34;

// Define CounterClass
class CounterClass {

    private static int instanceCount = 0; // Static variable to track the count

    // Constructor increments the instance count
    public CounterClass() {
        instanceCount++; // Increment count first
        if (instanceCount > 50) {
            instanceCount = 0 ;// Reset to 1 instead of 0, so counting continues correctly
        }
    }

    // Method to get the current instance count
    public static int getInstanceCount() {
        return instanceCount;
    }
}

// Main class to test CounterClass
public class Assignment32 {

    public static void main(String[] args) {
        // Loop to create 55 objects
        for (int i = 1; i <= 55; i++) {
            new CounterClass(); // Correct object creation
            System.out.println("Object " + i + " created. Instance count: " + CounterClass.getInstanceCount());
        }
    }
}
