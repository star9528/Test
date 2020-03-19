package action;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class BorrowAction implements IAction {
    @Override
    public void work(BookList bookList) {
        System.out.println("执行借书操作");
        System.out.println("请驶入你要借的书籍的出名：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        //先找的要借的书，把书的状态改为“借出”即可
        for (int i = 0; i < bookList.getSize(); i++) {
            Book book = bookList.getBook(i);
            if(book.getName().equals(name)){
                if(book.isBorrowed()){
                    continue;
                }else{
                    book.setBorrowed(true);
                    System.out.println("借书成功！");
                    return;
                }
            }
        }
        //可能是书籍不存在，也可能书籍被借走了
        System.out.println("借书失败！没有匹配的书籍！");
    }
}
