import java.util.Scanner;

public class Lesson02 {

    public static void main(String[] args) {
        //** Task1 **//
        System.out.print("Enter random number: ");
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()) {
            int num = in.nextInt();
            System.out.println("Your number: " + num);
        } else {
            System.out.println("Number doesn't exist ");
        }

        //** Task2 **//
        System.out.print("Enter your name: ");
        String name = in.next();
        System.out.print("Enter your surname: ");
        String surname = in.next();
        System.out.print("Enter your full age: ");
        int fullAge = in.nextInt();
        System.out.println("Name: " + name + "\nSurname: " + surname + "\nFull age: " + fullAge);
    }
}
