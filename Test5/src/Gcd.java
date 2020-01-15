//求两个正整数的最大公约数
public class Gcd {
    public static void gcd(int a, int b) {
        if (a == b) {
            System.out.println("最大公约数" + a);
        } else {
            if (a > b) {
                for (int j = (a / 2);j >= 1;j--) {
                    if (a % j == 0 && b % j == 0){
                        System.out.println(j);
                        break;
                    }
                }
            }else {
                for (int i = (b / 2); i >= 1; i--) {
                    if (a % i == 0 && b % i == 0) {
                        System.out.println(i);
                        break;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        gcd(100,99);
    }
}