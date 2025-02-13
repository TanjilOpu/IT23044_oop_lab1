
package javaapplication34;
improt java.io.*;
import java.util.*;


public class Assingnment1of40 {
    public static void main(String[] args) {
                try (Scanner scanner = new Scanner(new File("input.txt"));
             PrintWriter writer = new PrintWriter(new File("output.txt"))) {

            // Read the input file
            String line = scanner.nextLine();
            String[] numbers = line.split(",\\s*"); // Split numbers by commas and optional spaces

            // Convert numbers to integers and find the highest number
            int highestNumber = Integer.MIN_VALUE;
                    System.out.println("highest number"+highestNumber);
            for (String numStr : numbers) {
                int num = Integer.parseInt(numStr.trim());
                if (num > highestNumber) {
                    highestNumber = num;
                }
            }

            // Calculate the sum of natural numbers up to the highest number
            long sum = (long) highestNumber * (highestNumber + 1) / 2;

            // Write the highest number and its sum to the output file
            writer.println(highestNumber + ", " + sum);

            System.out.println("Operation completed successfully!");
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (IOException e) {
            System.out.println("Error: An I/O error occurred.");
        }
        
    }

   
    
}
