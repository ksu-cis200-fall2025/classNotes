import java.util.*;

public class CircleView {
    private Scanner s;

    public CircleView() {
        s = new Scanner(System.in);
    }

    //all the circles that matched my criteria
    public void printResults(ResizeableArray filtered) {
        for (int i = 0; i < filtered.size(); i++) {
            Circle circ = (Circle)filtered.get(i);
            System.out.println(circ);
        }
    }
}