public class dz2 {


    public static void main(String[] args) {
        sumAB(2, 10);
        positiveOrNegative(-1);
        returnPositiveOrNegative(5);
        printLine("Привет", 5);
        leapYear(2100);

    }

    // Задание 1
    public static boolean sumAB(int a, int b) {
        int c = a + b;

        if ((c >= 10) && (c <= 20)) {
            return true;
        } else {
            return false;
        }
    }

    // Задание 2
    public static void positiveOrNegative(int x) {
        if (x >= 0)
            System.out.println("Число положительное");
        else
            System.out.println("Число отрицательное");

    }

    // Задание 3
    public static boolean returnPositiveOrNegative(int c) {
        return c >= 0;

    }

    // Задание 4
    public static void printLine(String s, int x) {
        for (int i = 0; i < x; i++) {
            System.out.println(s);

        }

    }

    // Задание 5
    public static boolean leapYear(int year) {
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))

            System.out.println("Год високостный");
             return true;



    }
}















