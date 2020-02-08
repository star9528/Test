//实现交换两个变量的值。要求：需要交换实参的值。
public class Swop {
    public static void toSwop(String name1,String name2){
        String temp = name1;
        name1 = name2;
        name2 = temp;
        System.out.println("name1:" + name1 + "name2:" + name2);
    }

    public static void main(String[] args) {
        String name1 = "云韵";
        String name2 = "美杜莎";
        toSwop(name1,name2);
    }
}
