import java.util.Arrays;

//给定两个整型数组, 交换两个数组的内容.
public class Change {
    public static void toChange(int[] arr1,int[] arr2){
        if(arr1.length == arr2.length){
            for (int i = 0; i < arr1.length; i++) {
                int temp = arr1[i];
                arr1[i] = arr2[i];
                arr2[i] =temp;
            }
        }
        System.out.println("arr1:"+Arrays.toString(arr1));
        System.out.println("arr2:"+Arrays.toString(arr2));
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8};
        toChange(arr1,arr2);
    }
}
