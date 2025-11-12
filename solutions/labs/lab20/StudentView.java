import java.util.*;

public class StudentView {
    private View view;

    public StudentView(View type) {
        view = type;
    }

    public void printHonorRoll(ArrayList<Student> students) {
        StringBuilder build = new StringBuilder();
        
        build.append("\nHonor roll:");

        for (int i = 0; i < students.size(); i++) {
            Student cur = students.get(i);

            build.append(cur.toString() + "\n\n");
        }

        view.displayResult(build.toString());
    }

    public void printWithMajor(ArrayList<Student> students, String major) {
        StringBuilder build = new StringBuilder();
        
        build.append(String.format("Students with major %s: %n", major));

        for (int i = 0; i < students.size(); i++) {
            Student cur = students.get(i);

            build.append(cur.toString() + "\n\n");
        }

        view.displayResult(build.toString());
    }

    public String getMajor() {
        return view.getInput("Enter major to search for: ");
    }

    public Student getStudent() {
        String name = view.getInput("Enter name: ");
        String major = view.getInput("Enter major: ");
        double gpa = 0;

        int badCount = 0;

        while (badCount < 2) {
            try {
                //if use nextDouble, will need to do a s.nextLine() afterwards to clear the input buffer
                String line = view.getInput("Enter GPA: ");
                
                gpa = Double.parseDouble(line);
                break;
            }
            catch (NumberFormatException | NullPointerException nfe) {
                badCount++;

                if (badCount < 2) {
                    view.displayResult("Error. GPA must be a double.");
                }
                else {
                    view.displayResult("Invalid GPA for 2nd time. Skipping student.");
                }
            }
        }

        if (badCount == 2) return null;
        else return new Student(name, major, gpa);
    }

    public boolean goAgain() {
        String line = view.getInput("Enter another student? (y/n) ");

        if (line.toLowerCase().equals("y")) return true;
        else return false;
    }
}