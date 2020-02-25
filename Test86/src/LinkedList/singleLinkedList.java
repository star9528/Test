package LinkedList;

class Node{
    public  int date;
    public Node next;

    public Node(int date) {
        this.date = date;
    }
}

public class singleLinkedList {
    //单向的链表可以用头结点代表整个链表
    //初始情况下，链表为空（head = null）
    private Node head = null;
    //头插法
    public void addFirst(int date){
        //根据date值构建一个链表节点（Node对象）
        Node node = new Node(date);
        //如果是空链表
        if(head == null){
            head = node;
            return;
        }
        //如果不是空节点
        node.next = head;
        head = node;
    }
    //尾插法
    public void addLast(int date){
        //根据date构造一个Node对象
        Node node = new Node(date);
        //如果链表为空
        if(head == null){
            head = node;
            return;
        }
        //如果链表非空，先找链表的最后一个节点
        Node tail = head;
        while(tail.next != null){
            tail = tail.next;
        }
        //循环结束后，tail就对应最后一个节点了。
        tail.next = node;
    }
    public void display(){
        //把链表中的每一个元素都打印出来
        for(Node cur = head;cur != null;cur = cur.next){
            System.out.print(cur.date + " ");
        }
        System.out.println();
    }
}
