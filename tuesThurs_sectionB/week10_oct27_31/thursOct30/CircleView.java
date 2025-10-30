import java.util.*;

public class CircleView {
    private Scanner s;

    public CircleView() {
        s = new Scanner(System.in);
    }

    //print filtered circles
    public void printFiltered(ResizeableArray results) {
        for (int i = 0; i < results.size(); i++) {
            Circle c = (Circle) results.get(i);
            System.out.println(c);
        }
    }
}