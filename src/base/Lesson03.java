package base;

import java.util.Scanner;

public class Lesson03 {
    public static void main(String[] args) {
        //** Task 1 **//

        Scanner in = new Scanner(System.in);
        System.out.print("Enter -a: ");
        double a = in.nextDouble();
        System.out.print("Enter b: ");
        double b = in.nextDouble();
        a = -a;
        System.out.println("Result: " + ((a * b + 10) / 3 + (a + 2 / b - 7) * 5 - a - b / a));

        //** Task 2 **//

        System.out.print("Enter number: ");
        double num = in.nextInt();
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        //** Task 3 **//

        System.out.print("Enter 1st number: ");
        double num_1 = in.nextDouble();
        System.out.print("Enter 2nd number: ");
        double num_2 = in.nextDouble();
        System.out.print("Enter 3rd number: ");
        double num_3 = in.nextDouble();
        System.out.println("Average: " + ((num_1 + num_2 + num_3) / 3));

        //** Task 4 **//

        int[] rand = new int[3];

        for (int i = 0; i <= 2; i++) {
            rand[i] = (int) Math.round(Math.random() * 10);
        }

        System.out.println("Numbers: ");
        for (int i = 0; i <= 2; i++) {
            System.out.print(rand[i] + ", ");
        }
        System.out.println();

        int max = 0, min = 10, middle = 0;

        for (int i = 0; i <= 2; i++) {
            if (rand[i] > max) max = rand[i];
        }
        for (int i = 0; i <= 2; i++) {
            if (rand[i] < min) min = rand[i];
        }
        for (int i = 0; i <= 2; i++) {
            if (rand[i] != max && rand[i] != min) middle = rand[i];
        }

        System.out.println("Max: " + max + ", Min: " + min + ", Middle: " + middle);

        //** Task 5 **//

        int[] arr = new int[3];

        for (int i = 0; i <= 2; i++) {
            System.out.print("Enter " + (i + 1) + " number: ");
            arr[i] = in.nextInt();
        }



        for (int i = 0; i <= 2; i++) {
            if (arr[i] == 2 || arr[i] == 3) System.out.println("Prime number found: " + arr[i]);
                else if (arr[i] > 3) {
                for (int j = 2; j <= Math.sqrt(arr[i]); j++) {
                    if (arr[i] % j == 0) {
                        System.out.println("Not prime!");
                        break;

                    } else {
                        System.out.println("Prime number found: " + arr[i]);
                        break;
                    }
                }
            }
        }

        //** Task 6 **//

        int val = 0;
        while (val != -99){
            System.out.print("Enter your value (or '-99' to exit): ");
            val = in.nextInt();
            if (val <= 10 && val > 0) System.out.println("Your number is positive under (equal to) ten, or null ");
            else System.out.println("Your number is positive up ten or below null");
        }

        //** Task 7 **//

        int k = -99999999, x = -888888888;
        String garbage;
        while (k == -99999999) {
            System.out.print("Enter first number (any, except -99999999): ");
            if (!in.hasNextInt()){
                garbage = in.nextLine();
                System.out.println("Wrong value. Try again");
                in.reset();
            } else {
                k = in.nextInt();
                break;
            }
        }
        while (x == -888888888) {
            System.out.print("Enter first number (any, except -888888888): ");
            if (!in.hasNextInt()){
                garbage = in.nextLine();
                System.out.println("Wrong value. Try again");
                in.reset();
            } else {
                x = in.nextInt();
                break;
            }
        }

        System.out.println("Result: " + (x + k));

        //** Task 8 **//

        String [] week = {"monday" , "tuesday", "wednesday", "thursday", "friday", "weekend"};
        int day = 0;
        while(day != -1){
            System.out.println("Enter the number of day, 1-7 (or -1 to exit): ");
            day = in.nextInt();
            switch (day){
                case 1:
                    System.out.println(week[day-1]);
                    break;
                case 2:
                    System.out.println(week[day-1]);
                    break;
                case 3:
                    System.out.println(week[day-1]);
                    break;
                case 4:
                    System.out.println(week[day-1]);
                    break;
                case 5:
                    System.out.println(week[day-1]);
                    break;
                case 6:
                    System.out.println(week[day-1]);
                    break;
                case -1:
                    break;
            }
        }

        //** Task 9 **//

        int[] mas = new int[3];

        System.out.println("Enter 3 values: ");
        for (int i = 0; i <= 2; i++) {
            mas[i] = in.nextInt();
        }

        System.out.println("Numbers: ");
        for (int i = 0; i <= 2; i++) {
            System.out.print(mas[i] + ", ");
        }
        System.out.println();

        int min_1 = Math.abs(mas[1]);

        for (int i = 0; i <= 2; i++) {
            if (Math.abs(mas[i]) < min_1)  min_1 = mas[i];
        }

        System.out.println("Min: " + min_1);

        //** Task 10 **//

        double number = 1.4234;
        System.out.println("1.4234 ^ 3 = " + (int) Math.round(Math.pow(number, 3)));

    }
}
