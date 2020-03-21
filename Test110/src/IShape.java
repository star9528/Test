public interface IShape {
    //使用 interface 定义一个接口
    //接口中的方法一定是抽象方法, 因此可以省略 abstract
    //接口中的方法一定是 public, 因此可以省略 public
    //Cycle 使用 implements 继承接口. 此时表达的含义不再是 "扩展",
    // 而是 "实现"
    //在调用的时候同样可以创建一个接口的引用, 对应到一个子类的实例.
    //接口不能单独被实例化.
    void draw();
    //接口中只能包含抽象方法. 对于字段来说, 接口中只能包含静态常量(final static)
    public static final int num = 10;
}
