import java.util.Date;

public class Test {
    public static void main(String[] args) {
        //如果没有导入包则用下面这个
//        java.util.Date date = new java.util.Date();
//        //得到一个毫秒级的时间戳
        Date date = new Date();
        System.out.println(date.getTime());
    }
}
