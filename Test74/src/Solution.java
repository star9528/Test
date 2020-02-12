//合并两个有序数组
public class Solution {
    public void merge(int[] nums1,int m,int[] nums2,int n){
        if(nums1.length < m + n){
            return;
        }
        int j = 0;
        for (int i = m; i < nums1.length && j < n; i++) {
            nums1[i] = nums2[j++];
        }
        for(int bound = 0;bound < n + m;bound++){
            for(int cur = n + m - 1;cur > bound ;cur--){
                if(nums1[cur] < nums1[cur - 1]){
                    int temp = nums1[cur];
                    nums1[cur] = nums1[cur - 1];
                    nums1[cur - 1] = temp;
                }
            }
        }
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,0,0,0,0};
        int[] arr2 = {2,5,6};
        Solution s = new Solution();
        s.merge(arr1,2,arr2,3);
    }
}
