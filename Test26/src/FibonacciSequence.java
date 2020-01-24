//递归求斐波那契数列的第 N 项
import java.util.Scanner;

public class FibonacciSequence {
    public static int fibonacciSequence(int n){
        if(n < 3) {
            return 1;
        }else {
            return fibonacciSequence(n - 1)+
                    fibonacciSequence(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入：");
        int n = scanner.nextInt();

        System.out.println(fibonacciSequence(n));
    }
}
