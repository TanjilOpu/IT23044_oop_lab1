package mcq_quize_game;

import java.util.Scanner;

public class Mcq_quize_game {

    public static void main(String[] args) {
        System.out.println("Welcome to the Quiz Game!");
        System.out.println("If you want to play the game, press 1. Otherwise, press any other number to exit.");
        
        Scanner input = new Scanner(System.in);
        int score = 0;
        int choice = input.nextInt();
        input.nextLine(); // Consume the leftover newline character

        if (choice == 1) {
            System.out.println("Questions");

          
            System.out.println("Question 1: What is the capital of Bangladesh?");
            System.out.println("A. Barisal  B. Dhaka  C. Rangpur D. Noakhali");
            System.out.print("Your answer: ");
            String answer1 = input.nextLine().trim();
            if (answer1.equalsIgnoreCase("B")) {
                score += 5;
                System.out.println("Correct! +5 points.");
            } else {
                score -= 1;
                System.out.println("Wrong! -1 point.");
            }

         
            System.out.println("Question 2: What is the national fruit of Bangladesh");
            System.out.println("A. Apple  B.Banana  C. Jack-fruit  D.Mango");
            System.out.print("Your answer: ");
            String answer2 = input.nextLine().trim();
            if (answer2.equalsIgnoreCase("C")) {
                score += 5;
                System.out.println("Correct! +5 points.");
            } else {
                score -= 1;
                System.out.println("Wrong! -1 point.");
            }

           
            System.out.println("Question 3: What is the currency name of Bangladesh");
            System.out.println("A. Rupee B. Taka  C. Dollar  D. Pound");
            System.out.print("Your answer: ");
            String answer3 = input.nextLine().trim();
            if (answer3.equalsIgnoreCase("B")) {
                score += 5;
                System.out.println("Correct! +5 points.");
            } else {
                score -= 1;
                System.out.println("Wrong! -1 point.");
            }
          
            System.out.println("Question 4: Who is the national poet of Bangladesh");
            System.out.println("A.Sufia Kamal  B. Jibonannodo Das  C. Rabindranath Thakur  D. Kazi-Nazrul-Islam");
            System.out.print("Your answer: ");
            String answer4 = input.nextLine().trim();
            if (answer4.equalsIgnoreCase("D")) {
                score += 5;
                System.out.println("Correct! +5 points.");
            } else {
                score -= 1;
                System.out.println("Wrong! -1 point.");
            }
            
            System.out.println("Question 5: What is the national flower of Bangladesh ");
            System.out.println("A.Rose  B. Sunflower  C.Water lilies  D. Jasmine");
            System.out.print("Your answer: ");
            String answer5 = input.nextLine().trim();
            if (answer5.equalsIgnoreCase("C")) {
                score += 5;
                System.out.println("Correct! +5 points.");
            } else {
                score -= 1;
                System.out.println("Wrong! -1 point.");
            }

           
            System.out.println("Quiz Over! Your final score is: " + score);

        } else {
            System.out.println("Exiting the game. Goodbye!");
        }
    }
}
