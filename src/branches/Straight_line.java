package branches;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой
 */
public class Straight_line {
    private static int x1, x2, x3, y1, y2, y3;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите x1: ");
        String s1 = reader.readLine();
        System.out.println("Введите y1: ");
        String s2 = reader.readLine();
        System.out.println("Введите x2: ");
        String s3 = reader.readLine();
        System.out.println("Введите y2: ");
        String s4 = reader.readLine();
        System.out.println("Введите x3: ");
        String s5 = reader.readLine();
        System.out.println("Введите y3: ");
        String s6 = reader.readLine();

        x1 = Integer.parseInt(s1);
        y1 = Integer.parseInt(s2);
        x2 = Integer.parseInt(s3);
        y2 = Integer.parseInt(s4);
        x3 = Integer.parseInt(s5);
        y3 = Integer.parseInt(s6);

        straight(x1, x2, x3, y1, y2, y3);
    }

    public static void straight(int x1, int y1, int x2, int y2, int x3, int y3) {
        if ((y2 - y1) / (x2 - x1) == (y3 - y1) / (x3 - x1)) {
            System.out.println("Точки расположены на одной прямой");
        } else {
            System.out.println("Точки расположены не на одной прямой");
        }
    }

}
