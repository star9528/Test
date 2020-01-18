//求1！+2！+3！+4！+........+n!的和
public class FactorialSum {
    public static void factorialSum(int n){
        int sum = 0;
        int t = 1;
        for(int i = n;i > 0;i--){
            for(int j = i;j > 0;j--){
                t *= j;
            }
            sum += t;
            t = 1;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        factorialSum(3);
    }
}
