public class Lesson01 {
    final static int a = 5;
    //static int a1 = b; - ясен хуй, что это невозможно!
    final static boolean isProgramRunning = true;
    public static void main(String[] args) {
        System.out.println("Task1:\nHello world!\n"); // неплохо, конечно, не спорю:)

        int a = 12948;
        long b = 986378673463l;
        boolean yasno = true;
        System.out.println("Task2:\n" + "a = " + a + "\n" + "b = " + b + "\n" + "Yasno: " + yasno + "\n\n");

        System.out.println("Task3:\n" + "1. byte;\n2. short;\n3. int;\n4. long;\n5. float;\n6. double;\n7. boolean;\n8. char.\n\n"); // отлично, запомни это.
                                                                                                                                     // Любят на собеседованиях валить. Сама много раз слышала, ято люди обычно дальше чем int, char, long, double и boolean пройти не могут.
        System.out.println("Task4:\nStatic a = " + Lesson01.a + "\n\n"); // супер:)

        final var n = 5;
        //n = 9; - compiler says "go fuck yourself"
        // нет ни малейшего сомнения в том, что он так и сказал:)

        System.out.println("Task5:\nProgram running status: " + isProgramRunning + "\n" + "n = " + n + "\n\n");

        int b1 = Lesson01.a;
        //Main.a = 7; - compiler says "go fuck yourself"
        // как обычно. Он такой предсказуемый, этот копилятор:)
        int resultOfA = 5;
        int resultOfB = 5;
        System.out.println("Task6:\nA: " + Lesson01.a + " = " + resultOfA + "\nB: " + b1 + " = " + resultOfB + "\n\n");

        int b2 = 10;
        System.out.println("Task7:\nB = " + b2 + "\nA can't be initialized in the way, that was described in task\n");
        // действительно. Вопрос остается почему?
    }
}