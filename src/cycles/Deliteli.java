package cycles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
 * m и n вводятся с клавиатуры
 */
public class Deliteli {
    private static int m, n;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите n: ");
        String s1 = reader.readLine();
        n = Integer.parseInt(s1);
        System.out.println("Введите m: ");
        String s2 = reader.readLine();
        m = Integer.parseInt(s2);
        if (n <= 0 || m <= 0) {
            System.out.println("Введите натуральные числа");
        }
        for (int i = n; i <= m; i++) {
            for (int j = 2; j < n; j++) {

                if (i % j == 0) {
                    System.out.println("делители для числа " + i + ": " + j);
                }


            }
        }

    }
}
