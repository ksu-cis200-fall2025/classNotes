import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a postive number: ");
        int num = s.nextInt();

        if (num > 0) {
             //5! = 5*4*3*2*1

            int factorial = 1;
            for (int i = num; i >= 1; i--) {
                factorial *= i;
            }
            System.out.printf("%d! = %d%n", num, factorial);
        }
        else {
            System.out.println("Invalid input");
        }
       

        //print the factorial of num
        //how to add input validation?
    }
}