//实现一个方法 copyOf, 对一个整型数组进行拷贝, 得到一个新的数组.
import java.util.Arrays;

public class Copy {
    public static int[] copyOf(int[] arr){
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        //System.out.println(Arrays.toString(newArr));
        return newArr;
    }
    public static int[] transform(int[] arr){
        int[] newArr = copyOf(arr);
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = 2 * newArr[i];
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(copyOf(arr)));;
        System.out.println(Arrays.toString(transform(arr)));
        System.out.println(Arrays.toString(arr));
    }
}
