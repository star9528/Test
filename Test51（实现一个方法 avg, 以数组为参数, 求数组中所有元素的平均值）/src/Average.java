//实现一个方法 avg, 以数组为参数, 求数组中所有
// 元素的平均值(注意方法的返回值类型).
public class Average {
    public static double avg(int[] arr){
        double sum = 0;
        double avg = 1;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        avg = sum / arr.length;
        return avg;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,10};
        System.out.println(avg(arr));
    }
}
