package by.constantinVKLcorporation.module_01.loop;

import java.io.UnsupportedEncodingException;

/**
 * Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера
 */
public class Simvol {
    public static void main(String[] args) throws UnsupportedEncodingException {
             /*char s = 'A'; // с помощью приведения типов
        int a =s;
        System.out.println(a);*/
        String s = "A" + "a" + "C" + "U" + "o";
        byte[] b = s.getBytes("US-ASCII");
        for (int i = 0; i < 5; i++) {
            System.out.println(b[i]);
        }
    }

}

