/*
Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

Example:
    Input: 1->2->4, 1->3->4
    Output: 1->1->2->3->4->4
*/

// O(n) time and O(n) space
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        Queue<ListNode> queue = new LinkedList<>();
        while (l1 != null || l2 != null) {
            if (l1 != null && l2 != null) {
                if (l1.val < l2.val) {
                    queue.offer(l1);
                    l1 = l1.next;
                } else {
                    queue.offer(l2);
                    l2 = l2.next;
                }
            } else if (l1 != null) {
                while (l1 != null) {
                    queue.offer(l1);
                    l1 = l1.next;
                }
            } else if (l2 != null) {
                while (l2 != null) {
                    queue.offer(l2);
                    l2 = l2.next;
                }
            }
        }
        ListNode sentinel = new ListNode(-1);
        ListNode runner = sentinel;
        while (!queue.isEmpty()) {
            runner.next = queue.poll();
            runner = runner.next;
        }
        return sentinel.next;
    }
}

// O(n) time and O(1) space
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode sentinel = new ListNode(-1);
        ListNode runner = sentinel;
        while (l1 != null || l2 != null) {
            if (l1 != null && l2 != null) {
                if (l1.val < l2.val) {
                    runner.next = new ListNode(l1.val);
                    l1 = l1.next;
                } else {
                    runner.next = new ListNode(l2.val);
                    l2 = l2.next;
                }
            } else if (l1 != null) {
                runner.next = l1;
                break;
            } else if (l2 != null) {
                runner.next = l2;
                break;
            }
            runner = runner.next;
        }
        return sentinel.next;
    }
}
