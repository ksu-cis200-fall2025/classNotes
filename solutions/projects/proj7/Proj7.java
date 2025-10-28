/**
 * Proj7 gets input for two polynomials from the user and 
 * performs various operations on them.
 * 
 * @author Julie Thornton
 * @version Project 7
 */

import java.util.*;
import java.io.*;

public class Proj7 {
    private static Scanner s;

    public static void main(String[] args) {
        s = new Scanner(System.in);

        System.out.println("Input for first polynomial.");
        Polynomial p1 = buildPolynomial();

        System.out.println();
        System.out.println("Input for second polynomial.");
        Polynomial p2 = buildPolynomial();

        System.out.println();
        System.out.printf("First polynomial: %s%n", p1);
        for (int i = 1; i <= 5; i++) {
            System.out.printf("\tEvaluated at x=%d: %d%n", i, p1.evaluate(i));
        }
        System.out.println();
        System.out.printf("Second polynomial: %s%n", p2);
        for (int i = 1; i <= 5; i++) {
            System.out.printf("\tEvaluated at x=%d: %d%n", i, p2.evaluate(i));
        }

        System.out.println();
        Polynomial sum = p1.plus(p2);
        System.out.printf("(%s) + (%s) = %s%n", p1, p2, sum);

        System.out.println();
        Polynomial product = p1.times(p2);
        System.out.printf("(%s) * (%s) = %s%n", p1, p2, product);

        System.out.println();
        Polynomial derivative = product.derivative();
        System.out.printf("Derivative of %s is %s%n", product, derivative);
    }

    public static Polynomial buildPolynomial() {
        System.out.print("Enter degree of polynomial: ");
        int deg = s.nextInt();
        Polynomial p = new Polynomial(deg);

        for (int i = deg; i >= 0; i--) {
            if (i == 0) {
                System.out.print("Enter constant term: ");
            }
            else if (i == 1) {
                System.out.print("Enter coefficient for x: ");
            }
            else {
                System.out.printf("Enter coefficient for x^%d: ", i);
            }
            
            p.setTerm(s.nextInt(), i);
        }

        return p;
    }
}