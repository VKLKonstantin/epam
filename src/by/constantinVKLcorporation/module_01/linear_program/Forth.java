package by.constantinVKLcorporation.module_01.linear_program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
 * дробную и целую части числа и вывести полученное значение числа
 */
public class Forth {
    private static double r, a2;
    private static int a1, b1;

    public static void main(String[] args) throws IOException {
        System.out.println("Введите число типа nnn.ddd: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        r = Double.parseDouble(s);
        change(r);
    }

    public static double change(double r) throws IOException {

        a1 = (int) r; //выделяем целую часть
        if (a1 > 999) {
            throw new IOException("Неверный формат");
        }
        a2 = a1 / 1000d; //переводим целую часть в дробную
        b1 = (int) ((double) (r - (double) a1) * 1000d);//выделяем дробную часть и переводим ее в целую

        System.out.println(b1 + a2);
        return b1 + a2;
    }

}
