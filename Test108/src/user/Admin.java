package user;

import action.*;

import java.util.Scanner;

public class Admin extends User {
    public Admin(String name) {
        this.name = name;
        this.actions = new IAction[] {
                new ExitAction(),
                new FindAction(),
                new AddAction(),
                new DisplayAction()
        };
    }

    @Override
    public int menu() {
        System.out.println("==============================");
        System.out.println("欢迎" + this.name + "使用图书馆管理系统，您是管理员");
        System.out.println("1.查找图书");
        System.out.println("2.新增图书");
        System.out.println("3.删除图书");
        System.out.println("4.显示所有图书");
        System.out.println("0.退出");
        System.out.println("==============================");
        System.out.println("请输入您的选择：");
        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();
        return choice;
    }
}
