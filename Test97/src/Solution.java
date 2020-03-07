//输入两个链表，找出它们的第一个公共结点
class ListNode {
    int val;
    ListNode next;
    public ListNode(int x) { val = x; }
}

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int size1 = size(headA);
        int size2 = size(headB);
        if(size1 > size2){
            for(int i = 1;i <= size1 - size2;i++){
                headA = headA.next;
            }
        }
        else{
            for(int i = 1;i <= size2 - size1;i++){
                headB = headB.next;
            }
        }
        while(headA != null && headB != null){
            if(headA == headB){
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
    public int size(ListNode head){
        int size = 0;
        ListNode  cur = head;
        while(cur != null){
            size++;
            cur = cur.next;
        }
        return size;
    }
    public static void main(String[] args) {
        ListNode a = new ListNode(4);
        ListNode b = new ListNode(1);
        ListNode c = new ListNode(8);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);

        ListNode f = new ListNode(5);
        ListNode g = new ListNode(0);
        ListNode h = new ListNode(1);
        ListNode k = new ListNode(4);
        ListNode l = new ListNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        f.next = g;
        g.next = h;
        h.next = c;
        c.next = k;
        k.next = l;
        l.next = null;
        Solution s = new Solution();
        System.out.println(s.getIntersectionNode(a, f).val);
    }
}
