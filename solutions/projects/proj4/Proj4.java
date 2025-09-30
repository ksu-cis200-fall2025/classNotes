/**
 * Project 4 finds the maximum difference between two subsequent temperatures,  
 * the longest increasing portion of temperatures, and the most frequent temperature from a list.
 *
 * @author Julie Thornton
 * @version Project 4
 */

import java.util.*;

public class Proj4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Enter a list of temperature readings, separated by spaces: ");
		String list = s.nextLine();

		String[] pieces = list.split(" ");
		int[] temps = new int[pieces.length];
		for (int i = 0; i < pieces.length; i++) {
			temps[i] = Integer.parseInt(pieces[i]);
		}

		if (temps.length < 2) {
			System.out.println("Error: need to enter at least two numbers.");
			return;
		}

        //find maximum difference
		int maxDiff = Math.abs(temps[0] - temps[1]);
		int maxPos = 0;

		for (int i = 1; i < temps.length-1; i++) {
			int diff = Math.abs(temps[i] - temps[i+1]);
			if (diff > maxDiff) {
				maxDiff = diff;
				maxPos = i;
			}
		}

		System.out.printf("%nMaximum temperature difference: %d and %d%n", temps[maxPos], temps[maxPos+1]);
		System.out.println();

        //find longest increasing section of temperatures
		//this is not the most efficient approach

		int bestPos = 0;
		int bestEnd = 1;

        for (int curPos = 0; curPos < temps.length; curPos++) {
            int curEnd = curPos + 1;
            while (curEnd < temps.length) {
                if (temps[curEnd-1] >= temps[curEnd]) break;

                curEnd++;
            }

            if ((curEnd-curPos) > (bestEnd-bestPos)) {
                bestPos = curPos;
                bestEnd = curEnd;
            }
        }

		System.out.print("Longest increasing temperature section: ");
		for (int i = bestPos; i < bestEnd; i++) {
			System.out.printf("%d ", temps[i]);
		}
		System.out.println("\n");


        //most frequent temperature, again could be more efficient

        int mostFreqTemp= temps[0];
        int mostFreqCount = 1;

        //each temp might occur the most
        for (int i = 0; i < temps.length; i++) {
            //count the current temp, temps[i]
            int curCount = 0;
            for (int j = 0; j < temps.length; j++) {
                //did we find the temperature we're counting?
                if (temps[i] == temps[j]) {
                    //then count it!
                    curCount++;
                }
            }

            //is the new count better than our best?
            if (curCount > mostFreqCount) {
                mostFreqCount = curCount;
                mostFreqTemp = temps[i];
            }
        }

        System.out.printf("The most frequent temperature was %d, which occurred %d times.%n", mostFreqTemp, mostFreqCount);
	}
}