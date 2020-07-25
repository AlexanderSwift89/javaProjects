import java.util.Scanner;

/**
 * Java. Сryptographic machine.
 *
 * @author Aleksandr Liapunov
 * @version 1.4.1 date April 21, 2020
 */

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = " ";
        String output = " ";
        String output_res = " ";
        while (true) {
            System.out.println("Введите ASCII код (end для вывода результата):");
            input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }
            int input_int = Integer.parseInt(input, 8);
            output = Character.toString((char) input_int);
            output_res = output_res + output;
        }
        System.out.println("Результат:");
        System.out.print(output_res);
    }
}