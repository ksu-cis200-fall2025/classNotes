import java.util.*;

public class Lab4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        int correct = r.nextInt(100) + 1;

        System.out.println("I'm thinking of a number...");

        int numGuesses = 0;
        int guess;
        do {
            System.out.print("Enter a guess: ");
            guess = s.nextInt();

            if (guess > correct) {
                System.out.println("Nope, too high");
            }
            else if (guess < correct) {
                System.out.println("Nope, too low");
            }

            numGuesses++;
        } while (numGuesses < 10 && guess != correct);

        if (guess == correct) {
            System.out.printf("Correct! It took you %d guesses.%n", numGuesses);
        }
        else {
            System.out.println("Out of time...you've used your 10 guesses.");
        }
    }
}