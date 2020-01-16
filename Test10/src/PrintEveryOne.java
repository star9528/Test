//输出一个整数的每一位
public class PrintEveryOne {
    public static void printEveryOne(int n){
        int t = 0;
        int m = 0;
        int r = n;
        //查看整数是几位数
        while(r % 10 !=0){
            r = r / 10;
            t++;
        }
        System.out.println("把整数n的每一位按照从低到高的顺序打印");
        //输出整数的的每一位
        for(int i = 1;i <= t;i++){
            m = n % 10;
            n /= 10;
            System.out.print(m+"  ");
        }
    }

    public static void main(String[] args) {
        printEveryOne(23456789);
    }
}
