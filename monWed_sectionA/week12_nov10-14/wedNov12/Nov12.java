import java.util.*;

public class Nov12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //create a TreeSet of several people
        TreeSet<Person> set = new TreeSet<Person>();
        set.add(new Person("Bob", 20));
        set.add(new Person("Jill", 25));
        set.add(new Person("Bob", 22));
        set.add(new Person("Bob", 20));


        //loop to print all information
        for (Person p : set) {
            System.out.println(p);
        }
    }
}