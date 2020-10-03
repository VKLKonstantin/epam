package by.constantinVKLcorporation.module_02.multi_array;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 5. Составить программу, которая в массиве A[N] находит второе по величине число  (вывести на печать число,
 * которое меньше максимального элемента массива, но больше всех других элементов).
 */
public class SecondMax {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите количество элементов: ");
        int n = Integer.parseInt(reader.readLine());

        int[] a = new int[n];

        for (int j = 0; j < a.length; j++) {
            a[j] = (int) (Math.random() * 30);

            System.out.printf("%3d ", a[j]);
        }
        System.out.println();
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println();
        if (a[a.length - 2] != a[a.length - 1]) {
            System.out.println(a[a.length - 2]);
        } else {
            for (int i = 2; a[a.length - i - 1] == a[a.length - i]; ) {
                i++;
                if (a[a.length - i - 1] != a[a.length - i])
                    System.out.println(a[a.length - i - 1]);
            }
            System.out.println();
        }
    }

}
