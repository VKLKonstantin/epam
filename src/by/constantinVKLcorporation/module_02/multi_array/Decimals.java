package by.constantinVKLcorporation.module_02.multi_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 8.Даны дроби
 * Составить программу, которая приводит эти дроби к общему
 * знаменателю и упорядочивает их в порядке возрастания.
 */
//не решена
public class Decimals {
    public static void main(String[] args) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(read.readLine());

        Fraction[] fraction = new Fraction[n];

        for (int i = 0; i < n-1; i++) {
            fraction[i]=new Fraction();
            fraction[i].numerator =(int) (Math.random() * 10);
            fraction[i].denominator = (int) (Math.random() * 10);
            System.out.print(fraction[i].denominator+" ");
        }
        System.out.println();
        int j=2;//общий знаменатель
        int k=0;
       while(k<n-1){
          // fraction[k]=new Fraction();
            if(fraction[k].denominator%j==0){


             //   System.out.println(k);
                System.out.print(fraction[k].denominator+" ");
                k++;
            }
            else{
                j++;
               k=0;

            }
          System.out.println("Общий знаменатель "+j);
        }


    }
}


