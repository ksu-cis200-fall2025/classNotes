import java.util.*;
import java.io.*;

public class Sep30 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        //ask user for name of file
        System.out.print("Enter name of file: ");
        String filename = s.nextLine();

        Scanner inFile = new Scanner(new File(filename));
        PrintWriter outFile = new PrintWriter("copy_"+filename);

        while (inFile.hasNext()) {
            String line = inFile.nextLine();
            outFile.println(line);
        }

        outFile.close();
        inFile.close();
        
        //create output file named copy_origName
        //that is a duplicate of original file

    }
}