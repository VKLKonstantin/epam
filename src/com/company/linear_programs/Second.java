package com.company.linear_programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Вычислить значение выражения по формуле (все переменные принимают действительные значения)
 */
public class Second {

    private static double a, b, c, z;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите а ");
        String s1 = reader.readLine();

        System.out.println("Введите b ");
        String s2 = reader.readLine();

        System.out.println("Введите c ");
        String s3 = reader.readLine();

        a = Double.parseDouble(s1);
        b = Double.parseDouble(s2);
        c = Double.parseDouble(s3);

        formula(a, b, c);
    }

    public static double formula(double a, double b, double c) {
        if (a<=0||b<0||c<0){
            throw new ArithmeticException("Ошибка! Деление на 0 или переменные не действительные числа");
        }
        z = (b + (Math.sqrt(Math.pow(b, 2.0) + 4 * a * c))) / 2 * a - (Math.pow(a, 3.0) * c) + Math.pow(b, -2.0);

        System.out.println("z = " + z);
        return z;
    }
}
