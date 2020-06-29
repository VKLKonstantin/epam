package by.constantinVKLcorporation.module_01.linear_program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Вычислить значение выражения по формуле (все переменные принимают действительные значения)
 */
public class Third {
    private static double x, y, z;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите x ");
        String s1 = reader.readLine();

        System.out.println("Введите y ");
        String s2 = reader.readLine();


        x = Double.parseDouble(s1);
        y = Double.parseDouble(s2);


        formula(x, y);
    }

    public static double formula(double x, double y) {
        double z1 = Math.cos(x) - Math.sin(y);
        if (z1 == 0) {
            throw new ArithmeticException();
        }

        z = ((Math.cos(x) + Math.sin(y)) / z1) * Math.tan(x * y);
        System.out.println("z = " + z);
        return z;
    }
}
