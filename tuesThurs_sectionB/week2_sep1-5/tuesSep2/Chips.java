import java.util.*;

public class Chips {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /*
        bags of chips are buy one get one free at the store.
        Full price is $5.99 each.

        Customers are limited to 10 bags total.

        (is there any other input that would be invalid?)
        */

        System.out.print("Enter number of bags: ");
        int bags = s.nextInt();

        if (bags >= 0 && bags <= 10) {
            int groupsOfTwo = bags/2;
            int leftover = bags % 2;

            double price = (groupsOfTwo + leftover) * 5.99;  
            System.out.printf("Price: $%.2f%n", price); 
        }
        else {
            System.out.println("Input should be between 0 and 10");
        }
    }
}