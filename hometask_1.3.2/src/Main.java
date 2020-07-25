import java.util.Scanner;

/**
 * Java. Convert of time (days\hours\minutes to seconds).
 *
 * @author Aleksandr Liapunov
 * @version 1.3.2 date April 20, 2020
 */
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalTime = 0;
        int biggestTime = 0;
        int smallestTime = Integer.MAX_VALUE;

        while (true) {
            System.out.println("Введите название задачи");
            String titleTask = scanner.nextLine();
            System.out.println("Сколько дней потребуется на выполнение?");
            int days = scanner.nextInt();
            System.out.println("Сколько часов потребуется на выполнение?");
            int hours = scanner.nextInt();
            System.out.println("Сколько минут потребуется на выполнение?");
            int minutes = scanner.nextInt();
            int currentTimeTask = convertToSeconds(days, hours, minutes);
            totalTime += currentTimeTask;
            biggestTime = (currentTimeTask > biggestTime) ? currentTimeTask : biggestTime;
            smallestTime = (currentTimeTask < smallestTime) ? currentTimeTask : smallestTime;
            System.out.println("Для завершения работы введите 'end' для продолжения нажмите 'enter'");
            scanner.nextLine();
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                System.out.println("Всего потребуется:" + totalTime + " секунд");
                System.out.println("Самая продолжительная задача займет:" + biggestTime + " секунд");
                System.out.println("Самая короткая задача займет:" + smallestTime + " секунд");
                break;
            }
        }
    }

    static int convertToSeconds(int days, int hours, int minutes) {
        int seconds;
        seconds = days * 24 * 3600 + hours * 3600 + minutes * 60;
        return seconds;
    }
}
