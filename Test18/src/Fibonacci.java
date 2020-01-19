//求斐波那契数列的第n项。(迭代实现)
public class Fibonacci {
    public static void fibonacciSequence(int num) {
        int n = 1;//第一项
        int m = 1;//第二项
        int t = m + n;//第三项
        if(num == 1 || num == 2){
            System.out.println(1);
        }
        //大于三的项数
        for(int i = 3;i < num;i++) {
            n = m;
            m = t;
            t = m + n;
        }
        System.out.println(t);
    }

    public static void main(String[] args) {
        fibonacciSequence(4);
    }
}
