package exercise;


import java.util.Scanner;

public class Check_Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入待检验数字：");
        int num = scanner.nextInt();

        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i != 0) {
                System.out.println(num + "是质数");
                break;
            } else {
                System.out.println(num + "不是质数");
                break;
            }
        }

    }
}
