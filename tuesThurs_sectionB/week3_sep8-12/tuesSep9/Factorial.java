import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a postive number: ");
        int num = s.nextInt();

        if (num >= 1) {
            //5! = 5*4*3*2*1
            int result = 1; //multiplied so far

            for (int i = num; i >= 1; i--) {
                result *= i;
            }

            //print the factorial of num
            System.out.printf("%d! = %d%n", num, result);
        }
        else {
            System.out.printf("%d! is undefined%n", num);
        }
        

        //5! = 120
        //how to add input validation?
    }
}