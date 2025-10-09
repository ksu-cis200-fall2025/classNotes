//got list of allowed guesses, puzzle words from https://github.com/Kinkelin/WordleCompetition/tree/main

import java.util.*;
import java.io.*;

public class Proj5 {
    public static void printGameInfo() {
        System.out.println("Welcome to text-based Wordle! You get 6 tries to guess a five-letter word.");
        System.out.println("Each guess must be a valid English word.");
        System.out.println("After each guess, you will get feedback for each letter in your guess.");
        System.out.println("\"G\" means that letter appears at that position in the correct word.");
        System.out.println("\"Y\" means that letter appears at a different position in the correct word.");
        System.out.println("\"B\" means that letter does not appear in the correct word.");
        System.out.println();
    }

    public static String[] readWords(String filename) throws IOException {
        Scanner inFile = new Scanner(new File(filename));

        String[] words = new String[Integer.parseInt(inFile.nextLine())];
        for (int i = 0; i < words.length; i++) {
            words[i] = inFile.nextLine();
        }
        inFile.close();

        return words;
    }

    public static String buildSpacedWord(String guess) {
        StringBuilder build = new StringBuilder();
        for (int i = 0; i < guess.length(); i++) {
            build.append(guess.charAt(i) + " ");
        }
        return build.toString();
    }

    public static boolean isValid(String guess, String[] words1, String[] words2) {
        boolean found = false;
        for (int i = 0 ; i < words1.length; i++) {
            if (guess.equals(words1[i])) found = true;
        }
        for (int i = 0 ; i < words2.length; i++) {
            if (guess.equals(words2[i])) found = true;
        } 

        return found;
    } 

    public static char[] buildFeedback(String guess, String correct) {
        //build feedback
        //G = correct letter, correct spot
        //Y = correct letter, wrong spot
        //B = wrong letter 

        char[] feedback = new char[guess.length()];
        boolean[] used = new boolean[guess.length()];

        //find the correct letter/correct spot (G), mark that spot as used
        for (int i = 0; i < guess.length(); i++) {
            if (guess.charAt(i) == correct.charAt(i)) {
                feedback[i] = 'G';
                used[i] = true;
            }
        }

        //now go back and find the correct letters/wrong spots (Y)
        //if guess has x occurrences of the letter and correct has y occurrences, and x > y, only
        //the first y occurrences in guess should get marked as Y (or G)
        for (int i = 0; i < guess.length(); i++) {
            if (feedback[i] == 'G') continue;

            boolean matched = false;
            for (int j = 0; j < correct.length(); j++) {
                if (guess.charAt(i) == correct.charAt(j) && !used[j]) {
                    //only possible if i != j

                    matched = true;

                    //prevents us from matching the same correct letter against a different (duplicate)
                    //letter in guess
                    used[j] = true;
                    break;
                }
            }

            if (matched) feedback[i] = 'Y';
            else feedback[i] = 'B';
        }

        return feedback;
    }

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        printGameInfo();

        String[] allowed = readWords("allowed.txt");
        String[] puzzles = readWords("puzzles.txt");

        Random r = new Random();
        int puzzleNumber = r.nextInt(puzzles.length);
        String correct = puzzles[puzzleNumber];

        System.out.print("Do you want to enter \"cheat mode\", where you know the correct word ahead of time? (y/n) ");
        char mode = (s.nextLine().toLowerCase()).charAt(0);

        if (mode == 'y') {
            System.out.println();
            System.out.printf("The correct word is \"%s\".", correct);
        }
        //they can assume a non-'y' input means "no"

        System.out.println();

        int numGuesses = 0;
        while (numGuesses < 6) {
            System.out.printf("Enter guess #%d: ", numGuesses+1);
            String guess = s.nextLine().toLowerCase();

            //build spaced word
            String spacedGuess = buildSpacedWord(guess);

            if (!isValid(guess, allowed, puzzles)) {
                System.out.printf("%s is not a valid word%n%n", guess);
                continue;
            }

            //build feedback
            //G = correct letter, correct spot
            //Y = correct letter, wrong spot
            //B = wrong letter 

            char[] feedback = buildFeedback(guess, correct);

            System.out.println("Feedback: ");
            System.out.println("\t" + spacedGuess);
            
            System.out.print("\t");
            for (int i = 0; i < feedback.length; i++) {
                System.out.print(feedback[i] + " ");
            }
            System.out.println("\n");
            
            numGuesses++;

            if (guess.equals(correct)) break;
        }

        if (numGuesses < 6) {
            System.out.printf("Correct, the answer is %s. It took you %d guesses.%n", correct, numGuesses);
        }
        else {
            System.out.printf("You are out of guesses. The answer was %s.%n", correct);
        }
    }
}