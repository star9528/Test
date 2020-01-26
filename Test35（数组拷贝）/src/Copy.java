//数组拷贝
import java.util.Arrays;

public class Copy {
    public static void copyOf(int[] arr){
        //Arrays.copyOf()数组拷贝的方法
       int[] newArr = Arrays.copyOf(arr,arr.length);
       ////Arrays.copyOfRange()拷贝数组某个范围数据的方法
       int[] newArr1 = Arrays.copyOfRange(arr,2,3);
       arr[0] = 10;
       //toString()数组转换为字符串
        System.out.println("arr:"+Arrays.toString(arr));
        System.out.println("newArr:"+Arrays.toString(newArr));
        System.out.println("newArr1:"+Arrays.toString(newArr1));
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        copyOf(arr);
    }
}
