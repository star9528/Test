//编写代码模拟三次密码输入的场景。
// 最多能输入三次密码，密码正确，提示“登录成功”,密码错误，
// 可以重新输 入，最多输入三次。三次均错，则提示退出程序
import java.util.Scanner;

public class Print {
    public static void inputCode(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入密码:");
        String code = scanner.nextLine();
        String m = "1234567890";
        for (int i = 1;i < 3;i++){
            if (m.equals(code)){
                System.out.println("登录成功！");
                break;
            }
            else {
                System.out.println("登陆失败！");
                System.out.println("请重新输入密码:");
                code = scanner.nextLine();
            }
        }
        System.out.println("退出程序！");
    }

    public static void main(String[] args) {
        inputCode();
    }
}
