import java.util.*;

public class Sep23 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /*
        double[] nums = new double[5];
        nums[0] = 3.2;
        nums[4] = 10.7;

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        */

        //get 6 numbers

        //print pairs from input where one input is the square of the other
        //example, entered: 9 4 1 2 3 5

        //want to print: 2 squared is 4
                    //3 squared is 9

        int[] nums = new int[6];
        System.out.print("Enter six numbers: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = s.nextInt();
        }

        //outer loop checks each number
        for (int i = 0; i < nums.length; i++) {
            //see if the square of nums[i] is in the array
            for (int j = 0; j < nums.length; j++) {
                //see if nums[j] is nums[i] squared
                if (nums[i]*nums[i] == nums[j] && i != j) {
                    System.out.printf("%d^2 = %d%n", nums[i], nums[j]);
                }
            }
        }
    }
}