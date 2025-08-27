import java.util.*;

public class Burgers {
    public static void main(String[] args) {
        //burgers are $6.79 each. Get number of burgers, print total.

        Scanner s = new Scanner(System.in);

        System.out.print("Enter number of burgers: ");
        int burgers = s.nextInt();

        double cost = burgers*6.79;

        //Your total is: $x.xx
        System.out.printf("Your total is: $%.2f%n", cost);
    }
}