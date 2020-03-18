public class Test {
    public static void main(String[] args) {
        //实际使用抽象类的时候，和继承，多态语法是密切相关的
        Shape shape = new Circle();
        shape.draw();
    }
}
//抽象类是一种校验机制，是为了降低代码出错的概率。
//如果某个地方抽象类，去掉abstract，变成不同类，代码也是完全可以运行的
//结果没啥差异
//如果加上abstract多一重语法效验，防止在代码中不小心创建 不应被实力化的对象