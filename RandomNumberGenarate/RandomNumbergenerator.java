
package random;

import java.util.Random;

public class RandomNumberG {

    // Static method to generate a random integer between min and max
    public static int generateRandom(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    // Static method to generate a random double between min and max
    public static double generateRandom(double min, double max) {
        Random random = new Random();
        return min + (max - min) * random.nextDouble();
    }

    // Static method to generate a random float between min and max
    public static float generateRandom(float min, float max) {
        Random random = new Random();
        return min + (max - min) * random.nextFloat();
    }

    // Static method to generate a random number of mixed types: Integer, Double, or Float
    public static Object generateRandom(String type, double min, double max) {
        Random random = new Random();
        switch (type.toLowerCase()) {
            case "integer":
                return generateRandom((int) min, (int) max);  // Cast min and max to int for integer type
            case "double":
                return generateRandom(min, max);  // Double type
            case "float":
                return generateRandom((float) min, (float) max);  // Cast min and max to float for float type
            default:
                return null;  // If the type is unrecognized
        }
    }

    // Main method to test the random number generation
    public static void main(String[] args) {
        // Generating random integer between 1 and 100
        int randomInt = RandomNumberG.generateRandom(1, 100);
        System.out.println("Random Integer: " + randomInt);

        // Generating random double between 1.5 and 10.5
        double randomDouble =  RandomNumberG.generateRandom(1.5, 10.5);
        System.out.println("Random Double: " + randomDouble);

        // Generating random float between 1.5 and 10.5
        float randomFloat =  RandomNumberG.generateRandom(1.5f, 10.5f);
        System.out.println("Random Float: " + randomFloat);

        // Generating a random mixed type integer between 1.0 and 100.0
        Object randomMixedInt =  RandomNumberG.generateRandom("integer", 1.0, 100.0);
        System.out.println("Random Mixed Integer: " + randomMixedInt);

        // Generating a random mixed type float between 1.0 and 100.0
        Object randomMixedFloat =  RandomNumberG.generateRandom("float", 1.0, 100.0);
        System.out.println("Random Mixed Float: " + randomMixedFloat);

        // Generating a random mixed type double between 1.0 and 100.0
        Object randomMixedDouble =  RandomNumberG.generateRandom("double", 1.0, 100.0);
        System.out.println("Random Mixed Double: " + randomMixedDouble);
    }
}
