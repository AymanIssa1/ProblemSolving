package ayman.problemsolving.com;

public class MiddleOfTheLinkedList {

    // https://leetcode.com/problems/middle-of-the-linked-list/description/

    public static void main(String... args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        middleNode(head);
    }

    public static ListNode middleNode(ListNode head) {
        ListNode start = head;
        int counter = 0;
        int middle = 0;

        while (start.next != null) {
            start = start.next;
            counter++;
        }

        middle = (counter / 2) + counter % 2;
        counter = 0;
        start = head;

        while (counter != middle) {
            start = start.next;
            counter++;
        }

        return start;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
