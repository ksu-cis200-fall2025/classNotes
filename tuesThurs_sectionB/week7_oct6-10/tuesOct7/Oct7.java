import java.util.*;

public class Oct7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] arr = {-3,5,-2,7,17,5};

        //update each array element to be its own absolute value
        for (int i = 0; i < arr.length; i++) {
            arr[i] = absVal(arr[i]);
        }



        System.out.print("Enter a word: ");
        String word = s.nextLine();

        //print something like: madam is a palindrome
        //or loop is not a palindrome
        if (palindrome(word)) {
            System.out.printf("%s is a palindrome%n", word);
        }
        else {
            System.out.printf("%s is not a palindrome%n", word);
        }


        
        int[] another = {1,4,17,25,36,37,45};
        System.out.print("Enter a number to search for: ");
        int num = s.nextInt();

        int index = indexOf(another, num);
        if (index >= 0) {
            System.out.printf("%d is at index %d%n", num, index);
        }
        else {
            System.out.printf("%d is not found%n", num);
        }

        //print something like: 17 is at index 2
        //or 5 is not found

    }

    //write a method to compute the absolute value
    public static int absVal(int x) {
        if (x > 0) return x;
        else return -1*x;
    }

    //write a method to return whether a String 
    //is a palindrome
    public static boolean palindrome(String str) {
        int front = 0;
        int back = str.length()-1;

        while (front < back) {
            if (str.charAt(front) != str.charAt(back)) {
                return false;
            }

            front++;
            back--;
        }

        return true;
    }

    //write a method to return position of 
    //an element in an array (of integers)

    public static int indexOf(int[] nums, int elem) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == elem) return i;
        }

        //not found
        return -1;
    }

}