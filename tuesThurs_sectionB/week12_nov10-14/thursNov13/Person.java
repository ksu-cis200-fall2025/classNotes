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

    public int compareTo(Person other) {
        if (name.compareTo(other.name) == 0) {
            if (age < other.age) return -1;
            else if (age > other.age) return 1;
            else return 0;
        }
        else {
            return name.compareTo(other.name);
        }
    }
}