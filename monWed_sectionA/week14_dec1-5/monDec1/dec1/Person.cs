public class Person {
    private int age = 0;

    public string Name { get; set; }

    //want no negatives
    //not more than 130
    public int Age
    {
        get {
            return age;
        }
        set {
            if (age >= 0 && age <= 130) {
                age = value;
            }
        }
    }

    public Person(string n, int a) {
        Name = n;
        Age = a;
    }
}