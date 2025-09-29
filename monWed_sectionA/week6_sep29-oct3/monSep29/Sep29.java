import java.util.*;
import java.io.*;

public class Sep29 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        //ask user for name of file
        System.out.print("Enter name of file: ");
        String filename = s.nextLine();

        //connect to input file
        Scanner inFile = new Scanner(new File(filename));

        //connect to output file
        PrintWriter outFile = new PrintWriter("copy_"+filename);
        
        //read all lines in input file
        while (inFile.hasNext()) {
            String line = inFile.nextLine();
            outFile.println(line);
        }

        inFile.close();
        outFile.close();

        //create output file named copy+origName
        //that is a duplicate of original file

    }
}