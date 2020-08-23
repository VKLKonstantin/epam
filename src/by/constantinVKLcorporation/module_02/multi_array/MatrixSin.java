package by.constantinVKLcorporation.module_02.multi_array;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 7. Сформировать квадратную матрицу порядка N по правилу
 * A[I,J] = sin((I^2 - J^2) / N) и подсчитать количество положительных элементов в ней.
 */

public class MatrixSin {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите количество строк и столбцов ");
        int n = Integer.parseInt(reader.readLine());
        double[][] matrix = new double[n][n];
        int positive = 0; //количество положительных эелементов

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Math.sin((i * i - j * j) / n); //заполнение матрицы элементами по формуле
                System.out.printf("%15f", matrix[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < matrix.length; i++) { //подсчет количества положительных элементов
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > 0) {
                    positive++;
                }
            }
        }
        System.out.println();
        System.out.println("Количество положительных елементов: " + positive);
    }
}
