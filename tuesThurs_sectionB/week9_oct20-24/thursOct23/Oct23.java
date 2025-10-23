public class Oct23 {
    public static void main(String[] args) {
        //circ. circle with radius 2.5

        Circle c = new Circle(2.5);
        System.out.println("Circumference: " + c.circumference());

        System.out.println("Circumference: " + CircleStatic.circumference(2.5));        
    
        double pi = Circle.PI;
        double otherPI = Circle.getPI();

        //hold 5 circles
        Circle[] shapes = new Circle[5];
        
        //radius 4
        shapes[0] = new Circle(4);
        System.out.println(shapes[0].area());

        System.out.println(shapes[0]);
    }
}