//递归求 1 + 2 + 3 + ... + 10
public class Sum {
    public static int sum(int n){
        int s = 0;
        //递归结束程序
        if(n == 1){
            return 1;
        }
        s = n+sum(n-1);
        return s;
    }

    public static void main(String[] args) {
        System.out.println(sum(10));
    }
}
