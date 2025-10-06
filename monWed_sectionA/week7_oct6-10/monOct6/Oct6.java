import java.util.*;

public class Oct6 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //get number, print its abs value
        System.out.print("Enter number: ");
        int num = s.nextInt();
        System.out.printf("Abs of %d is %d%n", num, absVal(num));

        System.out.println("Enter word: ");
        String word = s.nextLine();

        //print: madam is a panlindrome
        //or, loop is not a palindrome
        boolean yes = palindrome(word);
        if (yes) System.out.printf("%s is a palindrome%n", word);
        else System.out.printf("%s is not a palindrome%n", word);
    }

    //write a method to compute the absolute value
    public static int absVal(int val) {
        if (val >= 0) return val;
        else return -1*val;
    }

    //write a method to return whether a String 
    //is a palindrome
    //"tacocat", "racecar"
    public static boolean palindrome(String word) {
        int front = 0;
        int back = word.length()-1;

        while (front < back) {
            if (word.charAt(front) != word.charAt(back)) {
                return false;
            }

            front++;
            back--;
        }

        return true;
    }

    //write a method to return position of 
    //an element in an array
    public static int getPos(int[] arr, int val) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) return i;
        }

        return -1;
    }

    //what if we knew the array was sorted?
    public static int binarySearch(int[] arr, int val) {
        int front = 0;
        int back = arr.length-1;

        while (front <= back) {
            int mid = (front+back)/2;
            if (arr[mid] < val) front = mid+1;
            else if (arr[mid] > val) back = mid-1;
            else return mid;
        }

        return -1;
    }
}