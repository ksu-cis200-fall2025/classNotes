import java.util.*;

public class Pizza {
    public static void main(String[] args) {
        /*
        Example: pizzas have 8 slices. 
        Get #pizzas, #people. 

        Print how many slices everyone can have, how many are leftover.
        */

        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter number of pizzas: ");
        int pizzas = s.nextInt();

        System.out.print("Enter number of people: ");
        int people = s.nextInt();

        int totalSlices = pizzas * 8;
        int serving = totalSlices / people;
        int leftover = totalSlices % people;

        //Everyone% gets 4 slices with 2 leftover
        System.out.printf("Everyone gets %d slices with %d leftover%n" , serving, leftover); 
    }
}