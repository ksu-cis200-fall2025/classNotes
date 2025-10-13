import java.util.*;

public class Oct13 {
    public static void main(String[] args) {
        //command-line args: word number

        if (args.length == 2) {
            String word = args[0];
            System.out.println(word.charAt(0));
            int val = Integer.parseInt(args[1]) + 1;
            System.out.println(val);
        }
        else {
            System.out.println("Error. Run as: java Oct13 word number");
        }

        //print 1st letter of word
        //print one more than number

        //print error if one or both not provided
    }
}