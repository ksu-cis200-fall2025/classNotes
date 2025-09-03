import java.util.*;

public class Lab2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the bill: $");
        double bill = s.nextDouble();

        System.out.println();

        double tip = bill * 0.18;
        System.out.printf("An 18%% tip would be: $%.2f%n", tip);
    }
}