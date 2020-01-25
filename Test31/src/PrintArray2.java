//写一个方法, 将数组中的每个元素都 * 2(不破坏原数组)
public class PrintArray2 {
    public static void printArray(int[] arr){
        for(int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void transform(int[] arr){
        for(int i = 0;i < arr.length;i++){
            System.out.println(arr[i]*2);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] nawArr = arr;
        printArray(arr);
        transform(nawArr);
    }
}
