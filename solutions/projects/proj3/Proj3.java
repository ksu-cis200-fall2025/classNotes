/**
 * This program calculates optimal change for a bill
 *
 * @author Julie Thornton
 * @version Project 3
 */

import java.util.*;

public class Proj3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        char again;
        do {
            System.out.print("Enter the total owed: $");
            double total = Double.parseDouble(s.nextLine());
            System.out.print("Enter the amount paid: $");
            double paid = Double.parseDouble(s.nextLine());

            //finish here
            double change = paid - total;

            //handle rounding issues
            System.out.printf("%nYour change is $%.2f, paid as:%n", change);

            int bills = (int)change;
            int coins = (int)(Math.round((change - bills)*100.0));

            int twenties = bills / 20;
            bills = bills % 20;
            int tens = bills / 10;
            bills = bills % 10;
            int fives = bills / 5;
            bills = bills % 5;

            if (twenties >= 1) {
                System.out.printf("\t%d twenty dollar bill", twenties);
                if (twenties > 1) {
                    System.out.printf("s");
                }
                System.out.println();
            }
            if (tens >= 1) {
                System.out.printf("\t%d ten dollar bill", tens);
                if (tens > 1) {
                    System.out.printf("s");
                }
                System.out.println();
            }
            if (fives >= 1) {
                System.out.printf("\t%d five dollar bill", fives);
                if (fives > 1) {
                    System.out.printf("s");
                }
                System.out.println();
            }
            if (bills >= 1) {
                System.out.printf("\t%d one dollar bill", bills);
                if (bills > 1) {
                    System.out.printf("s");
                }
                System.out.println();
            }
            
            int quarters = coins / 25;
            coins = coins % 25;
            int dimes = coins / 10;
            coins = coins % 10;
            int nickels = coins / 5;
            coins = coins % 5;

            if (quarters >= 1) {
                System.out.printf("\t%d quarter", quarters);
                if (quarters > 1) {
                    System.out.printf("s");
                }
                System.out.println();
            }
            if (dimes >= 1) {
                System.out.printf("\t%d dime", dimes);
                if (dimes > 1) {
                    System.out.printf("s");
                }
                System.out.println();
            }
            if (nickels >= 1) {
                System.out.printf("\t%d nickel", nickels);
                if (nickels > 1) {
                    System.out.printf("s");
                }
                System.out.println();
            }
            if (coins > 1) {
                System.out.printf("\t%d pennies%n", coins);
            }
            else if (coins == 1) {
                System.out.printf("\t%d penny%n", coins);
            }

            System.out.print("\nWould you like to go again? (y/n) ");
            again = s.nextLine().toLowerCase().charAt(0);
            System.out.println();

            if (again != 'y' && again != 'n') {
                System.out.println("Error - invalid input.");
            }
        } while (again != 'n');
    }
}