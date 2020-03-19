package book;

import java.util.Arrays;

//用来保存多本书
public class BookList {
    //顺序表,可以改变成链表
   private Book[] books = new Book[100];
    //数组中的有效元素个数
    private int size = 0;
    public BookList() {
        //先默认添加几个数据进去，方便后续测试
        books[0] = new Book("斗破苍穹","天蚕土豆",
                100,"玄幻",false);
        books[1] = new Book("武动乾坤","天蚕土豆",
                100,"玄幻",false);
        books[2] = new Book("斗罗大陆","唐家三少",
                100,"异界玄幻",false);
        books[3] = new Book("西游记","吴承恩",
                150,"古典名著",false);
        size = 4;
    }

    public Book getBook(int pos){
    return books[pos];
    }

    public void setBook(int pos,Book book){//?
        books[pos] = book;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "BookList{" +
                "books=" + Arrays.toString(books) +
                '}';
    }
}
