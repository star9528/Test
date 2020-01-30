//实现一个方法 toString, 把一个整型数组转换成字符串.
// 例如数组 {1, 2, 3} , 返回的字符串为 "[1, 2, 3]", 注意 逗号 的位置和数量.
//方法一
public class ToString {
    public static void toString1(int[] arr){
        //先打印一个[
        System.out.printf("[");
        for(int i = 0;i < arr.length;i++){
            //在除了最后一个数之外的所有数后面加上一个逗号
            if(i < arr.length-1) {
                System.out.print(arr[i]+",");
            }else{
                System.out.printf("%s",arr[i]);
            }
        }
        //最后再加上一个]
        System.out.printf("]");
    }
    //方法二
    public static String toString(int[] arr){
        //定义一个ret，进行字符串拼接
        String ret = "[";
        for (int i = 0; i < arr.length; i++) {
            ret += arr[i];
            //在除了最后一个数之外的所有数后面加上一个逗号
            if(i != arr.length-1){
                ret += ",";
            }
        }
        ret += "]";
        return ret;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        toString1(arr);
        System.out.println(toString(arr));
    }
}
