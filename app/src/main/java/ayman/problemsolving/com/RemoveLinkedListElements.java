package ayman.problemsolving.com;

public class RemoveLinkedListElements {

    // 203. Remove Linked List Elements
    // https://leetcode.com/problems/remove-linked-list-elements/

    public ListNode removeElements(ListNode head, int val) {
        if (head == null)
            return null;
        if (head.next == null && head.val == val)
            return null;
        if (head.next == null)
            return head;

        ListNode node = head;

        while (node.next != null) {
            if (node.next.val == val)
                node.next = node.next.next;
            else
                node = node.next;
        }

        if (head.next == null && head.val == val)
            return null;

        return head;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
