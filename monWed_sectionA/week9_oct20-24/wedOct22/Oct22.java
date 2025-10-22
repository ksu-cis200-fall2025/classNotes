import java.util.*;

public class Oct22 {
    public static void main(String[] args) {
        //area of a circle with radius 2.5

        double area = CircleStatic.area(2.5);

        Circle c = new Circle(2.5);
        System.out.println(c);

        double otherArea = c.area();

        double r = c.getRadius();

        //access PI
        double pi = Circle.PI;

        //circles with radius 1,2,3,4,5
        Circle[] circles = new Circle[5];

        //all null
        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle(i+1);
        }
    }

}