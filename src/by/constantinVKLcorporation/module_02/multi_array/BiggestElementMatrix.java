package by.constantinVKLcorporation.module_02.multi_array;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
 */
public class BiggestElementMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите количество строк");
        int n = Integer.parseInt(read.readLine());
        System.out.println("Введите количество столбцов");
        int m = Integer.parseInt(read.readLine());
        int[][] a = new int[n][m];
        int max_string = 0;
        int max_total = 0;
        for (int i = 0; i < a.length; i++) {//заполнение матрицы
            for (int j = 0; j < a[i].length; j++) {

                a[i][j] = -10 + ((int) (Math.random() * 20) + 1);
                System.out.printf("%5d ", a[i][j]);
            }
            System.out.println();
        }
        System.out.println();

//поиск наибольшего элемента
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {

                if (a[i][j] > max_string) {
                    max_string = a[i][j];
                }

            }
            if (max_string > max_total) {
                max_total = max_string;

            }

        }
        System.out.println("Максимальный элемент матрицы " + max_total);

        //формирование новой матрицы
        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] % 2 != 0) {
                    a[i][j] = max_total;
                }

            }

        }
        //вывод новой матрицы
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("%5d", a[i][j]);
            }
            System.out.println();
        }

    }


}
