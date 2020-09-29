package by.constantinVKLcorporation.module_02.multi_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Декомпозиция с использованием методов (подпрограммы)
 * 1. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
 * натуральных чисел
 */
public class NokAndNod {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите n1 ");
        int n1 = Integer.parseInt(read.readLine());
        System.out.println("Введите n2 ");
        int n2 = Integer.parseInt(read.readLine());


        System.out.println("НОК: " + nok(n1, n2));
        System.out.println("НОД: " + nod(n1, n2));
    }

    public static int nok(int n1, int n2) {//нахождение НОК
        int nok = 0;
        for (int i = 2; i <= n1 || i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                nok = i;
            }
        }

        return nok;
    }

    public static int nod(int n1, int n2) {//Нахождение НОД
        int nok = nok(n1, n2);
        int nod = n1 * n2 / nok;
        return nod;
    }
}
