import java.util.*;

public class Oct1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a list of numbers separated by commas: ");
        String line = s.nextLine();

        //like: "12,4,-3.2,5"
        //or "5"

        //how to print the sum of the numbers WITHOUT split?

        double sum = 0;
        int index = 0;
        boolean done = false;

        do {
            int comma = line.indexOf(",", index);

            double num;

            //see if I found a comma
            if (comma >= 0) {
                num = Double.parseDouble(line.substring(index,comma));
                index = comma+1;
            }
            else {
                //I didn't find a comma
                 num = Double.parseDouble(line.substring(index));
                 done = true;
            }

            sum += num;
        } while (!done);

        System.out.println("Sum is: " + sum);
    }
}