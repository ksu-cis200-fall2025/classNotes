import java.util.*;

public class Oct30 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ResizeableArray arr = new ResizeableArray();

        String line;
        do {
            System.out.print("Enter radius: ");
            line = s.nextLine();

            if (line.length() > 0) {
                double radius = Double.parseDouble(line);

                Circle c = new Circle(radius);
                arr.add(c);
            }
        } while (line.length() != 0);

        //print all circles with area 5-10
        ResizeableArray filtered = new ResizeableArray();
        for (int i = 0; i < arr.size(); i++) {
            Circle c = (Circle) arr.get(i);

            if (c.area() >= 5 && c.area() <= 10) {
                filtered.add(c);
            }
        }

        CircleView view = new CircleView();
        view.printFiltered(filtered);
    }
}