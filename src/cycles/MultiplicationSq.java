package cycles;

import java.math.BigInteger;

/**
 *
 * Найти сумму квадратов первых ста чисел
 *
 */
public class MultiplicationSq {
    private static int x = 1;
    private static BigInteger a, b;

    public static void main(String[] args) {
        b = BigInteger.valueOf(x);
        for (int i = 1; i < 50; i++) {

            a = BigInteger.valueOf(i * i);
            b = b.multiply(a);

        }
        System.out.println(b);
    }
}
