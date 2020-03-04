//以给定值x为基准将链表分割成两部分,
// 所有小于x的结点排在大于或等于x的结点之前
class ListNode {
    int val;
    ListNode next;
    public ListNode(int x) { val = x; }
}

public class Solution {
    public ListNode partition(ListNode pHead, int x) {
        // write code here
        ListNode newPHead1 = new ListNode(-1);
        ListNode newPHead2 = new ListNode(-1);
        ListNode cur1 = newPHead1;
        ListNode cur2 = newPHead2;
        while(pHead != null){
            //小于x的
            if(pHead.val < x){
                cur1.next = pHead;
                cur1 = cur1.next;
                pHead = pHead.next;
            }else{
                //大于等于x的
                cur2.next = pHead;
                cur2 = cur2.next;
                pHead = pHead.next;
            }
        }
        cur2.next = null;//如果不加这个步骤，最后将陷入死循环
        cur1.next = newPHead2.next;
        return newPHead1.next;
    }
    public static void main(String[] args) {
        ListNode a = new ListNode(9);
        ListNode b = new ListNode(5);
        ListNode c = new ListNode(2);
        ListNode d = new ListNode(7);
        ListNode e = new ListNode(3);
        ListNode f = new ListNode(6);
        ListNode g = new ListNode(0);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = null;
        Solution s = new Solution();
        ListNode pHead = s.partition(a,3);
        for(ListNode cur = pHead;cur != null;cur = cur.next){
            System.out.println(cur.val);
        }
    }
}
