import static java.lang.Math.*;
//使用 import static 可以导入包中的静态的方法和字段.
public class Test {
    public static void main(String[] args) {
        double x = 30;
        double y = 40;
        //如果没有导入包，则调用第一种方法，导入包之后用第二种方法，
        // 很显然第二种方法跟简单
        //double result = Math.sqrt(Math.pow(x,2)) + Math.pow(y,2);
        double result = sqrt(pow(x,2)) + pow(y,2);
        System.out.println(result);
    }
}
