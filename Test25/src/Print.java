//写一个递归方法，输入一个非负整数，返回组成它的数字之和
public  class Print {
    public static int sum = 0;
    public static int toPrint(int n) {
        if (n > 9){
            toPrint(n / 10);
        }
        sum = sum + (n % 10);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(toPrint(1234));
    }
}
