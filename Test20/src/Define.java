// 在同一个类中,分别定义求两个整数的方法 和 三个小数之和的方法。
// 并执行代码，求出结果
public class Define {
    public static void integer1(int n, int m){
        System.out.println(n+m);
    }
    public static void integer2(double n,double m,double t){
        System.out.println(n+m+t);
    }

    public static void main(String[] args) {
        integer1(4,5);
        integer2(1.2,3.4,5.6);
    }
}
