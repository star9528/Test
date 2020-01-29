//实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2 ,
// 并设置到对应的数组元素上. 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
import java.util.Arrays;

public class Multiply {
    public static void transform(int[] newArr){
        for(int i = 0;i < newArr.length;i++){
            newArr[i] = 2*newArr[i];
        }
        System.out.println("修改后的数组："+Arrays.toString(newArr));
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        //如果需要不改变原数组，那么就需要重新拷贝
        int[] newArr = Arrays.copyOf(arr,arr.length);
        transform(newArr);
        System.out.println("原数组:"+Arrays.toString(arr));
    }
}
