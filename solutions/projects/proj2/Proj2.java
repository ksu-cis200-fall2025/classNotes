/**
 * This program calculates the federal income tax for a single taxpayer in 2025
 *
 * @author Julie Thornton
 * @version Project 2
 */

import java.util.*;

public class Proj2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter your gross income from 2024: $");
        double income = s.nextInt();

        //standard deduction
        //this assumes the user input is at least 14600 (as in the writeup)
        //would need a separate case for lower income amounts
        income -= 14600;

        double tax = 0;
        double amountTaxed;
        if (income >= 609351) {
            amountTaxed = income - 609351;
            tax = amountTaxed*0.37;

            //set income left to tax to the cutoff
            income = 609351;
        }
        if (income >= 243726) {
            amountTaxed = income - 243726;
            tax += amountTaxed*0.35;

            //set income left to tax to the cutoff
            income = 243726;
        }
        if (income >= 191951) {
            amountTaxed = income - 191951;
            tax += amountTaxed*0.32;

            //set income left to tax to the cutoff
            income = 191951;
        }
        if (income >= 100526) {
            amountTaxed = income - 100526;
            tax += amountTaxed*0.24;

            //set income left to tax to the cutoff
            income = 100526;
        }
        if (income >= 47151) {
            amountTaxed = income - 47151;
            tax += amountTaxed*0.22;

            //set income left to tax to the cutoff
            income = 47151;
        }
        if (income >= 11601) {
            amountTaxed = income - 11601;
            tax += amountTaxed*0.12;

            //set income left to tax to the cutoff
            income = 11601;
        }

        //remaining income is taxed at lowest rate
        tax += income*0.10;

        int roundedTax = (int)(Math.round(tax));
        System.out.println();
        System.out.printf("Taxes owed if filing as single: $%,d%n", roundedTax);
    }
}

