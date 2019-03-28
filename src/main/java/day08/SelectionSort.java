package day08;

import sun.security.util.Length;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] ints = new int[10];
        for (int i = 0; i < 10; i++) {
            ints[i] = (int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(ints));

        for (int i = 0; i < ints.length-1; i++) {
            int min = i;
            for (int j = min + 1 ; j < ints.length; j++) {
                if (ints[min] > ints[j]){
                    min = j;
                }
            }

                if ( i != min){
                    int temp;
                    temp = ints[i];
                    ints[i] = ints[min];
                    ints[min] = temp;
                }


        }
        System.out.println(Arrays.toString(ints));
    }
}
