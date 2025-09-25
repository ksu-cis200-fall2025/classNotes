import java.util.*;

/*
NOTE: This lab was slightly edited for the Tues/Thurs section. The Mon/Wed section had to stop getting inputs when a 0 was entered, and the
Tues/Thurs section had to stop getting input when a -1 was entered. The solution below is for the Tues/Thurs version.
*/

public class Lab7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] arr = new int[10];
        int pos = 0;

        System.out.println("Enter a list of up to 10 temperatures separated by spaces, terminating with -1: ");

        for (int i = 0; i < arr.length; i++) {
            int num = s.nextInt();

            if (num == -1) break;

            arr[pos] = num;
            pos++;
        }

        //NOTE: this will only allow 10 total numbers to be entered, but it will still work correctly if the user enters
        //10 "real" temperatures followed by an 11th "end of input" value (-1 in this case). The 11th input will remain in
        //the input buffer, but there is no other input in the program so that won't affect anything.

        System.out.println("\nHere are the temperatures that were below freezing (32 degrees):");
        for (int i = 0; i < pos; i++) {
            if (arr[i] < 32) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}