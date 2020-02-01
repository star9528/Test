package Summary;

public class Person {
    public int age;
    public String name;
    public String sex;
    //类变量也称静态变量，编译时已产生，属于类的本身，
    // 且只有一份，放在方法区
    public static int count;
    //被final修饰的叫常量，也属于对象。 被final修饰，后续不可更改
    public final int SIZE = 10;
    ////静态的常量，属于类本身，只有一份 被final修饰，后续不可更g改
    public static final int COUNT = 99;

    public void eat(){
        //局部变量
        int a = 1;
        System.out.println("eat()!");
    }

    public void sleep(){
        System.out.println("sleep()!");
    }

    //静态方法
    //不能访问非静态成员变量
    public static void staticTest(){
        System.out.println("staticTest()");
    }
}
