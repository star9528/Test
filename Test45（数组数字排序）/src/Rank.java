//数组数字排列
import java.util.Arrays;

public class Rank {
    public static void toRank(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
           while(left < right && arr[left] % 2 == 0){
               left++;
           }
           while(left < right && arr[right] % 2 == 1){
               right--;
           }
           int temp = arr[left];
           arr[left] = arr[right];
           arr[right] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        toRank(arr);
        System.out.println(Arrays.toString(arr));
    }
}
