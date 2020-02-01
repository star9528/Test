package ConstructionMethod;

public class Person {
    private String name;
    private int age;
    private String sex;

    public Person(){
        this.name = "萧薰儿";
        this.age = 19;
        this.sex = "女";
    }
    public Person (String name,int age,String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public void show(){

        System.out.println("name:" + name + "age:" + age + "sex:" + sex);
    }
}