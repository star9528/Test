//输入一个链表，输出该链表中倒数第k个结点。
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Solution {
    //计算链表长度
    public int size(ListNode head) {
        ListNode cur = head;
        int size = 0;
        while (cur != null) {
            size++;
            cur = cur.next;
        }
        return size;
    }

    public ListNode FindKthToTail(ListNode head, int k) {
        //链表为空
        if (head == null) {
            return null;
        }
        int size = size(head);
        //k的值不符合要求
        if (k > size) {
            return null;
        }
        //正常情况
        ListNode cur = head;
        for (int i = 1; i <= size - k; i++) {
            cur = cur.next;
        }
        return cur;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        ListNode f = new ListNode(6);
        ListNode g = new ListNode(7);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = null;
        Solution s = new Solution();
        ListNode temp = s.FindKthToTail(a, 1);
        System.out.println(temp.val);

    }
}
