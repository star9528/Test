import java.util.Arrays;
//有序数组的平方
public class Solution {
    public int[] sortedSquares(int[] A) {
        for(int i = 0;i < A.length;i++){
            A[i] = A[i] * A[i];
        }
       for(int bound = 0;bound < A.length;bound++){
           for(int cur = A.length - 1;cur  > bound;cur--){
               if(A[cur] < A[cur -1]){
                   int temp = A[cur];
                   A[cur] = A[cur - 1];
                   A[cur - 1] = temp;
               }
           }
       }
        return A;
    }
    public static void main(String[] args){
        int[] arr = {-7,-3,2,3,11};
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.sortedSquares(arr)));
    }
}
