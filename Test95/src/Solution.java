//在一个排序的链表中，存在重复的结点，
// 请删除该链表中重复的结点，重复的结点不保留，返回链表头指针
class ListNode {
    int val;
    ListNode next;
    public ListNode(int x) { val = x; }
}

public class Solution {
    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null) {
            return null;
        }
        if (pHead == pHead.next) {
            return pHead;
        }
        ListNode newHead = new ListNode(-1);
        ListNode tail = newHead;
        ListNode cur = pHead;
        //这里如果用if（）else的条件语句，必须先说明cur.val == cur.next.val
        //的情况，否则最后一个元素不是重复元素的的话无法执行
        while (cur != null) {
            //如果是相同的元素，则跳过
            if (cur.next != null && cur.val == cur.next.val) {
                while (cur != null && cur.next != null && cur.val == cur.next.val) {
                    cur = cur.next;
                }
                //while结束后cur指向相同元素的最后一个
                //都走一步跳到下一个
                cur = cur.next;
            } else {
                //为了让最后一个节点的.next为空
                tail.next = new ListNode(cur.val);
                tail = tail.next;
                cur = cur.next;
            }
        }
        return newHead.next;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(2);
        ListNode d = new ListNode(3);
        ListNode e = new ListNode(3);
        ListNode f = new ListNode(3);
        ListNode g = new ListNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = null;
        Solution s = new Solution();
        ListNode node = s.deleteDuplication(a);
        for (ListNode cur = node;cur != null;cur = cur.next){
            System.out.println(cur.val);
        }
    }
}
