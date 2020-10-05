package by.constantinVKLcorporation.module_02.multi_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
 */
public class MoreNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите x1: ");
        int x1 = Integer.parseInt(reader.readLine());

        System.out.println("Введите x2: ");
        int x2 = Integer.parseInt(reader.readLine());

        System.out.println(more(x1, x2));
    }

    public static int more(int x1, int x2) {
        int x11 = 0, x22 = 0;
        double buf1 = (double) x1, buf2 = (double) x2;

        while (buf1 > 1 || buf2 > 1) {
            buf1 = buf1 / 10;
            buf2 = buf2 / 10;
            if (buf1 > 1) {
                x11++;
            }
            if (buf2 > 1) {
                x22++;
            }
        }
        if (x11 > x22) {
            return x1;
        }
        if (x11 < x22) {
            return x2;
        } else {
            return -1;
        }
    }
}
