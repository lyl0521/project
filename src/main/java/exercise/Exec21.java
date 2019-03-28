package exercise;
//  1到20阶乘
public class Exec21 {
    private static int num(int x){
        if (x == 1){
            return 1;
        }else{
            return num(x-1) * x;
        }
    }

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 20 ; i++) {
            sum += num(i);
        }
        System.out.println(sum);
    }
}
