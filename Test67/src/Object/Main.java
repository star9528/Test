package Object;
//没有引用的对象称为匿名对象.
//匿名对象只能在创建对象时使用.
//如果一个对象只是用一次, 后面不需要用了, 可以考虑使用匿名对象
public class Main {
    public static void main(String[] args) {
        //通过匿名对象调用方法
        new Person("萧薰儿",18).show();
    }
}
