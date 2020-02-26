package LinkedList;

public class Test {
    private static void testAddFirst(){
        singleLinkedList linkedList = new singleLinkedList();
        linkedList.addFirst(5);
        linkedList.addFirst(4);
        linkedList.addFirst(3);
        linkedList.addFirst(2);
        linkedList.addFirst(1);
    }

    private static void testAddLast(){
        singleLinkedList linkedList = new singleLinkedList();
        linkedList.addFirst(5);
        linkedList.addFirst(4);
        linkedList.addFirst(3);
        linkedList.addFirst(2);
        linkedList.addFirst(1);
        linkedList.display();
    }
    private  static void testAddIndex(){
        singleLinkedList linkedList = new singleLinkedList();
        linkedList.addIndex(0,1);
        linkedList.addIndex(1,2);
        linkedList.addIndex(1,3);
        linkedList.addIndex(1,4);
        linkedList.addIndex(1,5);
        linkedList.display();
    }
    public static void main(String[] args) {
        //testAddFirst();
        //testAddLast();
        testAddIndex();
    }
}
