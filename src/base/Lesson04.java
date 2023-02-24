package base;

import java.util.Scanner;
import java.util.StringJoiner;

public class Lesson04 {
    public static void main(String[] args) {

        //** Task 1 **//
        System.out.print("Enter amount of words you need: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        String[] wordList = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + (i + 1) + " word: ");
            wordList[i] = in.next();
        }

        System.out.print("Your words: ");

        for (int i = 0; i < n; i++) {
            System.out.print(wordList[i] + " ");
        }
        System.out.println();

        //** Task 2 **//
        System.out.println("Enter 10 words. ");
        String[] tenWords = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter " + (i + 1) + " word: ");
            tenWords[i] = in.next();
        }

        System.out.print("'for' way: "); //similar can be done with while.

        for (int i = 0; i < 10; i++) {
            System.out.print(tenWords[i] + " ");
        }
        System.out.println();

        System.out.println("Dumb way: " + tenWords[0] + " " + tenWords[1] + " " + tenWords[2] + " " + tenWords[3] + " " + tenWords[4] + " " + tenWords[5] + " " + tenWords[6] + " " + tenWords[7] + " " +tenWords[8] + " " + tenWords[9]);

        StringJoiner tenwords = new StringJoiner(" "); // we use Camel case in Java
        for (int i = 0; i < 10; i++) {
            tenwords.add(tenWords[i]);
        }

        String fin = tenwords.toString();
        System.out.print("'Stringjoiner' way: " + fin);
        System.out.println();

        // Also can be done another way
        String myString = String.join(" ", tenWords);
        System.out.println(myString);

        in.reset();

        //** Task 3 **//
        System.out.print("Delimiter: ");
        String del = in.next();
        System.out.print("Num1: ");
        int num1 = in.nextInt();
        System.out.print("Num2: ");
        int num2 = in.nextInt();

        String s1 = Integer.toString(num1);
        String s2 = Integer.toString(num2);
        String uni = String.join(del, s1, s2); // SUPER!!!

        System.out.print("Result: " + uni);

    }
}
