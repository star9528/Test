//编写代码: 创建一个 int 类型的数组,
// 元素个数为 100, 并把每个元素依次设置为 1 - 100
import java.util.Arrays;

public class Found {
    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i = 1,j = 0; i < 101 && j < 100; i++,j++) {
            arr[j] = i;
        }
        System.out.println(Arrays.toString(arr));
    }
}
