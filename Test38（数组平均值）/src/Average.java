//求数组中元素的平均值
public class Average {
    public static double toAverage(int[] arr){
        double sum = 0.0;
        double ave = 0.0;
//        for(int i = 0;i < arr.length;i++){
//            sum += arr[i];
//        }
        for (int x:arr) {
            sum += x;
        }
        ave = sum/arr.length;
        return ave;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(toAverage(arr));
    }
}
