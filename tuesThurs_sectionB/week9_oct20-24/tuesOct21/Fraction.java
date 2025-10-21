public class Fraction {
    private int num;
    private int denom;

    public Fraction(int n, int d) {
        num = n;
        denom = d;
    }

    //addition of fractions
    public Fraction plus(Fraction other) {
        //num
        //denom
        //other.num
        //other.denom

        int newDenom = denom * other.denom;
        int newNum = num*other.denom + other.num*denom;
        Fraction answer = new Fraction(newNum, newDenom);
        return answer;
    }
}