//参数传内置类型
public class Array {
    //修改形参 x 的值, 不影响实参的 num 值
    public static void func(int x){
       x = 10 ;
        System.out.println("x="+x);
    }
    //在方法内部修改数组内容, 方法外部也发生改变.
    //此时数组名 arr 是一个 "引用" . 当传参的时候, 是按照引用传参.
    public static void func(int[] a){
        a[0] = 10;
        System.out.println("a[0]="+a[0]);
    }

    public static void main(String[] args) {
        int num = 0;
        int[] arr = {1,2,3,4,5,6};
        func(num);
        System.out.println("num="+num);
        func(arr);
        System.out.println("arr[0]="+arr[0]);
    }
}
