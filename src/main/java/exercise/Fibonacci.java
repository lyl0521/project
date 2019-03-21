package exercise;

import java.util.Scanner;

public class Fibonacci  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入个数：");
        int n = scanner.nextInt();
        int i;
        for (int j = 1; j < n; j++) {
            System.out.println(Fib(j));
        }
    }

    public static int Fib(int n) {
        if (n == 1 || n == 2)
            return 1;
        return Fib(n-1)+Fib(n-2);

    }
}
