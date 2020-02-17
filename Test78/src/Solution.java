import java.util.Arrays;
//按奇偶排序数组
public class Solution {
    public int[] sortArrayByParity(int[] A) {
        int left = 0;
        int right = A.length - 1;
        while (left < right){
            while(A[left] % 2 != 1 && left < right){
                left++;
            }
            while(A[right] % 2 != 0 && left < right){
                right--;
            }
            if(left >= right){
                break;
            }
            int temp = A[left];
            A[left] = A[right];
            A[right] = temp;
            left++;
            right--;
        }
        return A;
    }

    public static void main(String[] args) {
        int[] arr = {1,3};
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.sortArrayByParity(arr)));
    }
}
