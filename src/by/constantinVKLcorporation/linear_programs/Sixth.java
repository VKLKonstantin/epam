package by.constantinVKLcorporation.linear_programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Для данной области составить линейную программу, которая печатает  true, если точка с координатами (х, у)
 * принадлежит закрашенной области, и false — в противном случае
 */
public class Sixth {
    private static int x, y;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите x: ");
        String s1 = reader.readLine();
        System.out.println("Введите y: ");
        String s2 = reader.readLine();

        x = Integer.parseInt(s1);
        y = Integer.parseInt(s2);
        System.out.println(coordinate(x, y));
    }

    public static boolean coordinate(int x, int y) {
        if (y >= 0 && y <= 4 && x >= -2 && x <= 2) {
            return true;
        } else if (y <= 0 && y >= -3 && x >= -4 && x <= 4) {
            return true;
        } else return false;
    }
}
