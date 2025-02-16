package javaapplication34;

import java.io.*;
import java.util.*;

public class Assignment29 {  
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("input.txt"));
             PrintWriter writer = new PrintWriter(new File("output.txt"))) {

           
            if (!scanner.hasNextLine()) {
                System.out.println("Error: Input file is empty.");
                return;
            }
            String line = scanner.nextLine().trim();
            if (line.isEmpty()) {
                System.out.println("Error: Input file contains only whitespace.");
                return;
            }
            String[] numbers = line.split(",\\s*"); // Split numbers by commas and optional spaces

            // Convert numbers to integers and find the highest number
            int highestNumber = Integer.MIN_VALUE;

            for (String numStr : numbers) {
                int num = Integer.parseInt(numStr.trim());
                if (num > highestNumber) {
                    highestNumber = num;
                }
            }
            // Calculate the sum of natural numbers up to the highest number
            long sum = (long) highestNumber * (highestNumber + 1) / 2;

            // Write the highest number and its sum to the output file
            writer.println("highest number = "+  highestNumber + "\nsum = " + sum);

            System.out.println("Operation successfull");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number formate");
        }
    }
}
