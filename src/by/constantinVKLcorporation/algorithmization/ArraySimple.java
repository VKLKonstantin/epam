package by.constantinVKLcorporation.algorithmization;

/**
 * В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К
 */
public class ArraySimple {
    private static int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
    private static int k = 3, sum = 0;

    public static void main(String[] args) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % k == 0) {
                sum = sum + a[i];
            }
        }
        System.out.println(sum);
    }
}
