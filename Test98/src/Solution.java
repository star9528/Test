//给定一个链表，判断链表中是否有环
class ListNode {
    int val;
    ListNode next;
    public ListNode(int x) { val = x; }
}

public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        if(head.next == null){
            return false;
        }
        ListNode fast = head.next;
        ListNode slow = head;
        //fast.next != null不能忘
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
//        ListNode a = new ListNode(9);
//        ListNode b = new ListNode(5);
//        ListNode c = new ListNode(2);
//        ListNode d = new ListNode(7);
//        ListNode e = new ListNode(3);
//        ListNode f = new ListNode(6);
//        ListNode g = new ListNode(0);
//        a.next = b;
//        b.next = c;
//        c.next = d;
//        d.next = e;
//        e.next = f;
//        f.next = g;
//        g.next = null;
        ListNode g = new ListNode(-1);
        g.next = null;
        Solution s = new Solution();
        System.out.println(s.hasCycle(g.next));
    }
}
