//调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
public class Adjust {
    public static void adjustString(int[] arr){
        int[] arr1 = new int[arr.length];//存放调整后的数组
        int j = 0;
        int n = arr.length;
        for(int i = 0;i < arr.length;i++){//遍历数组

            if(arr[i] % 2 ==0){
                arr1[j++] = arr[i];
            }else{
                arr1[n-1] = arr[i];
                n--;
            }
        }
        for (int i = 0;i < arr1.length;i++){
            System.out.print(arr1[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr ={2,3,4,5,6,7,8,9};
        adjustString(arr);
    }
}
