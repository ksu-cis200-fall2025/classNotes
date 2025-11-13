import java.util.*;

public class Nov13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        TreeSet<Person> list = new TreeSet<Person>();
        list.add(new Person("Bob", 20));
        list.add(new Person("Alice", 30));
        list.add(new Person("Bob", 25));
        list.add(new Person("Mary", 40));

        for (Person p : list) {
            System.out.println(p);
        }
    }
}