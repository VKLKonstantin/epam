package by.constantinVKLcorporation.module_01.branch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
 * отверстие.
 */
public class Brick {

    public static void main(String[] args) throws IOException {

        int a;
        int b;
        int x;
        int y;
        int z;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите параметры прямоугольного отверстия");
        System.out.println("Введите сторону a: ");
        String s1 = reader.readLine();
        System.out.println("Введите сторону b: ");
        String s2 = reader.readLine();
        System.out.println("Введите параметры кирпича: ");
        System.out.println("Введите x: ");
        String s3 = reader.readLine();
        System.out.println("Введите y: ");
        String s4 = reader.readLine();
        System.out.println("Введите z: ");
        String s5 = reader.readLine();

        a = Integer.parseInt(s1);
        b = Integer.parseInt(s2);
        x = Integer.parseInt(s3);
        y = Integer.parseInt(s4);
        z = Integer.parseInt(s5);

        if (x <= a && y <= b || x <= b && y <= a || z <= a && x <= b || z <= b && x <= a ||
                z <= b && y <= a || z <= a && y <= b) {
            System.out.println("Кирпич пройдет через отверстие");
        } else {
            System.out.println("Кирпич не пройдет через отверстие");
        }
    }
}
