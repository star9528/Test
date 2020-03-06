// 链表的回文结构
class ListNode {
    int val;
    ListNode next;
    public ListNode(int x) { val = x; }
}

public class Solution {
    public boolean chkPalindrome(ListNode A) {
        // write code here
        int size = size(A);
        ListNode cur = A;
        int t = size / 2;
        for(int i = 1;i <= t;i++){
            cur = cur.next;
        }
        ListNode prev = null;
        ListNode next = cur.next;
        //size / 2的链表反向，变成一个新链表
        while(next != null && next != null){
            cur.next = prev;
            prev = cur;
            cur = next;
            next = next.next;
        }
        ListNode B = new ListNode(cur.val);
        ListNode cur1 = A;
        ListNode cur2 = B;
        //比较两个链表的元素是否一样
        while(cur1 != null && cur2 != null){
            if(cur1.val != cur2.val){
                return false;
            }
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        return true;
    }
    public int size(ListNode A){
        int size = 0;
        for(ListNode curr = A;curr != null;curr = curr.next){
            size++;
        }
        return size;
    }
    public static void main(String[] args) {
        ListNode a = new ListNode(0);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(3);
        ListNode f = new ListNode(2);
        ListNode g = new ListNode(1);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = null;
        Solution s = new Solution();
        System.out.println(s.chkPalindrome(a));
    }
}
