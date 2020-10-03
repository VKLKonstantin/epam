package by.constantinVKLcorporation.module_02.multi_array;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 3.  Вычислить  площадь  правильного  шестиугольника  со  стороной  а,  используя  метод  вычисления  площади
 * треугольника.
 */
public class Hexagon {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите a");
        int a = Integer.parseInt(read.readLine());
        System.out.println(6 * squareTriangle(a));//площадь шестиугольника

    }

    public static double squareTriangle(int a) {//площадь равностороннего треугольника
        double sq = (a * a * Math.sqrt(3)) / 4;
        return sq;
    }

}
