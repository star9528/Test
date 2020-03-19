package user;

import action.*;

import java.util.Scanner;

public class NormalUser extends User {
    public NormalUser(String name){
        this.name = name;
        this.actions = new IAction[] {
                new ExitAction(),
                new FindAction(),
                new BorrowAction(),
                new ReturnAction()
        };
    }



    @Override
    public int menu() {
        System.out.println("=============================");
        System.out.println("欢迎" + this.name + "图书馆管理系统");
        //用户输入的选项和下标要匹配
        System.out.println("1.查找图书");
        System.out.println("2.借书");
        System.out.println("3.还书");
        System.out.println("0.退出");
        System.out.println("=============================");
        //让用户输入一个选项
        System.out.println("请输入您的选择：");
        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();

        return choice;
    }
}
