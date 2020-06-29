package by.constantinVKLcorporation.module_01.loop;

/**
 * Составить программу нахождения произведения квадратов первых двухсот чисел
 */
public class MultiplicationSq {


    public static void main(String[] args) {

        int x = 1;
        for (int i = 1; i < 200; i++) {

            if (x > x * i) {

                System.out.println("Переполнение допустимого значения." +
                        " Текущее значение " + x + "." + " Максимальное значение - 2147483647");
                break;
            }
            x = x * i;


        }
        //  System.out.println(x);
    }
}
