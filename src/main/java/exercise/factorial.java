package exercise;

import java.util.Scanner;

public class factorial{
    public static void main(String args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入阶乘次数");
        int i = scanner.nextInt();
        System.out.println(num(i));
    }
    public static int num(int i){
        if (i == 1 || i == 2)
            return 1;
        return num(i-1) * i;
    }
}