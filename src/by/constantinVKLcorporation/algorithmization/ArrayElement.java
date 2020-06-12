package by.constantinVKLcorporation.algorithmization;

/**
 * Дан  массив  действительных  чисел,  размерность  которого  N.  Подсчитать,  сколько  в  нем  отрицательных,
 * положительных и нулевых элементов.
 */
public class ArrayElement {
    private static int zero = 0, positive = 0, negative = 0;
    private static int[] a = {0, 1, -3, 8, 6, -9, 0, 45};

    public static void main(String[] args) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                zero++;
            } else if (a[i] < 0) {
                negative++;
            } else if (a[i] > 0) {
                positive++;
            }
        }
        System.out.println("Нулевых: " + zero + " Отрицательных: " + negative + " Положительных: " + positive);

    }

}

