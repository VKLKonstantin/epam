package by.constantinVKLcorporation.module_02.array;

/**
 * 5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
 */
public class BigA {
    private static int first[] = {1, 103, 5, 9, 7, 6, 0, 5, 4};

    public static void main(String[] args) {

        for (int i = 0; i < first.length; i++) {
            if (first[i] > i) {
                System.out.println(first[i]);
            }

        }
    }

}
