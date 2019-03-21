package exercise;

public class _01_Rabbit {
    public static void main(String[] args) {
        int rabbit ;
        for(int i = 1 ; i <= 20 ; i++){
            rabbit= getMonthNum(i);
            System.out.println("第"+i+"个月,有"+rabbit+"对兔子");
        }
    }
    public static int getMonthNum(int x){
        int Rabbit = 1;
        if(x == 1 || x == 2){
            return Rabbit;
        }
        Rabbit = getMonthNum(x-1) + getMonthNum(x-2);
        return Rabbit;  }
}
