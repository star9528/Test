
class ListNode {
      int val;
      ListNode next;
       public ListNode(int x) { val = x; }
}
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        //链表为空的情况
        if(head == null){
            return null;
        }
        //删除非头节点的情况
        ListNode prev = head;
        ListNode cur = head.next;
        while(cur != null){
            if(cur.val == val){
                prev.next = cur.next;
                cur = cur.next;
            }else{
                prev =prev.next;
                cur = cur.next;
            }
        }
        //删除头结点的情况
        if(head.val == val){
            head = head.next;
        }
        return head;
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

        int x = 6;
        Solution s = new Solution();
        ListNode result = s.removeElements(a,x);
        for (ListNode cur = result;cur != null;cur =cur.next){
            System.out.println(cur.val);
        }
    }
}
