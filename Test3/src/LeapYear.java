//输出 1000 - 2000 之间所有的闰年
public class LeapYear {
    public static void leapYear() {
        for(int year = 1000;year <= 2000;year++){
            if(year % 100 == 0){
              if(year % 4 ==0){
                  System.out.println(year);
              }
            }
            else {
             if(year % 4 == 0){
                 System.out.println(year);
             }
            }
        }
    }

    public static void main(String[] args) {
        leapYear();
    }
}
