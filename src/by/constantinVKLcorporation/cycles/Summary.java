package by.constantinVKLcorporation.cycles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Summary {
    private static int x, y = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите число: ");
        String s1 = reader.readLine();
        x = Integer.parseInt(s1);
        if (x > 0) {
            for (int i = 0; i <= x; i++) {
                y = y + i;
            }
            System.out.println(y);
        }


    }
}
