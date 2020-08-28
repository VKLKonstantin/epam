package by.constantinVKLcorporation.module_02.multi_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 10. Найти положительные элементы главной диагонали квадратной матрицы.
 */
public class PositiveDiagonalMatrix {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //формирование матрицы
        System.out.println("Введите количество строк и столбцов: ");
        int strings_and_columns = Integer.parseInt(reader.readLine());


        int a[][] = new int[strings_and_columns][strings_and_columns];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {

                a[i][j] = -5 + ((int) (Math.random() * 10) + 1);
                System.out.printf("%10d", a[i][j]);

            }
            System.out.println();
        }

        for (int i = 0, j = 0; i < a.length; i++, j++) { //поиск положительных элементов главной диагонали матрицы

            if (a[i][j] > 0) {
                System.out.print(a[i][j] + " ");
            }
        }
    }
}
