//获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列
public class BinarySystem {
    public static void binarySystem(int num){
        int[] arr = new int[40];//存放整数转换的没有逆序的二进制数
        int[] arr1 = new int[40];//逆序的二进制数（整数对应的二进制数）
        int i = 0;
        int count = 0;//计算整数转换出的二进制数有几位
        while (num != 0){
            int n = num % 2;
            num = num / 2;
            count++;
            for (;i < count;i++){
                arr[i] = n;
            }
        }
        //逆序
        int m = count;
        for(int j = 0;j < count;j++){
            arr1[j] = arr[m-1];
            m--;
        }
        //奇数位输出
        System.out.print("奇数位：");
        for (int j = 0;j < count;j++){
            if(j % 2 == 1){
                System.out.print(arr1[j]+" ");
            }
        }
        System.out.println();
        //偶数位输出
        System.out.print("偶数位:");
        for(int j = 0;j < count;j++){
            if(j % 2 ==0){
                System.out.print(arr1[j]+" ");
            }
        }
    }

    public static void main(String[] args) {
        binarySystem(125);
    }
}
