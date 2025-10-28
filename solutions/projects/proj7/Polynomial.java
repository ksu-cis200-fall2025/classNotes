public class Polynomial {
    private int[] _coeffs;

    public Polynomial(int maxDegree) {
        _coeffs = new int[maxDegree + 1];
    }

    public boolean setTerm(int coeff, int degree) {
        if (degree < 0 || degree >= _coeffs.length) return false;

        _coeffs[degree] = coeff;
        return true;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();

        boolean first = true;
        for (int i = getMaxDegree(); i >= 0; i--) {
            if (getTerm(i) != 0) {
                if (!first && getTerm(i) < 0) {
                    result.append(" - ");
                }
                else if (!first && getTerm(i) > 0) {
                    result.append(" + ");
                }
                
                if (first) first = false;

                int val = Math.abs(getTerm(i));
                if (val > 1 || i == 0) result.append(val);

                if (i != 0) result.append("x");
                if (i > 1) result.append("^" + i);
            }
        }

        return result.toString();
    }

    public int getTerm(int degree) {
        if (degree < 0 || degree >= _coeffs.length) return 0;
        else return _coeffs[degree];
    }

    public int getMaxDegree() {
        for (int i = _coeffs.length-1; i >= 1; i--) {
            if (_coeffs[i] != 0) return i;
        }

        return 0;
    }

    public Polynomial plus(Polynomial p) {
        int newMax = Math.max(getMaxDegree(), p.getMaxDegree());
        Polynomial result = new Polynomial(newMax);

        for (int i = newMax; i >= 0; i--) {
            result.setTerm(getTerm(i) + p.getTerm(i), i);
        }

        return result;
    }

    public int evaluate(int x) {
        int result = 0;
        for (int i = 0; i <= getMaxDegree(); i++) {
            result += ((int)(Math.pow(x, i))) * getTerm(i);
        }

        return result;
    }

    public Polynomial derivative() {
        int max = getMaxDegree();

        Polynomial result = new Polynomial(max-1);

        for (int i = max; i > 0; i--) {
            result.setTerm(i*getTerm(i), i-1);
        }

        return result;
    }

    public Polynomial times(Polynomial p) {
        int thisMax = getMaxDegree();
        int otherMax = p.getMaxDegree();

        Polynomial result = new Polynomial(thisMax+otherMax);

        for (int i = 0; i <= thisMax; i++) {
            for (int j = 0; j <= otherMax; j++) {
                result.setTerm(getTerm(i)*p.getTerm(j) + result.getTerm(i+j), i+j);
            }
        }

        return result;
    }
}