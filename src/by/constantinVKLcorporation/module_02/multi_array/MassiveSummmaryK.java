package by.constantinVKLcorporation.module_02.multi_array;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 12. Даны натуральные числа К  и N. Написать метод(методы) формирования массива А,  элементами  которого
 * являются числа, сумма цифр которых равна К и которые не большее N
 */
public class MassiveSummmaryK {
    public static int sum = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите K: ");
        int k = Integer.parseInt(reader.readLine());
        System.out.println("Введите N: ");
        int n = Integer.parseInt(reader.readLine());


        int a[] = new int[n];
        System.out.println(Arrays.toString(summ(a, k)));
    }

    public static int[] mass(int a[]) { //заполнение массива
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        return a;
    }

    public static int[] summ(int a[], int k) {//сравнение суммы элементов и k
        a = mass(a);
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        if (sum > k) {
            int buf = sum - k;
            a[a.length - 1] = a[a.length - 1] - buf;
            return a;
        }
        if (sum < k) {
            int buf = k - sum;
            a[a.length - 1] = a[a.length - 1] + buf;
            return a;
        } else {
            return a;
        }
    }

}
