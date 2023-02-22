import java.util.Scanner;

public class Lesson05 {

    //** Methods for task 1 **//
    public static int getValue () {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        return n;
    }

    public static int [] firstSubsequence (int n) {
        int [] arr = new int[n];
        arr[0] = 2;

        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + 2;
        }

        return arr;
    }

    public static int [] secondSubsequence (int n) {
        int [] arr = new int[n];
        arr[0] = 1;

        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + 2;
        }

        return arr;
    }

    public static int [] thirdSubsequence (int n) {
        int [] arr = new int[n];
        int count = 1;

        for (int i = 0; i < n; i++) {
            arr[i] = (int) Math.pow(count, 2);
            count++;
        }

        return arr;
    }

    public static int [] fourthSubsequence (int n) {
        int [] arr = new int[n];
        int count = 1;
        arr[0] = count;

        for (int i = 0; i < n; i++) {
            arr[i] = (int) Math.pow(count, 3);
            count++;
        }

        return arr;
    }

    public static void show1 (int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //** Methods for task 2 **//

    public static void show2 (int arr[][]) {
        System.out.println("Your array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void showBelowZero(int arr[][]) {
        System.out.print("Elements below zero: ");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < 0) System.out.print(arr[i][j] + ", ");
            }
        }
        System.out.println(".");
    }

    public static void negativeInString(int arr[][], int n) {
        System.out.print("Negative elements in string " + n + ": ");
        n--;

        for (int i = 0; i < arr.length; i++) {
            if (arr[n][i] < 0) System.out.print(arr[n][i] + "; ");
        }

        System.out.println();
    }

    public static void negativeInColumn(int arr[][], int n) {
        System.out.print("Negative elements in column " + n + ": ");
        n--;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i][n] < 0) System.out.print(arr[i][n] + "; ");
            }

        System.out.println();
    }

    public static void diagonalElements1(int arr[][]) {
        System.out.print("Diagonal 1: ");
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == count) System.out.print(arr[i][count] + "; ");
            }
            count++;
        }
        System.out.println();
    }

    public static void diagonalElements2(int arr[][]) {
        System.out.print("Diagonal 2: ");
        int count = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = arr[i].length - 1; j >= 0; j--) {
                if (j == count) System.out.print(arr[i][count] + "; ");
            }
            count++;
        }
        System.out.println();
    }

    //** Methods for task 3 **//

    public static int[] create8Arr() {
        int [] arr = new int[8];
        for (int i = 0; i < 8; i++) {
            arr[i] = (int) Math.round(Math.random() * 10);
        }
        return arr;
    }

    public static void replaceOdds(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) arr[i] = 0;
        }
    }

    //** Methods for task 4 **//

    public static int [] createArr(int n){
        int [] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = (int) Math.round(Math.random() * 50 + 1);
            //if (i == 5) {
            //    arr[i-1] = arr[i];
            //    arr[i-2] = arr[i];
            //}
        }

        return arr;
    }

    public static int [] findMostFrequentEl(int [] arr) {
        int [][] elTable = new int [arr.length][2];
        int count = 0;
        int countEls = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < elTable.length; j++) {
                if (arr[i] == elTable[j][0]) {
                    elTable[j][1]++;
                    count++;
                }
        }
            if (count == 0) {
                elTable[countEls][0] = arr[i];
                elTable[countEls][1] = 1;
                countEls ++;
            }
        }

        int [] elAndCount = mostFrequent(elTable);
        return elAndCount;
    }

    public static int [] mostFrequent(int [][] elTable) {
        int [] elAndCount = {0, 0};

        for (int i = 0; i < elTable.length; i++) {
            if (elTable[i][1] > elAndCount[1]) {
                elAndCount[0] = elTable [i][0];
                elAndCount[1] = elTable[i][1];
            }
        }

        int max = elAndCount[1];

        for (int i = 0; i < elTable.length; i++) {
            for (int j = 0; j < elTable.length; j++) {
                if (i != j) {
                    if (elTable[i][1] == elTable[j][1] && elTable[i][1] == max) {
                        elAndCount[0] = 0;
                        elAndCount[1] = 0;
                    }
                }
            }
        }

        return elAndCount;
    }


    //** task methods **//

    //** Task 1 **//

    public static void task1 () {
        int m = 1;
        int n = 0;

        while (m != 0) {
            System.out.print("Enter the number of subsequence (1-4, or 0 to exit): ");
            m = getValue();
            if (m != 0 && m > 0 && m <= 4) { // m > 0 means m != 0 by default
                // so it can be simplified:
                // if (m > 0 && m <= 4)
                System.out.print("Enter the number of elements you need: ");
                n = getValue();
            }

//            int [] num = new int[n];
//            you define num[] in ***Subsequence methods, so there is no need to define it here
//            just declaration will be enough

            int num[];

            switch (m) {
                case 1:
                    num = firstSubsequence(n);
                    show1(num);
                    break;
                case 2:
                    num = secondSubsequence(n);
                    show1(num);
                    break;
                case 3:
                    num = thirdSubsequence(n);
                    show1(num);
                    break;
                case 4:
                    num = fourthSubsequence(n);
                    show1(num);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Wrong data entered. Try again.");
                    break;
            }
        }
    }

    //** Task 2 **//

    public static void task2(){
        int [][] arr = {{1, -2, 3}, {-4, 5, -6},  {7, -8, 9}};
        show2(arr);
        showBelowZero(arr);
        System.out.print("Enter the number of string: ");
        int n = getValue();
        negativeInString(arr, n);
        System.out.print("Enter the number of column: ");
        n = getValue();
        negativeInColumn(arr, n);
        diagonalElements1(arr);
        diagonalElements2(arr);
    }

    //** Task 3 **//

    public static void task3(){
        int [] arr = create8Arr();
        System.out.print("Your start array: ");
        show1(arr);
        replaceOdds(arr);
        System.out.print("Your final array: ");
        show1(arr);

    }

    //** Task 4 **//

    public static void task4(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = in.nextInt();
        int [] arr = createArr(n);
        System.out.println("Your array: ");
        show1(arr);
        int [] result = findMostFrequentEl(arr);
        if (result[1] != 0) System.out.println("Most frequent element: " + result[0] + "; It was noticed " + result[1] + " times.");
        else System.out.println("2 or more elements with the same frequency.");


    }

    public static void main(String[] args) {
        task1(); // nice, I am glad to see several usages of getValue() without creating new methods with the same purpose
        task2(); // well done!
        task3(); // nice to see you've defined to functions show1() and show2() to use them for one-dimension and two-dimension arrays
        task4(); // pretty nice:)

        // what I want to see is:
        // printNumberOfTheTask(number of task); before calling task1(), task2(), etc.
    }

    private static void printNumberOfTheTask(int number) {
        System.out.println("The " + number + " task.");
    }
}
