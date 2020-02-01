package Private;

public class Test {
    public static void main(String[] args) {
        //此时字段已经使用 private 来修饰.
        // 类的调用者(main方法中)不能直接使用.
        // 而需要借助 show 方法. 此时类的使
        //用者就不必了解 Person 类的实现细节.
        Person person = new Person();
        person.show();
    }

}
