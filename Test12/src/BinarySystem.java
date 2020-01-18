//求一个整数，在内存当中存储时，二进制1的个数
public class BinarySystem {
    public static void binarySystem(int n) {
        int count = 0;//计数
        while(n != 0) {
            //如果n对二取余等于一，那么计数器加一，
            // 并且n变为原来的一半
            if (n % 2 == 1) {
                count++;
                n = n / 2;
            }
            //如果不等于一，仅仅是n变为原来的一半
            else {
                n = n / 2;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
         binarySystem(125);
    }
}
