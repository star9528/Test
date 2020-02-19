public class Solution {
    public int thirdMax(int[] nums) {
        Integer max = 0;
        Integer secondMax = 0;
        Integer thirdMax = 0;
        boolean f = false;
        for(int i = 0;i < nums.length;i++){
            if(max < nums[i]){
                max = nums[i];
            }
        }
        for(int i = 0;i < nums.length; i++){
            if(nums[i] < max && nums[i] > secondMax){
                secondMax = nums[i];
            }
        }
        for(int i = 0;i < nums.length;i++){
            if(nums[i] < max && nums[i] < secondMax && thirdMax < nums[i]){
                thirdMax = nums[i];
                f = true;
            }
        }
        if(f != true){
            return max;
        }
        else {
            return thirdMax;
        }
    }
    public static void main(String[] args){
        int[] arr = {2,2,1};
        Solution s = new Solution();
        System.out.println(s.thirdMax(arr));
    }
}
