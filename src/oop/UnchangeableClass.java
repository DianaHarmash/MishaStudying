package oop;

public class UnchangeableClass {
    private static final UnchangeableClass unchangeableClass = new UnchangeableClass();
    private UnchangeableClass() { }
    public static UnchangeableClass getUnchangeableClass() {
        return unchangeableClass;
    }
}
