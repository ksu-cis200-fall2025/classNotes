import java.util.*;

public class Oct30 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ResizeableArray array = new ResizeableArray();

        //enter radius until hit enter
        String line;
        do {
            System.out.print("Enter radius: ");
            line = s.nextLine();

            if (line.length() > 0) {
                double r = Double.parseDouble(line);
                Circle c = new Circle(r);
                array.add(c);
            }
        } while (line.length() != 0);

        //all circles with area 5-10
        for (int i = 0; i < array.size(); i++) {
            Circle circ = (Circle)array.get(i);
            if (circ.area() >= 5 && circ.area() <=10) {
                System.out.println(circ);
            }
        }

        CircleView view = new CircleView();

        ResizeableArray results = new ResizeableArray();
        for (int i = 0; i < array.size(); i++) {
            Circle circ = (Circle)array.get(i);
            if (circ.area() >= 5 && circ.area() <=10) {
                results.add(circ);
            }
        }

        view.printResults(results);
    }
}