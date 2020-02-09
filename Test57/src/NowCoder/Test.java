package NowCoder;

public class Test{
        public String toLowerCase(String a,String b) {
            int x = 0;
            if(a.length >= b.length){
                x = a.length;
            }else {
                x = b.length;
            }
        }
    public static void main(String[] args) {
        Test t = new Test();
        String str = "Hello";
        t.toLowerCase(str);
    }
}