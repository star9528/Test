//将两个有序链表合并为一个新的有序链表并返回。
// 新链表是通过拼接给定的两个链表的所有节点组成
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //新建一个链表
        ListNode node = new ListNode(-1);
        ListNode newHead = node;
        ListNode newCur = newHead;
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        while(cur2 != null && cur1 != null){
            if(cur1.val > cur2.val){
                node = cur2;
                newCur.next = node;
                newCur = newCur.next;
                cur2 = cur2.next;
            }else{
                node = cur1;
                newCur.next = node;
                newCur = newCur.next;
                cur1 = cur1.next;
            }
        }
        if(cur1 == null){
            newCur.next = cur2;
        }
        if(cur2 == null){
            newCur.next = cur1;
        }
        return newHead.next;
    }
}
