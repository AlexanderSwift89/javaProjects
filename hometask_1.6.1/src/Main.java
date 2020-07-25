import java.util.Scanner;
import java.util.ArrayList;

/**
 * Java. Shopping.
 *
 * @author Aleksandr Liapunov
 * @version 1.6.1 date April 21, 2020
 */

public class Main {
    public static void main(String[] args) {
        int productNumber = 0;//переменная для ввода номера продукта
        int productCount = 0;// переменная для ввода количества покупаемых продуктов
        int currentPrices = 0;// переменная для хранения текущей стоимости
        Scanner scanner = new Scanner(System.in);

        String[] inputArray = new String[2];
        String[] products = new String[]{"Хлеб", "Яблоки", "Молоко"};
        ArrayList<String> outputTable = new ArrayList<>();
        outputTable.add("Наимнование товара" + "   " + "Количество товара" + "   " + "Цена/за ед." + "   " + "Общая стоимость");
        int sumProducts = 0;//переменная для хранения общей стоимости товара одного типа
        int totalSum = 0;//переменная для хранения итоговой стоимости товара
        int[] prices = new int[]{100, 200, 300};
        int j = 0; //размерность выходного массива
        String pos1, pos2, pos3, pos4 = null;

        for (int k = 0; k < products.length; k++) {
            System.out.println((k + 1) + "." + products[k]);
        }

        while (true) {
            System.out.println("Выберите товар и количество или введите `end`");
            String inputString = scanner.nextLine();
            if (inputString.equals("end") == true) {
                break;
            }
            inputArray = inputString.split(" ");
            try {
                productNumber = Integer.parseInt(inputArray[0]) - 1;
            } catch (NumberFormatException e) {
                System.out.println("Введите целое число");
            }
            productCount = Integer.parseInt(inputArray[1]);
            currentPrices = prices[productNumber];
            pos1 = products[productNumber];
            pos2 = Integer.toString(productCount);
            pos3 = Integer.toString(currentPrices);
            pos4 = Integer.toString(productCount * currentPrices);
            sumProducts = productCount * currentPrices;
            totalSum = totalSum + sumProducts;
            outputTable.add("      " + pos1 + "                 " + pos2 + "              " + pos3 + "            " + pos4);
            j++;
        }
        outputTable.add("                                            " + "Итого" + "           " + totalSum);
        for (int i = 0; i < outputTable.size(); i++) {
            System.out.println(outputTable.get(i));
        }
    }
}