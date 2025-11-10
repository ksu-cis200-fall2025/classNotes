import java.util.*;
import javax.swing.*;

public class Nov10 {
    public static void main(String[] args) {
        //ArrayList example: collection of circles

        /*
        ArrayList<Circle> list = new ArrayList<Circle>();

        //add a few
        Circle c = new Circle(3.5);
        list.add(c);
        list.add(new Circle(7.5));

        //then print those with area between 5-10
        for (int i = 0; i < list.size(); i++) {
            Circle cur = list.get(i);
            if (cur.area() >= 5 && cur.area() <= 10) {
                System.out.println(cur);
            }
        }

        for (Circle cur : list) {
            if (cur.area() >= 5 && cur.area() <= 10) {
                System.out.println(cur);
            }
        }*/

       /*
       Nameable n = new Circle();

       System.out.println(n.name());
       */

        //message box:
        JOptionPane.showMessageDialog(null, "Hello, world!");

        //input box:
        String name = JOptionPane.showInputDialog("Enter your name: ");

        JOptionPane.showMessageDialog(null, "Hello " + name);
    }
}