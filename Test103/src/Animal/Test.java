package Animal;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal("小动物");
        animal.eat("玉米");

        Animal bird = new Bird("小鸟");
        //这个eat到底是父类中的还是子类中的，取决于new Bird和new Animal
        //只一点方法重写和动态绑定一样，但是原理不同
        //方法重写是语法上的，动态绑定是JVM底层执行规则
        //方法重修这样的语法机制，是基于动态绑定来实现的
        bird.eat("谷子");

    }
}
