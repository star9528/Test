//查找数组中指定元素(二分查找)
public class BinarySearch {
    public static int binarySearch(int[] arr,int toFind) {
        int left = 0;
        int right = arr.length;
        int mid = (left + right) / 2;
        while (left < right) {
            if (arr[mid] > toFind) {
                //在左边
                right = mid - 1;
                mid = (left + right) / 2;
            } else {
                if (arr[mid] < toFind) {
                    //在右边
                    left = mid + 1;
                    mid = (left + right) / 2;
                } else {
                    //相等，查到了
                    return mid;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(binarySearch(arr,2));
    }
}
