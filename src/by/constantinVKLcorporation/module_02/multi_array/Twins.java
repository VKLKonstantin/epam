package by.constantinVKLcorporation.module_02.multi_array;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 13. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
 * Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n  - заданное натуральное число больше 2. Для
 * решения задачи использовать декомпозицию.
 */
public class Twins {

    public static void main(String[] args) throws IOException {

        int mass[] = {4, 11, 13, 5, 8, 41, 43, 7};
        simple(mass);
    }

    public static int simple(int a[]) {//поиск пары простых чисел
        int i = 0;
        int first = 0;
        int second = 0;

        for (; i < a.length; i++) {

            for (int j = 2; j < a[i]; j++) {
                if (a[i] % j != 0) {
                    continue;

                } else {
                    j = 1;
                    first = 0;
                    if (i < a.length - 1) {
                        i++;
                    } else {
                        break;
                    }
                }
            }

            if (first != 0) {
                second = a[i];
            } else {
                first = a[i];
            }

            if (first != 0 && second != 0) {
                two(first, second, i);
                first = 0;
                second = 0;
            }

        }
        return -1;
    }

    public static int two(int first, int second, int i) { // нахождение разности

        int difference = Math.abs(first - second);
        if (difference == 2) {
            end(first, second);
        }
        return i;
    }

    public static void end(int first, int second) { //вывод пары чисел
        System.out.println(first + " " + second);
    }

}
