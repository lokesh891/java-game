import java.util.Random;
import java.util.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Game setup
        int rangeMin = 1;
        int rangeMax = 100; // You can set it to 1000 as needed.
        int randomNumber = random.nextInt(rangeMax - rangeMin + 1) + rangeMin;
        int maxAttempts = 10; // You can change the number of allowed attempts.
        int attemptsLeft = maxAttempts;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Try to guess the number between " + rangeMin + " and " + rangeMax + ".");
        System.out.println("You have " + maxAttempts + " attempts. Good luck!");

        boolean hasWon = false;

        while (attemptsLeft > 0) {
            System.out.println("\nYou have " + attemptsLeft + " attempts remaining.");
            System.out.print("Enter your guess: ");
            int playerGuess = scanner.nextInt();
            attemptsLeft--;

            if (playerGuess == randomNumber) {
                System.out.println("Congratulations! You guessed the correct number!");
                hasWon = true;
                break;
            } else if (playerGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        if (!hasWon) {
            System.out.println("\nYou've used all your attempts. The correct number was: " + randomNumber);
            System.out.println("Better luck next time!");
        }

        scanner.close();
    }
}


