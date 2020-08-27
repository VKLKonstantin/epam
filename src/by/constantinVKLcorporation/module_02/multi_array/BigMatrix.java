package by.constantinVKLcorporation.module_02.multi_array;


/**
 * 11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
 * которых число 5 встречается три и более раз.
 */
public class BigMatrix {

    public static void main(String[] args) {
        int a[][] = new int[10][20];
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {

                a[i][j] = (int) (Math.random() * 16);
                System.out.printf("%5d", a[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < a.length; i++) {
            count = 0;
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == 5) {
                    count++;
                }
            }
            if (count >= 3) {
                System.out.println("Номер строки, в которой число 5 встречается три и более раз: " + i);
            }
        }
    }
}
