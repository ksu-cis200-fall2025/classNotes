public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String n, int a) {
        name = n;
        age = a;
    }

    public String toString() {
        return String.format("Name: %s, age: %d%n", name, age);
    }

    public int compareTo(Person p) {
        if (name.compareTo(p.name) < 0) return -1;
        else if (name.compareTo(p.name) == 0) {
            if (age < p.age) return -1;
            else if (age == p.age) return 0;
            else return 1;
        }
        else {
            //name.compareTo(p.name) > 0
            return 1;
        }
    }
}