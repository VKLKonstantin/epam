package by.constantinVKLcorporation.module_02.multi_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 8. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
 * Пояснение. Составить метод(методы) для вычисления суммы  трех последовательно расположенных  элементов
 * массива с номерами от k до m.
 */
public class MassiveThreeElement {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите размерность массива: ");
        int n = Integer.parseInt(reader.readLine());
        System.out.println("Введите границы суммы");
        int k = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());

        int d[] = new int[n];

        for (int j = 0; j < d.length; j++) {
            d[j] = (int) (Math.random() * 30);

            System.out.printf("%3d ", d[j]);
        }
        System.out.println();

        System.out.println(sum(d, k, m));
    }

    public static int sum(int a[], int k, int m) {
        if (k > a.length || m > a.length) {
            System.out.println("элементы за пределами массива");
            return -1;
        }
        int three_element = 0;
        for (int i = k; i <= m; i++) {
            three_element = three_element + a[i];
        }
        return three_element;
    }

}
