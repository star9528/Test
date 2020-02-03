package SeqList;

public class Test {
    public static void testAdd(){
        SeqList s = new SeqList();
        s.add(4,0);
        s.add(3,0);
        s.add(2,0);
        s.add(1,0);
        s.display();
    }
    public static void testContains(){
        SeqList s = new SeqList();
        s.add(4,0);
        s.add(3,0);
        s.add(2,0);
        s.add(1,0);
        System.out.println(s.contains(2));
    }
    public static void testSearch(){
        SeqList s = new SeqList();
        s.add(4,0);
        s.add(3,0);
        s.add(2,0);
        s.add(1,0);
        System.out.println(s.search(2));
    }
    public static void testGetPos(){
        SeqList s = new SeqList();
        s.add(4,0);
        s.add(3,0);
        s.add(2,0);
        s.add(1,0);
        System.out.println(s.getPos(2));
    }
    public static void testSetPos(){
        SeqList s = new SeqList();
        s.add(4,0);
        s.add(3,0);
        s.add(2,0);
        s.add(1,0);
        s.setPos(2,2);
        s.display();
    }
    public static void testToMove(){
        SeqList s = new SeqList();
        s.add(4,0);
        s.add(3,0);
        s.add(2,0);
        s.add(1,0);
        s.remove(0);
        s.display();
    }
    public static void testSize(){
        SeqList s = new SeqList();
        s.add(4,0);
        s.add(3,0);
        s.add(2,0);
        s.add(1,0);
        System.out.println(s.size());
    }
    public static void testClear(){
        SeqList s = new SeqList();
        s.add(4,0);
        s.add(3,0);
        s.add(2,0);
        s.add(1,0);
        s.clear();
        s.display();
    }
    public static void main(String[] args) {
        //testAdd();
        //testContains();
        //testSearch();
        //testGetPos();
        //testSetPos();
        //testToMove();
        //testSize();
        testClear();
    }
}
