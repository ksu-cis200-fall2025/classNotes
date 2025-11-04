public class Nov4 {
    public static void main(String[] args) {
        //create Person/Student/Employee objects

        Person[] people = new Person[5];

        //Student with Bob, 20, ECE, 3.4
        people[0] = new Student("Bob", 20, "ECE", 3.4);

        //see if Bob is on the honor roll
        if (people[0] instanceof Student) {
            Student s = (Student) people[0];
            if (s.honorRoll()) {

            }
        }
        System.out.println(people[0].getType()); //prints Student
    }
}