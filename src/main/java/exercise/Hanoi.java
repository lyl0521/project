package exercise;

import java.util.Scanner;

public class Hanoi {
    private static long hanoi(int x){
        if (x == 1){
            return 1;
        }else{
            return 2 * (hanoi(x - 1)) + 1 ;
        }
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入汉诺塔层数：");
        int x = scanner.nextInt();
        System.out.println("最少需要移动" + hanoi(x) + "次");
    }

}
