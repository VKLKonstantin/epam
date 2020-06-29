package by.constantinVKLcorporation.module_01.loop;

/**
 * Найти сумму квадратов первых ста чисел
 */
public class SumSq {
    private static int y = 0, x = 0;

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            y = i * i;
            x = x + y;
        }
        System.out.println(x);
    }
}
