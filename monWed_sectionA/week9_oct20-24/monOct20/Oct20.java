import java.util.*;

public class Oct20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //want to represent a circle with radius 4.5
        Circle c = new Circle(4.5);
        System.out.println(c.area());

        //another circle, radius 2
        Circle c2 = new Circle(2);
        System.out.println(c2.area());

        c2 = c;

        //fraction 3/4
        Fraction f1 = new Fraction(3, 4);

        //fraction 2/3
        Fraction f2 = new Fraction(2, 3);

        //add them together
        Fraction result = f1.plus(f2);
    }
}