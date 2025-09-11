import java.util.*;

public class DiceGame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Random r = new Random();

        //first pass: repeatedly "roll" a dice and print
        //ask user if they want to go again

        char again;
        int score = 0;
        do {
            int roll = r.nextInt(6) + 1;
            System.out.printf("You rolled %d%n", roll);

            if (roll == 1) {
                score = 0;
                System.out.println("Your total is zeroed");
                break;
            }
            else {
                score += roll;
            
                System.out.printf("Total score is: %d%n", score);
                System.out.println();

                System.out.print("Do you want to go again? (y/n) ");
                again = s.nextLine().charAt(0);
            }
            
        } while (again == 'y');

        //print win/lose, final score
        System.out.printf("Your final score is: %d%n", score);
        if (score >= 20) {
            System.out.println("You win!");
        }
        else {
            System.out.println("You lose.");
        }



        //game goal: get to at least 20 points (higher is better)

        //user starts with 0 points
        //each time, user can choose to stop or roll (a 6-sided die)

        //game ends when either: they roll a 1, or
            //they choose to stop

        //if they roll a 1: game over, score = 0, they lose

        //if they stop with at least 20 points, they win

        //when game is over, print win/lose and score
    }
}