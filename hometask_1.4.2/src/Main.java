import java.util.Scanner;

/**
 * Java. Compare of double (type of data).
 *
 * @author Aleksandr Liapunov
 * @version 1.4.2 date April 21, 2020
 */

class Main {
    public static void main(String[] args) {
        int typeOfOperation = 0;
        float value1 = 0;
        float value2 = 0;
        int resultRound1 = 0;
        int resultRound2 = 0;
        long resultLong1 = 0;
        long resultLong2 = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Операции над double/float");
        System.out.println("1. Сравнить");
        System.out.println("2. Округлить");
        System.out.println("3. Отбросить дробную часть");

        typeOfOperation = scanner.nextInt();

        System.out.println("Введите первое число");
        value1 = scanner.nextFloat();
        System.out.println("Введите второе число");
        value2 = scanner.nextFloat();

        switch (typeOfOperation) {
            case 1:
                float compare = value1 - value2;
                if (compare == 0) {
                    System.out.println("Введеные числа равны");
                } else if (compare > 0) {
                    System.out.println("Первое число больше чем второе");
                } else {
                    System.out.println("Второе число больше чем первое");
                }
                break;
            case 2:
                resultRound1 = Math.round(value1);
                resultRound2 = Math.round(value2);
                System.out.println("Превое число после операции округления равно:" + resultRound1);
                System.out.println("Второе число после операции округления равно:" + resultRound2);
                break;
            case 3:
                resultLong1 = (long) value1;
                resultLong2 = (long) value2;
                System.out.println("Первое число после операции отбрасывания дробной части равно:" + resultLong1);
                System.out.println("Второе число после операции отбрасывания дробной части равно:" + resultLong2);
                break;
            default:
                System.out.println("Неверно выбранная операция, возможные значени от 1 до 3");
                break;
        }
    }
}