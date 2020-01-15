//计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值 。
public class Sum {
    public static void sum(int n) {
        double sum = 0L;
        for(int i = 1;i <= n;i++){
            sum = sum + (Math.pow(-1,(i+1)))*1/i ;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        sum(100);
    }
}
