public class Maxormin {
    public static void toCompare(int a,int b,int c) {
        int max = (a > b ? a : b) > c ? (a > b ? a : b) : c;
        int min = (a > b ? b : a) > c ? c : (a > b ? b : a);
        System.out.println("max="+max);
        System.out.println("min="+min);
    }

    public static void main(String[] args) {
        toCompare(23,34,56);
    }
}
