package by.constantinVKLcorporation.module_02.multi_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 7.  Пусть  даны  две  неубывающие  последовательности  действительных  чисел
 * Требуется указать те места, на которые нужно вставлять элементы последовательности
 * в первую последовательность так, чтобы новая последовательность оставалась возрастающей.
 */
public class NumberSeven {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(read.readLine());

        int mass1[] = new int[n];
        int mass2[] = new int[n];
        int buffer;//временное хранение элемента массива


        for (int i = 0; i < mass1.length; i++) {
            mass1[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(mass1));

        for (int i = 0; i < mass2.length; i++) {
            mass2[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(mass2));

        for (int i = 0; i < mass1.length - 1; i++) {
            int j = i;
            if (mass1[i] > mass1[i + 1]) {
                while (j >= 0 && mass1[j] > mass1[j + 1]) {
                    buffer = mass1[j];
                    mass1[j] = mass1[j + 1];
                    mass1[j + 1] = buffer;
                    j--;
                }
            }
        }
        System.out.println(Arrays.toString(mass1));
        for (int i = 0; i < mass2.length - 1; i++) {
            int j = i;
            if (mass2[i] > mass2[i + 1]) {
                while (j >= 0 && mass2[j] > mass2[j + 1]) {
                    buffer = mass2[j];
                    mass2[j] = mass2[j + 1];
                    mass2[j + 1] = buffer;
                    j--;
                }
            }
        }
        System.out.println(Arrays.toString(mass2));
        for (int i = 0; i < mass2.length; i++) {
            if (mass2[i] > mass1[i]) {
                int a = i + 1;
                System.out.println("Положение элемента массива2 " + i + " в массиве 1 =" + a + " ");
            }
            if (mass1[i] > mass2[i]) {
                System.out.println("Положение элемента массива2 " + i + " в массиве 1 =" + i + " ");
            }
        }
    }
}
