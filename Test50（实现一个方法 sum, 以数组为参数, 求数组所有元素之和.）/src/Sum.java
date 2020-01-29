//实现一个方法 sum, 以数组为参数, 求数组所有元素之和.
public class Sum {
    public static int arraySum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(arraySum(arr));
    }
}
