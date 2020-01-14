//编写程序数一下 1到 100 的所有整数中出现多少个数字9
public class Appear {
    public static void appear() {
        int t = 0;
        for(int i = 1;i <= 100;i++){
            if(i % 10 == 9){t++;}
            if(i / 10 % 10 == 9){t++;}
            if(i / 100 == 9){t++;}
        }
        System.out.println(t);
    }

    public static void main(String[] args) {
        appear();
    }
}
