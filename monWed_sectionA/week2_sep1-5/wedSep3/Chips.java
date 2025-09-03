import java.util.*;

public class Chips {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter number of bags: ");
        int bags = s.nextInt();

        //is bags between 0-10?
        if (bags >= 0 && bags <= 10) {
            //price calculation

            //double price = ((bags - (bags%2))/2) * 5.99;
            double price = (bags/2) * 5.99 + (bags%2) * 5.99;

            System.out.printf("Total price: $%.2f%n", price);
        }
        else {
            System.out.println("Error: input must be 0-10");
        }

        /*
        bags of chips are buy one get one free at the store.
        Full price is $5.99 each.

        Customers are limited to 10 bags total.

        (is there any other input that would be invalid? < 0)
        */
    }
}