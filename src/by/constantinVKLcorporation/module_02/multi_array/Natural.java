package by.constantinVKLcorporation.module_02.multi_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 10.  Дано  натуральное  число  N.  Написать  метод(методы)  для  формирования  массива,  элементами  которого
 * являются цифры числа N.
 */
public class Natural {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите размерность массива: ");
        int x = Integer.parseInt(reader.readLine());
        System.out.println("Введите натуральное  число  N: ");
        int n = Integer.parseInt(reader.readLine());
        int mass[] = new int[x];
        System.out.println(Arrays.toString(massive(mass, n)));
    }

    public static int[] massive(int mass[], int n) {
        int our_numbers[] = randoms(n); //передаем новый массив с цифрами числа
        for (int i = 0, j = 0; i < mass.length; i++, j++) { //заполняем новый массив
            if (j == our_numbers.length) {
                j = 0;
            }
            mass[i] = our_numbers[j];
        }
        return mass;
    }

    public static int[] randoms(int n) { //определяем цифры числа для заполнения массива
        double buffer = n;
        int capacity = 1;//длина нового массива
        for (int i = 0; buffer > 1; i++) {
            buffer = buffer / 10;
            if (buffer > 1) {
                capacity++;
            }
        }

        int[] mass_buffer = new int[capacity];
        buffer = n;

        for (int i = 0; i < mass_buffer.length; i++) {
            mass_buffer[i] = (int) buffer % 10;
            buffer = buffer / 10;
        }
        return mass_buffer;
    }
}
