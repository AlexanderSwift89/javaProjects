import java.util.Scanner;

/**
 * Java. Calculation of the area and circumference.
 * @author Aleksandr Liapunov
 * @version 1.2.1 date April 20, 2020
 */
class Main {
    public static void main(String[] args) {
        int radius = 0;
        final double Pi = 3.14;
        //-----------------------------------------------
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите радиус окружности в сантиметрах:");
        radius = scanner.nextInt();
        //-----------------------------------------------
        double area = calculateCircleArea(radius);
        double length = calculateCircleLength(radius);
        //-----------------------------------------------
        System.out.println("Площадь окружности: " + area + " см.кв.");
        System.out.println("Длина окружности: " + length + " см.");
    }

    //-----------------------------------------------
    static double calculateCircleArea(int radius) {
        final double Pi = 3.14;
        return Pi * radius * radius;
    }

    //-----------------------------------------------
    static double calculateCircleLength(int radius) {
        final double Pi = 3.14;
        return 2 * Pi * radius;
    }
}