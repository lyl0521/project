package exercise;

import java.util.Scanner;

public class Exec06 {
    //    输入两个正整数m和n，求其最大公约数和最小公倍数
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两个正整数");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        GCD(x,y);
    }

    private static void GCD(int x, int y) {
        int max, min;
        int a = x;
        for (int i = 1; i <= a; i++) {
            if (x > y) {
                max = x;
                min = y;
            } else {
                max = y;
                min = x;
            }

            x = max % min;
            y = min;

            if ( x == 0) {
                System.out.println(min);
            }
        }
    }
}
