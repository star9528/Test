import java.util.Arrays;
//在排序数组中查找元素的第一个和最后一个位置
public class Solution {
    public int[] searchRange(int[] nums, int target) {
    int[] arr = new int[2];
    int flag = 0;
    for(int i = 0;i < nums.length;i++){
        if(nums[i] == target){
            arr[0] = i;
            break;
        }
    }
    for(int i = 0;i < nums.length;i++){
        if(nums[i] == target){
            arr[1] = i;
            flag++;
        }
    }
    if(flag == 0){
        arr[0] = -1;
        arr[1] = -1;
    }
    return arr;
}
    public static void main(String[] args){
        int[] nums = {5,7,7,8,8,10};
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.searchRange(nums,7)));
    }
}
