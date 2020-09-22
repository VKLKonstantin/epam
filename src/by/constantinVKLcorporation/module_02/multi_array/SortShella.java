package by.constantinVKLcorporation.module_02.multi_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 6.  Сортировка Шелла.  Дан  массив  n  действительных  чисел.  Требуется  упорядочить  его  по  возрастанию.
 */
public class SortShella {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(read.readLine());

        int mass[] = new int[n];
        int buffer;//временное хранение элемента массива
        int index;//номер ячейки массива

        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(mass));

        for (int i = 0; i < mass.length - 1; i++) {
            int j = i;
            if (mass[i] > mass[i + 1]) {
                while (j >= 0 && mass[j] > mass[j + 1]) {
                    buffer = mass[j];
                    mass[j] = mass[j + 1];
                    mass[j + 1] = buffer;
                    j--;
                }
            }
        }
        System.out.println(Arrays.toString(mass));
    }

}