//检查数组的有序性
public class Ordering {
    //boolean类型返回值为true或false
    public static boolean checkOrdering(int[] arr){
        for(int i = 1;i < arr.length;i++){
            if(arr[i - 1] > arr[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,4,6};
        System.out.println(checkOrdering(arr));
    }
}
