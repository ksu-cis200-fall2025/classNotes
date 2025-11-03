//what should we do with Person?

public class Student extends Person {
    //want name, age, major, gpa
    private String major;
    private double gpa;

    public Student(String n, int a, String m, double g) {
        //need to call the Person constructor
        super(n, a);
        major = m;
        gpa = g;
    }

    //what do we inherit?
    //getType, toString, birthday

    //what do we want to change?

    //method overriding
    public String getType() {
        return "Student";
    }

    public String toString() {
        StringBuilder build = new StringBuilder();
        build.append(super.toString());
        build.append(String.format(", major: %s, gpa: %f", major, gpa));

        return build.toString();
    }
}