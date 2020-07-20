package by.constantinVKLcorporation.module_02.array;

/**
 * 6. Задана  последовательность  N  вещественных  чисел.  Вычислить  сумму  чисел,  порядковые  номера  которых
 * являются простыми числами
 *
 *
 *
 */
public class EasyNumber {

    public static void main(String[] args) {

        int first[] = {1, 2, 8, 4, 7, 15, 20};
        int sum = first[2] + first[3];
        for (int i = 4; i < first.length; i++) {
            for (int j = 2; j < i - 1; j++) {
                if (i % j == 0) {
                   break;
                }
                sum = sum + first[i];
            }
        }


        System.out.println(sum);
    }

}
