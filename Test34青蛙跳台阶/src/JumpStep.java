//递归实现代码: 青蛙跳台阶问题
public class JumpStep {
    public static int jumpStep(int n){
        int step = 0;
        if(n == 1){
           return 1;
        }
        if(n == 2){
            return 2;
        }
        if(n > 2){
            step = jumpStep(n - 2) + jumpStep(n - 1);
        }
        return step;
    }

    public static void main(String[] args) {
        System.out.println(jumpStep(4));
    }
}
