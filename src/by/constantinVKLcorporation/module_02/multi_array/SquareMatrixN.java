package by.constantinVKLcorporation.module_02.multi_array;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
 */
public class SquareMatrixN {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //формирование матрицы
        System.out.println("Введите количество строк и столбцов (четное число)");
        int stringsANDcolums = Integer.parseInt(reader.readLine());

        //проверка на четность
        if (stringsANDcolums % 2 != 0) {
            System.out.println("Вы ввели нечетное число");
            stringsANDcolums = -1;
        }

        int a[][] = new int[stringsANDcolums][stringsANDcolums];
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length - k; j++) {
                a[i][j] = k + 1;

            }
            k++;
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}
