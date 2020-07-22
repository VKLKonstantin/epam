package by.constantinVKLcorporation.module_02.multi_array;

/**
 * Задачи. Массивы массивов
 * 1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
 */
public class Matrix {
    public static void main(String[] args) {
        int a[][] = {{5, 7, 3, 17}, {7, 0, 1, 12}, {8, 1, 2, 3}};
        for (int i = 0; i < 3; i++) { //строки
            for (int j = 0; j < 4; j++) { //столбцы
                if (j % 2 == 0 && a[0][j] > a[2][j]) { //нахождение нечетного столбца и сравнение первого и последнего элемента
                    System.out.println(a[i][j]);

                } else {
                    System.out.println("Во всех нечетных столбцах первый элемент меньше последнего");
                }
            }

        }
    }
}
