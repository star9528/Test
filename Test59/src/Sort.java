import java.util.Arrays;

//给定整型数组, 把所有的偶数放到数组前面, 把所有奇数放到数组后面.
public class Sort {
    public static int[] toSort(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            //必须要left < right的判断条件，
            // 否则最中间的两个数可能会交换
            //从前往后判断
            while(arr[left] % 2 != 1 && left < right){
                left++;
            }
            //必须要left < right的判断条件，
            // 否则最中间的两个数可能会交换
            //从后往前判断
            while (arr[right] % 2 != 0 && left < right){
                right--;
            }
            //进行交换
                int a = arr[left];
                arr[left] = arr[right];
                arr[right] = a;
                left++;
                right--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(toSort(arr)));
    }
}
