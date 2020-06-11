package cycles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Даны  числовой  ряд  и  некоторое  число  е.  Найти  сумму  тех  членов  ряда,
 * модуль  которых  больше  или  равен заданному е.
 */
public class Sequence {
    private static int e, n;
    private static double an;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите e: ");
        String s1 = reader.readLine();
        e = Integer.parseInt(s1);
        System.out.println("Введите n: ");
        String s2 = reader.readLine();
        n = Integer.parseInt(s2);

        if (1 / Math.pow(2, n) < e) {
            an = 1 / Math.pow(2, n) + 1 / Math.pow(3, n);
        }
        System.out.println(an);
    }
}
