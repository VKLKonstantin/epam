package by.constantinVKLcorporation.module_02.multi_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 9. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
 * если угол между сторонами длиной X и Y— прямой.
 */
public class Quadrangle {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите x: ");
        int x = Integer.parseInt(reader.readLine());

        System.out.println("Введите y: ");
        int y = Integer.parseInt(reader.readLine());

        System.out.println("Введите z: ");
        int z = Integer.parseInt(reader.readLine());

        System.out.println("Введите t: ");
        int t = Integer.parseInt(reader.readLine());

        System.out.println(square(x, y, z, t));
    }

    public static double square(int x, int y, int z, int t) {
        //разбиваем четырехугольник на два треугольника
        double s, s1, s2;
        double c = (double) (Math.sqrt(x * x + y * y));// диагональ и третья сторона второго треугольника
        double poluperimetr = (double) (z + t + c) / 2;
        s1 = (double) ((x * y) / 2);//площадь прямоугольного треугольника
        s2 = (double) (Math.sqrt((poluperimetr * (poluperimetr - t) * (poluperimetr - z) * (poluperimetr - c))));
        s = s1 + s2;
        return s;
    }
}
