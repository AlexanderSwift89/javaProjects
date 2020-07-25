import java.util.Random;
import java.util.Date;

/**
 * Java. Rotate the matrix 90 degrees clockwise.
 *
 * @author Aleksandr Liapunov
 * @version 1.7.1 date April 21, 2020
 */

class Main {
    public static void main(String[] args) {
        Date date = new Date();
        int SIZE = 8;
        int[][] colors = new int[SIZE][SIZE];//исходный массив
        int[][] rotatedColors = new int[SIZE][SIZE];// повернутый массив на 90 градусов
        Random random = new Random();
        System.out.println("Исходный двумерный массив");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }
        showMatrix(colors);
        //поворот матрицы на 90 градусов
        System.out.println("Массив повернутый на 90 градусов");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotatedColors[i][j] = colors[SIZE - j - 1][i];
            }
        }
        showMatrix(rotatedColors);
    }

    //-------------------Функция отображения массива----------------------
    public static void showMatrix(int[][] matrix) {
        int SIZE = 8;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", matrix[i][j]);
            }
            System.out.println();//перевод строки массива на новую строку
        }
    }
}