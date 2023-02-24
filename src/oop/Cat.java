package oop;

import java.util.Arrays;

public class Cat {
    private final int age;
    private String name;
    private final String[] arrayStrings;
    private final String eyeColor; // параметры (поля, атрибуты) определяют состояние класса
    public Cat(int age, String name, String eyeColor) {
        this.age = age;
        arrayStrings = new String[] {"someString1", "someString2", "someString3"};
        this.name = name;
        this.eyeColor = eyeColor;
    }
    @Override
    public boolean equals(Object obj) { // методы определяют поведение класса
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Cat obj1 = (Cat) obj;
        return this.age == obj1.age &&
               this.name.equals(obj1.name) &&
               this.eyeColor.equals(obj1.eyeColor);
    }
    public static void someMethod1() {
        System.out.println("Whatever static method"); // часть шаблона
    }
    protected void someMethod() {
        System.out.println("Whatever non-static method"); // часть объекта
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String[] getArrayStrings() {
        return arrayStrings;
    }

    public void setArrayStrings(String[] arrayStrings) {
        if (this.arrayStrings.length != arrayStrings.length) {
            return;
        }

        for (int x = 0; x < arrayStrings.length; x++) {
            this.arrayStrings[x] = arrayStrings[x];
        }
    }
    public String getEyeColor() {
        return eyeColor;
    }
    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", arrayStrings=" + Arrays.stream(arrayStrings).toList() +
                ", name='" + name + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                '}';
    }
}
