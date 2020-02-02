package This;

public class Person {
    private String name;
    private int age;
    private String sex;
    //可以借助 this 来访问对象的字段和方法
    //调用构造方法
    public Person() {
        this("萧薰儿",18,"女");
    }

    public Person (String name,int age,String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void show(){
        System.out.println("name:" + name + "age:"
                + age + "sex:" + sex);
    }
}