package by.constantinVKLcorporation.module_02.multi_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
 * действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
 */
public class Mission17 {
    private static int subtraction;
    private static int n;
    private static int totalSum;
    private static int newN;

    public static void main(String[] args) throws IOException {
        System.out.println("Введите число: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(reader.readLine());

        int count = 0;
        newN = n;
        while (newN > 0) {
            sum();
            difference();
            System.out.println(subtraction);
            count++;

        }
        System.out.println("Количество действий " + count);
    }

    private static int sum() {
        totalSum = 0;
        int buf1 = newN;
        while (buf1 >= 1) {
            int buf2 = buf1 - ((buf1 / 10) * 10);
            totalSum = totalSum + buf2;
            buf1 = buf1 / 10;
        }
        return totalSum;
    }

    private static int difference() {
        subtraction = newN - totalSum;
        newN = subtraction;
        return subtraction;
    }

}


