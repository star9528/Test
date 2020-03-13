package Animal;

public class Bird extends Animal{
    public Bird(String name) {
        //调用父类构造方法
        super(name);
    }
    //子类实现父类的同名方法, 并且参数的类型和个数完全相同,即为方法重写
    //调用这个方法时，最终执行的到底是父类的的方法还是子类的方法，
    // 取决于应用对象的应用对象的实例对象的类型
    @Override//这是一个注解，当重写的方法的方法名错误是可以纠正
    public void eat(String food){
        System.out.println("Bird.eat");
        System.out.println(this.name + "正在吃" + food);
    }
}
