//求 N 的阶乘
public class Factorial {
    public static void factorial(int n){
        int t = 1;
        for(int i = n;i > 0;i--){
            t *= i;
        }
        System.out.println(t);
    }

    public static void main(String[] args) {
        factorial(5);
    }
}
