//大写字母转换为小写字母
public class Test{
    public String toLowerCase(String s) {
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                System.out.print(Character.toLowerCase(s.charAt(i)));;
            }
            else{
                System.out.print( s.charAt(i));;
            }
        }
        return s;
    }
    public static void main(String[] args) {
        Test t = new Test();
        String str = "Hello";
        t.toLowerCase(str);
    }
}

