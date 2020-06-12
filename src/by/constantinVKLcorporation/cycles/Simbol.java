package by.constantinVKLcorporation.cycles;

import java.io.UnsupportedEncodingException;

/**
 * Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера
 *
 *
 */
public class Simbol {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "A"+"a"+"C"+"U"+"o";
        byte[] b = s.getBytes("US-ASCII");
        for (int i=0;i<5;i++){
            System.out.println(b [i]);
        }

    }
}
