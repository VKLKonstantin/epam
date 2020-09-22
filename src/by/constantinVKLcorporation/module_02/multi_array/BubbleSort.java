package by.constantinVKLcorporation.module_02.multi_array;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 4. Сортировка обменами. Дана последовательность чисел a1<=a2<=   <=aN .Требуется переставить числа в
 * порядке возрастания. Для этого сравниваются два соседних числа a i и a i + 1 . Если a i > a i + 1 , то делается
 * перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
 * Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
 */
public class BubbleSort {

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int buffer;
        int count = 0;

        System.out.println("Введите размерность массива");
        int n = Integer.parseInt(read.readLine());
        int[] mass = new int[n];

        for (int i = mass.length - 1; i >= 0; i--) {
            mass[i] = i;
            System.out.print(mass[i] + ", ");
        }
        System.out.println();

        for (int i = 0; i < mass.length - 1; i++) { //сортировка пузырьком
            for (int j = 0; j < mass.length - 1; j++) {
                if (mass[j] > mass[j + 1]) {
                    buffer = mass[j];
                    mass[j] = mass[j + 1];
                    mass[j + 1] = buffer;
                    count=count+1;

                }
            }
        }

        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + ", ");


        }
        System.out.println();

        System.out.println("количество перестановок "+count);
    }

}
