import java.util.Scanner;

/**
 * Java. Adder.
 *
 * @author Aleksandr Liapunov
 * @version 1.2.0 date April 19, 2020
 */
class Main {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int result = 0;
        //-----------------------------------------------
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        num1 = scanner.nextInt();
        //-----------------------------------------------
        System.out.println("Введите второе число:");
        num2 = scanner.nextInt();
        //-----------------------------------------------
        System.out.println("Введите третье число:");
        num3 = scanner.nextInt();
        //-----------------------------------------------
        result = sum(num1, num2, num3);
        //-----------------------------------------------
        System.out.println("Сумма чисел = " + result);
    }

    //-----------------------------------------------
    static int sum(int value1, int value2, int value3) {
        return value1 + value2 + value3;
    }
}