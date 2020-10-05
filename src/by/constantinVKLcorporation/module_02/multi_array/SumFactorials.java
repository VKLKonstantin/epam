package by.constantinVKLcorporation.module_02.multi_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
 */
public class SumFactorials {
    public static void main(String[] args) throws IOException {

        int mas[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % 2 != 0) {
                sum = sum + factorial(mas[i]);
            }
        }
        System.out.println(sum);
    }

    public static int factorial(int a) {
        int b = 1;
        for (int i = 1; i <= a; i++) {
            b = b * i;
        }
        return b;
    }
}
