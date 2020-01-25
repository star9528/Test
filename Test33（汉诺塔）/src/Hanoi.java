//递归求解汉诺塔问题
public class Hanoi {
    private static int i = 1;
    //n表示盘子的层数，first、second、aim分别表示第一、二、三根柱子
    public static void towerOfHanoi(int n,char first,
                                    char second, char aim){
        if(n == 1){//如果只有一个盘子,直接将这个盘子移动到从第一根柱子移动到第三根柱子
            move(n,first,aim);
            return;
        }
        else {
            towerOfHanoi(n-1,first,aim,second);//将(n-1)个盘子看作一个盘子,依赖第三个柱子,从第一根柱子移动到第二根柱子
            move(n,first,aim);//将第n根柱子从第一根柱子移动到第三根
            towerOfHanoi(n-1,aim,first,second);//将n-1个盘子从第二根柱子,依赖第一根柱子,移动到第三根柱子
        }
    }
    public static void move(int n,char first,char aim){
        System.out.println("第"+ i++ +"步"+"从柱子"+first+"--->"+aim);
    }

    public static void main(String[] args) {
        towerOfHanoi(4,'A','B','C');
    }
}
