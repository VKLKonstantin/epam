package by.constantinVKLcorporation.module_02.array;

/**
 * 9. В массиве целых чисел с количеством элементов  n найти наиболее часто встречающееся число. Если таких
 * чисел несколько, то определить наименьшее из них.
 */
public class СommonNumber {
    public static int index;

    public static void main(String[] args) {

        int number[] = {10, 7, 10, 4, 5, 6, 7, 7, 7, 10, 10};
        int often[] = new int[number.length];
        int count; //количество повторений-1
        int max = often[0]; // максимальное значение количества повторений


        for (int j = 0; j < number.length; j++) { // поиск одинаковых элементов
            count = 0;

            for (int i = j + 1; i < number.length; i++) {
                if (number[j] - number[i] == 0) {
                    count++; // подсчет количества одинаковых элементов и добавление в новый массив
                    often[j] = count;
                }

            }
            for (int i = 0; i < often.length; i++) { //определение индекса повторяющегося элемента
                if (often[i] > max) {
                    max = often[i];
                    index = i;
                } else if (often[i] == max && number[i] < number[index]) { // сравнение в случае, если количество повторяющихся элементов одинаково и выбор с меньшим значением
                    max = often[i];
                    index = i;
                } else {
                    max = often[index];
                }
            }

        }
        System.out.println(number[index]);
    }
}
