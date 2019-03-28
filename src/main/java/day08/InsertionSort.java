package day08;

import java.util.Arrays;

//   插入排序
public class InsertionSort {
    public static void main(String[] args) {
        int[] ints = new int[10];
        for (int i = 0; i < 10; i++) {
            ints[i] = (int) (Math.random() * 100);
        }

        System.out.println(Arrays.toString(ints));

        for (int i = 1; i < ints.length; i++) {
            int x = ints[i];

            int j = i;
            while (j>0&&x<ints[j-1]){
                ints[j] = ints[j-1];
                j--;
            }

            if( j != i)
                ints[j] = x;
        }
        System.out.println(Arrays.toString(ints));

    }

}
