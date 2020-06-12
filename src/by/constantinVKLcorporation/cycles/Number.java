package by.constantinVKLcorporation.cycles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */
public class Number {
    private static int m, n, z = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите n: ");
        String s1 = reader.readLine();
        n = Integer.parseInt(s1);
        System.out.println("Введите m: ");
        String s2 = reader.readLine();
        m = Integer.parseInt(s2);

        number(n);
        number(m);

    }

    public static void number(int n) {
        while (n != 0) {
            z = n % 10;
            System.out.print(z + " ");
            n = n / 10;
        }
        System.out.println();
        z = 1;
    }
}
