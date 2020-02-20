public class Solution {
    public int thirdMax(int[] nums) {
        int max = Integer.MIN_VALUE;//Integer.MIN_VALUE = -2147483648
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        int flag = 0;
        boolean f = true;
        if(nums.length == 1){
            return nums[0];
        }
        if(nums.length == 2){
            return Math.max(nums[0],nums[1]);
        }
        for(int i = 0;i < nums.length;i++){
            //若出现连续的最小值
            // -2147483648,-2147483648,-2147483648,-2147483648,1,1,1
            //则进行下面的这个判断，使flag++只执行一次
            //若出现[1,2,-2147483648]、[1,-2147483648,2]，
            // 则flag++也只执行一次，使最终的flag = 3；
            // 能成功返回最小值也就是thirdMax的初值
            //若在中间出现则对结果没有影响
            if(nums[i]==Integer.MIN_VALUE && f){
                flag++;
                f = false;
            }

            if(max < nums[i]){
                flag++;
                thirdMax = secondMax;
                secondMax = max;
                max = nums[i];

            }else{
                if(nums[i] < max && nums[i] > secondMax){
                    flag++;
                    thirdMax = secondMax;
                    secondMax = nums[i];
                }
                else{
                    if(nums[i] < secondMax && nums[i] > thirdMax){
                        flag++;
                        thirdMax = nums[i];

                    }
                }
            }
        }
        return flag>=3?thirdMax:max;
    }
    public static void main(String[] args){
        int[] arr = {1,2,-2147483648,3,4,5};
        Solution s = new Solution();
        System.out.println(s.thirdMax(arr));
    }
}
