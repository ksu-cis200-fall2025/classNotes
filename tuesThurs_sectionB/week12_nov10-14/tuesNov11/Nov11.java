import java.util.*;
import javax.swing.*;

public class Nov11 {
    public static void main(String[] args) {
        //ArrayList example: collection of circles

        /*
        ArrayList<Circle> list = new ArrayList<Circle>();
        list.add(new Circle(3.5));
        list.add(new Circle(7.5));
        list.add(new Circle(3.2));
        list.add(new Circle(1.5));

        //print all circle whose area is between 5-10
        for (int i = 0; i < list.size(); i++) {
            Circle c = list.get(i);
            if (c.area() >= 5 && c.area <= 10) {
                System.out.println(c);
            }
        }

        for (Circle c : list) {
            if (c.area() >= 5 && c.area <= 10) {
                System.out.println(c);
            }
        }
        */

       //Nameable n = new Nameable(); NO!
      
      /*
       Nameable n = new Circle(2.3);
       System.out.println(n.name());
       */

        JOptionPane.showMessageDialog(null, "Hello, world!");
        String name = JOptionPane.showInputDialog("Enter your name: ");
    }
}