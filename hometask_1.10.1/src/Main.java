import java.util.Scanner;

/**
 * Java. Shooter game.
 *
 * @author Aleksandr Liapunov
 * @version 1.10.1 date April 21, 2020
 */
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        // Как настоящие программисты мы имеем в виду, что исчисление начинается с 0
        System.out.format("У игрока %d слотов с оружием,"
                        + " введите номер, чтобы выстрелить,"
                        + " -1 чтобы выйти%n",
                player.getSlotsCount()
        );
        int slot;
        int equalExit = -1;//переменная с которой сравнивается вводимое пользователем значение
        int inputValue = 0;//переменая, хранящая вводимое пользователем в цикле значение
        while (inputValue != equalExit) {
            inputValue = Integer.parseInt(scanner.nextLine());
            if (inputValue == equalExit) {
                break;
            } else {
                player.shotWithWeapon(inputValue);
            }
        }
        System.out.println("Game over!");
    }
}