package by.constantinVKLcorporation.module_02.multi_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.ArrayList;
import java.util.Arrays;

public class Exp {


    public static void main(String[] args) throws IOException {

        ArrayList<String>list=new ArrayList<String>();

        list.add("KKK");
        list.add("HKL");
        list.add("ppoj");

        System.out.println(list);
        System.out.println();
        System.out.println(list.get(0));


        list.remove(1);
        list.remove("HKL");
        System.out.println(list);
    }
}
