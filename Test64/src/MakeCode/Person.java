package MakeCode;

public class Person {
    private String name;
    private int age;
    private String sex;

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
    public void show(){

        System.out.println("name:" + name + "age:" + age + "sex:" + sex);
    }
}