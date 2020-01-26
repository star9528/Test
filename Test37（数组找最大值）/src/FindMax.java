//找数组中的最大元素
public class FindMax {
    public static int findMax(int[] arr){
        int max = arr[0];
        for(int i = 0;i < arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5,6};
        System.out.println(findMax(arr));
    }
}
