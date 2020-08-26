package by.constantinVKLcorporation.module_02.multi_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 8. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
 * на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
 * пользователь с клавиатуры.
 */
public class ChangeColumn {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //формирование матрицы
        System.out.println("Введите количество строк: ");
        int strings = Integer.parseInt(reader.readLine());
        System.out.println("Введите количество столбцов: ");
        int columns = Integer.parseInt(reader.readLine());

        int a[][] = new int[strings][columns];

        int column_first[] = new int[strings]; //вспомагательные массивы
        int column_second[] = new int[strings];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {

                a[i][j] = (int) (Math.random() * 30);
                System.out.printf("%10d", a[i][j]);
            }
            System.out.println();

        }

        System.out.println("Введите номер столбца №1");
        int column1 = Integer.parseInt(reader.readLine());
        System.out.println("Введите номер столбца №2");
        int column2 = Integer.parseInt(reader.readLine());

        if (column1 > columns || column2 > columns || column1 < 0 || column2 < 0 || column1 == column2) {
            System.out.println("Введите корректные данные");

        }

        for (int i = 0; i < a.length; i++) { //заполнение вспомагательных массивов
            column_first[i] = a[i][column1];
        }
        for (int i = 0; i < a.length; i++) {
            column_second[i] = a[i][column2];
        }


        for (int i = 0; i < a.length; i++) { //замена столбцов
            a[i][column1] = column_second[i];
        }
        for (int i = 0; i < a.length; i++) {
            a[i][column2] = column_first[i];
        }
        System.out.println();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("%10d", a[i][j]);
            }
            System.out.println();
        }
    }
}