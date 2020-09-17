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
        int k = 3;



        for (int i = 0; i < mas1.length; i++) {
            if (i < k) {
                System.out.print(mas1[i] + " ");
            } else if (i == k) {
                for (int j = 0; j < mas2.length; j++) {
                    System.out.print(mas2[j] + " ");
                }
            } else {
                System.out.print(mas1[i] + " ");
            }


        }

    }

}
