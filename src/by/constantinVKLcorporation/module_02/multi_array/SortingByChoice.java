package by.constantinVKLcorporation.module_02.multi_array;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 3. Сортировка выбором. Дана последовательность чисел (возрастающая)
 * Требуется переставить элементы так,
 * чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
 * элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
 * повторяется. Написать алгоритм сортировки выбором.
 */
public class SortingByChoice {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int buffer;

        System.out.println("Введите размерность первого массива");
        int n1 = Integer.parseInt(read.readLine());
        int[] mass = new int[n1];

        for (int i = 0; i < mass.length; i++) {
            mass[i] = i;
            System.out.print(mass[i] + ", ");
        }
        System.out.println();

        for (int i = 0; i < mass.length / 2; i++) { //сортировка выбором
            buffer = mass[i];
            mass[i] = mass[mass.length - 1 - i];
            mass[mass.length - 1 - i] = buffer;

        }

        System.out.println();

        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + ", ");

        }

    }
}
