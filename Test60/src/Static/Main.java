package Static;

import Method.Test;

public class Main {
    public static void main(String[] args) {
        TestDemo t1 = new TestDemo();
        t1.a++;
        //count被static所修饰，所有类共享
        TestDemo.count++;
        System.out.println(t1.a);
        System.out.println(TestDemo.count);
        System.out.println("=================");
        TestDemo t2 = new TestDemo();
        t2.a++;
        //count被static所修饰，所有类共享
        TestDemo.count++;
        System.out.println(t2.a);
        System.out.println(TestDemo.count);
        //静态方法属于类，而不属于类的对象。
        //可以直接调用静态方法，而无需创建类的实例。
        // 静态方法和实例无关, 而是和类相关
        //静态方法不能直接使用非静态数据成员或调用非静态方法
        //非静态数据成员和方法都是和实例相关的
        //this和super两个关键字不能在静态上下文中使用
       TestDemo.change();
        System.out.println(TestDemo.count);
    }
}
//输出结果
//        1
//        1
//        =================
//        1
//        2
//        100