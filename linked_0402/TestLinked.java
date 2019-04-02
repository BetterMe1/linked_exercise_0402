package linked.linked_0402;
public class TestLinked {
}
/*
203. 移除链表元素
删除链表中等于给定值 val 的所有节点。
示例:
输入: 1->2->6->3->4->5->6, val = 6
输出: 1->2->3->4->5
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/*class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while(head != null && head.val == val){
            head = head.next;
        }
        ListNode cur = head;
        while(cur != null && cur.next != null){
            if(cur.next.val == val){
                cur.next = cur.next.next;
            }else{
                cur = cur.next;
            }
        }
        return head;
    }
}*/

/*
206. 反转链表
反转一个单链表。
示例:
输入: 1->2->3->4->5->NULL
输出: 5->4->3->2->1->NULL
进阶:
你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 */
//迭代
/*
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        if(head != null){
            while(cur.next != null){
                ListNode temp = cur.next;
                cur.next = cur.next.next;
                temp.next = head;
                head = temp;
            }
        }
        return head;
    }
}*/
//递归
/*
class Solution {
    ListNode tmp = null;
    public ListNode reverseList(ListNode head) {
        if(head != null){
            ListNode next = head.next;
            head.next = tmp;
            if(next != null){
                tmp = head;
                return reverseList(next);
            }
        }
        return head;
    }
}*/
