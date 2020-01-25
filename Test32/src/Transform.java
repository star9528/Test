import java.util.Arrays;

public class Transform {
    public static void toTransform(int[] arr){
        String newArr = Arrays.toString(arr);
        System.out.println(newArr);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        toTransform(arr);
    }
}
