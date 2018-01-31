/*
Remove all elements from a linked list of integers that have value val.

Example
Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
Return: 1 --> 2 --> 3 --> 4 --> 5
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return head;
        ListNode sentinel = new ListNode(Integer.MIN_VALUE);
        sentinel.next = head;
        ListNode runner = sentinel;
        while (runner.next != null) {
            if (runner.next.val == val) {
                runner.next = runner.next.next;
            } else {
                runner = runner.next;
            }
        }
        return sentinel.next;
    }
}
