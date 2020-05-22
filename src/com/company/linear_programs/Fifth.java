package com.company.linear_programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Дано  натуральное  число  Т,  которое  представляет  длительность  прошедшего  времени  в  секундах.  Вывести
 * данное значение длительности в часах, минутах и секундах в следующей форме:
 * ННч ММмин SSc
 */
public class Fifth {
    private static int seconds, minutes, hour, excess;

    public static void main(String[] args) throws IOException {
        System.out.println("Введите количество секунд: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        seconds = Integer.parseInt(s);

        hour = seconds / 3600;//количество часов
        minutes = (seconds - (hour * 3600)) / 60;//количество минут
        excess = seconds - (hour * 3600 + minutes * 60);//количество секунд
        System.out.println(hour + " ч " + minutes + " мин " + excess + " c ");
    }


}
