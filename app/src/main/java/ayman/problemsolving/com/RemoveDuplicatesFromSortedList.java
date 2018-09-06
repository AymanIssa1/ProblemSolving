package ayman.problemsolving.com;

public class RemoveDuplicatesFromSortedList {

    // https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/

    public static ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return head;

        ListNode node = head;
        while (node.next != null) {
            if (node.val == node.next.val)
                node.next = node.next.next;
            else
                node = node.next;
        }
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
