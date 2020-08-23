package by.constantinVKLcorporation.module_02.multi_array;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
 */
public class SquareMatrixNN {
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
        int k1 = 0; //число, уменьшающее количество ячеек с единицами
        int k2 = stringsANDcolums; //триггер, который сработает, когда останется две единицы
        int string = 0;//число, указывающее, с какой строки начать заполнение единицами, после того, как сработает триггер


        for (int i = 0; i < a.length; i++) { //заполнение первой половины матрицы

            for (int j = k1; j < a[i].length - k1; j++) {
                a[i][j] = 1;

            }
            k2 = k2 - 2;
            k1++;
            string++;

            if (k2 < 2) {
                break;
            }
        }

        if (k2 == 0) {

            for (int i = string; i < a.length; i++) { //заполнение второй половины матрицы
                for (int j = k1 - 1; j < a[i].length - k1 + 1; j++) {
                    a[i][j] = 1;
                }
                k1--;
            }
        }


        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}
