package SeqList;

public class SeqList {
    private int[] dates = null;
    private int size;

    public SeqList() {
        //容量（能容纳最大元素个数）
        dates = new int[100];
        //长度（有效元素个数）
        size = 0;
    }

    //打印顺序表
    public void display() {
        String result = "[";
        for (int i = 0; i < size; i++) {
            result += dates[i];
            if (i < size - 1) {
                result += ",";

            }
        }
        result += "]";
        System.out.println(result);
    }

    // 在 pos 位置新增元素
    public void add(int num, int pos) {

        //pos不符合条件
        if (pos > size && pos < 0) {
            return;
        }
        //扩容
        if (size > dates.length) {
            int[] newDates = new int[2 * dates.length];
            for (int i = 0; i < dates.length; i++) {
                newDates[i] = dates[i];
            }
            dates = newDates;
        }
        //尾插
        if (pos == size) {
            this.dates[pos] = num;
            size++;
            return;
        } else
        //其他任意位置
        {
            for (int i = size; i >= pos; i--) {
                dates[i + 1] = dates[i];
            }
            dates[pos] = num;
            size++;
        }
    }
    //判断是否包含某个元素
    public boolean contains(int toFind) {
        //循环访问每一个元素进行比较
        //如果发现某个元素和toFind相等，返回true
        //如果所有元素都找完了，也没有找到相等的，就返回false
        for (int i = 0; i < dates.length; i++) {
            if (dates[i] == toFind) {
                return true;
            }
        }
        return false;
    }
    //查找某个元素的位置
    public int search(int toFind) {
        for (int i = 0; i < size; i++) {
            if (dates[i] == toFind) {
                return i;
            }
        }
        return -1;
    }
    //获取pos元素的位置
    public int getPos(int pos) {
        for (int i = 0; i < size; i++) {
            if (pos == i) {
                return dates[pos];
            }
        }
        return -1;
    }
    //给pos位置的元素的值设置为valve
    public void setPos(int pos, int valve) {
        for (int i = 0; i < size; i++) {
            if (pos == i) {
                dates[pos] = valve;
            }
        }
    }
    //删除第一次出现的关键字key
    public void remove(int toMove) {
        //找到toMove对应的下标
        int pos = search(toMove);
        //如果没找到（-1即为没找到）
        if(pos == -1){
            System.out.println("没找到！");
            return;
        }
        //如果在最后一个位置，直接删除
        if(pos == size - 1){
            size--;
            return;
        }
        //如果在中间位置
        for(int i = pos;i < size - 1;i ++){
            dates[i] = dates[i + 1];
        }
        size--;
    }
    //获取顺序表长度
    public int size(){
        int temp = 0;
        for (int i = 0; i < size; i++) {
            temp++;
        }
        return temp;
    }
    //清空顺序表
    public void clear(){
        size = 0;
    }
}
