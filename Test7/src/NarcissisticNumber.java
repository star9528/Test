//求出0～999之间的所有“水仙花数”并输出。
public class NarcissisticNumber {
    public static void narcissisticNumber() {
        int sum = 0;
        for(int i = 0;i < 1000;i++){
            if (i > 99) {
                sum = (int) Math.pow(i % 10, 3) +
                        (int) Math.pow(i / 10 % 10, 3) +
                        (int) Math.pow(i / 100, 3);
                if (sum == i) {
                    System.out.println(sum);
                }
            }
        }
    }

    public static void main(String[] args) {
        narcissisticNumber();
    }
}
