/**
 * This program calculates the cost of attending a concert.
 *
 * @author Julie Thornton
 * @version Project 1
 */

import java.util.*;

public class Proj1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.printf("This program calculates the total price for a concert.%n%n");
        System.out.println("It makes the following assumptions:");
        System.out.printf("\tAdult ticket cost: $59.99 each%n");
        System.out.printf("\tChild ticket cost: $39.99 each%n");
        System.out.printf("\tT-shirt cost: $14.99 each%n");
        System.out.printf("\tSales tax rate: 9.5%%%n%n");

        System.out.print("Enter number of adult tickets: ");
        int adult = s.nextInt();
        System.out.print("Enter number of child tickets: ");
        int child = s.nextInt();

        double ticketCost = 59.99*adult + 39.99*child;
        double shirtCost = 14.99*(adult + child);
        double beforeTax = ticketCost + shirtCost;
        double afterTax = beforeTax + 0.095*beforeTax;

        System.out.println();
        System.out.printf("Total ticket cost: $%.2f%n", ticketCost);
        System.out.printf("Total shirt cost: $%.2f%n", shirtCost);
        System.out.printf("Overall cost before tax: $%.2f%n", beforeTax);
        System.out.printf("Overall cost after tax: $%.2f%n", afterTax);
    }
}