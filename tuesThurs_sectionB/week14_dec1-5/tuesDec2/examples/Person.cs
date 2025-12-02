public class Person {
    private int _age;

    //if no constructor, then get default for free:
    //public Person() {}

    public void Print() {
        Console.WriteLine($"Name: {Name}, age: {Age}");
    }

    //same thing for age, but only allow age 0-130
    public int Age {
        //get access and/or set access
        get {
            return _age;
        }
        set {
            //"value" means the information I am setting it to
            if (value >= 0 && value <= 130) {
                _age = value;
            }
        }
    }


    public string Name {get; set;}
}