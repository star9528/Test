import book.BookList;
import user.Admin;
import user.NormalUser;
import user.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1.先把数据准备好
        BookList bookList = new BookList();
        //2.创建用户并进行登陆
        User user = login();
        //3.进入主循环
        while(true){
            //4.循环内部调用 menu 方法显示用户菜单
            int choice = user.menu();
            //5.根据用户输入的来决定执行那个IAction完成操作
            user.doAction(choice,bookList);
        }
    }

    public static User login() {
        //提示用户进行登录
        Scanner scanner = new Scanner(System.in);
        System.out.println("请登录系统！！！");
        System.out.println("请输入您的姓名：");
        String name = scanner.next();
        System.out.println("请输入您的身份：1. 表示管理员，2.表示普通用户");
        int who = scanner.nextInt();
        if(who == 1){
            return new Admin(name);
        }
        return new NormalUser(name);
    }
}
