package by.constantinVKLcorporation.module_02.multi_array;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
 */
public class SortMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите количество строк");
        int n = Integer.parseInt(read.readLine());
        System.out.println("Введите количество столбцов");
        int m = Integer.parseInt(read.readLine());
        int[][] a = new int[n][m];

        for (int i = 0; i < a.length; i++) {//заполнение матрицы
            for (int j = 0; j < a[i].length; j++) {

                a[i][j] = -5 + ((int) (Math.random() * 10) + 1);
                System.out.printf("%5d ", a[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        int buffer;
        boolean trigger = true; //переключатель

        System.out.println("Сортировка по возрастанию ");
        for (int i = 0; i < a.length; i++) {
            trigger = false;
            while (!trigger) {
                trigger = true;
                for (int j = 0; j < a[i].length - 1; j++) {
                    if (a[i][j] > a[i][j + 1]) {
                        trigger = false;
                        buffer = a[i][j];
                        a[i][j] = a[i][j + 1];
                        a[i][j + 1] = buffer;
                    }
                }
            }
        }


        for (int i = 0; i < a.length; i++) { //вывод первой матицы
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("%5d", a[i][j]);
            }
            System.out.println();
        }

        System.out.println("Сортировка по убыванию ");
        for (int i = 0; i < a.length; i++) {
            trigger = false;
            while (!trigger) {
                trigger = true;
                for (int j = 0; j < a[i].length - 1; j++) {
                    if (a[i][j] < a[i][j + 1]) {
                        trigger = false;
                        buffer = a[i][j];
                        a[i][j] = a[i][j + 1];
                        a[i][j + 1] = buffer;
                    }
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("%5d", a[i][j]);
            }
            System.out.println();
        }

    }
}
