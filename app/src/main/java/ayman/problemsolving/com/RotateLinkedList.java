package ayman.problemsolving.com;

public class RotateLinkedList {

    // 61. Rotate List
    // https://leetcode.com/problems/rotate-list/

    public static void main(String... args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        head = rotateRight(head, 2);

        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
    }

    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null)
            return head;


        ListNode node = head;
        while (k != 0) {
            ListNode lastElement;
            ListNode beforeLastElement = null;

            while (node.next != null) {
                if (node.next.next == null)
                    beforeLastElement = node;

                node = node.next;
            }
            lastElement = node;

            lastElement.next = head;
            head = lastElement;
            beforeLastElement.next = null;

            node = head;
            k--;
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
