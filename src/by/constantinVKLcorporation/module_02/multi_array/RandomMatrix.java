package by.constantinVKLcorporation.module_02.multi_array;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
 * единиц равно номеру столбца.
 */

public class RandomMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите количество строк");
        int n = Integer.parseInt(read.readLine());
        System.out.println("Введите количество столбцов");
        int m = Integer.parseInt(read.readLine());

        if (n > m - 1) {

            int[][] a = new int[n][m];

            for (int i = 0; i < a.length; i++) {
                for (int j = i + 1; j < a[i].length; j++) {
                    a[i][j] = 1;
                }
                System.out.println();
            }
            System.out.println();

            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    System.out.printf("%5d", a[i][j]);
                }
                System.out.println();
            }
        } else {
            System.out.println("Количество столбцов превышает количество строк");
        }
    }
}


