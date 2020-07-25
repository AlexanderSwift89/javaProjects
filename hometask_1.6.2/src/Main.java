import java.util.Scanner;
import java.util.Arrays;

/**
 * Java. Manual array sorting.
 *
 * @author Aleksandr Liapunov
 * @version 1.6.2 date April 21, 2020
 */

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputTable = new String[3];
        Product[] products = new Product[10];
        int j = 0;
        int inputPrice = 0;
        for (int i = 0; i < products.length; i++) {
            products[i] = new Product();
        }
        while (true) {
            System.out.println("Введите через пробел:");
            System.out.println("Название товара, цену товара и его описание, для окончания ввода введите end");
            String inputString = scanner.nextLine();
            if (inputString.equals("end") == true) {
                break;
            }
            inputTable = inputString.split(" ");
            inputPrice = Integer.parseInt(inputTable[1]);
            products[j].initProduct(inputTable[0], inputPrice, inputTable[2]);
            j++;
        }
        System.out.println("---------------Введенные данные--------------------------------");
        System.out.println("Название товара     Цена товара          Описание товара");
        System.out.println("---------------------------------------------------------------------");
        for (int i = 0; i < products.length; i++) {
            products[i].showProduct();
        }

        Arrays.sort(products);//сортировка массива объектов

        System.out.println("---------------Отсортированные данные--------------------------------");
        System.out.println("Название товара     Цена товара          Описание товара");
        System.out.println("---------------------------------------------------------------------");

        for (int i = 0; i < products.length; i++) {
            products[i].showProduct();
        }
    }
}
