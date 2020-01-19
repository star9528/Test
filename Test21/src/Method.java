//在同一个类中定义多个方法：要求不仅可以求两个整数的最大值，
// 还可以求两个小数的最大值，以及两个小数和一个整数的大小关系。
public class Method {
    //两个整数的最大值
    public static void integerMax(int n,int m){
        if(n > m) {
            System.out.println("max="+n);
        }else{
            System.out.println("max="+m);
        }
    }
    //两个小数的最大值
    public static void doubleMax(double n,double m){
        if(m > n){
            System.out.println("max="+m);
        }else{
            System.out.println("max="+n);
        }
    }
    //两个小数和一个整数的大小关系
    public static void compare(double n,double m,int t){
        if(n > m){
            if(m > t){
                System.out.println("max="+n);
                System.out.println("min="+t);
            }
            else{
                if(n > t){
                    System.out.println("max="+n);
                    System.out.println("min="+m);
                }
                else{
                    System.out.println("max="+t);
                    System.out.println("min="+m);
                }
            }
        }
        else {
            if(m < t){
                System.out.println("max="+t);
                System.out.println("min="+n);
            }else{
                if(n > t){
                    System.out.println("max="+m);
                    System.out.println("min="+t);
                }else{
                    System.out.println("max="+m);
                    System.out.println("min="+n);
                }
            }
        }
    }

    public static void main(String[] args) {
        integerMax(2,3);
        doubleMax(1.2,3.4);
        compare(2.3,2.3,3);
    }
}

