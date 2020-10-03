package by.constantinVKLcorporation.module_02.multi_array;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.spec.RSAOtherPrimeInfo;

/**
 * 6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
 */
public class Mutual {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите первое число: ");
        int n1 = Integer.parseInt(reader.readLine());

        System.out.println("Введите второе число: ");
        int n2 = Integer.parseInt(reader.readLine());

        System.out.println("Введите третие число: ");
        int n3 = Integer.parseInt(reader.readLine());

        System.out.println(comparison(n1, n2, n3));
    }

    public static boolean comparison(int a, int b, int c) {
        int nod = 0;
        for (int i = 1; i <= a || i <= b || i <= c; i++) {

            if (a % i == 0 && b % i == 0 && c % i == 0) {
                nod = i;

            }
        }
        if (nod < 1) {
            System.out.println(nod);
            return false;
        } else {
            return true;
        }
    }

}
