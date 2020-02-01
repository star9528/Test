package Method;

public class Person {
    public String name = "萧炎";
    public int age = 18;
    //这里不能用static，佛祖name，age无法调用
    public void show(){
        System.out.println("我叫"+ name +",今年"+ age +"岁");
    }
}
