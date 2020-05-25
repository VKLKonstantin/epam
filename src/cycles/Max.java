package cycles;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Найти max{min(a, b), min(c, d)}
 */
public class Max {
    private static int a, b, c, d, min1, min2, max;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите a: ");
        String s1 = reader.readLine();
        System.out.println("Введите b: ");
        String s2 = reader.readLine();
        System.out.println("Введите c: ");
        String s3 = reader.readLine();
        System.out.println("Введите d: ");
        String s4 = reader.readLine();
        a = Integer.parseInt(s1);
        b = Integer.parseInt(s2);
        c = Integer.parseInt(s3);
        d = Integer.parseInt(s4);
        comparison(a, b, c, d);

    }

    public static void comparison(int a, int b, int c, int d) {
        if (a < b) {
            min1 = a;
        } else {
            min1 = b;
        }

        if (c < d) {
            min2 = c;
        } else {
            min2 = d;
        }
        if (min1 > min2) {
            max = min1;
        } else {
            max = min2;
        }
        System.out.println("максимальное число: " + max);

    }
}
