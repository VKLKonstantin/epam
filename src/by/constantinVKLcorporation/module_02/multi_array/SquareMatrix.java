package by.constantinVKLcorporation.module_02.multi_array;

/**
 * 2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */
public class SquareMatrix {
    public static void main(String[] args) {
        int a[][] = {{5, 7, 3, 17}, {7, 0, 1, 12}, {8, 1, 2, 3}, {1, 1, 4, 5}};

        for (int i = 0; i < 4; i++) { //строки
            for (int j = 0; j < 4; j++) { //столбцы
                if (i == j) {
                    System.out.println(a[i][j]);
                }
            }
        }
    }
}
