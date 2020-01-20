//递归求 N 的阶乘
public class RecursionFactorial {
    public static int recursionFactorial(int n) {
        int sum = 0;
        //递归结束程序
        if(n == 1){
            return 1;
        }
        sum = n * recursionFactorial(n-1);
        return sum;
    }

    public static void main(String[] args) {
        recursionFactorial(5);
        System.out.println(recursionFactorial(5));
    }
}
