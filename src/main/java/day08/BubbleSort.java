package day08;

import com.sun.javafx.util.TempState;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] ints =  new int[10];
        for (int i = 0; i < 10; i++) {
            ints[i] = (int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(ints));
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length - 1 - i; j++) {
                if (ints[j] > ints[j+1]){
                    int temp = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(ints));
    }
}
