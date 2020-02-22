public class Solution {
    public int myAtoi(String str) {
        int t = 0;
        char[] arr = str.toCharArray();
        if(arr == null || arr.length == 0){
            return 0;
        }
        for(int i = 0;i < arr.length;i++){
            if(arr[i] == ' '){
                break;
            }
            if(arr[i] == '-'){
                if(arr[i + 1] > Integer.MIN_VALUE && arr[i + 1] < Integer.MAX_VALUE){
                    for(int j = i + 1;j < arr.length;j++){
                        if(arr[j] > Integer.MIN_VALUE && arr[j] < Integer.MAX_VALUE){
                            t = t * 10 - arr[j];
                        }
                    }
                    break;
                }
                else{
                    return 0;
                }
            }
            if(arr[i] == '+'){
                if(arr[i + 1] > Integer.MIN_VALUE && arr[i + 1] < Integer.MAX_VALUE){
                    for(int j = i + 1;j < arr.length;j++){
                        if(arr[j] > Integer.MIN_VALUE && arr[j] < Integer.MAX_VALUE){
                            t = t * 10 + arr[j];
                        }
                    }
                    break;
                }
                else {
                    return 0;
                }
            }
            if(arr[i] > Integer.MIN_VALUE && arr[i] < Integer.MAX_VALUE){
                t = arr[i];
                for(int j = i + 1;j < arr.length;j++){
                    if(arr[j] > Integer.MIN_VALUE && arr[j] < Integer.MAX_VALUE){
                        t = t * 10 + arr[j];
                    }
                }
                break;
            }
            if(arr[i] < Integer.MIN_VALUE || arr[i] > Integer.MAX_VALUE){
                return  2^32;
            }
        }
        return t;
    }

    public static void main(String[] args) {
        String str = "42";
        Solution s = new Solution();
        System.out.println(s.myAtoi(str));
    }
}
