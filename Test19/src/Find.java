//有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字。
public class Find {
    public static void toFind(int[] arr){
        int count = 0;
        //选择数组中的一个数进行判断
       for(int i = 0;i < arr.length;i++){
           count = 0;//每判断一个数对计数器置0
           //把选择的数与数组中的每一个进行比较
           for(int j = 0;j < arr.length;j++){
               if(arr[i] == arr[j]){
                   count++;
               }
           }
           //如果计数器的值为1，则说明这个数只出现了一次
           if(count == 1){
               System.out.println(arr[i]);
           }
       }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,7,6,8};
        toFind(arr);
    }
}
