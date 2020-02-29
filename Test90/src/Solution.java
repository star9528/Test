class ListNode{
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}

public class Solution {
    public ListNode reverseList(ListNode head) {
        //链表为空
        if(head == null){
            return null;
        }
        //链表只有一个元素
        if(head.next == null){
            return head;
        }
        //一般情况
        ListNode cur = head;
        ListNode prev = null;
        while(cur != null){
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        head = prev;
        return head;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        Solution s = new Solution();
        s.reverseList(a);
        for (ListNode cur = e;cur != null;cur = cur.next){
            System.out.println(cur.val);
        }
    }
}
