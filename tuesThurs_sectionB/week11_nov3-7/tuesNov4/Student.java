//what should we do with Person?

public class Student extends Person {
    //want name, age, major, gpa
    private String major;
    private double gpa;

    public Student(String n, int a, String m, double g) {
        //call the parent constructor
        super(n, a);
        major = m;
        gpa = g;
    }

    //method overriding
    public String getType() {
        return "Student";
    }

    public String toString() {
        StringBuilder build = new StringBuilder();
        build.append(super.toString());
        build.append(String.format(" major: %s, gpa: %.2f", major, gpa));
    }

    public boolean honorRoll() {
        return gpa >= 3.5;
    }

    //what do we inherit? anything protected or public
        //getType, toString, birthday

    //what do we want to change?
}