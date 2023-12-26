import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        // Initialize random number generator
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;

        // Initialize variables
        int maxChances = 3;
        int currentChances = 0;
        int playerGuess;

        // Create scanner object to read player input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a random number between 1 and 100. Can you guess it?");

        while (currentChances < maxChances) {
            System.out.println("\nEnter your guess: ");
            playerGuess = scanner.nextInt();

            // Check if the player's guess is correct
            if (playerGuess == randomNumber) {
                System.out.println("Congratulations! You guessed the correct number!");
                break;
            } else if (playerGuess < randomNumber) {
                System.out.println("Your guess is too low.");
            } else {
                System.out.println("Your guess is too high.");
            }

            currentChances++;
        }

        if (currentChances == maxChances) {
            System.out.println("Sorry, you have used all your chances. The correct number was: " + randomNumber);
        }

        scanner.close();
    }
}
