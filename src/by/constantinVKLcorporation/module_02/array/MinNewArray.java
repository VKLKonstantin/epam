package by.constantinVKLcorporation.module_02.array;

/**
 * 8.  Дана  последовательность  целых  чисел
 * Образовать  новую  последовательность,  выбросив  из исходной те члены, которые равны min
 */
public class MinNewArray {
    public static void main(String[] args) {

        int massive[] = {1, 2, -8, 6, 1, 10, -8};
        int new_massive[] = new int[massive.length];
        int min = massive[0];

        for (int i = 1; i < massive.length; i++) { // находим минимальные значения

            if (massive[i] < min) {
                min = massive[i];
            }
        }

        for (int i = 0, j = 0; i < massive.length; i++) { //заполняем новый массив без минимальных членов
            if (massive[i] != min) {
                new_massive[j] = massive[i];
                j++;
            }

        }

        for (int i = 0; i < massive.length; i++) {
            System.out.println(new_massive[i]);
        }

    }
}
