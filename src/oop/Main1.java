package oop;

public class Main1 {

    // классы, не имеющие параметров -> stateless

    public static void someMethodFromMain1() {
        System.out.println("I am PUBLIC a method from oop.Main1");
    }

    public static void main(String[] args) {

    }

    private static void createObjects() {
        Cat cat1 = new Cat(1, "Keks", "blue"); // oбъект, экземпляр, инстанс -> одно и то же

        /*
        Cat - тип ссылки,
        cat1 - ссылка,
        new - оператор вызова конструктора,
        Cat - конструктор
         */
        System.out.println(cat1);

        Cat cat2 = new Cat(2, "Keks2", "green");
        System.out.println(cat2);

        Cat cat3 = new Cat(1, "Keks", "blue");
        System.out.println(cat3);

        Cat cat = new Cat(1, "Keks", "blue");
        cat.setArrayStrings(new String[] {"someString4", "someString5", "someString10"});
        cat.setName("Sobaka");
        System.out.println(cat.getName());
        System.out.println(cat);

        System.out.println("Are objects Cat1 & Cat2 equal? " + cat1.equals(cat2));
        System.out.println("Are objects Cat1 & Cat3 equal? " + cat1.equals(cat3));
    }

}
