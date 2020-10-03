package by.constantinVKLcorporation.module_02.multi_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 */
public class OnlyNod {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите n1 ");
        int n1 = Integer.parseInt(read.readLine());
        System.out.println("Введите n2 ");
        int n2 = Integer.parseInt(read.readLine());
        System.out.println("Введите n3 ");
        int n3 = Integer.parseInt(read.readLine());
        System.out.println("Введите n4 ");
        int n4 = Integer.parseInt(read.readLine());

        System.out.println("НОД = "+nod(nod(n1, n2), nod(n3, n4)));

    }

    public static int nod(int n1, int n2) {//нахождение НОД
        int nod = 0;
        for (int i = 1; i <= n1 || i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                nod = i;
            }
        }

        return nod;
    }

}
