package StaticCode;

public class Person {
    private String name;
    private int age;
    private String sex;
    private static int count = 0;

    public Person(){
        System.out.println("I am Person init()!");
    }
    //实例代码块（构造代码块）
    {
        this.name = "萧薰儿";
        this.age = 18;
        this.sex = "女";
        System.out.println("I am instance init()!");
    }
    //静态代码块
    static{
        count = 0;//只能访问静态数据成员
        System.out.println("I an static init()!");
    }
    public void show(){

        System.out.println("name:" + name + "age:" + age + "sex:" + sex);
    }
}
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.show();
    }
}