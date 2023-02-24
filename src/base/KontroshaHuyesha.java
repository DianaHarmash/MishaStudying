package base;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.Calendar;

public class KontroshaHuyesha {
    private final static int [] decimal = {49, 50, 51, 52, 53, 54, 55, 56, 57, 48};
    public static void main(String[] args) {
        String fuckingScannerError;

        //** Task 1 **//
        //Пользователь вводит рандомно буквы и числа. Все записывать в массив строк. Вывести на экран только числа.

        System.out.print("Enter the number of statements you want to enter: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        String [] numsAndWords = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + (i + 1) + " statement: ");
            if (i == 0) {
                fuckingScannerError = in.nextLine(); // what's the purpose of this line?
            }
            numsAndWords[i] = in.nextLine();
        }
        System.out.println();

        int count = 0;
        System.out.println("Numbers: ");
        for (int i = 0; i < n; i++) {
            char [] statement = numsAndWords[i].toCharArray();
            for (int j = 0; j < statement.length; j++){
                for (int k = 0; k < 10; k++) {
                    if ((int) statement[j] == decimal[k]) count++; // pretty nice!
                }
            }
            if (count == statement.length) {
                System.out.println(numsAndWords[i]);
                count = 0;
            } else {
                count = 0;
            }
        }
        System.out.println();

        //** Task 2 **//
        //Пользователь вводит рандомные слова. Вывести на экран длину самого большого и самого маленького.

        System.out.print("Enter the number of words you want to enter: ");
        n = in.nextInt();

        String [] wordlist = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + (i + 1) + " word: ");
            if (i == 0) {
                fuckingScannerError = in.nextLine();
            }
                wordlist[i] = in.nextLine();
        }
        System.out.println();

        //** int max = 0, min = 1000; /--you can't use hard code when you have--/ to **//
        int max = wordlist[0].length();
        int min = wordlist[0].length(); // plus, we do not unite two declaration of variable in the same line,

        for (int i = 1; i < n; i++){
            if (wordlist[i].length() > max) max = wordlist[i].length();
            if (wordlist[i].length() < min) min = wordlist[i].length();
        }

        System.out.println("The biggest word's length: " + max + "\nThe smallest word's length: " + min);
        System.out.println();

        //** Task 3 **//
        //Пользователь вводит рандомные числа. Создать переменную boolean isOdd. Посчитать
        //сумму всех чисел и присвоить переменной isOdd true, если сумма нечетная, иначе false,
        //если четная. Вывести на экран значение переменной isOdd.

        System.out.print("Enter amount of numbers: ");
        n = in.nextInt();

        int [] num = new int [n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + (i + 1) + " number: ");
            if (i == 0){
                fuckingScannerError = in.nextLine();
            }
            num[i] = in.nextInt();
        }
        System.out.println();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += num[i];
        }

        /*-- boolean isOdd = false;
        if (sum % 2 == 0) isOdd = true; --*/

        // can be done another way:
        boolean isOdd = sum % 2 == 0;
        System.out.println("Is the sum odd? " + isOdd + "!");
        System.out.println();

        //** Task 4 **//
        //Пользователь вводит строку в формате “числа, разделенные пробелом”: "1 2 3 4 5".
        //Пользуясь методом String.split() разделить строку на массив строк. Преобразовать
        //каждый элемент в тип int. Выяснить, какое значение в массиве чисел минимальное и максимальное.

        System.out.print("Enter the numbers through ' ': ");
        fuckingScannerError = in.nextLine();
        String startNums = in.nextLine();

        String [] splitedNums = startNums.split(" "); // very well!
        int [] convertedNums = new int [splitedNums.length];

        for (int i = 0; i < splitedNums.length; i++){
            convertedNums[i] = Integer.parseInt(splitedNums[i]); // nice!:)
        }

        /*-- int max1 = -2147483648, min1 = 2147483647; --*/
        int max1 = convertedNums[0];
        int min1 = convertedNums[0];

        for (int i = 1; i < splitedNums.length; i++){
            if (convertedNums[i] > max1) max1 = convertedNums[i];
            if (convertedNums[i] < min1) min1 = convertedNums[i];
        }

        System.out.println("The biggest number: " + max1 + "\nThe smallest number: " + min1);
        System.out.println();

        //** Task 5 **//
        //Пользователь вводит рандомные числа. Проверить, были ли введенные пользователем числа расставлены
        //в порядке возрастания. Вывести true, если да.

        System.out.print("Enter amount of numbers: ");
        n = in.nextInt();

        int [] arr = new int[n];
        int buf = 1;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + (i + 1) + " number: ");
            arr[i] = in.nextInt();
            if (i > 0 && arr[i] > arr[i-1]) buf++; // nice!:)
        }

        boolean increasingOrder = false;
        if (buf == n) increasingOrder = true;

        System.out.println("Increasing order? " + increasingOrder + "!");
        System.out.println();

        //** Task 6 **//
        //Пользователь вводит рандомные числа, которые программа пишет в массив, и одно рандомное число,
        //которое записывается в переменную int limitValue. Проверить, были ли все введенные пользователем
        //числа меньше либо равны ограничивающего значения. Вывести true, если да.

        System.out.print("Enter amount of numbers: ");
        n = in.nextInt();
        int [] num1 = new int [n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + (i + 1) + " number: ");
            num1[i] = in.nextInt();
        }

        System.out.print("Enter limit value: ");
        int limVal = in.nextInt();
        boolean inRange = true;

        for (int i = 0; i < n; i++) {
            if (num1[i] > limVal) inRange = false;
        }

        System.out.println("Are all numbers down the limit value? " + inRange + "!");
        System.out.println();

        //** Task 7 **//
        //Пользователь вводит рандомное значение. Вывести на экран таблицу умножения этого числа от 0 до 9.

        System.out.print("Enter the number: ");
        n = in.nextInt();

        System.out.println("_____________________");
        for (int i = 0; i < 10; i++){
            System.out.println(n + " * " + i + " = " + (n * i));
        }

        System.out.println("______________________");
        System.out.println();

        //** Task 8 **//
        //Пользователь вводит рандомное значение. Вывести на экран сумму всех чисел до этого числа (включая его).

        System.out.print("Enter the number: ");
        n = in.nextInt();

        sum = 0;
        if (n > 0) {
            for (int i = n; i != 0; i--){
                sum += i;
            }
        } else {
            for (int i = n; i != 0; i++){
                sum += i;
            }
        }

        System.out.println("The sum is: " + sum);
        System.out.println();

        //** Task 9 **//
        //Напишите программу на Java для переворачивания строки, изменив расположение символов в строке задом
        //наперёд без использования встроенных в String функций.

        System.out.print("Enter the text: ");
        fuckingScannerError = in.nextLine();
        String deftext = in.nextLine();
        char [] upsideDown = deftext.toCharArray();
        char bin;
        int step = 0;
        int size = upsideDown.length;

        for (int i = 0; i < size; i++) {
            bin = upsideDown[size - 1];
            upsideDown[size - 1] = upsideDown[i];
            upsideDown[i] = bin;
            step++;
            size--;
        }

        String fintext = new String(upsideDown);
        System.out.println("Upside down: " + fintext);
        System.out.println();

        //** Task 10 **//
        //Напишите программу на Java для того, чтобы поменять местами значения,
        //хранящиеся в двух переменных с помощью третьей переменной.

        int a = 45;
        int b = 67;

        buf = a;
        a = b;
        b = buf;

        System.out.println("A: " + a + "\nB: " + b);
        System.out.println();

        //или я не понял прикола, или задание ни про что... well, it is..

        //** Task 11 **//
        //Напишите Java-программу, чтобы определить, является ли строка или число палиндромом, или нет

        System.out.print("Enter the text or number: ");
        String start = in.nextLine();
        char [] convert = start.toCharArray();
        step = 0;
        count = 0;
        size = convert.length;

        for (int i = 0; i < size; i++) {
            if (convert[size - 1] == convert[i]) {
                count++;
                step++;
                size--;
            }
        }

        if (((convert.length / 2) == step && convert.length % 2 == 0) || ((convert.length / 2 + 1) == step && convert.length % 2 != 0)) System.out.println("Palindrome!");
        else System.out.println("Not palindrome.");
        System.out.println();

        //** Task 12 **//
        //Написать программу на Java для вычисления серии чисел Фибоначчи.

        System.out.print("Enter amount of Fibonacci numbers you want to generate: ");
        n = in.nextInt();
        a = 0;
        b = 1;
        int fib;
        System.out.print("Your numbers: " + a + ", "  + b + ", ");

        for (int i = 0; i < (n - 2); i++) {
            fib = a + b;
            System.out.print(fib + ", ");
            if (i % 2 == 0) a = fib;
            else b = fib;
        }

        System.out.println();

        //** Task 13 **//
        //Напишите программу на Java, чтобы найти повторяющиеся символы в строке.

        System.out.print("Enter the text: ");
        fuckingScannerError = in.nextLine();
        start = in.nextLine();
        convert = start.toCharArray();
        char [] duplicates = new char[convert.length / 2];
        count = 0;
        step = 0;
        buf = 0;

        for (int i = 0; i < convert.length; i++) {
            for (int j = i + 1; j < convert.length; j++) {
                for (int k = 0; k < duplicates.length; k++) {
                    if (convert[i] == duplicates[k]) count++;
                }
                if (count == 0 && convert[i] == convert[j]){
                    System.out.println("Match found!\nSymbol: " + convert[i] + "; Position 1: " + i + "; Position 2: " + j + ".\n");
                    step++;
                }
                else if (count != 0) continue;
            }
            if (step > 0){
                duplicates[buf] = convert[i];
                buf++;
                step = 0;
                count = 0;
            }
        }

        //** Task 14 **//
        //Напишите Java-программу, чтобы найти второе по величине число в массиве.

        System.out.print("Enter the size of array: ");
        n = in.nextInt();
        int [] arr1 = new int [n];

        System.out.print("Your array: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = (int) Math.round(Math.random() * 45);
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        int preMax = arr1[1];
        max = arr1[0];
        count = 0;

        for (int i = 1; i < n; i++) {
            if (arr1[i] > max) max = arr1[i];
        }

        for (int i = 0; i < n; i++) {
            if (arr1[i] > preMax && arr1[i] < max) preMax = arr1[i];
        }

        System.out.println("Max: " + max + "; PreMax: " + preMax + "\n");

        //** Task 15 **//
        //Пользователь вводит число N – количество элементов массива и N целых чисел,
        //представляющих заданный массив. Вывести два числа: сумму положительных элементов
        //и произведение чисел, расположенных между минимальным и максимальным элементами.

        System.out.print("Enter the size of array: ");
        n = in.nextInt();
        int [] arr2 = new int [n];

        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + " element: ");
            arr2[i] = in.nextInt();
        }

        System.out.print("Your array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        max = arr2[0];
        min = arr2[0];
        int indmin = 0;
        int indmax = 0;
        sum = 0;
        int mult = 1;

        for (int i = 0; i < n; i++) {
            if (arr2[i] > max) {
                max = arr2[i];
                indmax = i;
            }
            if (arr2[i] < min) {
                min = arr2[i];
                indmin = i;
            }
        }

        /* I really don't understand what happens in this part of the code.

        for (int i = 0; i < n; i++) {
            if (arr2[i] > 0) sum += arr2[i];
        }

        if (indmin > indmax) {
            for (int i = (indmax + 1); i < indmin; i++) {
                mult *= arr2[i];
            }
        } else {
            for (int i = (indmin + 1); i < indmax; i++) {
                mult *= arr2[i];
            }
        }*/

        for (int x = 0; x < arr2.length; x++) {
            if (!(x == indmin || x == indmax)) {
                mult *= arr2[x];
            }
            if (arr2[x] > 0) {
                sum += arr[x];
            }
        }

        System.out.println("The sum of all positive elements is " + sum + ";\nThe multiple of all elements between max and min is " + mult + ".\n");

        //** Task 16 **//
        //Пользователь три натуральных числа a, b и c – измерения параллелепипеда.
        //Выведите два целых числа: площадь поверхности и объем заданного параллелепипеда.

        System.out.println("Enter the sides of parallelepiped;");
        System.out.print("A: ");
        a = in.nextInt();
        System.out.print("B: ");
        b = in.nextInt();
        System.out.print("C: ");
        int c = in.nextInt();

        System.out.print("Square: " + ((a * b) + (b * c) + (a * c)) + ";\n"); // very well!
        System.out.println("Volume: " + (a * b * c) + ".\n"); // nice:)

        //** Task 17 **//
        //Пользователь вводит два целых числа - час, когда он лег спать, и час,
        //на который он установил будильник. Выведете на экран целое число – через сколько часов зазвонит будильник.

        //ИЗМЕНЕННОЕ ЗАДАНИЕ: поебитесь с классами DATE и CALENDAR часика так полтора-два, чтобы создать следующую програму: Будильник. Пользоатель
        //вводит значение даты и времени в формате строки, которые затем с помощью метода String.split() и parseInt() передаются в
        //целевой объект класса Calendar, который обозначает дату и время будильника. С помощью класса Date вывести текущее и целевое
        //время и определить разницу между ними в днях часах и минутах, или иными словами, вывести время через которое сработает будильник.


        System.out.print("Enter the date of alarm (through '/', day then month): ");
        fuckingScannerError = in.nextLine();
        String awakeDateLine = in.nextLine();
        System.out.print("Enter the time of alarm (through ':'): ");
        String awakeTimeLine = in.nextLine();

        String[] awakeDateConv = awakeDateLine.split("/");
        String[] awakeTimeConv = awakeTimeLine.split(":");

        Calendar sleepTime = new GregorianCalendar();
        Date current = sleepTime.getTime();
        System.out.println("Current time: " + current);

        Calendar alarmTime = new GregorianCalendar(sleepTime.getWeekYear(), Integer.parseInt(awakeDateConv[1]) - 1, Integer.parseInt(awakeDateConv[0]), Integer.parseInt(awakeTimeConv[0]), Integer.parseInt(awakeTimeConv[1]));

        Date alarm = alarmTime.getTime();
        System.out.println("Alarm time: " + alarm);

        long delta = alarm.getTime() - current.getTime();
        long seconds = delta / 1000;
        int minutes = (int) seconds / 60;
        int hours = minutes / 60;
        int minutes_left = minutes % 60;
        int days = hours / 24;
        int hours_left = hours % 24;

        System.out.println("Time to alarm: " + days + " days, " + hours_left + " hours, " + minutes_left + " minutes.");
        System.out.println();

        // Wow!

        //** Task 18 **//
        //Пользователь вводит два числа: – количество строк, которое печатается на странице книги, и – номер строки.
        //Выведете на экран два числа – номер страницы, на которой будет напечатана эта строка и номер строки на странице.

        System.out.print("Enter the amount of pages in the book: ");
        int pages = in.nextInt();
        System.out.print("Enter the amount of strings on a page: ");
        int str = in.nextInt();
        System.out.print("Enter the number of string, page of which you are searching for: ");
        int goal = in.nextInt();

        if (goal / str <= pages && goal > 0 && pages > 0 && str > 0) System.out.println("Your page is: " + ((goal / str) + 1) + ". The number of string on the page: " + (goal % str));
        else System.out.println("This string doesn't exist.");

        // AWESOME!

    }

}



