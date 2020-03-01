
class ListNode {
    int val;
    ListNode next;
    public ListNode(int x) { val = x; }
}

public class Solution {
//    public ListNode removeElements(ListNode head, int val) {
//        if(head == null){
//            return null;
//        }
//        ListNode cur = head.next;
//
//        while(cur != null){
//            if(cur.val == val){
//                cur.next = cur.next.next;
//                cur = cur.next;
//            }
//        }
//        if(head.val == val){
//            head =head.next;
//        }
//        return head;
//    }
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null &&fast.next != null){
            if(fast == slow){
               return true;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
    }
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(6);
        ListNode d = new ListNode(3);
        ListNode e = new ListNode(4);
        ListNode f = new ListNode(5);
        ListNode g = new ListNode(6);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        g.next = null;
        Solution s = new Solution();
            System.out.println(s.hasCycle(a));
    }
}
