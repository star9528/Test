//for each 打印数组
public class Array {
    public static void printArray(){
        int[] arr = new int[10];
        for (int x:arr) {
            System.out.println(x);
        }
    }
    public static void printArray1(){
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        for (int x:arr) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        //printArray();
        printArray1();
    }
}
