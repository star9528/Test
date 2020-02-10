//搜索插入位置
 public class Search {
    public int searchInsert(int[] nums,int target){
        int temp = 0;
        int i = 0;
        for (i = 0; i < nums.length; i++) {
            if(nums[i] == target){
                temp = i;
                return temp;
            }
        }
       for(int j = 0;j < nums.length;j++){
           if(target < nums[0]){
               temp = 0;
               return temp;
           }
           if(target > nums[nums.length - 1]){
               temp = nums.length;
               return temp;
           }
           if(nums[j] < target && nums[j + 1] > target){
               temp = j + 1;
             return temp;
           }
       }
       return temp;
//        public int searchInsert(int[] nums, int target) {
//            for(int i = 0; i < nums.length;i++){
//                if(nums[i] >= target){
//                    return i;
//                }
//            }
//            return nums.length;
//        }
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        Search s = new Search();
        System.out.println(s.searchInsert(arr,7));
    }
}
