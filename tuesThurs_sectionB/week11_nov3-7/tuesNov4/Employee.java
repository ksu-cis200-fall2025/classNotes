//what should we do with Person?

public class Employee extends Person {
    //want name, age, job title, salary

    private String title;
    private double salary;

    public Employee(String n, int a, String t, double s) {
        super(n, a);
        title = t;
        salary = s;
    }

    //what do we inherit?

    //what do we want to change?
}