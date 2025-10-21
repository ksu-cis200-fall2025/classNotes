import java.util.*;

public class Oct21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //radius 3.5 circle
        Circle c = new Circle(3.5);
        System.out.println(c.area());

        Circle c2 = new Circle(4);
        System.out.println(c2.area());

        c = c2;
        System.out.println(c.area());

        //want fraction 1/2
        Fraction f1 = new Fraction(1,2);

        //want fraction 1/4
        Fraction f2 = new Fraction(1,4);

        Fraction result = f1.plus(f2);
    }
}