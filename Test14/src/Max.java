//创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3。
//​ 要求：在max3这个函数中，调用max2函数，来实现3个数的最大值计算。
public class Max {
    public static int findMax(int a,int b){
        int max2 = 0;
        if(a > b){
            max2 = a;
        }else {
            max2 = b;
        }
        //System.out.println("最大值："+max2);
        return  max2;
    }
    public static void findMax(int e,int f,int c){
        int max3 = findMax(findMax(e,f),c);
        System.out.println("最大值："+max3);
    }

    public static void main(String[] args) {
        //findMax(1,2);
        findMax(1,2,3);
    }
}
