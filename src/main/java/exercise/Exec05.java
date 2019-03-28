package exercise;

import java.util.Scanner;

public class Exec05 {
//    利用条件运算符的嵌套来完成此题：
//    学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入成绩");
        int score = scanner.nextInt();
        if (score >= 90)
            System.out.println("A");
        else if (score >=60 &&score<90)
            System.out.println("B");
        else
            System.out.println("C");
    }
}
