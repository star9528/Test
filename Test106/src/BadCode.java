class B{
     public B() {
         func();          //2
     }

     public void func() {
         System.out.println("B.func");
     }
}

class D extends B{
    private int num = 1;

    @Override
    public void func() {           //3
        System.out.println("D.func " + num);   //4
    }
}

public class BadCode {
    public static void main(String[] args) {
        //在创建D对象的时候，会先创建对应的父类对象
        //类B中的func（）是this.func,是指D中的func（）
        //而此时num并没有被幅值为1，仍然是初始值0
      D d = new D();//            1
    }
}
//结论：不要在构造方法中触发多态
// 尽量避免在构造方法中调用其他方法