package by.constantinVKLcorporation.algorithmization;

/**
 * Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
 */
public class ArrayChange {
    private static int a[] = {1, 103, 5, 9, 7, 6, 0, 5, 4};
    private static int min = a[0], max = a[0], buff_min, buff_max, buff;

    public static void main(String[] args) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
                buff_min = i; //индекс ячейки с числом
            } else if (a[i] > max) {
                max = a[i];
                buff_max = i;
            }
        }

        buff = a[buff_min];
        a[buff_min] = a[buff_max];
        a[buff_max] = buff;

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }


    }
}
