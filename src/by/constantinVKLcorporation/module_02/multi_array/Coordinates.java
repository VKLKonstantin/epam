package by.constantinVKLcorporation.module_02.multi_array;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 4. На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
 * из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
 */
public class Coordinates {

    private static double maxDistance;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        {
            System.out.println("Введите количество строк: ");
            int n = Integer.parseInt(reader.readLine());
            System.out.println("Введите количество столбцов: ");
            int m = Integer.parseInt(reader.readLine());
            int[][] a = new int[n][m];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    a[i][j] = (int) (Math.random() * 30);

                    System.out.printf("%3d ", a[i][j]);
                }
                System.out.println();
            }
            int[] result = findMaxDistance(a);
            System.out.printf("Максимальное расстояние между точками %d и %d, равно %.2f %n",
                    result[0], result[1], maxDistance);
        }
    }

    private static double distance(int[][] matrix) {// формула нахождения расстояния между координатами
        return Math.sqrt(Math.pow((matrix[0][0] - matrix[1][0]), 2)
                + Math.pow((matrix[0][1] - matrix[1][1]), 2));
    }

    private static int[] findMaxDistance(int[][] a) {
        int[] result = new int[2];
        double distance;
        maxDistance = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                int[][] currentPoints = {{a[i][0], a[i][1]}, {a[j][0], a[j][1]}};
                distance = distance(currentPoints);
                if (distance > maxDistance) {
                    maxDistance = distance;
                    result[0] = i + 1;
                    result[1] = j + 1;
                }
            }
        }
        return result;
    }
}

