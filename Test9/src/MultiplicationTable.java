//输出乘法口诀表
public class MultiplicationTable {
    public static void multiplicationTable(){
        int i = 1;
        for(i = 1;i < 10;i++){//行
            for(int j = 1;j <= i;j++){//列
                int t = i * j;
                System.out.print(i+"*"+j+"="+t+"  ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        multiplicationTable();
    }
}
