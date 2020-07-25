import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.lang.*;

/**
 * Java. Notebook.
 *
 * @author Aleksandr Liapunov
 * @version 1.12.1 date April 21, 2020
 */

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> tasks = new ArrayList<String>();
        while (true) {
            System.out.println("Выберете действие:");
            System.out.println("1. Добавить задачу");
            System.out.println("2. Вывести список задач");
            System.out.println("3. Удалить задачу");
            System.out.println("0. Выход");
            String inputString = scanner.nextLine();
            if (inputString.equals("end") == true || inputString.equals("0") == true) {
                break;
            }
            switch (inputString) {
                case "1":
                    while (true) {
                        System.out.println("Введите название задачи (для завершения введите end)");
                        String inputTask = scanner.nextLine();
                        if (inputTask.equals("end") == true) {
                            break;
                        } else {
                            tasks.add(inputTask);
                        }
                    }
                    break;
                case "2":
                    System.out.println("Список введенных задач:");
                    int i = 0;
                    for (String task : tasks) {
                        System.out.println(" " + i + ". " + task);
                        i++;
                    }
                    break;
                case "3":
                    while (true) {
                        System.out.println("Введите номер задачи которую необходимо удалить (для завершения введите end):");
                        String taskIndex = scanner.nextLine();
                        if (taskIndex.equals("end") == true) {
                            break;
                        } else {
                            tasks.remove(Integer.parseInt(taskIndex));
                        }
                    }
                    break;
                case "0":
                    break;
                default:
                    System.out.println("Вы можете вводить значения от 0 до 3 или слово [end]");
            }
        }
        System.out.println("Вы вышли из программы");
    }
}
