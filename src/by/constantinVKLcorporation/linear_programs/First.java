package by.constantinVKLcorporation.linear_programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Basics of software code development
 * Найдите  значение функции: z = ( (a – 3 ) * b / 2) + c
 */
public class First {

    private static int a, b, c, z;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите а ");
        String s1 = reader.readLine();

        System.out.println("Введите b ");
        String s2 = reader.readLine();

        System.out.println("Введите c ");
        String s3 = reader.readLine();

        a = Integer.parseInt(s1);
        b = Integer.parseInt(s2);
        c = Integer.parseInt(s3);

        formula(a, b, c);

    }

    public static int formula(int a, int b, int c) {
        z = ((a - 3) * b / 2) + c;

        System.out.println("z = " + z);
        return z;
    }
}
