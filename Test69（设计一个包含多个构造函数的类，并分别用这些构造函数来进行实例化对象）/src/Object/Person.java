package Object;
//设计一个包含多个构造函数的类，并分别用这些构造函数来进行实例化对象
public class Person {
    public String name;
    public int age;
    public String sex;
    public String number;

    public Person() {
        name = "药尘";//this.name
        age = 10000;//this.age
        sex = "男";//this.sex
        number = "100000002";//this.sex
    }

    public void Grade() {
        int Chinese = 90;
        int math = 90;
        int English = 90;
        System.out.println("语文；" + Chinese + "数学：" + math + "英语：" + English);
    }

    public void Show() {
        System.out.println("姓名：" + name + ",年龄：" + age +
                ",性别：" + sex + ",学号" + number + ",成绩：");
    }
}