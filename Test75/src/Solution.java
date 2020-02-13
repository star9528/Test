//存在重复元素
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        //用每一个元素与它后面的元素比较，如果存在相同的元素，则返回true
        for(int i = 0;i < nums.length;i++){
            for(int j = i + 1;j < nums.length;j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr = {1,1};
        Solution s = new Solution();
        System.out.println(s.containsDuplicate(arr));
    }
}
