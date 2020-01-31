public class Orderly {
    public static boolean judgeOrderly(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                return false; //不是升序
            }
        }
        return true; //是升序
    }

    public static void main(String[] args) {
        int[] arr = {1,2,8,4,5,6,7};
        System.out.println(judgeOrderly(arr));
    }
}
