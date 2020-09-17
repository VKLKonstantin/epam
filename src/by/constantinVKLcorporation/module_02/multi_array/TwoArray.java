package by.constantinVKLcorporation.module_02.multi_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * 2. Даны две последовательности
 * Образовать из них новую последовательность
 * чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.
 */
public class TwoArray {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите размерность первого массива");
        int n1 = Integer.parseInt(read.readLine());
        int[] firstArray = new int[n1];

        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = i;
            System.out.print(firstArray[i] + ", ");
        }
        System.out.println();
        System.out.println("Введите размерность второго массива ");
        int n2 = Integer.parseInt(read.readLine());
        int[] secondArray = new int[n2];

        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = i * 3;
            System.out.print(secondArray[i] + ", ");
        }

        System.out.println();
        System.out.println("Новая последовательность: ");

        for (int i = 0, j = 0, k = 0; i < firstArray.length - 1 || j < secondArray.length - 1; ) {//k < firstArray.length + secondArray.length;
            if (i == firstArray.length - 1) {
                for (int h = j; h < secondArray.length - j - 1; h++) {
                    System.out.println(secondArray[h]);
                }
//break;

            }
            if (j == secondArray.length - 1) {
                for (int x = i; x < firstArray.length - i - 1; x++) {
                    System.out.println(firstArray[x]);
                }
//break;

            }

            if (firstArray[i] < secondArray[j]) {
                System.out.print(firstArray[i] + " ");
                i++;
                k++;
            }
            if (firstArray[i] == secondArray[j]) {
                System.out.print(firstArray[i] + " ");
                System.out.print(secondArray[j] + " ");
                i++;
                j++;
                k++;
            }
            if (firstArray[i] > secondArray[j]) {
                System.out.print(secondArray[j] + " ");
                j++;
                k++;
            }


        }


    }
}
