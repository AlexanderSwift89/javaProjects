import java.util.Scanner;

/**
 * Java. Adding a new task to Task Manager.
 *
 * @author Aleksandr Liapunov
 * @version 1.5.1 date April 20, 2020
 */
class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        System.out.println("Введите название задачи и время на ее выполнение:");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int startPos = input.indexOf("начинается в");
        String startTimeString = input.substring(startPos + 12, startPos + 15);
        startTimeString = startTimeString.trim();//удаление пробелов
        int startTime = Integer.parseInt(startTimeString);//преобразование строковой переменной в числовое значение

        int finishPos = input.indexOf("заканчивается в");
        String finishTimeString = input.substring(finishPos + 15, input.length());
        finishTimeString = finishTimeString.trim();//удаление пробелов
        int finishTime = Integer.parseInt(finishTimeString);//преобразование строковой

        int compareOfTime = finishTime - startTime;
        if (compareOfTime > 0) {
            System.out.println("На задачу потребуется: " + compareOfTime);
        } else if (compareOfTime == 0) {
            System.out.println("На задачу потребуется: " + compareOfTime + " зачем тогда ее выполнять?");
        } else {
            System.out.println("Формат введенных данных неверный");
        }
    }
}