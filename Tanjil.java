
package tanjil;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Tanjil{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = 0;

        // Take player details
        System.out.print("Enter your name: ");
        String playerName = input.nextLine();

        // Ask for difficulty level
        String difficultyLevel = null;
        while (true) {
            System.out.println("Choose difficulty level: ");
            System.out.println("1. Easy");
            System.out.println("2. Medium");
            System.out.println("3. Hard");
            System.out.print("Enter 1, 2, or 3: ");
            int choice = input.nextInt();

            if (choice == 1) {
                difficultyLevel = "easy";
                break;
            } else if (choice == 2) {
                difficultyLevel = "medium";
                break;
            } else if (choice == 3) {
                difficultyLevel = "hard";
                break;
            } else {
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }

        // Load questions based on difficulty
        String fileName = "questions_" + difficultyLevel + ".txt";
        File questionFile = new File(fileName);

        if (!questionFile.exists()) {
            System.out.println("No questions found for the selected difficulty level.");
            return;
        }

        try (Scanner fileScanner = new Scanner(questionFile)) {
            System.out.println("Welcome to the Math Puzzle, " + playerName + "!");
            System.out.println("Answer the following questions:");

            // Read and process questions
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(" ");
                if (parts.length != 3) {
                    System.out.println("Skipping invalid question format: " + line);
                    continue;
                }

                int num1, num2, correctAnswer = 0;
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
                    correctAnswer = num1 + num2;
                } else if (operator.equals("-")) {
                    correctAnswer = num1 - num2;
                } else if (operator.equals("*")) {
                    correctAnswer = num1 * num2;
                } else if (operator.equals("/")) {
                    if (num2 == 0) {
                        System.out.println("Skipping division by zero in question: " + line);
                        continue;
                    }
                    correctAnswer = num1 / num2;
                } else {
                    System.out.println("Skipping invalid operator in question: " + line);
                    continue;
                }

                // Ask the user for their answer
                System.out.print(num1 + " " + operator + " " + num2 + " = ");
                int userAnswer = input.nextInt();

                // Check the answer
                if (userAnswer == correctAnswer) {
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("Wrong! The correct answer is: " + correctAnswer);
                }
            }

            // Save the player's score
            saveScore(playerName, difficultyLevel, score);

            // Display final score
            System.out.println("Game over! Your final score is: " + score);

        } catch (IOException e) {
            System.out.println("An error occurred while processing the file: " + e.getMessage());
        }
    }

    private static void saveScore(String playerName, String difficultyLevel, int score) {
        try (FileWriter writer = new FileWriter("scores.txt", true)) {
            writer.write(playerName + " (" + difficultyLevel + "): " + score + "\n");
        } catch (IOException e) {
            System.out.println("An error occurred while saving the score: " + e.getMessage());
        }
    }
}

