//交换变量的值
public class Change {
    public static void changNumber() {
        int a = 2;
        int b = 3;
        int t = a;
        a = b;
        b = t;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }

    public static void main(String[] args) {
       changNumber();
    }
}
