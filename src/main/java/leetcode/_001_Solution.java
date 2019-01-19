package leetcode;

import java.util.HashMap;
import java.util.Map;

public class _001_Solution {
    public static void main(String[] args) {
        /**
         * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
         *
         * You may assume that each input would have exactly one solution, and you may not use the same element twice.
         *
         * Example:
         *
         * Given nums = [2, 7, 11, 15], target = 9,
         *
         * Because nums[0] + nums[1] = 2 + 7 = 9,
         * return [0, 1].
         */
        int[] x = {2,7,11,15};
        int y = 9;
        
        for (int i = 0 ; i< x.length ; i++){
            for (int j = i + 1 ; j < x.length; j++) {
                if ( (x[i] + x[j] ) == y){
                    System.out.println("[" + i + "," + j + "]");
                }
            }
        }
    }
}
