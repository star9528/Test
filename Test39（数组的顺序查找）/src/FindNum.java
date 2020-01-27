//查找数组中指定元素(顺序查找)
public class FindNum {
    public static int findNum(int[] arr,int toFind){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == toFind){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(findNum(arr,2));
    }
}
