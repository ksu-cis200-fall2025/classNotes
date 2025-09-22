import java.util.*;

public class Sep22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /*
            Get 6 numbers from the user.

            Print whether any input number is the square of another 
            input number.
        */

        int[] nums = new int[6];
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter number: ");
            nums[i] = s.nextInt();
        }

        //nums: {0,3,2,1,4,9}
        for (int i = 0; i < nums.length; i++) {
            //seeing if the square of nums[i] is in there
            for (int j = 0; j < nums.length; j++) {
                if (nums[i]*nums[i] == nums[j] && (i != j)) {
                    System.out.printf("%d^2 = %d%n", nums[i], nums[j]);
                }
            }
        }
    }
}