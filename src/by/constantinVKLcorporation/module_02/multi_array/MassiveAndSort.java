package by.constantinVKLcorporation.module_02.multi_array;


/**
 * Одномерные массивы. Сортировки
 * 1. Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
 * один  массив,  включив  второй  массив  между  k-м  и  (k+1)  -  м  элементами  первого,  при  этом  не  используя
 * дополнительный массив.
 */
public class MassiveAndSort {
    public static void main(String[] args) {
        int mas1[] = {0, 1, 2, 3, 4, 5, 6, 7};
        int mas2[] = {22, 23, 224, 242};
        int mas3[] = new int[mas1.length + mas2.length];
        int k = 3;
        int count = 0;

        for (int i = 0; i < k; i++) {
            mas3[i] = mas1[i];
            count++;
        }

        for (int i = 0; i < mas2.length; i++) {
            mas3[count++] = mas2[i];

        }

        for (int i = 0; i < mas1.length - k; i++) {
            mas3[count++] = mas1[k + i];

        }

        for (int a : mas3) {
            System.out.print(a + " ");
        }

    }
}
