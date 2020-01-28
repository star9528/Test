//冒泡排序性能较低. Java 中内置了更高效的排序算法
import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {8,4,2,5,6,1,3};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
