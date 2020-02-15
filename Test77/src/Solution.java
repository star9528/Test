//仅仅字母反转
public class Solution {
    public String reverseOnlyLetters(String S) {
        char[] arr = S.toCharArray();
        int left = 0;//从左边开始
        int right = arr.length - 1;//从右边开始
        char temp = 0;
        String s = "";
       while (left < right){
           //如果不是字母left自动加一
          while(!Letter(arr[left]) && left < right){
             left++;
          }
          //如果不是字母right自动减一
          while(!Letter(arr[right]) && left < right){
              right--;
          }
          temp = arr[left];
          arr[left] = arr[right];
          arr[right] = temp;
          left++;
          right--;
       }
        for(int i = 0;i < arr.length; i++){
            s += arr[i];
        }
       return s;
    }
    //判断是不是字母的方法
    public boolean Letter(char s){
        return (s >= 'a' && s <= 'z' )|| (s >= 'A' && s <= 'Z');
    }

    public static void main(String[] args) {
        String S = "ab-cd";
        Solution s = new Solution();
        System.out.println(s.reverseOnlyLetters(S));
    }
}
