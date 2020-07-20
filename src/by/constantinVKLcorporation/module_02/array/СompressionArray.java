package by.constantinVKLcorporation.module_02.array;

/**
 * 10. Дан  целочисленный  массив  с  количеством  элементов  п. Сжать  массив,  выбросив  из  него  каждый  второй
 * элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
 */
public class СompressionArray {
    public static void main(String[] args) {
        int massive[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < massive.length; i++) {
            if (i % 2 != 0) {
                massive[i] = 0;
            }

        }
        for (int j = 0; j < massive.length; j++) {
            System.out.println(massive[j]);
        }

    }
}
