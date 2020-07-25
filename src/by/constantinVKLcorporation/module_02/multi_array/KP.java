package by.constantinVKLcorporation.module_02.multi_array;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */
public class KP {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            //формирование матрицы
            System.out.println("Введите количество строк ");
            int strings = Integer.parseInt(reader.readLine());

            System.out.println("Введите количество столбцов ");
            int columns = Integer.parseInt(reader.readLine());

            int[][] a = new int[strings][columns];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {

                    a[i][j] = (int) (Math.random() * 30);
                    System.out.print(a[i][j] + "  ");
                }
                System.out.println();
            }

        // выбор искомой строки и столбца
        System.out.println("Введите номер строки");
        int k = Integer.parseInt(reader.readLine());
        System.out.println("Введите номер столбца");
        int p = Integer.parseInt(reader.readLine());

        // проверка, что номер строки и столбца находится в пределах массива
        if (k >= strings || p >= columns) {
            System.out.println("Выход за пределы массива");
        } else {
            // поиск выбранной строки
            System.out.println("Выбранная строка:");
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    if (i == k) {

                        System.out.print(a[i][j] + " ");
                    }

                }
                System.out.println();
            }
            // поиск столбца
            System.out.println("Выбранный столбец: ");
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    if (j == p) {
                        System.out.print(a[i][j] + " ");
                    }

                }
                System.out.println();
            }

        }
    }
}