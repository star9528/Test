package GetterSetter;
//getName 即为 getter 方法, 表示获取这个成员的值.
//setName 即为 setter 方法, 表示设置这个成员的值.
public class Person {
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;//this引用，表示调用该方法的对象
    }
    public String getName(){
        return name;
    }
    public void show(){
        System.out.println("name:" + name + " age:" + age + " age");
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("楚枫");
        String name = person.getName();
        System.out.println(name);
        person.show();
    }
}
