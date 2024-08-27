package Assignment_4;

import java.util.Random;
import java.util.Scanner;

public class Bai5_37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int score = 0;
        int incorrectAnswers = 0;

        while (incorrectAnswers < 3) {
            int numOfNumbers = random.nextInt(4) + 2;
            
            int[] numbers = new int[numOfNumbers];
            int correctAnswer = 0;
            
            for (int i = 0; i < numOfNumbers; i++) {
                numbers[i] = random.nextInt(10) + 1;
                correctAnswer += numbers[i];
                System.out.print(numbers[i]);
                if (i < numOfNumbers - 1) {
                    System.out.print(" + ");
                }
            }
            System.out.print(" = ");
            
            int userAnswer = scanner.nextInt();
            
            if (userAnswer == correctAnswer) {
                score++;
            } else {
                System.out.println("Wrong! The answer was " + correctAnswer);
                incorrectAnswers++;
            }
        }
        
        System.out.println("You earned " + score + " total points.");
    }
}