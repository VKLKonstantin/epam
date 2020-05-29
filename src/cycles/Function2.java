package cycles;

/**
 * Найти сумму квадратов первых ста чисел
 */
public class Function2 {
    private static int y = 0, x = 0;

    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {
            y = i * i;
            x = x + y;
        }
        System.out.println(x);
    }
}
