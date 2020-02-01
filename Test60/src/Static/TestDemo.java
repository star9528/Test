package Static;
//1.static修饰属性，Java静态属性和类相关, 和具体的实例无关.
// 换句话说, 同一个类的不同实例共用同一个静态属性.
//2.如果在任何方法上应用 static 关键字，此方法称为静态方法。
public class TestDemo {
    public int a;
    public static int count;

//    静态方法可以访问静态数据成员，并可以更改静态数据成员的值
    public static void change(){
        count = 100;
    }
}
