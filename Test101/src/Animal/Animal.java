package Animal;
//继承
import java.sql.SQLOutput;
public class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat(String food){
        System.out.println(this.name + "正在吃" + food);
    }
}
//public class bird extends Animal{
//    public bird(String name) {
//        super(name);
//    }
//
//    public void fly(){
//        System.out.println(this.name + "正在飞");
//    }
//}
//public class Cat extends Animal{
//    public Cat(String name) {
//        //使用super调用父类构造方法
//        super(name);
//    }
//}