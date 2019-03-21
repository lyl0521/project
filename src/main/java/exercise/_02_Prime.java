package exercise;

public class _02_Prime {
    public static void main(String[] args) {
        boolean check;
        for (int i = 101; i <= 200; i++) {
            check = false;
            for (int j = 2 ; j <= Math.sqrt(i) ; j++){
                if (i % j == 0){
                    check = true;
                    break;}
            }
            if (check == false)
                System.out.println(i);
        }
    }
}
