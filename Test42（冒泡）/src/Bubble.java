//数组排序(冒泡排序升序)
import java.util.Arrays;

public class Bubble {
    public static void bubbleSort(int[] arr){
        int t = arr.length;
        for(int bound = 0;bound < arr.length-1;bound++){
            //从前向后比较(找最大的)
//            for(int cur = 0;cur < t-1;cur++){
//                if(arr[cur] > arr[cur + 1]){
//                    int temp = arr[cur + 1];
//                    arr[cur + 1] = arr[cur];
//                    arr[cur] = temp;
//                }
//            }
//            t--;
            //从后往后往前（找最小的）
            for(int cur = arr.length - 1;cur > bound;cur--){
                if(arr[cur - 1] > arr[cur]){
                    int temp = arr[cur - 1];
                    arr[cur - 1] = arr[cur];
                    arr[cur] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {7,4,8,2,6,5,0};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
