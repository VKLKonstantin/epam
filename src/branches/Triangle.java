package branches;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
 * он прямоугольным
 */
public class Triangle {
    private static int angle1, angle2;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите значение угла №1: ");
        String s1 = reader.readLine();
        System.out.println("Введите значение угла №2: ");
        String s2 = reader.readLine();
        angle1 = Integer.parseInt(s1);
        angle2 = Integer.parseInt(s2);
        validate(angle1, angle2);
    }

    public static void validate(int angle1, int angle2) {
        if ((angle1 + angle2) < 180) {
            if ((angle1 + angle2) == 90) {
                System.out.println("Это прямоугольный треугольгик");
            } else {
                System.out.println("Это не прямоугольный треугольник");
            }
        } else {
            System.out.println("Такой треугольник не существует");
        }
    }

}
