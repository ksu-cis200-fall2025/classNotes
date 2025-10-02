import java.util.*;

public class Oct2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a list of numbers separated by commas: ");
        String line = s.nextLine();

        //like: 12,4,-3.2,5

        //how to print the sum of the numbers WITHOUT split?

        double sum = 0;
        int index = 0;
        boolean done = false;
        do {
            int comma = line.indexOf(",", index);

            String piece;
            if (comma >= 0) {
                piece = line.substring(index,comma);
            }
            else {
                piece = line.substring(index);
                done = true;
            }
            sum += Double.parseDouble(piece);
            
            index = comma + 1;
        } while (!done);

        System.out.printf("Sum: %.2f%n", sum);
    }
}