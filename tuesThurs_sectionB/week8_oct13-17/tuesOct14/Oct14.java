import java.util.*;

public class Oct14 {
    public static void main(String[] args) {
        if (args.length == 2) {
            char letter = args[0].charAt(0);
            int num = Integer.parseInt(args[1]);

            System.out.println(letter + " " + (num+1));
        }
        else {
            System.out.println("Error. Run as: java Oct14 word number");
        }

        //command-line args: word number
        //java Oct14 apple 15

        //print 1st letter of word
        //print one more than number

        //print error if one or both not provided
    }
}