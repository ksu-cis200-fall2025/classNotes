import java.util.*;

public class Lab5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter an integer greater than or equal to 2: ");
        int num = s.nextInt();

        boolean prime = true;
        if (num >= 2) {
            //it is OK to loop up to num instead
            for (int factor = 2; factor <= Math.sqrt(num); factor++) {
                if (num % factor == 0) {
                    int otherFactor = num / factor;
                    System.out.printf("%d = %d*%d%n", num, factor, otherFactor);
                    prime = false;
                    break;
                }
            }

            if (prime) {
                System.out.printf("%d is prime%n", num);
            }
        }
        else {
            System.out.printf("%d is an invalid input%n", num);
        }
    }
}