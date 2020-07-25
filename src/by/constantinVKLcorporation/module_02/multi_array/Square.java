package by.constantinVKLcorporation.module_02.multi_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 */
public class Square {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите n (n должно быть четное): ");
        int n = Integer.parseInt(reader.readLine());

        int[][] a = new int[n][n];
        int first = 0;
        int second = n;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i % 2 == 0) {
                    first++;
                    a[i][j] = first;
                    System.out.printf("%3d ", a[i][j]);
                } else {

                    a[i][j] = second;
                    System.out.printf("%3d ", a[i][j]);
                    second--;
                }
            }
            first = 0;
            second = n;
            System.out.println();
        }

    }
}
