package by.constantinVKLcorporation.module_02.multi_array;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 5. Сортировка вставками. Дана последовательность чисел
 * Требуется переставить числа в порядке возрастания.  Примечание. Место помещения очередного элемента в отсортированную часть производить
 * с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
 */
public class SortInsert {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(read.readLine());

        int mass[] = new int[n];
        int buffer;//временное хранение элемента массива
        int index;//номер ячейки массива

        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 100);
        }

        System.out.println(Arrays.toString(mass));//Вывод неотсортированного массива
        System.out.println();

        for (int j = 1; j < mass.length; j++) {//сортировка методом вставки
            buffer = mass[j];
            index = j;

            while (index > 0 && mass[index - 1] >= buffer) {

                mass[j] = mass[j - 1];
                --index;

            }
            mass[index] = buffer;
        }

        System.out.println(Arrays.toString(mass));//вывод отсортированного массива
    }
}
