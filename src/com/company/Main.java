package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Basics of software code development
 * Найдите  значение функции: z = ( (a – 3 ) * b / 2) + c
 */
public class Main {

    private static int a, b, c, z;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        String s3 = reader.readLine();
        System.out.println("Введите а " + a);
        System.out.println("Введите b " + b);
        System.out.println("Введите c " + c);
        a = Integer.parseInt(s1);
        b = Integer.parseInt(s2);
        c = Integer.parseInt(s3);

        z = ((a - 3) * b / 2) + c;

        System.out.println(z);

    }
}
