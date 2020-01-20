//按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4) （递归）
public class Print {
    public static int toPrint(int n){
        if(n > 9){
            toPrint(n / 10);
        }
        System.out.print(n % 10+"   ");
        return 1;
    }

    public static void main(String[] args) {
        toPrint(12345);
    }
}
