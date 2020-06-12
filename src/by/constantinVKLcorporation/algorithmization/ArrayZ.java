package by.constantinVKLcorporation.algorithmization;

/**
 * Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
 * числом. Подсчитать количество замен.
 */
public class ArrayZ {
    private static int k[] = {3, 4, 5, 6, 7, 8, 9, 11, 13, 15, 18};
    private static int z = 7, index = 0;

    public static void main(String[] args) {
        for (int i = 0; i < k.length; i++) {
            if (k[i] > z) {
                k[i] = z;
                index++;
            }
        }
        for (int i = 0; i < k.length; i++) {
            System.out.println(k[i]);

        }
        System.out.println("Количество замен: " + index);
    }
}
