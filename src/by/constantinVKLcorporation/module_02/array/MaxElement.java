package by.constantinVKLcorporation.module_02.array;

/**
 * 7. Даны действительные числа.  * . Найти max
 */
public class MaxElement {

    public static void main(String[] args) {
        double massive[] = {1.9, 2.0, 3.7, 6.3, 1.0, 10.9, -8.1};
        double max_value = Double.MIN_VALUE;
        for (int i = 0, j = massive.length - 1; i < j; i++, j--) {
            max_value = Double.max(max_value, massive[i] + massive[j]);
        }
        System.out.println(max_value);
    }
}
