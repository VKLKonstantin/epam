package branches;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Вычислить значение функции
 */
public class Function {
    private static int x, y;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите x: ");
        String s1 = reader.readLine();
        x = Integer.parseInt(s1);

        if (x <= 3) {
            y = x * x - 3 * x + 9;
        } else {
            y = 1 / (x * x * x + 6);
        }
        System.out.println("y = " + y);
    }
}
