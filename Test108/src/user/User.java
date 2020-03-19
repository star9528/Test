package user;

import action.IAction;
import book.BookList;

//User并不需要去创建实例，真正需要创建的是NormalUser和Admin
 abstract public class User {
     protected String name;
     //当前用户支持的哪些操作
     protected IAction[] actions;

     //打印一个命令行的菜单
    //由于普通用户和管理员支持的操作不同，交互的菜单也就存在差异
    //就需要在普通用户和管理员中分别实现各自的菜单方法
    //而这段代码就是为了让在NormalUser和Admin中重写
     abstract public int menu();

     //还需要一个公共的每种用户都需要的方法
    public void doAction (int choice, BookList bookList){
        //choice就是用户通过命令菜单输入的选项
        //根据输入的选项，在数组中选择合适的对象进行操作
        actions[choice].work(bookList);
    }
}