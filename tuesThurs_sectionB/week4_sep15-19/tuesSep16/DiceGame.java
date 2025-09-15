import java.util.*;

public class DiceGame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        char again;
        int total = 0;
        do {
            //roll a dice
            int roll = r.nextInt(6) + 1;
            System.out.printf("You rolled %d%n", roll);

            //did they roll a 1?
            if (roll == 1) {
                total = 0;
                System.out.println("Total is zeroed, game over.");
                break;
            }
            else {
                total = total + roll;
            }
            
            System.out.printf("Your current total is %d%n", total);

            //add it to total, update stuff
            //do they want to go again?
            System.out.print("Do you want to roll again? (y/n) ");
            again = (s.nextLine().toLowerCase()).charAt(0);

        } while (again == 'y');

        //print end of game stuff
        if (total >= 20) {
            System.out.printf("Total: %d points. You win!%n", total);
        }
        else {
            System.out.printf("Total: %d points. You lose.%n", total);
        }

        //game goal: get to at least 20 points 
        // (higher is better)

        //user starts with 0 points
        //each time, user can choose to stop or roll 
        // (a 6-sided die)

        //game ends when either: they roll a 1, or
            //they choose to stop

        //if they roll a 1: game over, score = 0

        //when game is over, print win/lose and score
    }
}