//完成猜数字游戏
import java.util.Random;
import java.util.Scanner;
public class Guess {
    public static int toGuess() {
        System.out.println("欢迎来到猜字游戏");
        Random random = new Random();
        int a = random.nextInt(101);


        for (int i = 1; i < 100; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入你要猜的数字：");
            int toGuess = scanner.nextInt();
            if (a > toGuess) {
                System.out.println("输入小了!");
            } else {
                if (a < toGuess) {
                    System.out.println("输入大了！");
                } else {
                    System.out.println("恭喜你！猜对了！");
                }
            }
        }
        return 1;
    }
    public static void main(String[] args) {
            toGuess();

    }
}
