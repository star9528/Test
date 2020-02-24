
//一个节点
class Node {
    public int date;//数据
    public Node next;//下一个节点的位置
    public Node (int date) {
        this.date = date;
    }
}


public class LinkedList {
    //管理所有的节点。 只需要记录头结点的位置即可
    //初始情况下head为null，此时表示空链表（不带傀儡节点）
    private Node head = null;
    public void addFirst(int date) {
        //1.根据date链表构建一个链表节点（Node对象）
        Node node = new Node(date);
        //2.如果链表为空
        if (head == null) {
            head = node;
            return;
        }
        //3.如果链表不为空
        if (head != null) {
            node.next = head;
            head = node;
        }
    }

    public void display() {
        //把链表中的每个元素都打印出来
        for (Node cur = head; cur != null; cur = cur.next) {
            System.out.print(cur.date + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);
        linkedList.addFirst(4);
        linkedList.addFirst(5);
        linkedList.display();
    }
}
