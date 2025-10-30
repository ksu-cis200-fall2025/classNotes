import java.util.*;

public class StudentView {
    private Scanner s;

    public StudentView() {
        s = new Scanner(System.in);
    }

    public void printHonorRoll(ResizeableArray students) {
        System.out.println("\nHonor roll:");

        for (int i = 0; i < students.size(); i++) {
            Student cur = (Student) students.get(i);

            System.out.println(cur);
            System.out.println();
        }
    }

    public void printWithMajor(ResizeableArray students, String major) {
        System.out.printf("Students with major %s: %n", major);

        for (int i = 0; i < students.size(); i++) {
            Student cur = (Student) students.get(i);

            System.out.println(cur);
            System.out.println();
        }
    }

    public String getMajor() {
        System.out.print("Enter major to search for: ");
		return s.nextLine();
    }

    public Student getStudent() {
        System.out.print("Enter name: ");
        String name = s.nextLine();
        System.out.print("Enter major: ");
        String major = s.nextLine();
        System.out.print("Enter GPA: ");
        double gpa = 0;

        int badCount = 0;

        while (badCount < 2) {
            try {
                //if use nextDouble, will need to do a s.nextLine() afterwards to clear the input buffer
                gpa = Double.parseDouble(s.nextLine());
                break;
            }
            catch (NumberFormatException nfe) {
                badCount++;

                if (badCount < 2) {
                    System.out.print("Error. GPA must be a double. Re-enter GPA: ");
                }
                else {
                    System.out.println("Invalid GPA for 2nd time. Skipping student.");
                }
            }
        }

        System.out.println();

        if (badCount == 2) return null;
        else return new Student(name, major, gpa);
    }

    public boolean goAgain() {
        System.out.print("Enter another student? (y/n) ");
		String line = s.nextLine();

        if (line.toLowerCase().equals("y")) return true;
        else return false;
    }
}