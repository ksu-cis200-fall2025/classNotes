public class Fraction {
    //fields
    private int num;
    private int denom;

    //constructor
    public Fraction(int n, int d) {
        num = n;
        denom = d;
    }   

    public void print() {
        System.out.printf("%d/%d%n", num, denom);
    }

    //addition
    public Fraction plus(Fraction other) {
        //num and denom are the info for the calling object
        //(THIS fraction)

        //need new numerator
        int newNum = num*other.denom + other.num*denom;    

        //need new denominator
        //multiply the two denominators
        int newDenom = denom * other.denom;

        Fraction answer = new Fraction(newNum, newDenom);

        return answer;
    }
}