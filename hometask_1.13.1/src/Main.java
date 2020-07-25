import java.util.Scanner;
import java.util.ArrayDeque;
import java.lang.*;

/**
 * Java. Lift.
 *
 * @author Aleksandr Liapunov
 * @version 1.13.1 date April 21, 2020
 */

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> queueOfFloors = new ArrayDeque<Integer>();
        int numberOfFloor = 0;
        int waitDoorsInSeconds = 10;//кол-во секунд необходимое на закрытие/открытие дверей
        int waitMoveInSeconds = 5; // кол-во секунд затрачиваемое лифтом на движение между этадами
        Integer totalSeconds = 0;//всего затрачено секунд
        Integer previousFloor = -1;//предыдущая остановка
        Integer currentFloor = 0;//текущий этаж
        while (true) {
            System.out.println("Ожидаю ввода этажа: (для завершения введите 0)");
            String inputString = scanner.nextLine();
            numberOfFloor = Integer.parseInt(inputString);
            if (numberOfFloor < 0 || numberOfFloor > 25) {
                System.out.println("Такого этада нет в доме, в доме есть этажи от 1 до 25.");
            } else if (numberOfFloor == 0) {
                queueOfFloors.add(numberOfFloor);
                break;
            } else {
                System.out.println("Введен этаж в допустимом диапазоне");
                queueOfFloors.add(numberOfFloor);
            }
        }
        System.out.println("Лифт проследовал по следующим этажам:");
        if (queueOfFloors.size() < 2) {
            Integer sLast = queueOfFloors.getLast();
            System.out.println("этаж - " + sLast);
            System.out.println("Затрачено времени на поездку - 0 с.");
        } else {
            queueOfFloors.removeLast();
            for (Integer floor : queueOfFloors) {
                System.out.print("этаж " + floor + "-> ");
            }
            System.out.println("этаж - 0");
            while (!queueOfFloors.isEmpty()) {
                currentFloor = queueOfFloors.remove();
                if (previousFloor != -1) {
                    totalSeconds += Math.abs(currentFloor - previousFloor) * waitMoveInSeconds;
                    totalSeconds += waitDoorsInSeconds;
                }
                previousFloor = currentFloor;
            }
            System.out.println("Время затраченное лифтом на маршрут =: " + totalSeconds + " с.");
        }
    }
}