package by.constantinVKLcorporation.module_02.multi_array;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 9. Задана матрица неотрицательных чисел. Посчитать  сумму  элементов  в каждом  столбце. Определить,  какой
 * столбец содержит максимальную сумму.
 */
public class PositiveMatrix {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //формирование матрицы
        System.out.println("Введите количество строк: ");
        int strings = Integer.parseInt(reader.readLine());
        System.out.println("Введите количество столбцов: ");
        int columns = Integer.parseInt(reader.readLine());

        int a[][] = new int[strings][columns];

        int sum[] = new int[columns];
        int max_sum_column = 0;
        int max = -1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {

                a[i][j] = (int) (Math.random() * 10);
                System.out.printf("%10d", a[i][j]);
            }
            System.out.println();

        }
        for (int i = 0; i < a.length; i++) {//столбцы
            for (int j = 0; j < a[i].length; j++) {//строки
                sum[i] = sum[i] + a[j][i];
            }

        }

        for (int i = 0; i < a.length - 1; i++) {
            if (sum[i] > max) {
                max = sum[i];
                max_sum_column = i;
            }
        }


        System.out.println(max_sum_column);
    }
}
