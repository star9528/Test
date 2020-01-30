//给定一个有序整型数组, 实现二分查找
public class BinarySearch {
    public static int binarySearch(int[] arr,int toFind){
        int right = arr.length - 1;
        int left = 0;
        int mid = (right + left) / 2;
        while(left <= right){
            mid = (right + left) / 2;
            if(arr[mid] < toFind){
                //去右边找
                left = mid + 1;
            }else{
                if(arr[mid] > toFind){
                    //去左边找
                    right = mid - 1;
                }else {
                    if(arr[mid] ==  toFind){
                        //找到了
                        return mid;
                    }
                }
            }
        }
        //说明没找到
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(binarySearch(arr,11));
    }
}
