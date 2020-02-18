import java.util.Arrays;

public class Solution {
    public int[] plusOne(int[] digits) {
        if(digits[0] == 0 && digits.length != 1){
            System.out.println("输入有误！");
            return digits;
        }
        //最低位不为九
        if(digits[digits.length - 1] != 9){
            digits[digits.length - 1] += 1;
            return digits;
        }
        //最高位不为九
        for(int i = digits.length - 1;i >= 0;i--){
            if(digits[i] == 9){
                digits[i] = 0;
            }
            else{
                digits[i] += 1;
                return digits;
            }
        }
        //最高位为九
        int[] newArr = new int[digits.length + 1];
        newArr[0] = 1;
        digits = newArr;
        return digits;
    }

    public static void main(String[] args) {
        int[] arr = {8,9,9,9};
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.plusOne(arr)));
    }
}
