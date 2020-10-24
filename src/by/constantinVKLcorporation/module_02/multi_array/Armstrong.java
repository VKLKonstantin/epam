package by.constantinVKLcorporation.module_02.multi_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * 14.  Натуральное  число,  в  записи  которого  n  цифр,  называется  числом  Армстронга,  если  сумма  его  цифр,
 * возведенная  в  степень  n,  равна  самому  числу.  Найти  все  числа  Армстронга  от  1  до  k.  Для  решения  задачи
 * использовать декомпозицию.
 */
//пример 153=1*1*1+5*5*5+3*3*3=1+125+27
public class Armstrong {
    private static int n = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите K: ");
        int k = Integer.parseInt(reader.readLine());
        int mass[] = new int[k];

        decomposition(mass);
    }

    public static int[] populate(int mas[]) {//заполнение массива от 1 до k
        for (int i = 0, j = 0; i < mas.length; i++, j++) {
            mas[i] = j;
        }
        return mas;
    }


    public static void decomposition(int mas[]) {
        mas = populate(mas);

        int mas2[] = new int[10];
        for (int i = 0; i < mas.length; i++) { //разложение числа на цифры
            int buf1 = mas[i];
            while (buf1 >= 1) {
                int buf2 = buf1 - ((buf1 / 10) * 10);
                buf1 = buf1 / 10;
                mas2[n] = buf2;
                n++; //счет разрядности числа
            }
            if (sum(mas2, n) == mas[i]) { //вызов метода сравнения числа массива и числа, вычисленного по алгоритму
                System.out.println(mas[i]);
            }
            n = 0;
        }
    }
    //реализация алгоритма согласно примера 153=1*1*1+5*5*5+3*3*3=1+125+27
    public static int sum(int mas2[], int n) {
        int totalSum = 0;
        for (int j = 0, n2 = n; j < n; j++) {
            int level = 1;
            while (n2 > 0) {
                level = level * mas2[j];
                n2--;
            }
            n2 = n;
            totalSum = totalSum + level;

        }
        return totalSum;
    }


}
