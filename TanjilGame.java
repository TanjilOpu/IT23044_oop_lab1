package tanjilgame;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TanjilGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // User input scanner
        int score = 0;

        try {
            // Load the game file
            File file = new File("tanjilgame.txt");
            if (!file.exists()) {
                System.out.println("Error: The file 'tanjilgame.txt' does not exist.");
                return;
            }

            Scanner fileScanner = new Scanner(file); // Scanner to read the file
            System.out.println("Welcome to the Math Game!");
            System.out.println("Answer the questions to earn points!");

            // Process each question
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(" ");

                // Ensure valid input format
                if (parts.length < 3) {
                    System.out.println("Skipping invalid question format: " + line);
                    continue;
                }

                int num1, num2, correct = 0;
                String operator;

                try {
                    // Parse numbers and operator
                    num1 = Integer.parseInt(parts[0]);
                    operator = parts[1];
                    num2 = Integer.parseInt(parts[2]);
                } catch (NumberFormatException e) {
                    System.out.println("Skipping invalid numbers in question: " + line);
                    continue;
                }

                // Calculate the correct answer
                if (operator.equals("+")) {
                    correct = num1 + num2;
                } else if (operator.equals("-")) {
                    correct = num1 - num2;
                } else {
                    System.out.println("Invalid operator in question: " + line);
                    continue;
                }

                // Prompt the user for their answer
                System.out.print(num1 + " " + operator + " " + num2 + " = ");
                int userAnswer = input.nextInt();

                // Check the user's answer
                if (userAnswer == correct) {
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("Wrong! The correct answer is: " + correct);
                }
            }

            fileScanner.close(); // Close the file scanner

            // Display the final score
            System.out.println("Game over! Your final score is: " + score);

        } catch (FileNotFoundException e) {
            System.out.println("Error: The file 'tanjilgame.txt' was not found.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            input.close(); // Close the user input scanner
        }
    }
}
