import java.util.Scanner;

/**
 * Java. Remove extra spaces.
 *
 * @author Aleksandr Liapunov
 * @version 1.5.2 date April 21, 2020
 */

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст:");
        String input = scanner.nextLine();
        System.out.println("Пробелы удалены:");
        String resultS = extraTrim(input);
        System.out.println(resultS);
    }

    static String extraTrim(String input) {
        input = input.trim();//удаление пробелов
        String result = input.replaceAll("\\s+", " ");
        return result;
    }
}